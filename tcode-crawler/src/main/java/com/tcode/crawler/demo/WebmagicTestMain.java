package com.tcode.crawler.demo;

import us.codecraft.webmagic.Spider;

/**
 * @ Author     ：zhangcx
 * @ Date       ：Created in 10:53 2020/8/28
 * @ Description：${description}
 * @ Modified By：
 * @Version: $version$
 */
public class WebmagicTestMain {
    public static void main(String[] args) {
        //获取影片标题和页面链接
        Spider.create(new ListPageProcesser()).addUrl("http://www.dytt8.net/html/gndy/dyzz/list_23_1.html")
                .addPipeline(new MyPipeline()).thread(1).run();

        //获取指定详情页面的影片下载地址
        Spider.create(new DetailPageProcesser()).addUrl("http://www.dytt8.net/html/gndy/dyzz/20191204/59453.html")
                .addPipeline(new MyPipeline()).thread(1).run();
    }
}
