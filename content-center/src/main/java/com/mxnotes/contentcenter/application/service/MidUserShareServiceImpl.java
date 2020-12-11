package com.mxnotes.contentcenter.application.service;

import com.mxnotes.contentcenter.domain.MidUserShare;
import com.mxnotes.contentcenter.infrastructure.mapper.MidUserShareMapper;
import com.mxnotes.contentcenter.application.IMidUserShareService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户-分享中间表【描述用户购买的分享】 服务实现类
 * </p>
 *
 * @author ex-aipeng
 * @since 2020-12-07
 */
@Service
public class MidUserShareServiceImpl extends ServiceImpl<MidUserShareMapper, MidUserShare> implements IMidUserShareService {

}
