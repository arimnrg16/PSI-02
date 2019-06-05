package com.PSB.WebBintangTimur.sevice;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.PSB.WebBintangTimur.model.User;
import com.PSB.WebBintangTimur.web.dto.UserRegistrationDto;

public interface UserService extends UserDetailsService {

    User findByEmail(String email);

    User save(UserRegistrationDto registration);
}
