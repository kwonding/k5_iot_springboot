package com.example.k5_iot_springboot.service.impl;

import com.example.k5_iot_springboot.dto.D_Post.Request.PostCreateRequestDto;
import com.example.k5_iot_springboot.dto.D_Post.Request.PostUpdateRequestDto;
import com.example.k5_iot_springboot.dto.D_Post.Response.PostDetailResponseDto;
import com.example.k5_iot_springboot.dto.D_Post.Response.PostListResponseDto;
import com.example.k5_iot_springboot.dto.ResponseDto;
import com.example.k5_iot_springboot.service.D_PostService;
import org.springframework.stereotype.Service;

@Service
public class D_PostServiceImpl implements D_PostService {
    @Override
    public ResponseDto<PostDetailResponseDto> createPost(PostCreateRequestDto dto) {
        return null;
    }

    @Override
    public ResponseDto<PostDetailResponseDto> getPostById(Long id) {
        return null;
    }

    @Override
    public ResponseDto<PostListResponseDto> getAllPosts() {
        return null;
    }

    @Override
    public ResponseDto<PostDetailResponseDto> updatePost(Long id, PostUpdateRequestDto dto) {
        return null;
    }

    @Override
    public ResponseDto<Void> deletePost(Long id) {
        return null;
    }
}
