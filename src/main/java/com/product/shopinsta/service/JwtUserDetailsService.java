package com.product.shopinsta.service;

import com.product.shopinsta.config.UserPrincipal;
import com.product.shopinsta.model.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class JwtUserDetailsService implements UserDetailsService {

    @Override
    public UserDetails loadUserByUsername(String username) {
        User user = new User();
        user.setUsername("user");
        user.setId(new Random().nextLong());

        return new UserPrincipal(user);
    }
}
