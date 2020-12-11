package com.mxnotes.usercenter.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @author ex-aipeng
 * @CreatedDate on 2020/12/5 18:51
 * @Description 用户登录响应DTO
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@NoArgsConstructor
@AllArgsConstructor
public class UserLoginResponseDTO {
    /**
     * token信息
     */
    private UserLoginResponse token;
    /**
     * 用户相应DTO
     */
    private UserResponseDTO userRespons;
}
