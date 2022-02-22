package com.wth.blog.service;

import com.wth.blog.po.Type;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface TypeService {

    Type saveType(Type type);
    Type getType(Long id);
    Page <Type> listType(Pageable pageable);
    Type updataType(Long id,Type type);
    void deleteType(Long id);
}
