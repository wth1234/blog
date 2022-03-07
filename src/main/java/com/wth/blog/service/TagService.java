package com.wth.blog.service;

import com.wth.blog.po.Tag;
import com.wth.blog.po.Type;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface TagService {

    Tag saveTag(Tag tag);
    Tag getTag(Long id);
    Tag getTagByName(String name);
    Page <Tag> listTag(Pageable pageable);
    Tag updateTag(Long id,Tag tag);
    List<Tag> listTag();
    List<Tag> listTag(String ids);
    List<Tag> listTagTop(Integer size);
    void deleteTag(Long id);
}
