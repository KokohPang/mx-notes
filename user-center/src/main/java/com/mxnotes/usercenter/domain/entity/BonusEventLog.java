package com.mxnotes.usercenter.domain.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * <p>
 * 积分变更记录表
 * </p>
 *
 * @author ex-aipeng
 * @since 2020-12-05
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("bonus_event_log")
@NoArgsConstructor
@AllArgsConstructor
public class BonusEventLog implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * Id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * userId
     */
    @TableField("user_id")
    private Integer userId;

    /**
     * 积分操作值
     */
    @TableField("value")
    private Integer value;

    /**
     * 发生的事件
     */
    @TableField("event")
    private String event;

    /**
     * 创建时间
     */
    @TableField("create_time")
    private LocalDateTime createTime;

    /**
     * 描述
     */
    @TableField("description")
    private String description;


}
