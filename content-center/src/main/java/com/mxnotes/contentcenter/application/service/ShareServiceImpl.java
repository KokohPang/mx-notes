package com.mxnotes.contentcenter.application.service;

import com.mxnotes.contentcenter.domain.Share;
import com.mxnotes.contentcenter.infrastructure.mapper.ShareMapper;
import com.mxnotes.contentcenter.application.IShareService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 分享表 服务实现类
 * </p>
 *
 * @author ex-aipeng
 * @since 2020-12-07
 */
@Service
public class ShareServiceImpl extends ServiceImpl<ShareMapper, Share> implements IShareService {

}
