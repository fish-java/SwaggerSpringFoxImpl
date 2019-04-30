package com.github.fish56.SpringFoxSwaggerImpl.controller;

import com.github.fish56.SpringFoxSwaggerImpl.pojo.Article;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/articles")
public class ArticlesController {
    // 说明这个接口是干什么的
    @ApiOperation(value = "获得文章列表")

    // 调用接口需要传入的参数
    @ApiImplicitParams({
            @ApiImplicitParam(name = "authorId", dataType = "Integer",
                  value = "作者id", paramType = "query", required = false),
            @ApiImplicitParam(name = "label", dataType = "String",
                    value = "文章标签", required = false)
    })
    @GetMapping
    public List<Article> getArticles(
            @RequestParam(required = false) Integer authorId,
            @RequestParam(required = false) String label){

        return new ArrayList<Article>();
    }

    @ApiOperation(value = "获得单个文章")
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Article getArticle(@PathVariable Integer id){

        return new Article();
    }

    @ApiOperation(value = "创建一篇文章")
    @PostMapping
    public Article postArticle(@RequestBody Article article){
        article.setId(2);
        return article;
    }
}
