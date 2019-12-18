package com.dsl.first.util;

import java.util.List;
import java.util.Map;



/**
 * 
 * <一句话功能简述> 常用工具类 <功能详细描述>
 * 
 * @author JACK HUANG
 * @version [版本号, 2017年7月27日]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
public class NomalUtil
{

    /**
     * <一句话功能简述> 判断字符串是否为空 <功能详细描述>
     * @param val
     * @return
     * @see [类、类#方法、类#成员]
     */
    public static boolean isNull(String val)
    {
        if (null == val || val.length() <= 0 || val.equals(""))
        {
            return true;
        }
        ;
        return false;

    }

    /**
     * 空值判断 支持判断对象是否为null，判断字符串是否为空，List和Map是否为空
     * @param obj
     * @return
     * @see [类、类#方法、类#成员]
     */
    public static boolean isNullOrEmpty(Object obj)
    {
        if (null == obj)
        {
            return true;
        }
        else if (obj instanceof String)
        {
            return obj.equals("");
        }
        else if (obj instanceof List)
        {
            List<?> list = (List<?>) obj;
            return list.isEmpty();
        }
        else if (obj instanceof Map)
        {
            Map<?, ?> map = (Map<?, ?>) obj;
            return map.isEmpty();
        }
        return false;
    }

}
