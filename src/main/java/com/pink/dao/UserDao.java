package com.pink.dao;

import com.pink.entity.User;

import java.util.List;

public interface UserDao {

    User getById(Short id);
    List<User> findAll();
    void save(User user);
    void delete(Short id);
    void update(User user);

}
