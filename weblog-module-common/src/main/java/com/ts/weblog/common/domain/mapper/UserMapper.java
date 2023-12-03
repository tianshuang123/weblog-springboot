package com.ts.weblog.common.domain.mapper;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ts.weblog.common.domain.dos.UserDO;

/**
 * @BelongsProject: weblog-springboot
 * @BelongsPackage: com.ts.weblog.common.domain.mapper
 * @Author: ts  happyBoy
 * @CreateTime: 2023-11-26  10:12
 * @Description: TODO
 * @Version: 1.0
 */
public interface UserMapper extends BaseMapper<UserDO> {
    default UserDO findByUsername(String username) {
        LambdaQueryWrapper<UserDO> wrapper = new LambdaQueryWrapper<>();
        wrapper.eq(UserDO::getUsername, username);
        return selectOne(wrapper);
    }
}
