package com.clothesPlatform.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Post {//帖子表
    @Id
    private int postId;//帖子id
    private String userId;//发帖人id
    private String title;//帖子标题
    private String content;//帖子内容
    private String date;//发帖日期
}
