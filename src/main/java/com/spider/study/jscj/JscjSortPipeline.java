package com.spider.study.jscj;

import com.geccocrawler.gecco.annotation.PipelineName;
import com.geccocrawler.gecco.pipeline.Pipeline;
import com.geccocrawler.gecco.request.HttpRequest;
import com.geccocrawler.gecco.scheduler.SchedulerContext;
import com.geccocrawler.gecco.spider.HrefBean;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ProjectName: spider
 * @Package: com.spider.study.jscj
 * @ClassName: AllSortPipeline
 * @Author: fel
 * @Description:
 * @Date: 2019/12/13 下午3:25
 */
@PipelineName("jscjSortPipeline")
public class JscjSortPipeline implements Pipeline<JscjSort> {
    @Override
    public void process(JscjSort jscjSort) {
        Map<String,List<Category>> map = new HashMap<>();
        //头条
        List<Category> headlines = new ArrayList<Category>();
        headlines.addAll(jscjSort.getHeadlines());
        map.put("头条",headlines);
        //新闻
        List<Category> news = new ArrayList<Category>();
        news.addAll(jscjSort.getNews());
        map.put("新闻",news);
        //政策
        List<Category> policy = new ArrayList<Category>();
        policy.addAll(jscjSort.getPolicy());
        map.put("政策",policy);
        //直播
        List<Category> Livebroadcast = new ArrayList<Category>();
        Livebroadcast.addAll(jscjSort.getLivebroadcast());
        map.put("直播",Livebroadcast);
        //产业
        List<Category> industry = new ArrayList<Category>();
        industry.addAll(jscjSort.getIndustry());
        map.put("产业",industry);
        //产业
        List<Category> technology = new ArrayList<Category>();
        technology.addAll(jscjSort.getTechnology());
        map.put("技术",technology);
        //产业
        List<Category> encyclopedias = new ArrayList<Category>();
        encyclopedias.addAll(jscjSort.getEncyclopedias());
        map.put("百科",encyclopedias);
        //产业
        List<Category> relativity = new ArrayList<Category>();
        relativity.addAll(jscjSort.getRelativity());
        map.put("相对论",relativity);
        //产业
        List<Category> character = new ArrayList<Category>();
        character.addAll(jscjSort.getCharacter());
        map.put("人物",character);
        //产业
        List<Category> researchReport = new ArrayList<Category>();
        researchReport.addAll(jscjSort.getResearchReport());
        map.put("研报",researchReport);

        map.forEach((k,v) ->{
            System.out.println("所属模块"+k);
            v.forEach(category -> {
                List<HrefBean> hrefs = category.getCategorys();
                for(HrefBean href : hrefs) {
                    System.out.println("title: " + href.getTitle() + " url: " + href.getUrl());
                    String url = href.getUrl();
                    HttpRequest currRequest = jscjSort.getRequest();
                    SchedulerContext.into(currRequest.subRequest(url));
                }
            });
        });
    }
}
