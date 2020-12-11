package com.mxnotes.contentcenter.application.service;

import com.mxnotes.contentcenter.domain.Notice;
import com.mxnotes.contentcenter.infrastructure.mapper.NoticeMapper;
import com.mxnotes.contentcenter.application.INoticeService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author ex-aipeng
 * @since 2020-12-07
 */
@Service
public class NoticeServiceImpl extends ServiceImpl<NoticeMapper, Notice> implements INoticeService {

}
