package com.davidrus.shiokosho.services;

import com.davidrus.shiokosho.dto.User;
import org.springframework.stereotype.Service;

/**
 * Created by david on 27-May-17.
 */
@Service
public interface UserService {

    boolean createUser(User user);

    User getUserById(Long id);

    User getUserByName(String name);

    boolean updateUser(User user);

    boolean deleteUser(Long id);

}
