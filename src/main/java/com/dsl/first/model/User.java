package com.dsl.first.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.Date;

/**
 * @ClassName User
 * @Description 用户表
 * @Author jiangruliang
 * @Date 2019/5/16 16:24
 * @Version 1.0
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class User {
    private Long id;
    private String username;
    private String password;
    private Date createdAt;
    private Date updatedAt;
}
