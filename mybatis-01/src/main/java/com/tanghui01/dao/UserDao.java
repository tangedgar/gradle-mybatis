package com.tanghui01.dao;

import com.tanghui01.Models.User;

import java.util.List;

/**
 * @author tanghui
 */
public interface UserDao {
    /**
     * 查询User数据表所有数据
     *
     * @return List<User>
     */
    List<User> getUserList();
}
