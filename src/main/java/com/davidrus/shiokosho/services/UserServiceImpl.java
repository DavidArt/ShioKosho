package com.davidrus.shiokosho.services;

import com.davidrus.shiokosho.dao.UserDao;
import com.davidrus.shiokosho.dto.User;
import lombok.extern.slf4j.Slf4j;
import org.dozer.Mapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by david on 27-May-17.
 */
@Service
@Slf4j
public class UserServiceImpl implements UserService {

    @Resource
    private Mapper mapper;
    @Resource
    private UserDao userDao;

    @Override
    public boolean createUser(User user) {
        com.davidrus.shiokosho.domain.User userDomain = mapper.map(user, com.davidrus.shiokosho.domain.User.class);
        return userDao.createUser(userDomain);
    }

    @Override
    public User getUserById(Long id) {
       com.davidrus.shiokosho.domain.User userDomain = userDao.getUserById(id);
        User userDto = mapper.map(userDomain, User.class);
        return userDto;
    }

    @Override
    public User getUserByName(String name) {
        com.davidrus.shiokosho.domain.User user = userDao.getUserByName(name);
        User userDto = mapper.map(user, User.class);
        return userDto;
    }

    @Override
    public boolean updateUser(User user) {
        com.davidrus.shiokosho.domain.User userDomain = mapper.map(user, com.davidrus.shiokosho.domain.User.class);
        return userDao.updateUser(userDomain);
    }

    @Override
    public boolean deleteUser(Long id) {
        return userDao.deleteUser(id);
    }
}
