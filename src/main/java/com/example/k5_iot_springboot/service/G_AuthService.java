package com.example.k5_iot_springboot.service;

import com.example.k5_iot_springboot.dto.G_Auth.Request.SignInRequest;
import com.example.k5_iot_springboot.dto.G_Auth.Request.SignUpRequest;
import com.example.k5_iot_springboot.dto.G_Auth.Response.SignInResponse;
import com.example.k5_iot_springboot.dto.ResponseDto;
import jakarta.validation.Valid;

public interface G_AuthService {
    void signUp(@Valid SignUpRequest req);

    ResponseDto<SignInResponse> signIn(@Valid SignInRequest req);
}
