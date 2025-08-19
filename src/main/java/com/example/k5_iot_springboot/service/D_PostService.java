package com.example.k5_iot_springboot.service;

import com.example.k5_iot_springboot.dto.D_Post.Request.PostCreateRequestDto;
import com.example.k5_iot_springboot.dto.D_Post.Request.PostUpdateRequestDto;
import com.example.k5_iot_springboot.dto.D_Post.Response.PostDetailResponseDto;
import com.example.k5_iot_springboot.dto.D_Post.Response.PostListResponseDto;
import com.example.k5_iot_springboot.dto.ResponseDto;
import jakarta.validation.Valid;

public interface D_PostService {
    ResponseDto<PostDetailResponseDto> createPost(@Valid PostCreateRequestDto dto);

    ResponseDto<PostDetailResponseDto> getPostById(Long id);

    ResponseDto<PostListResponseDto> getAllPosts();

    ResponseDto<PostDetailResponseDto> updatePost(Long id, @Valid PostUpdateRequestDto dto);

    ResponseDto<Void> deletePost(Long id);
}
