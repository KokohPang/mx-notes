package com.mxnotes.usercenter.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @author ex-aipeng
 * @CreatedDate on 2020/12/5 18:37
 * @Description  用户响应DTO
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@NoArgsConstructor
@AllArgsConstructor
public class UserResponseDTO {
    /**
     * 头像地址
     */
    private String avatarUrl;
    /**
     * 积分
     */
    private Integer bonus;
    /**
     * id
     */
    private Integer id;
    /**
     * 微信昵称
     */
    private String wxNickname;
}
