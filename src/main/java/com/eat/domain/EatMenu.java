package com.eat.domain;

import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EatMenu {
    /**
    * 菜谱表Id
    */
    private Long id;

    /**
    * 菜谱编码
    */
    private String code;

    /**
    * 菜品名称
    */
    private String name;

    /**
    * 菜品简介
    */
    private String synopsis;

    /**
    * 属于什么菜系：川菜.
    */
    private String type;

    /**
    * 食物类型，粥，粉，米饭...
    */
    private String foodType;

    /**
    * 菜品口味：酸甜苦辣
    */
    private String taste;

    /**
    * 菜的分量
    */
    private String weight;

    /**
    * 价格预算
    */
    private BigDecimal price;

    /**
    * 菜所知名地域
    */
    private String territory;

    /**
    * 菜图片预览，多个图片用;隔离开
    */
    private String image;

    /**
    * 菜品来源，自建或者其他爬虫
    */
    private String source;

    /**
    * 适合吃的时间
    */
    private String eatTime;

    /**
    * 食品的成分
    */
    private String ingredient;

    /**
    * 做法
    */
    private String practice;

    /**
    * 荤菜还是素菜
    */
    private String clitocybine;

    /**
    * 制作方法：煮，炒，，
    */
    private String markMethod;

    /**
    * 一份够吃的人数
    */
    private String eatPeople;

    /**
    * 备注
    */
    private String remark;
}