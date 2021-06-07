package com.youthstudy.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Date;

@Entity //说明这是一个实体类
@Table(name = "college_data")
@Data // getter/setter/toString
@EntityListeners(AuditingEntityListener.class)
@Inheritance(strategy = InheritanceType.JOINED)
@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler"})
public class CollegeData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //自增
    private Long id;

    @Temporal(TemporalType.TIMESTAMP)
    private Date dateTime;
    @Column(columnDefinition = "nvarchar")
    private String acceptRate;
    @Column(columnDefinition = "nvarchar")
    private String successRate;
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
