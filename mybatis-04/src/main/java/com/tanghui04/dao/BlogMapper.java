package com.tanghui04.dao;

import com.tanghui04.model.Blog;

import java.util.List;
import java.util.Map;

public interface BlogMapper {
    /**
     * 插入数据
     *
     * @param blog rule Blog
     * @return int
     */
    int addBlog(Blog blog);

    /**
     * 查询数据
     *
     * @param map rule Map
     * @return List<Blog>
     */
    List<Blog> queryblogif(Map<String,Object> map);
}
