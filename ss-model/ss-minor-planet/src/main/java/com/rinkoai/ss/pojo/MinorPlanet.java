package com.rinkoai.ss.pojo;

import java.io.Serializable;
import lombok.Data;

@Data
public class MinorPlanet implements Serializable {
    /**
     *
     */
    private Long id;

    /**
     * 编号
     */
    private String number;

    /**
     * 绝对星等
     */
    private Double absoluteMagnitude;

    /**
     * 斜率参数
     */
    private Double slopeParameter;

    /**
     * 纪元
     */
    private String epoch;

    /**
     * 纪元的平均异常
     */
    private Double meanAnomalyEpoch;

    /**
     * 近日点幅角
     */
    private Double argumentPerihelion;

    /**
     * 升交点经度
     */
    private Double longitudeAscendNode;

    /**
     * 黄道倾角
     */
    private Double inclinationEcliptic;

    /**
     * 轨道离心率
     */
    private Double orbitalEccentricity;

    /**
     * 平均每日运动
     */
    private Double meanDailyMotion;

    /**
     * 半长轴
     */
    private Double semimajorAxis;

    /**
     * 不确定参数
     */
    private String uncertaintyParameter;

    /**
     * 参考
     */
    private String reference;

    /**
     * 观察次数
     */
    private Integer observations;

    /**
     * 冲日次数
     */
    private Integer oppositions;

    /**
     * 多/单向冲日轨道数量
     */
    private String orbits;

    /**
     * residual
     */
    private Double rmsResidual;

    /**
     * perturbers
     */
    private String perturbers;

    /**
     * 电脑名称
     */
    private String computerName;

    /**
     * 4位十六进制标志
     */
    private String hexdigitFlag;

    /**
     * 行星名称
     */
    private String name;

    /**
     * 最后一次观察的日期
     */
    private Integer lastDate;

    private static final long serialVersionUID = 1L;
}

