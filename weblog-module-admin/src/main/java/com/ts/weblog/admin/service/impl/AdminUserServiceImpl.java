package com.ts.weblog.admin.service.impl;

import com.ts.weblog.admin.model.vo.UpdateAdminUserPasswordReqVO;
import com.ts.weblog.admin.model.vo.user.FindUserInfoRspVO;
import com.ts.weblog.admin.service.AdminUserService;
import com.ts.weblog.common.domain.mapper.UserMapper;
import com.ts.weblog.common.enums.ResponseCodeEnum;
import com.ts.weblog.common.utils.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

/**
 * @BelongsProject: weblog-springboot
 * @BelongsPackage: com.ts.weblog.admin.service.impl
 * @Author: ts  happyBoy
 * @CreateTime: 2023-12-05  23:15
 * @Description: TODO
 * @Version: 1.0
 */
@Service
public class AdminUserServiceImpl implements AdminUserService {

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private PasswordEncoder passwordEncoder;

    /**
     * 修改密码
     * @param updateAdminUserPasswordReqVO
     * @return
     */
    @Override
    public Response updatePassword(UpdateAdminUserPasswordReqVO updateAdminUserPasswordReqVO) {
        // 拿到用户名、密码
        String username = updateAdminUserPasswordReqVO.getUsername();
        String password = updateAdminUserPasswordReqVO.getPassword();

        // 加密密码
        String encodePassword = passwordEncoder.encode(password);

        // 更新到数据库
        int count = userMapper.updatePasswordByUsername(username, encodePassword);

        return count == 1 ? Response.success() : Response.fail(ResponseCodeEnum.USERNAME_NOT_FOUND);
    }


    /**
     * 获取当前登录用户信息
     * @return
     */
    @Override
    public Response findUserInfo() {
        // 获取存储在 ThreadLocal 中的用户信息
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        // 拿到用户名
        String username = authentication.getName();

        return Response.success(FindUserInfoRspVO.builder().username(username).build());
    }
}



