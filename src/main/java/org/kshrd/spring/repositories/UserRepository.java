package org.kshrd.spring.repositories;

import org.apache.ibatis.annotations.*;
import org.kshrd.spring.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Obi-Voin Kenobi on 22-Jun-17.
 */
@Repository
public interface UserRepository {

    @Select("SELECT id, username, gender, email, phonenumber, hashcode, status FROM tbl_users")
    @Results(value = {
            @Result(property = "mId", column = "id"),
            @Result(property = "mUsername", column = "username"),
            @Result(property = "mGender", column = "gender"),
            @Result(property = "mEmail", column = "email"),
            @Result(property = "mPhoneNumber", column = "phonenumber"),
            @Result(property = "mHashCode", column = "hashcode"),
            @Result(property = "mStatus", column = "status")
    })
    List<User> findAllUsers();

    @Select("SELECT id, username, gender, email, phonenumber, hashcode, status FROM tbl_users " +
            "WHERE hashcode = #{hashCode}")
    @Results(value = {
            @Result(property = "mId", column = "id"),
            @Result(property = "mUsername", column = "username"),
            @Result(property = "mGender", column = "gender"),
            @Result(property = "mEmail", column = "email"),
            @Result(property = "mPhoneNumber", column = "phonenumber"),
            @Result(property = "mHashCode", column = "hashcode"),
            @Result(property = "mStatus", column = "status")
    })
    User findUserByHashcode(@Param("hashCode") String hashCode);

    @Insert("INSERT INTO tbl_users(username, gender, email, phonenumber, hashcode) " +
            "VALUES(#{u.mUsername}, #{u.mGender}, #{u.mEmail}, #{u.mPhoneNumber}, #{u.mHashCode})")
    boolean createNewUser(@Param("u") User user);

    @Update("UPDATE tbl_users SET username=#{user.mUsername}, gender=#{user.mGender}, " +
            "email=#{user.mEmail}, phonenumber=#{user.mPhoneNumber} " +
            "WHERE hashcode=#{user.mHashCode}")
    boolean updateUserByHashcode(@Param("user") User user);

    @Delete("UPDATE tbl_users SET status='False' WHERE hashcode=#{hashCode}")
    boolean deleteUserByHashcode(@Param("hashCode") String hashCode);

    @Select("SELECT COUNT(id) FROM tbl_users")
    int findUserNumber();

    @Select("SELECT COUNT(id) FROM tbl_users WHERE gender='Male'")
    int findMaleUserNumber();

    @Select("SELECT COUNT(id) FROM tbl_users WHERE gender='Female'")
    int findFemaleUserNumber();
}
