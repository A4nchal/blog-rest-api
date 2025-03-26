package com.aanchal.blog_rest_api.service;

import com.aanchal.blog_rest_api.payload.LoginDto;
import com.aanchal.blog_rest_api.payload.RegisterDto;

public interface AuthService {
    String login(LoginDto loginDto);
    String register(RegisterDto registerDto);
}
