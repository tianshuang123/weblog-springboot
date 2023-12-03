package com.ts.weblog.common.aspect;

import java.lang.annotation.*;

/**
 * @BelongsProject: weblog-springboot
 * @BelongsPackage: com.ts.weblog.common.aspect
 * @Author: ts  happyBoy
 * @CreateTime: 2023-11-22  23:02
 * @Description: TODO
 * @Version: 1.0
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
@Documented
public @interface ApiOperationLog {
    /**
     * API 功能描述
     *
     * @return
     */
    String description() default "";

}
