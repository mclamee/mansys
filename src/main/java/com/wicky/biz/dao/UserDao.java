package com.wicky.biz.dao;


import java.util.List;

import com.wicky.biz.entity.UserVO;

public interface UserDao extends AbstractDao<UserVO, Long> {

    /**
     * 创建用户
     * @param user
     */
    UserVO createUser(UserVO user);

    UserVO updateUser(UserVO user);

    void deleteUser(Long userId);


    UserVO findOne(Long userId);

    List<UserVO> findAll();

    /**
     * 根据用户名查找用户
     * @param username
     * @return
     */
    UserVO findByUsername(String username);


}
