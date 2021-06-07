package com.youthstudy.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "college_list")
@Data
@EntityListeners(AuditingEntityListener.class)
@Inheritance(strategy = InheritanceType.JOINED)
public class CollegeList {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //自增
    private Long id;
    @Column(columnDefinition = "nvarchar")
    private String collegeName;
    @Column(columnDefinition = "nvarchar")
    private String describeText;
    @Column(columnDefinition = "nvarchar")
    private String schoolBadge;


    @OneToOne
    private CollegeData collegeData;
    /**
     * 创建时间
     */
    @CreatedDate
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime createTime;

    /**
     * 修改时间
     */
    @LastModifiedDate
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime modifyTime;
}
