package com.sunmengjie;

import java.io.File;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.sunmengjie.cms.utils.FileUtillo;
import com.sunmengjie.cms.utils.RandomUtils;



//读取爬虫爬取的文本，把文本名称作为标题，内容作为文章内容，封装到article对象，然后把对象转成json，发送到kafka
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = {"classpath:producer.xml","redis.xml"})
public class SendArticles2Kafka {
	
	@Autowired
	KafkaTemplate<String, String> kafkaTemplate;

	@Test
	public void sendArticle() throws Exception {
		
		File file = new File("D:\\文件");
		//遍历file路径下的所有文件
		File[] listFiles = file.listFiles();
		for (File file2 : listFiles) {
			//System.out.println(file2.getName());
			String title = file2.getName().replace(".txt", "");
			//System.out.println(title);
			//读取文章内容
			String content = FileUtillo.readFile(file2, "UTF8");
			//System.out.println(content);
			//声明一个文章对象
			Articles article = new Articles();
			 article.setTitle(title);
			 article.setContent(content);
			article.setPicture("20191101/88dbc45d-5784-424b-89dc-419f782d73bb.jpeg");
			article.setChannelId(RandomUtils.getNum(1, 8));
			article.setCategoryId(RandomUtils.getNum(1,28));
			article.setUserId(RandomUtils.getNum(1,6));
			article.setArticleType(0000);
			 //把对象转成JSON格式
			 String jsonString = JSON.toJSONString(article);
			 
			kafkaTemplate.send("article", jsonString);
			 
		}
		
	}
	
	
}
