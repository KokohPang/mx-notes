package com.mxnotes.contentcenter;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author ex-aipeng
 * @CreatedDate on 2020/12/12 1:47
 * @Description
 */
@SpringBootApplication
@MapperScan("com.mxnotes.contentcenter.infrastructure.mapper")
public class ContentApplication {
    public static void main(String[] args) {
        SpringApplication.run(ContentApplication.class, args);
    }
}
