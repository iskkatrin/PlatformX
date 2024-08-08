package org.example.service;

import org.example.model.User;

import java.util.List;

public interface UserService {
    void save(User user);
    void update(User user);
    void delete(int userId);
    User findById(int userId);
    List<User> findAll();
}