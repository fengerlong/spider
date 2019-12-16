package com.spider.study.jscj;

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
@Gecco(matchUrl="https://www.jinse.com/news/blockchain/{code}.html", pipelines={"newsProductDetailsPipeline"})
public class NewsProductDetail implements HtmlBean {

    private static final long serialVersionUID = -377053120283382723L;

    /**
     * 标题
     */
    @Text
    @HtmlField(cssPath = "div.js-container.js-content>div.js-left > h1")
    private String title;
    /**
     * 文本内容
     */
    @HtmlField(cssPath = "div.js-container.js-content > div.js-left > div.js-article")
    private String content;

    @RequestParameter
    private String code;

}
