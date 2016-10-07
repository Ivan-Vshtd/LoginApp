package net.veshtdivn.springsecurityapp.dao;

import net.veshtdivn.springsecurityapp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by user on 04.10.2016.
 */
public interface UserDao extends JpaRepository<User, Long> {
    User findByUsername(String username);

}
