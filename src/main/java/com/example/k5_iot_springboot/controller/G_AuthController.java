package com.example.k5_iot_springboot.controller;

import com.example.k5_iot_springboot.dto.G_Auth.Request.SignInRequest;
import com.example.k5_iot_springboot.dto.G_Auth.Request.SignUpRequest;
import com.example.k5_iot_springboot.dto.G_Auth.Response.SignInResponse;
import com.example.k5_iot_springboot.dto.ResponseDto;
import com.example.k5_iot_springboot.service.G_AuthService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/auth") // 회원가입, 로그인, 아이디찾기, 비밀번호 재설정 등
@RequiredArgsConstructor
public class G_AuthController {
    private final G_AuthService authService;

    /* 회원가입 */
    @PostMapping("/sign-up")
    public ResponseEntity<ResponseDto<Void>> singUp(@Valid @RequestBody SignUpRequest req) {
        authService.signUp(req);
        return ResponseEntity.ok(ResponseDto.setSuccess("회원가입이 완료되었습니다.", null));
    }

    /* 로그인 */
    @PostMapping("/sign-in")
    public ResponseEntity<ResponseDto<SignInResponse>> signIn(@Valid @RequestBody SignInRequest req) {
        ResponseDto<SignInResponse> response = authService.signIn(req);
        return ResponseEntity.ok().body(response);
    }


}
