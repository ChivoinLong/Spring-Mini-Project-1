package org.kshrd.spring.services;

import org.apache.ibatis.annotations.Param;
import org.kshrd.spring.model.User;

import java.util.List;

/**
 * Created by Obi-Voin Kenobi on 22-Jun-17.
 */
public interface UserService {

    List<User> findAllUsers();

    User findUserByHashcode(String hashCode);

    boolean createNewUser(User user);

    boolean updateUserByHashcode(String hashCode, User user);

    boolean deleteUserByHashcode(String hashCode);

    int findUserNumber();

    int findFemaleUserNumber();

    int findMaleUserNumber();
}
