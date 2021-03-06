package com.hengyunsoft.platform.exchange.api.system.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
@ApiModel(value = "ShareResponseDbSourceDTO", description = "数据源返回信息")
public class ShareResponseDbSourceDTO implements Serializable {

    /**
     * 主键
     *
     * @mbggenerated
     */
    @ApiModelProperty(value = "主键")
    private Long id;

    /**
     * 单位id
     *
     * @mbggenerated
     */
    @ApiModelProperty(value = "单位id")
    private String unitId;

    /**
     * 单位名称
     *
     * @mbggenerated
     */
    @ApiModelProperty(value = "单位名称")
    private String systemName;
    /**
     * 数据源名称
     *
     * @mbggenerated
     */
    @ApiModelProperty(value = "数据源名称")
    private String sourceName;

    /**
     * 数据库名
     *
     * @mbggenerated
     */
    @ApiModelProperty(value = "数据库名")
    private String dbName;

    /**
     * 数据库端口
     *
     * @mbggenerated
     */
    @ApiModelProperty(value = "数据库端口")
    private String dbPort;

    /**
     * 数据库地址
     *
     * @mbggenerated
     */
    @ApiModelProperty(value = "数据库地址")
    private String dbAddress;

    /**
     * 连接类型：1，Basic;2,TNS
     *
     * @mbggenerated
     */
    @ApiModelProperty(value = "连接类型")
    private Integer contType;

    /**
     * 数据库类型:1,orcale;2,mysql;3,sqlserver;
     *
     * @mbggenerated
     */
    @ApiModelProperty(value = "数据库类型")
    private Integer dbType;

    /**
     * 服务类型：1，服务名；2，SID
     *
     * @mbggenerated
     */
    @ApiModelProperty(value = "服务类型")
    private Integer serverType;

    /**
     * 数据库账号
     *
     * @mbggenerated
     */
    @ApiModelProperty(value = "数据库账号")
    private String dbAccount;

    /**
     * 数据库密码
     *
     * @mbggenerated
     */
    @ApiModelProperty(value = "数据库密码")
    private String dbPassword;

    /**
     * 创建时间
     *
     * @mbggenerated
     */
    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    /**
     * 创建人
     *
     * @mbggenerated
     */
    @ApiModelProperty(value = "创建人")
    private Long createUser;

    /**
     * 更新时间
     *
     * @mbggenerated
     */
    @ApiModelProperty(value = "更新时间")
    private Date updateTime;

    /**
     * 更新人
     *
     * @mbggenerated
     */
    @ApiModelProperty(value = "更新人")
    private Long updateUser;
}
