package com.example.k5_iot_springboot.dto.I_Order.Request;

public class ProductRequest {
    /* 제품 등록 요청 DTO */
    public record Create( // ProductCreateRequest
            String name,
            Integer price
    ) {}

    /* 제품 수정 요청 DTO */
    public record Update( // ProductUpdateRequest
            String name,
            Integer price
    ) {}
}
