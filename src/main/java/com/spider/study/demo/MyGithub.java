package com.spider.study.demo;

import com.geccocrawler.gecco.GeccoEngine;
import com.geccocrawler.gecco.annotation.*;
import com.geccocrawler.gecco.spider.HtmlBean;
import lombok.Data;

/**
 * @ProjectName: demo
 * @Package: com.example.demo.seeker
 * @ClassName: MyGithub
 * @Author: fel
 * @Description:
 * @Date: 2019/12/12 下午2:07
 */
@Data
//@Gecco(matchUrl="https://github.com/{user}/{project}", pipelines="consolePipeline")
public class MyGithub implements HtmlBean {

    private static final long serialVersionUID = -7127412585200687225L;

    @RequestParameter("user")
    private String user;

    @RequestParameter("project")
    private String project;

    @Text
    @HtmlField(cssPath=".repository-meta-content")
    private String title;

    @Text
    @HtmlField(cssPath=".pagehead-actions li:nth-child(2) .social-count")
    private int star;

    @Text
    @HtmlField(cssPath=".pagehead-actions li:nth-child(3) .social-count")
    private int fork;

    @Html
    @HtmlField(cssPath=".entry-content")
    private String readme;

}