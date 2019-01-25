package demo.tyh.service.base.service;

import demo.tyh.service.base.entity.User;
import demo.tyh.service.base.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public User insertUser(User user) {
        userMapper.insertUser(user);
        return user;
    }
}

