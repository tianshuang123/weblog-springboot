package com.ts.exception;

import org.springframework.security.core.AuthenticationException;
/**
 * @BelongsProject: weblog-springboot
 * @BelongsPackage: com.ts.exception
 * @Author: ts  happyBoy
 * @CreateTime: 2023-11-26  11:47
 * @Description: TODO
 * @Version: 1.0
 */
public class UsernameOrPasswordNullException extends AuthenticationException {
    public UsernameOrPasswordNullException(String msg, Throwable cause) {
        super(msg, cause);
    }

    public UsernameOrPasswordNullException(String msg) {
        super(msg);
    }
}



