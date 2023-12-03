package com.ts.weblog.common;

import com.ts.weblog.common.domain.dos.UserDO;
import com.ts.weblog.common.domain.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

@SpringBootTest
class WeblogModuleCommonApplicationTests {

    @Test
    void contextLoads() {
    }

    @Autowired
    private UserMapper userMapper;

    @Test
    void insertTest() {
        // 构建数据库实体类
        UserDO userDO = UserDO.builder()
                .username("ts")
                .password("$2a$10$pvgGeGgvyHNZ0vjK16lTkeEsPgXfT9P01NsL8N68vSy378Bie8JbG")
                .createTime(new Date())
                .updateTime(new Date())
                .isDeleted(false)
                .build();

        userMapper.insert(userDO);
    }

}
