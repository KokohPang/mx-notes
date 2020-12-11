package com.mxnotes.usercenter.domain.enums;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Setter;

/**
 * @author ex-aipeng
 * @CreatedDate on 2020/12/5 19:06
 * @Description
 */

public enum ResponseStatusCodeEnum {
    /**、
     * 成功
     */
    OK(200,"SUCCESS" ),
    /**、
     * 失败
     */
    ERROR(500,"NoSUCCESS" ),
    /**
     * 没找到
     */
    NOTFOUND(404,"Not Found"),
    /**
     * 禁止
     */
    FORBIDDEN(403,"Forbidden"),
    /**
     * 未允许
     */
    UNAUTHORIZED(401,"Unauthorized");
    // 成员变量
    private int code;
    private String statusName;

     // 构造方法 默认私有化
     ResponseStatusCodeEnum(int code,String statusName) {
         this.code = code;
         this.statusName = statusName;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getStatusName() {
        return statusName;
    }

    public void setStatusName(String statusName) {
        this.statusName = statusName;
    }
}
