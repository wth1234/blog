package com.wth.blog.service;

import com.wth.blog.po.Blog;
import com.wth.blog.vo.BlogQuery;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface BlogService {
    Blog getBlog(Long id);
    Blog getAndCovert(Long id);
    Page<Blog> listBlog(Pageable pageable, BlogQuery blog);
    Page<Blog> listBlog(Pageable pageable);
    Page<Blog> listBlog(String query,Pageable pageable);
    List<Blog> listRecommendBlogTop(Integer size);
    Blog saveBlog(Blog blog);
    Blog updateBlog(Long id,Blog blog);
    void deleteBlog(Long id);
}
