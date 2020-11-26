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
public class Clothing {
    @Id
    private int clothesId;//服装id
    private String type;//服装的类型
    private String description;//服装的描述
    private int rent;//租金
    private String belong;//服装所属
}
