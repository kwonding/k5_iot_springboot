package com.example.k5_iot_springboot.dto.G_User.Request;

import com.example.k5_iot_springboot.common.enums.Gender;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record UserProfileUpdateRequest( // record는 불변값 private 제거
                                        @NotBlank @Size(max = 50)
        String nickname,
                                        Gender gender // 선택
) {}
