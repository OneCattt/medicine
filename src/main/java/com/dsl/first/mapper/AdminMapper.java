package com.dsl.first.mapper;

import com.dsl.first.model.Admin;
/**
 *@ClassName AdminMapper
 *@Description TODO
 *@Author jiangruliang
 *@Date 2019/5/16 9:26 PM
 *@Version 1.0
 */
public interface AdminMapper {

    Admin selectAdmin(Admin admin);

    int updateAdmin(Admin admin);
}
