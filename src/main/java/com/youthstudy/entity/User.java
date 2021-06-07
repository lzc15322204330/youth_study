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
@Table(name = "user")
@Data // getter/setter/toString
@AllArgsConstructor //有参构造
@NoArgsConstructor //无参构造
@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler"})
public class User {
    @Id //主键
    @GeneratedValue(strategy = GenerationType.IDENTITY) //自增
    @Column(columnDefinition = "int not null")
    private Long uid;
    @Column(columnDefinition = "varchar(50) not null")
    private String username;
    @Column(columnDefinition = "varchar(50) not null")
    private String password;
    @Column(columnDefinition = "varchar(50)")
    private String lastname;
    @Column(columnDefinition = "tinyint")
    private Integer gender;
    @Column(columnDefinition = "varchar(50)")
    private String phone;
    @Column(columnDefinition = "varchar(50)")
    private String email;
    @Column(columnDefinition = "varchar(50)")
    private String id_card;
    @Column(columnDefinition = "varchar(255)")
    private String head;
    @Column(columnDefinition = "varchar(50)")
    private String college;
    @Column(columnDefinition = "varchar(50)")
    private String major;
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
