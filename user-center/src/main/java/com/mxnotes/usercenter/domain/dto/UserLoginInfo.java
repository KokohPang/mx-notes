package com.mxnotes.usercenter.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @author ex-aipeng
 * @CreatedDate on 2020/12/5 18:46
 * @Description 用户登录信息 (都是必须参数 required)
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@NoArgsConstructor
@AllArgsConstructor
public class UserLoginInfo {
    /**
     * 头像地址
     */
    private String avatarUrl;
    /**
     * 微信昵称
     */
    private String wxNickname;
    /**
     * 状态码
     */
    private String code;
}
