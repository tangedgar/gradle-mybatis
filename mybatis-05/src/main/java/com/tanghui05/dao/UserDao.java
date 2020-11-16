package com.tanghui05.dao;

import com.tanghui05.model.User;

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

    /**
     * 根据id查询
     *
     * @param id int
     * @return User
     */
    User getUserById(int id);

    /**
     * 修改用户
     *
     * @param user User
     */
    void updateUser(User user);
}
