package com.example.server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.server.mapper.DepartmentMapper;
import com.example.server.pojo.Department;
import com.example.server.service.IDepartmentService;
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
public class DepartmentServiceImpl extends ServiceImpl<DepartmentMapper, Department> implements IDepartmentService {

}
