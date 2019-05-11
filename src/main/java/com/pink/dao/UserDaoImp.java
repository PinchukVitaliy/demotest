package com.pink.dao;

import com.pink.entity.User;
import com.pink.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

//@Repository
public class UserDaoImp implements UserDao {

    public final JdbcTemplate jdbcTemplate;

    @Autowired
    public UserDaoImp(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }


    @Override
    public User getById(Short id) {
        String sql = "SELECT * FROM user WHERE id=?";
        return jdbcTemplate.queryForObject(sql, new UserMapper(), id);
    }

    @Override
    public List<User> findAll() {
        String sql = "SELECT * FROM user";

        return jdbcTemplate.query(sql, new UserMapper());
    }

    @Override
    public void save(User user) {
        String sql = "INSERT INTO user (name, email, age) VALUES (?,?,?)";

        jdbcTemplate.update(sql, user.getName(), user.getEmail(), user.getAge());
    }

    @Override
    public void delete(Short id) {
        String sql = "DELETE FROM user WHERE id=?";
        jdbcTemplate.update(sql , id);
    }

    @Override
    public void update(User user) {
        String sql = "UPDATE user SET name=?, email=?, age=? WHERE id=?";
        jdbcTemplate.update(sql, user.getName(), user.getEmail(), user.getAge(), user.getId());
    }
}
