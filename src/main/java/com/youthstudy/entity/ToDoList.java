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
@Table(name = "todo_list")
@Data // getter/setter/toString
@AllArgsConstructor //有参构造
@NoArgsConstructor //无参构造
@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler"})
public class ToDoList {
    @Id //主键
    @GeneratedValue(strategy = GenerationType.IDENTITY) //自增
    @Column(columnDefinition = "int")
    private Long tid;
    @Column(columnDefinition = "varchar(255)")
    private String mission;
    @Column(columnDefinition = "varchar(255)")
    private String missionTime;
    @Column(columnDefinition = "tinyint(1)")
    private Integer checkList;
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
