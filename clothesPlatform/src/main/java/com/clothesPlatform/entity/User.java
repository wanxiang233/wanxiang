package com.clothesPlatform.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data//自动添加getter和setter方法
@AllArgsConstructor//自动添加全参的构造函数
@NoArgsConstructor//自动添加无参的构造函数
public class User {
    @Id
    private String userId;//账号
    private String password;//密码
    private String role;//职位
    private String userName;//用户名
    private String gender;//性别
    private int height;//身高
    private int weight;//体重

}
