package com.spider.study.irseach;

import com.geccocrawler.gecco.annotation.Gecco;
import com.geccocrawler.gecco.annotation.HtmlField;
import com.geccocrawler.gecco.annotation.RequestParameter;
import com.geccocrawler.gecco.annotation.Text;

import com.geccocrawler.gecco.spider.HtmlBean;
import lombok.Data;

/**
 * @ProjectName: spider
 * @Package: com.spider.study.jscj
 * @ClassName: ProductDetail
 * @Author: fel
 * @Description:
 * @Date: 2019/12/13 下午3:32
 */
@Data
@Gecco(matchUrl="http://news.iresearch.cn/content/{yeary}/{month}/{code}.shtml", pipelines={"productDetailPipeline"})
public class ProductDetail implements HtmlBean {

    private static final long serialVersionUID = -377053120283382723L;

    /**
     * 标题
     */
    @Text
    @HtmlField(cssPath = "body > div.g-content > div.g-main.f-mt-auto > div > div > div.title > h1")
    private String title;

    /**
     * 文本内容
     */
    @HtmlField(cssPath = "body > div.g-content > div.g-bd.f-mt-auto > div > div.g-mn > div > div.g-article > div.m-article")
    private String content;

    @RequestParameter
    private String code;

    @RequestParameter
    private String year;

    @RequestParameter
    private String month;

}
