package com.cxy.pojo;

import lombok.Data;
import net.sf.jsqlparser.expression.DateTimeLiteralExpression;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * (Jiaoyi)实体类
 *
 * @author makejava
 * @since 2021-03-01 23:48:42
 */
@Data
public class Jiaoyi implements Serializable {
    private static final long serialVersionUID = 538811095981481933L;
    
    private Integer jiaoyiId;
    /**
    * 交易流水号
    */
    private Integer jiaoyiNumber;
    /**
    * 用户
    */
    private String jiaoyiUsername;
    /**
    * 交易金额
    */
    private Double jiaoyiPrice;
    /**
    * 支付来源
    */
    private String jiaoyiSource;
    /**
    * 支付方式
    */
    private String jiaoyiPayway;
    /**
    * 交易状态
    */
    private String jiaoyiState;
    /**
    * 交易时间
    */
    private String jiaoyiTime;

}