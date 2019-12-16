package com.spider.study.irseach;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.util.regex.Pattern.*;

/**
 * @ProjectName: spider
 * @Package: com.spider.study.jscj
 * @ClassName: RegrexUtil
 * @Author: fel
 * @Description:
 * @Date: 2019/12/13 下午3:35
 */
public class RegrexUtil {

    public static String match(String content) {
        StringBuilder stringBuilder = new StringBuilder();
        Pattern pattern = compile("([\\u4e00-\\u9fa5]+)");
        Matcher matcher = pattern.matcher(content);
        while (matcher.find()) {
            stringBuilder.append(matcher.group(0));
        }
        return stringBuilder.toString();
    }
}
