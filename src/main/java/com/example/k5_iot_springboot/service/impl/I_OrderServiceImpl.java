package com.example.k5_iot_springboot.service.impl;

import com.example.k5_iot_springboot.common.enums.OrderStatus;
import com.example.k5_iot_springboot.dto.I_Order.Request.OrderRequest;
import com.example.k5_iot_springboot.dto.I_Order.Response.OrderResponse;
import com.example.k5_iot_springboot.dto.ResponseDto;
import com.example.k5_iot_springboot.repository.I_OrderRepository;
import com.example.k5_iot_springboot.security.UserPrincipal;
import com.example.k5_iot_springboot.service.I_OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;

// 인터페이스의 추상 메서드를 Impl 클래스 파일에서 "강제 구현!"
@Service
@RequiredArgsConstructor // final 필드 or @NonNull 필드만을 매개변수로 가지는 생성자
@Transactional(readOnly = true)
public class I_OrderServiceImpl implements I_OrderService {
    private final I_OrderRepository orderRepository;

    @Override
    @Transactional
    @PreAuthorize("isAuthenticated()")
    public ResponseDto<OrderResponse.Detail> create(UserPrincipal userPrincipal, OrderRequest.OrderCreateRequest req) {
        return null;
    }

    @Override
    @Transactional
    @PreAuthorize("hasAnyRole('MANAGER', 'ADMIN')")
    public ResponseDto<OrderResponse.Detail> approve(UserPrincipal userPrincipal, Long orderId) {
        return null;
    }

    @Override
    @Transactional
    @PreAuthorize("hasAnyRole('MANAGER', 'ADMIN') or @authz.canCancel(#orderId, authentication) ")
    public ResponseDto<OrderResponse.Detail> cancel(UserPrincipal userPrincipal, Long orderId) {
        return null;
    }

    @Override
    @PreAuthorize("hasAnyRole('MANAGER', 'ADMIN') or @authz.isSelf(#userPrincipal.id, authentication) ")
    public ResponseDto<List<OrderResponse.Detail>> search(UserPrincipal userPrincipal, Long userId, OrderStatus status, LocalDateTime from, LocalDateTime to) {
        return null;
    }
}
