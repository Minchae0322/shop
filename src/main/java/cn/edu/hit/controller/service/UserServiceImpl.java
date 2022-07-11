package cn.edu.hit.controller.service;

import cn.edu.hit.controller.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {


    @Autowired
    UserDao userDao;

    @Override
    public void test() {
        System.out.println(userDao.test());
    }
}
