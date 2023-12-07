package com.ts.weblog.admin.model.vo.user;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @BelongsProject: weblog-springboot
 * @BelongsPackage: com.ts.weblog.admin.model.vo.user
 * @Author: ts  happyBoy
 * @CreateTime: 2023-12-07  21:53
 * @Description: TODO
 * @Version: 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FindUserInfoRspVO {
    /**
     * 用户名
     */
    private String username;

}



