package com.tanghui03.dao;

import com.tanghui03.model.User;

import java.util.List;

public interface UserMapper {
    /**
     * 查询User数据表所有数据
     *
     * @return List<User>
     */
    List<User> getUserList();
}
