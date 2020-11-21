package com.money.store.model;

import java.time.LocalDateTime;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author Money
 * @since 2020-11-17
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="AmsAppTemporary对象", description="")
public class AmsAppTemporary implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    @ApiModelProperty(value = "开发者")
    private String dev;

    @ApiModelProperty(value = "安装包")
    private String installFile;

    @ApiModelProperty(value = "包名")
    private String packageName;

    @ApiModelProperty(value = "版本名")
    private String versionName;

    @ApiModelProperty(value = "版本号")
    private String versionCode;

    private LocalDateTime createTime;


}
