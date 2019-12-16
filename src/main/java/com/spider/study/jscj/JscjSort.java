package com.spider.study.jscj;

import com.geccocrawler.gecco.annotation.Gecco;
import com.geccocrawler.gecco.annotation.HtmlField;
import com.geccocrawler.gecco.annotation.Request;
import com.geccocrawler.gecco.request.HttpRequest;
import com.geccocrawler.gecco.spider.HtmlBean;
import lombok.Data;

import java.util.List;

/**
 * @ProjectName: spider
 * @Package: com.spider.study.jscj
 * @ClassName: AllSort
 * @Author: fel
 * @Description: 实体类映射需要抓取的数据
 * @Date: 2019/12/16 上午9:44
 */
@Data
@Gecco(matchUrl="https://www.jinse.com/", pipelines={"jscjSortPipeline"})
public class JscjSort implements HtmlBean {

    private static final long serialVersionUID = -1673873361831247230L;

    @Request
    private HttpRequest request;

    /**
     * 新闻
     */
    @HtmlField(cssPath="section > div.js-main__l > div.js-left > div:nth-child(2)")
    private List<Category> headlines;

    /**
     * 新闻
     */
    @HtmlField(cssPath="section > div.js-main__l > div.js-left > div:nth-child(3)")
    private List<Category> news;

    /**
     * 政策
     */
    @HtmlField(cssPath="section > div.js-main__l > div.js-left > div:nth-child(4)")
    private List<Category> policy;

    /**
     * 直播
     */
    @HtmlField(cssPath="section > div.js-main__l > div.js-left > div:nth-child(5)")
    private List<Category> livebroadcast;

    /**
     * 产业
     */
    @HtmlField(cssPath="section > div.js-main__l > div.js-left > div:nth-child(6)")
    private List<Category> industry;

    /**
     * 技术
     */
    @HtmlField(cssPath="section > div.js-main__l > div.js-left > div:nth-child(7)")
    private List<Category> technology;

    /**
     * 百科
     */
    @HtmlField(cssPath="section > div.js-main__l > div.js-left > div:nth-child(8)")
    private List<Category> encyclopedias;

    /**
     * 相对论
     */
    @HtmlField(cssPath="section > div.js-main__l > div.js-left > div:nth-child(9)")
    private List<Category> relativity;

    /**
     * 人物
     */
    @HtmlField(cssPath="section > div.js-main__l > div.js-left > div:nth-child(10)")
    private List<Category> character;

    /**
     * 研报
     */
    @HtmlField(cssPath="section > div.js-main__l > div.js-left > div:nth-child(11)")
    private List<Category> researchReport;
}
