package com.example.k5_iot_springboot.service;

import com.example.k5_iot_springboot.dto.G_User.Request.UserProfileUpdateRequest;
import com.example.k5_iot_springboot.dto.G_User.Response.UserProfileResponse;
import com.example.k5_iot_springboot.dto.ResponseDto;
import com.example.k5_iot_springboot.security.UserPrincipal;
import jakarta.validation.Valid;
import org.springframework.security.access.AccessDeniedException;


public interface G_UserService {
    ResponseDto<UserProfileResponse.MyPageResponse> getMyInfo(UserPrincipal principal) throws AccessDeniedException;

    ResponseDto<UserProfileResponse.MyPageResponse> updateMyInfo(UserPrincipal principal, @Valid UserProfileUpdateRequest request);
}
