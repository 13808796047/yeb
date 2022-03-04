package com.example.service.impl;

import com.example.pojo.Nation;
import com.example.mapper.NationMapper;
import com.example.service.INationService;
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
public class NationServiceImpl extends ServiceImpl<NationMapper, Nation> implements INationService {

}
