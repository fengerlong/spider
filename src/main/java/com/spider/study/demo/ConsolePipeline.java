package com.spider.study.demo;

import com.alibaba.fastjson.JSON;
import com.geccocrawler.gecco.pipeline.Pipeline;
import com.geccocrawler.gecco.spider.SpiderBean;
import org.springframework.stereotype.Service;

public class ConsolePipeline implements Pipeline<MyGithub> {

	@Override
	public void process(MyGithub bean) {

		System.out.println(JSON.toJSONString(bean));
	}

}
