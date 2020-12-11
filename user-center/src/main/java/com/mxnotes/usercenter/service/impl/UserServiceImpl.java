package com.mxnotes.usercenter.service.impl;

import com.mxnotes.usercenter.domain.entity.User;
import com.mxnotes.usercenter.dao.user.UserMapper;
import com.mxnotes.usercenter.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 分享 服务实现类
 * </p>
 *
 * @author ex-aipeng
 * @since 2020-12-05
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
