package com.ts.weblog.common.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @BelongsProject: weblog-springboot
 * @BelongsPackage: com.ts.weblog.common.config
 * @Author: ts  happyBoy
 * @CreateTime: 2023-11-25  23:25
 * @Description: TODO
 * @Version: 1.0
 */
@Configuration
@MapperScan("com.ts.weblog.common.domain.mapper")
public class MybatisPlusConfig {
}



