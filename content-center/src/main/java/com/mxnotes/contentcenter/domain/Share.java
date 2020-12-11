package com.mxnotes.contentcenter.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 分享表
 * </p>
 *
 * @author ex-aipeng
 * @since 2020-12-07
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("share")
public class Share implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 发布人id
     */
    @TableField("user_id")
    private Integer userId;

    /**
     * 标题
     */
    @TableField("title")
    private String title;

    /**
     * 创建时间
     */
    @TableField("create_time")
    private LocalDateTime createTime;

    /**
     * 修改时间
     */
    @TableField("update_time")
    private LocalDateTime updateTime;

    /**
     * 是否原创 0:否 1:是
     */
    @TableField("is_original")
    private Boolean isOriginal;

    /**
     * 作者
     */
    @TableField("author")
    private String author;

    /**
     * 封面
     */
    @TableField("cover")
    private String cover;

    /**
     * 概要信息
     */
    @TableField("summary")
    private String summary;

    /**
     * 价格（需要的积分）
     */
    @TableField("price")
    private Integer price;

    /**
     * 下载地址
     */
    @TableField("download_url")
    private String downloadUrl;

    /**
     * 下载数 
     */
    @TableField("buy_count")
    private Integer buyCount;

    /**
     * 是否显示 0:否 1:是
     */
    @TableField("show_flag")
    private Boolean showFlag;

    /**
     * 审核状态 NOT_YET: 待审核 PASSED:审核通过 REJECTED:审核不通过
     */
    @TableField("audit_status")
    private String auditStatus;

    /**
     * 审核不通过原因
     */
    @TableField("reason")
    private String reason;


}
