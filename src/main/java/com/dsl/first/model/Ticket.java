package com.dsl.first.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.Date;

/**
 * @ClassName Ticket
 * @Description 票
 * @Author jiangruliang
 * @Date 2019/5/16 16:32
 * @Version 1.0
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Ticket {
    private Long id;
    private Long userId;
    private String ticketCode;
    private Integer usestatus;
    private String ticketdesc;
    private Date exp;
    private String field;
}
