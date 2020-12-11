package com.mxnotes.usercenter.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @author ex-aipeng
 * @CreatedDate on 2020/12/5 18:48
 * @Description 用户登录响应
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@NoArgsConstructor
@AllArgsConstructor
public class UserLoginResponse {
    /**
     * 过期时间
     */
    private Integer expirationTime;
    /**
     * token
     */
    private String token;
}
