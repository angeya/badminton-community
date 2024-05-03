package top.angeya.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;

/**
 * 实体类
 * @author: angeya
 * @date: 2024/5/1 20:35
 * @description:
 */
@Data
@TableName
public class Racket {

    /**
     * 雪花算法id
     */
    @TableId(type = IdType.ASSIGN_ID)
    private String id;

    /**
     * 名称
     */
    private String name;

    /**
     * 价格
     */
    private Float price;

    /**
     * 品牌
     */
    private String brand;

    /**
     * 颜色
     */
    private String color;

    /**
     * 重量等级 U
     */
    private Integer weightGrade;

    /**
     * 重量范围 g
     */
    private String weightRange;

    /**
     * 长度 mm
     */
    private Float length;

    /**
     * 材质
     */
    private String materialId;

    /**
     * 平衡点(距离拍柄) <285mm: 防守 185-190mm: 攻守兼备 >290mm: 进攻拍
     */
    private Float balancePoint;

    /**
     * (建议)最小拉力 磅 bls
     */
    private Integer minTension;

    /**
     * 最大拉力 磅 bls
     */
    private Integer maxTension;

    /**
     * 手柄粗细 G(0-6) 数字越大 手柄越细
     */
    private Integer grip;

    /**
     * 线孔数
     */
    private Integer stringHoleCount;

    /**
     * 上市时间
     */
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private LocalDateTime timeToMarket;

    /**
     * 数据创建时间
     */
    private LocalDateTime createTime;

    /**
     * 数据更新时间
     */
    private LocalDateTime updateTime;

}
