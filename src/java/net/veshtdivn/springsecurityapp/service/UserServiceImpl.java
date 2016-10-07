package net.veshtdivn.springsecurityapp.service;

import net.veshtdivn.springsecurityapp.dao.RoleDao;
import net.veshtdivn.springsecurityapp.dao.UserDao;
import net.veshtdivn.springsecurityapp.model.Role;
import net.veshtdivn.springsecurityapp.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by user on 04.10.2016.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Autowired
    private RoleDao roleDao;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public void save(User user) {
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        Set<Role> roles = new HashSet<>();
        roles.add(roleDao.getOne(1L));
        user.setRoles(roles);
        userDao.saveAndFlush(user);
    }

    @Override
    public User findByUsername(String username) {
        return userDao.findByUsername(username);
    }

}