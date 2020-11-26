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
public class Comment {//帖子的评论
    @Id
    private int commentId;//评论id
    private int postId;//关联的的帖子id
    private String userId;//评论人
    private String content;//评论内容
    private String date;//评论时间
    private int storey;//评论的楼层顺序
}
