package com.example.service.impl;

import com.example.pojo.Role;
import com.example.mapper.RoleMapper;
import com.example.service.IRoleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zhanglishen
 * @since 2022-03-04
 */
@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements IRoleService {

}
