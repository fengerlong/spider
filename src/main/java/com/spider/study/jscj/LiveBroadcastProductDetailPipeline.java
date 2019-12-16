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
@PipelineName("liveBroadcastProductDetailPipeline")
public class LiveBroadcastProductDetailPipeline implements Pipeline<LiveBroadcastProductDetail> {
    @Override
    public void process(LiveBroadcastProductDetail bean) {
        System.out.println("直播内容是-----------"+bean.getContent());
    }
}
