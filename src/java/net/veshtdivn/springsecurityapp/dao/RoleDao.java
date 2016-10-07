package net.veshtdivn.springsecurityapp.dao;

import net.veshtdivn.springsecurityapp.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by user on 04.10.2016.
 */
public interface RoleDao extends JpaRepository<Role,Long>{
}
