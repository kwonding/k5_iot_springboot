package com.example.k5_iot_springboot.service;

import com.example.k5_iot_springboot.dto.D_Comment.Request.CommentCreateRequestDto;
import com.example.k5_iot_springboot.dto.D_Comment.Request.CommentUpdateRequestDto;
import com.example.k5_iot_springboot.dto.D_Comment.Response.CommentResponseDto;
import com.example.k5_iot_springboot.dto.ResponseDto;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Positive;

public interface D_CommentService {
    ResponseDto<CommentResponseDto> createComment(@Positive(message = "postId는 1이상의 정수여야 합니다.") Long postId, @Valid CommentCreateRequestDto dto);

    ResponseDto<CommentResponseDto> updateComment(@Positive(message = "postId는 1 이상의 정수여야 합니다.") Long postId, @Positive(message = "commentId는 1 이상의 정수여야 합니다.") Long commentId, @Valid CommentUpdateRequestDto dto);

    ResponseDto<CommentResponseDto> deleteComment(@Positive(message = "postId는 1 이상의 정수여야 합니다.") Long postId, @Positive(message = "commentId는 1 이상의 정수여야 합니다.") Long commentId);
}
