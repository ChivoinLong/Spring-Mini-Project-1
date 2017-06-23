package org.kshrd.spring.services.implement;

import org.kshrd.spring.model.User;
import org.kshrd.spring.repositories.UserRepository;
import org.kshrd.spring.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

/**
 * Created by Obi-Voin Kenobi on 22-Jun-17.
 */
@Service
public class UserServiceImpl implements UserService {

    private UserRepository mUserRepository;

    @Autowired
    public UserServiceImpl(UserRepository mUserRepository) {
        this.mUserRepository = mUserRepository;
    }

    @Override
    public List<User> findAllUsers() {
        return mUserRepository.findAllUsers();
    }

    @Override
    public User findUserByHashcode(String hashCode) {
        return mUserRepository.findUserByHashcode(hashCode);
    }

    @Override
    public boolean createNewUser(User user) {
        String hashCode = UUID.randomUUID().toString();
        user.setmHashCode(hashCode);
        return mUserRepository.createNewUser(user);
    }

    @Override
    public boolean updateUserByHashcode(String hashCode, User user) {
        user.setmHashCode(hashCode);
        return mUserRepository.updateUserByHashcode(user);
    }

    @Override
    public boolean deleteUserByHashcode(String hashCode) {
        return mUserRepository.deleteUserByHashcode(hashCode);
    }

    @Override
    public int findUserNumber() {
        return mUserRepository.findUserNumber();
    }

    @Override
    public int findFemaleUserNumber() {
        return mUserRepository.findFemaleUserNumber();
    }

    @Override
    public int findMaleUserNumber() {
        return mUserRepository.findMaleUserNumber();
    }
}
