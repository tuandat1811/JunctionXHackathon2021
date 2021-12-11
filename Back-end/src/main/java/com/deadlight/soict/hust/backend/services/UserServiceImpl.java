package com.deadlight.soict.hust.backend.services;

import com.deadlight.soict.hust.backend.entities.LoginForm;
import com.deadlight.soict.hust.backend.entities.RegisterForm;
import com.deadlight.soict.hust.backend.entities.Users;
import com.deadlight.soict.hust.backend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    UserRepository userRepository;

    @Override
    public List<Users> getListUsers() {
        return userRepository.findAll();
    }

    @Override
    public void saveUser(Users user) {
        userRepository.save(user);
    }

    @Override
    public Users getUserById(Integer uid) {
        return userRepository.findById(uid).get();
    }

    @Override
    public Users deleteUser(Integer uid) {
        userRepository.deleteById(uid);
        return null;
    }

    @Override
    public boolean register(RegisterForm registerForm) throws Exception {
        return false;
    }

    @Override
    public boolean login(LoginForm loginForm) {
        return false;
    }
}
