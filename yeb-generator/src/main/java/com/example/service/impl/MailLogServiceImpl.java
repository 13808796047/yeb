package com.example.service.impl;

import com.example.pojo.MailLog;
import com.example.mapper.MailLogMapper;
import com.example.service.IMailLogService;
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
public class MailLogServiceImpl extends ServiceImpl<MailLogMapper, MailLog> implements IMailLogService {

}
