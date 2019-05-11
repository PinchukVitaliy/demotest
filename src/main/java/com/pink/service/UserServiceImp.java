package com.pink.service;

import com.pink.dao.UserDao;
import com.pink.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserServiceImp implements UserService {
    @Autowired
    public UserDao userDao;


    @Override
    public User getById(Short id) {
        return userDao.getById(id);
    }

    public List<User> findAll() {
        return userDao.findAll();
    }

    @Override
    public void save(User user) {
        userDao.save(user);
    }

    @Override
    public void delete(Short id) {
        userDao.delete(id);
    }

    @Override
    public void update(User user) {
        userDao.update(user);
    }
}
