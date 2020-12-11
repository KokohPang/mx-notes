package com.mxnotes.usercenter.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.mxnotes.usercenter.domain.entity.BonusEventLog;
import com.mxnotes.usercenter.dao.bonuseventlog.BonusEventLogMapper;
import com.mxnotes.usercenter.service.IBonusEventLogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 积分变更记录表 服务实现类
 * </p>
 *
 * @author ex-aipeng
 * @since 2020-12-05
 */
@Service
public class BonusEventLogServiceImpl extends ServiceImpl<BonusEventLogMapper, BonusEventLog> implements IBonusEventLogService {
    @Resource
    private BonusEventLogMapper bonusEventLogMapper;

    @Override
    public List<BonusEventLog> listBonusByUserId(Integer userId) {
        QueryWrapper<BonusEventLog> qw = new QueryWrapper<>();
        qw.eq("user_id",userId);
        List<BonusEventLog> bonusEventLogs = bonusEventLogMapper.selectList(qw);
        return bonusEventLogMapper.selectList(qw);
    }
}
