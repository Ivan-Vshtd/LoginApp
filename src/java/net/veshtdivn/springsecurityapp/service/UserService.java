package net.veshtdivn.springsecurityapp.service;

import net.veshtdivn.springsecurityapp.model.User;

/**
 * Created by user on 04.10.2016.
 */
public interface UserService {
    void save(User user);

    User findByUsername(String username);

}
