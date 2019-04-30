package com.github.fish56.SpringFoxSwaggerImpl.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@ApiModel(value="文章对象")
@Getter @Setter
public class Article {
    private Integer id;
    @ApiModelProperty(value="文章标题" ,required=true)
    private String title;
    @ApiModelProperty(value="文章内容" ,required=true)
    private String content;
    @ApiModelProperty(value="作者id" ,required=true)
    private Integer userId;
}
