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
 * @Description:
 * @Date: 2019/12/13 下午2:29
 */
//该爬虫匹配的url格式(matchUrl)和内容抽取后的bean处理类
@Data
@Gecco(matchUrl="http://news.iresearch.cn/", pipelines={"allSortPipeline"})
public class AllSort implements HtmlBean {

    private static final long serialVersionUID = 665662335318691818L;

    @Request
    private HttpRequest request;

    // 移动互联网
    @HtmlField(cssPath="#tab-list > div:nth-child(1)")
    private List<Category> mobileInternet;

    // 电子商务
    @HtmlField(cssPath="#tab-list > div:nth-child(2)")
    private List<Category> electric;

    // 互联网
    @HtmlField(cssPath="#tab-list > div:nth-child(3)")
    private List<Category> internet;

    // 网络营销
    @HtmlField(cssPath="#tab-list > div:nth-child(4)")
    private List<Category> netMarket;

    // 网络游戏
    @HtmlField(cssPath="#tab-list > div:nth-child(5)")
    private List<Category> netGame;

}
