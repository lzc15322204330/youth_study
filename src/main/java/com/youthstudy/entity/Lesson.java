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
@Table(name = "lesson")
@Data // getter/setter/toString
@AllArgsConstructor //有参构造
@NoArgsConstructor //无参构造
@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler"})
public class Lesson {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //自增
    private Long id;
    @Column(columnDefinition = "nvarchar(50)")
    private String lessonId;
    @Column(columnDefinition = "varchar(50)")
    private String type;
    @Column(columnDefinition = "nvarchar(255)")
    private String lessonName;
    @Column(columnDefinition = "NTEXT")
    private String photo;
    @Column(columnDefinition = "decimal(18, 2)")
    private double bill;
    @Column(columnDefinition = "int")
    private Integer readCount;
    @Column(columnDefinition = "NTEXT")
    private String lessonDes;

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
