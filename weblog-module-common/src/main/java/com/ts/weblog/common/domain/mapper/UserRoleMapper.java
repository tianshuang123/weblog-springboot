package com.ts.weblog.common.domain.mapper;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ts.weblog.common.domain.dos.UserRoleDO;

import java.util.List;

/**
 * @BelongsProject: weblog-springboot
 * @BelongsPackage: com.ts.weblog.common.domain.mapper
 * @Author: ts  happyBoy
 * @CreateTime: 2023-12-03  19:35
 * @Description: TODO
 * @Version: 1.0
 */
public interface UserRoleMapper extends BaseMapper<UserRoleDO> {
    /**
     * 根据用户名查询
     * @param username
     * @return
     */
    default List<UserRoleDO> selectByUsername(String username) {
        LambdaQueryWrapper<UserRoleDO> wrapper = new LambdaQueryWrapper<>();
        wrapper.eq(UserRoleDO::getUsername, username);

        return selectList(wrapper);
    }
}
