package com.tanghui04.dao;

import com.tanghui04.model.Blog;
import com.tanghui04.utils.IDutils;
import com.tanghui04.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class BlogMapperTest {
    @Test
    public void test(){
        System.out.println("UUID:"+IDutils.getId());
    }

    @Test
    public void addBlogTest(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper blogMapper = sqlSession.getMapper(BlogMapper.class);

        Blog blog = new Blog();
        blog.setId(IDutils.getId());
        blog.setTitle("Mybatis如此简单");
        blog.setAuthor("tang_edgar");
        blog.setCreatetime(new Date());
        blog.setViews(9999);

        blogMapper.addBlog(blog);

        blog.setId(IDutils.getId());
        blog.setTitle("Java如此简单");
        blogMapper.addBlog(blog);

        blog.setId(IDutils.getId());
        blog.setTitle("Spring如此简单");
        blogMapper.addBlog(blog);

        blog.setId(IDutils.getId());
        blog.setTitle("微服务如此简单");
        blogMapper.addBlog(blog);

        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void queryBlogIfTest(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper blogMapper = sqlSession.getMapper(BlogMapper.class);

        Map<String,Object> map = new HashMap<>();
        map.put("title","Java如此简单");
        map.put("author","tang_edgar");
        List<Blog> blogList = blogMapper.queryblogif(map);
        for (Blog blog : blogList) {
            System.out.println(blog);
        }

        sqlSession.close();
    }
}
