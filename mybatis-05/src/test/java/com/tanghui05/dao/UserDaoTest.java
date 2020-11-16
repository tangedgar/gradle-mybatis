package com.tanghui05.dao;

import com.tanghui05.model.User;
import com.tanghui05.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class UserDaoTest {
    @Test
    public void getUserListTest(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserDao userDao = sqlSession.getMapper(UserDao.class);

        List<User> userList = userDao.getUserList();
        for (User user : userList) {
            System.out.println(user);
        }

        sqlSession.close();
    }
    @Test
    public void getUserByIdTest(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserDao userDao = sqlSession.getMapper(UserDao.class);

        User user = userDao.getUserById(1);
        System.out.println(user);
        System.out.println("========================");

        // userDao.updateUser(new User(2,"aaaaaa","bbbbbb"));
        /*清空缓存*/
        sqlSession.clearCache();

        User user2 = userDao.getUserById(1);
        System.out.println(user2);
        System.out.println("========================");
        System.out.println(user==user2);
        sqlSession.close();
    }

    @Test
    public void Test(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        SqlSession sqlSession2 = MybatisUtils.getSqlSession();

        UserDao userDao = sqlSession.getMapper(UserDao.class);
        User user = userDao.getUserById(1);
        System.out.println(user);
        sqlSession.close();
        System.out.println("==================");

        UserDao userDao2 = sqlSession2.getMapper(UserDao.class);
        User user2 = userDao2.getUserById(1);
        System.out.println(user2);
        System.out.println(user==user2);
        sqlSession2.close();
    }
}
