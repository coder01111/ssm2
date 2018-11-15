package cn.itcast.service;

import cn.itcast.domain.User;

import java.util.List;

/**
 * 用户业务层的接口
 */
public interface UserService {
    //业务层的接口登录方法
    User login(User user);
    List<User> findAll();
}
