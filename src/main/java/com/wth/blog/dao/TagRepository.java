package com.wth.blog.dao;

import com.wth.blog.po.Tag;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TagRepository extends JpaRepository<Tag,Long> {
    Tag findByName(String name);
}
