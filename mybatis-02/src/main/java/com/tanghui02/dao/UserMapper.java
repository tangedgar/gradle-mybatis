package com.tanghui02.dao;

import com.tanghui02.mode.User;

import java.util.List;

/**
 * @author tanghui
 */
public interface UserMapper {
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
     * 插入用户
     *
     * @param user User
     */
    void addUser(User user);

    /**
     * 修改用户
     *
     * @param user User
     */
    void updateUser(User user);

    /**
     * 根据id删除
     *
     * @param id int
     */
    void deleteUser(int id);
}
