package com.example.k5_iot_springboot.service;

import com.example.k5_iot_springboot.dto.H_Article.Request.ArticleCreateRequest;
import com.example.k5_iot_springboot.dto.H_Article.Request.ArticleUpdateRequest;
import com.example.k5_iot_springboot.dto.H_Article.Response.ArticleDetailResponse;
import com.example.k5_iot_springboot.dto.H_Article.Response.ArticleListResponse;
import com.example.k5_iot_springboot.dto.ResponseDto;
import com.example.k5_iot_springboot.security.UserPrincipal;
import jakarta.validation.Valid;

import java.util.List;

public interface H_ArticleService {
    ResponseDto<ArticleDetailResponse> createArticle(UserPrincipal principal, @Valid ArticleCreateRequest request);


    ResponseDto<List<ArticleListResponse>> getAllArticles();

    ResponseDto<ArticleDetailResponse> getArticleById(Long id);

    ResponseDto<ArticleDetailResponse> updateArticle(UserPrincipal principal, Long id, @Valid ArticleUpdateRequest request);

    ResponseDto<Void> deleteArticle(UserPrincipal principal, Long id);
}
