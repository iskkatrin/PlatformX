package org.example.dao;


import org.example.model.User;

import java.util.List;

/**
 * Интерфейс UserDao определяет методы для операций CRUD над пользователями.
 */

public interface UserDao {
    void save(User user);
    void update(User user);
    void delete(int userId);
    User findById(int userId);
    List<User> findAll();
}