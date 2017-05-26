package com.davidrus.shiokosho.dao;

import com.davidrus.shiokosho.domain.User;
import org.springframework.stereotype.Repository;

/**
 * Created by david on 24-May-17.
 */
@Repository
public interface UserDao {

    boolean createUser(User user);

    User getUserById(Long id);

    User getUserByName(String userName);

    boolean updateUser(User user);

    boolean deleteUser(Long id);

}
