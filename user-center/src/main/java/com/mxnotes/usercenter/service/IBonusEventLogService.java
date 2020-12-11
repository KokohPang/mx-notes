package com.mxnotes.usercenter.service;

import com.mxnotes.usercenter.domain.entity.BonusEventLog;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 积分变更记录表 服务类
 * </p>
 *
 * @author ex-aipeng
 * @since 2020-12-05
 */
public interface IBonusEventLogService extends IService<BonusEventLog> {
    /**
     * 查询当前登录用户积分明细
     */
    List<BonusEventLog> listBonusByUserId(Integer userId);

}
