package com.rinkoai.mapper;

import com.rinkoai.ss.pojo.SsUser;

public interface SsUserMapper {

    /**
     * 根据用户名查询用户
     */
    SsUser selectByName(String name);

}
