package com.dsl.first.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import javax.validation.constraints.Future;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * @ClassName Admin
 * @Description admin
 * @Author jiangruliang
 * @Date 2019/5/16 16:34
 * @Version 1.0
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Admin {
    private Long id;
    @NotNull(message = "账号不能为空")
    private String username;
    @NotNull(message = "密码不能为空")
    private String password;
    @NotNull(message = "券码预发总量不能为空")@Min(value = 0,message = "券码预发总量必须大于等于0")
    private Integer totalcode;
    @NotNull(message = "有效期不能为空")@Future(message = "有效期不能小于今日")
    private Date exp;
    @NotNull(message = "单用户领取上限不能为空")@Min(value = 1,message = "单用户领取上限必须大于等于1")
    private Integer userlimit;
}
