package com.money.store.model;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
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
 * @author money
 * @since 2020-12-06
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="AmsAppTemporary对象", description="")
public class AmsAppTemporary implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.ASSIGN_ID)
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

    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createTime;

    @ApiModelProperty(value = "更新时间")
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private LocalDateTime updateTime;


}
