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
@Gecco(matchUrl="https://www.jinse.com/live_broadcast/{code}", pipelines={"liveBroadcastProductDetailPipeline"})
public class LiveBroadcastProductDetail implements HtmlBean {

    private static final long serialVersionUID = -377053120283382723L;

    /**
     * 文本内容
     */
    @HtmlField(cssPath = "#app > div.container > div:nth-child(1) > div.nav-content > div:nth-child(2) > div.container.js-lives > div")
    private String content;

    @RequestParameter
    private String code;

}
