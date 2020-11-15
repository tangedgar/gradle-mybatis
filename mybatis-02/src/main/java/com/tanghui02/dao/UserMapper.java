package com.tanghui02.dao;

import com.tanghui02.mode.User;

import java.util.List;
import java.util.Map;

/**
 * @author tanghui
 */
public interface UserMapper {
    /**
     * 使用存储过程查询User数据表
     *
     * @param map Map
     * @return List<User>
     */
    List<User> queryUserInfoBase(Map<String,Object> map);

    /**
     * 使用存储过程添加数据
     *
     * @param map Map
     */
    void addUserInfoBase(Map<String,Object> map);

    /**
     * 使用存储过程修改数据
     *
     * @param map Map
     */
    void updateUserInfoBase(Map<String,Object> map);

    /**
     * 使用存储过程删除数据
     *
     * @param map Map
     */
    void deleteUserInfoBase(Map<String,Object> map);
}
