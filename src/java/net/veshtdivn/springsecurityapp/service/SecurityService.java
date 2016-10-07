package net.veshtdivn.springsecurityapp.service;

/**
 * Created by user on 05.10.2016.
 */
public interface SecurityService {

    String findLoggedInUsername();

    void autoLogin(String username, String password);
}