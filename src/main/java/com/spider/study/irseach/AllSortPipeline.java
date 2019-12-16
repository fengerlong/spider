package com.spider.study.irseach;

import com.geccocrawler.gecco.annotation.PipelineName;
import com.geccocrawler.gecco.pipeline.Pipeline;
import com.geccocrawler.gecco.request.HttpRequest;
import com.geccocrawler.gecco.scheduler.SchedulerContext;
import com.geccocrawler.gecco.spider.HrefBean;

import java.util.ArrayList;
import java.util.List;

/**
 * @ProjectName: spider
 * @Package: com.spider.study.jscj
 * @ClassName: AllSortPipeline
 * @Author: fel
 * @Description:
 * @Date: 2019/12/13 下午3:25
 */
@PipelineName("allSortPipeline")
public class AllSortPipeline implements Pipeline<AllSort> {
    @Override
    public void process(AllSort allSort) {
        System.out.println("-=======-");
        List<Category> categorys = new ArrayList<Category>();
        categorys.addAll(allSort.getInternet());
        categorys.addAll(allSort.getElectric());
        categorys.addAll(allSort.getMobileInternet());
        categorys.addAll(allSort.getNetGame());
        categorys.addAll(allSort.getNetMarket());
        for(Category category : categorys) {
            System.out.println("parentName"+category.getParentName());
            List<HrefBean> hrefs = category.getCategorys();
            for(HrefBean href : hrefs) {
                System.out.println("title: " + href.getTitle() + " url: " + href.getUrl());
                String url = href.getUrl();
                HttpRequest currRequest = allSort.getRequest();
                SchedulerContext.into(currRequest.subRequest(url));
            }
        }
    }
}
