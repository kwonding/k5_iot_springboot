package com.example.k5_iot_springboot.service.impl;

import com.example.k5_iot_springboot.dto.H_Article.Request.ArticleCreateRequest;
import com.example.k5_iot_springboot.dto.H_Article.Request.ArticleUpdateRequest;
import com.example.k5_iot_springboot.dto.H_Article.Response.ArticleDetailResponse;
import com.example.k5_iot_springboot.dto.H_Article.Response.ArticleListResponse;
import com.example.k5_iot_springboot.dto.ResponseDto;
import com.example.k5_iot_springboot.repository.H_ArticleRepository;
import com.example.k5_iot_springboot.security.UserPrincipal;
import com.example.k5_iot_springboot.service.H_ArticleService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class H_ArticleServiceImpl implements H_ArticleService {
    public final H_ArticleRepository articleRepository;

    @Override
    @Transactional
    @PreAuthorize("isAuthenticated()")
    public ResponseDto<ArticleDetailResponse> createArticle(UserPrincipal principal, ArticleCreateRequest request) {
        return null;
    }

    @Override
    public ResponseDto<List<ArticleListResponse>> getAllArticles() {
        return null;
    }

    @Override
    public ResponseDto<ArticleDetailResponse> getArticleById(Long id) {
        return null;
    }

    @Override
    @Transactional
    public ResponseDto<ArticleDetailResponse> updateArticle(UserPrincipal principal, Long id, ArticleUpdateRequest request) {
        return null;
    }

    @Override
    @Transactional
    public ResponseDto<Void> deleteArticle(UserPrincipal principal, Long id) {
        return null;
    }

    /* 공통 유틸: 제목/내용 유효성 검사 */
    private void validateTitleAndContent(String title, String content) {
        if (!StringUtils.hasText(title)) {
            throw new IllegalArgumentException("TITLE_REQUIRED");
        }
        if (!StringUtils.hasText(content)) {
            throw new IllegalArgumentException("CONTENT_REQUIRED");
        }

    }
}
