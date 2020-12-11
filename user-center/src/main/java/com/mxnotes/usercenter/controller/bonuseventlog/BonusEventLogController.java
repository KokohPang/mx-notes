package com.mxnotes.usercenter.controller.bonuseventlog;


import com.mxnotes.usercenter.domain.entity.BonusEventLog;
import com.mxnotes.usercenter.service.IBonusEventLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 积分变更记录表 前端控制器
 * </p>
 *
 * @author ex-aipeng
 * @since 2020-12-05
 */
@RestController
@RequestMapping("/users")
public class BonusEventLogController {

    /**
     * 查询当前登录用户积分明细
     */
    @Autowired
    private IBonusEventLogService iBonusEventLogService;

    @GetMapping("/bonus-logs/{userId}")
    public List<BonusEventLog> ListBonus(@PathVariable(name = "userId") Integer userId){
        return iBonusEventLogService.listBonusByUserId(userId);
    }
 /*   @GetMapping("/bonus-logs/{userId}")
    public List<BonusEventLog> userLogin(@PathVariable(name = "userId") Integer userId){
        return iBonusEventLogService.listBonusByUserId(userId);
    }*/
}

