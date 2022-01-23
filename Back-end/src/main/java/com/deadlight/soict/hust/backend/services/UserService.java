package com.deadlight.soict.hust.backend.services;

import com.deadlight.soict.hust.backend.entities.LoginForm;
import com.deadlight.soict.hust.backend.entities.RegisterForm;
import com.deadlight.soict.hust.backend.entities.Users;

import java.util.List;

public interface UserService {
    public List<Users> getListUsers();
    public void saveUser(Users user);
    public Users getUserById(Integer uid);
    public Users deleteUser(Integer uid);
    boolean register(RegisterForm registerForm) throws Exception;
    boolean login(LoginForm loginForm);
}
