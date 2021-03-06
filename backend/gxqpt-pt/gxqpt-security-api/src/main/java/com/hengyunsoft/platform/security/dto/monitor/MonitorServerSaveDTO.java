package com.hengyunsoft.platform.security.dto.monitor;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

@Data
@ApiModel
public class MonitorServerSaveDTO implements Serializable{
    @ApiModelProperty(value = "服务ip")
    private String serverIp;

    @ApiModelProperty(value = "服务名称")
    private String name;

    @ApiModelProperty(value = "账号")
    private String account;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    @ApiModelProperty(value = "预警时间")
    private Date warnTime;

    @ApiModelProperty(value = "备注")
    private String remarks;
}
