package com.example.demo02.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("用户实体类")
public class user {
    @ApiModelProperty("用户名")
    public String userame;
    @ApiModelProperty("密码")
    public String password;
}
