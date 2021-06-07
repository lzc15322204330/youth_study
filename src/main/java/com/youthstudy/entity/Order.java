package com.youthstudy.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.util.Date;

@Entity //说明这是一个实体类
@Table(name = "order_list")
@Data // getter/setter/toString
@AllArgsConstructor //有参构造
@NoArgsConstructor //无参构造
@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler"})
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //自增
    private Long id;
    @Column(columnDefinition = "nvarchar(32)")
    private String orderId;
    @Column(columnDefinition = "nvarchar")
    private String carId;
    @Column(columnDefinition = "nvarchar(32)")
    private String userName;
    @Column(columnDefinition = "nvarchar(18)")
    private String userPhone;
    @Column(columnDefinition = "int(11)")
    private Integer totalNum;
    @Column(columnDefinition = "decimal(8,2) unsigned")
    private double totalPrice;
    @Column(columnDefinition = "int(11)")
    private Long couponId;
    @Column(columnDefinition = "decimal(8,2) unsigned")
    private double couponPrice;
    @Column(columnDefinition = "tinyint(1)")
    private Integer paId;
    @Column(columnDefinition = "tinyint(1)")
    private Integer payType;
    @Column(columnDefinition = "tinyint(1)")
    private Integer orderStatus;

    /**
     * 创建时间
     */
    @CreatedDate
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    /**
     * 修改时间
     */
    @LastModifiedDate
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private Date modifyTime;
}
