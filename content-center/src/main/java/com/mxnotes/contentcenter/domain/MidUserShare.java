package com.mxnotes.contentcenter.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 用户-分享中间表【描述用户购买的分享】
 * </p>
 *
 * @author ex-aipeng
 * @since 2020-12-07
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("mid_user_share")
public class MidUserShare implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * share.id
     */
    @TableField("share_id")
    private Integer shareId;

    /**
     * user.id
     */
    @TableField("user_id")
    private Integer userId;


}
