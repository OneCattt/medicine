package com.dsl.first.enums;
/**
 *@ClassName ErrorEnum
 *@Description TODO
 *@Author jiangruliang
 *@Date 2019/5/16 16:57
 *@Version 1.0
 */
public enum ErrorEnum {
    /**
     *⽤⼾已存在
     */
    USER_ALREADY_EXISTS("10001", "user already exists"),

    USER_PASSWORD_ERROR("10005", "user account or password error"),
    /**
     *券码已使⽤
     */
    TICKET_CODE_HAS_BEEN_USED("10002", "ticket code has been used"),
    /**
     *券码已全部发完
     */
    TICKET_CODE_ARE_ALL_DELIVERED_OUT("10003", "ticket code are all delivered out"),
    /**
     *券码已过期
     */
    TICKET_CODE_EXPIRED("10004", "ticket code expired");

    /**
     * key
     */
    private String key;

    /**
     * value
     */
    private String value;

    /**
     *
     * @param key
     * @param value <默认构造函数>
     */
    private ErrorEnum(String key, String value)
    {
        this.key = key;
        this.value = value;
    }

    /**
     * <一句话功能简述> 获取key对应的值 <功能详细描述>
     * @param key
     * @return
     * @see [类、类#方法、类#成员]
     */
    public static String getMsg(String key)
    {
        for (ErrorEnum c : ErrorEnum.values())
        {
            if (c.getKey().equals(key))
            {
                return c.value;
            }
        }
        return null;
    }

    public String getKey()
    {
        return key;
    }

    public void setKey(String key)
    {
        this.key = key;
    }

    public String getValue()
    {
        return value;
    }

    public void setValue(String value)
    {
        this.value = value;
    }
}
