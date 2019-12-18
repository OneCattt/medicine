package com.dsl.first.base;

import org.slf4j.LoggerFactory;

/**
 *@ClassName BaseLogger
 *@Description 基本日志类
 *@Author jiangruliang
 *@Date 2019/5/16 8:53 PM
 *@Version 1.0
 */
public interface BaseLogger
{
    /**
     * logflag 
     */
    boolean DEBUG = false;

    public static boolean isDebugEnabled()
    {
        return DEBUG;
    }
    /**
     * <一句话功能简述>
     * get with the base logger object
     * <功能详细描述>
     * @param clazz
     * @param errorMsg
     * @see [类、类#方法、类#成员]
     */
    public default void getBaseLogger(Class<?> clazz, String errorMsg)
    {
        if (isDebugEnabled())
        {
            LoggerFactory.getLogger(clazz).error(errorMsg);;   
        }
        

    }
}
