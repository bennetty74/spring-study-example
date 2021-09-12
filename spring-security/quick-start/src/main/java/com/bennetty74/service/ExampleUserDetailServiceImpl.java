package com.bennetty74.service;

import com.bennetty74.bean.ExampleUserDetail;
import com.bennetty74.mapper.ExampleUserDetailMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * If you want to authenticate by username and password in database, such as MySQL
 * @author bennetty74
 * @date 2021.9.12
 */
@Service
public class ExampleUserDetailServiceImpl implements UserDetailsService {

    @Resource
    BCryptPasswordEncoder passwordEncoder;

    @Resource
    ExampleUserDetailMapper exampleUserDetailMapper;


    /**
     * The below code returns a user with username 'example' and password '1234'.
     * So we can login this system the below user with it's password
     * if authenticate by username and password
     * please return the matched user bean
     * @param username username
     * @return a entity witch implemented the UserDetails interface
     * @throws UsernameNotFoundException not found exception
     */
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        please notice that the password must be encoded, otherwise the console will log a warning info
//        return new ExampleUserDetail("mike", passwordEncoder.encode("1234"), Collections.emptyList());

        // find in database
        return exampleUserDetailMapper.selectByUsername(username);
    }
}
