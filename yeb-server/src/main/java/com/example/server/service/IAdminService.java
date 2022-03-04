package com.example.server.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.server.pojo.Admin;
import com.example.server.pojo.RespBean;

import javax.servlet.http.HttpServletRequest;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author zhanglishen
 * @since 2022-03-04
 */
public interface IAdminService extends IService<Admin> {
    /**
     * 登录之后返回Token
     *
     * @param username
     * @param password
     * @param request
     * @return
     */
    RespBean login(String username, String password, HttpServletRequest request);

    /**
     * 根据用户获取用户
     *
     * @param username
     * @return
     */
    Admin getAdminByUserName(String username);
}
