package com.ts.weblog.common.exception;

import lombok.Getter;
import lombok.Setter;

/**
 * @BelongsProject: weblog-springboot
 * @BelongsPackage: com.ts.weblog.common.exception
 * @Author: ts  happyBoy
 * @CreateTime: 2023-11-23  21:59
 * @Description: TODO
 * @Version: 1.0
 */
@Getter
@Setter
public class BizException extends RuntimeException {
    // 异常码
    private String errorCode;
    // 错误信息
    private String errorMessage;

    public BizException(BaseExceptionInterface baseExceptionInterface) {
        this.errorCode = baseExceptionInterface.getErrorCode();
        this.errorMessage = baseExceptionInterface.getErrorMessage();
    }
}



