package com.spider.study.irseach;

import com.geccocrawler.gecco.annotation.HtmlField;
import com.geccocrawler.gecco.annotation.Text;
import com.geccocrawler.gecco.spider.HrefBean;
import com.geccocrawler.gecco.spider.HtmlBean;
import lombok.Data;

import java.util.List;

/**
 * @ProjectName: spider
 * @Package: com.spider.study.jscj
 * @ClassName: Category
 * @Author: fel
 * @Description:
 * @Date: 2019/12/13 下午3:18
 */
@Data
public class Category implements HtmlBean {

    private static final long serialVersionUID = 3018760488621382659L;

    @Text
    @HtmlField(cssPath="dt a")
    private String parentName;

    @HtmlField(cssPath="ul li h3")
    private List<HrefBean> categorys;
}
