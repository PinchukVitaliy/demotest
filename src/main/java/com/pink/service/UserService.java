package com.pink.service;

import com.pink.entity.User;
import java.util.List;


public interface UserService {
    User getById(Short id);
    List<User> findAll();
    void save(User user);
    void delete(Short id);
    void update(User user);
}
