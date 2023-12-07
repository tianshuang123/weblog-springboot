package com.ts.weblogweb.web;

import com.ts.weblog.common.domain.dos.UserDO;
import com.ts.weblog.common.domain.mapper.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

@SpringBootTest
@Slf4j
class WeblogWebApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Test
    void insertTest() {
        // 构建数据库实体类
        UserDO userDO = UserDO.builder()
                .username("test")
                .password("$2a$10$erZo53hPj1htak9znqVzw.w3Gv4mpkKfhT3wLaR0mjCqbsXIxvjsy")
                .createTime(new Date())
                .updateTime(new Date())
                .isDeleted(false)
                .build();

        userMapper.insert(userDO);
    }

    @Test
    void testLog() {
        log.info("这是一行 Info 级别日志");
        log.warn("这是一行 Warn 级别日志");
        log.error("这是一行 Error 级别日志");

        // 占位符
        String author = "ts";
        log.info("这是一行带有占位符日志，作者：{}", author);
    }


    @Test
    void test() {

        String mainString = "Hello, World!";
        int index = mainString.indexOf("World");

        if (index != -1) {
            System.out.println("Found at index " + index);
        } else {
            System.out.println("Not found");
        }

    }

}
