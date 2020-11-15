package com.tanghui02.dao;

import com.tanghui02.mode.User;
import com.tanghui02.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserMapperTest {

    @Test
    public void queryUserInfoBaseTest(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

        Map<String, Object> map = new HashMap<>();
        map.put("userid",0);
        map.put("code",1);
        map.put("info","");
        List<User> userList = userMapper.queryUserInfoBase(map);

        System.out.println(map.get("code"));
        System.out.println(map.get("info"));

        for (User user : userList) {
            System.out.println(user);
        }

        sqlSession.close();
    }

    @Test
    public void addUserInfoBaseTest(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

        Map<String, Object> map = new HashMap<>();
        map.put("userid",4);
        map.put("username","赵六");
        map.put("password","234567");
        map.put("code",1);
        map.put("info","");
        userMapper.addUserInfoBase(map);
        sqlSession.commit();
        System.out.println(map.get("code"));
        System.out.println(map.get("info"));

        sqlSession.close();
    }

    @Test
    public void updateUserInfoBaseTest(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

        Map<String, Object> map = new HashMap<>();
        map.put("userid",4);
        map.put("username","小六");
        map.put("password","345678");
        map.put("code",1);
        map.put("info","");
        userMapper.updateUserInfoBase(map);
        sqlSession.commit();
        System.out.println(map.get("code"));
        System.out.println(map.get("info"));

        sqlSession.close();
    }

    @Test
    public void deleteUserInfoBaseTest(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

        Map<String, Object> map = new HashMap<>();
        map.put("userid",4);
        map.put("code",1);
        map.put("info","");
        userMapper.deleteUserInfoBase(map);
        sqlSession.commit();
        System.out.println(map.get("code"));
        System.out.println(map.get("info"));

        sqlSession.close();
    }
}
