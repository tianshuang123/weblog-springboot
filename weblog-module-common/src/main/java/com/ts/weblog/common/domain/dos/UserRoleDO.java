package com.ts.weblog.common.domain.dos;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Builder;
import lombok.Data;

import java.util.Date;

/**
 * @BelongsProject: weblog-springboot
 * @BelongsPackage: com.ts.weblog.common.domain.dos
 * @Author: ts  happyBoy
 * @CreateTime: 2023-12-03  19:34
 * @Description: TODO
 * @Version: 1.0
 */
@Data
@Builder
@TableName("t_user_role")
public class UserRoleDO {
    @TableId(type = IdType.AUTO)
    private Long id;
    private String username;
    private String role;
    private Date createTime;
}



