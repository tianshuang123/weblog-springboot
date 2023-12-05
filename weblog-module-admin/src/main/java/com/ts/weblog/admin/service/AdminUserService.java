package com.ts.weblog.admin.service;

import com.ts.weblog.admin.model.vo.UpdateAdminUserPasswordReqVO;
import com.ts.weblog.common.utils.Response;

/**
 * @BelongsProject: weblog-springboot
 * @BelongsPackage: com.ts.weblog.admin.service
 * @Author: ts  happyBoy
 * @CreateTime: 2023-12-05  23:14
 * @Description: TODO
 * @Version: 1.0
 */
public interface AdminUserService {
    /**
     * 修改密码
     * @param updateAdminUserPasswordReqVO
     * @return
     */
    Response updatePassword(UpdateAdminUserPasswordReqVO updateAdminUserPasswordReqVO);
}
