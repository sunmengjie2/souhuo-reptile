package com.sunmengjie;


import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Spider2SouHu {

	public static void main(String[] args) throws Exception {
		
		//模拟浏览器发请求
		Connection connect = Jsoup.connect("http://news.sohu.com/");
		Document doc = connect.get();
//		System.out.println(doc);
		Elements select = doc.select(".list16");
		for (Element list16 : select) {
//			System.out.println(list16);
			Elements select2 = list16.select("a[href]");
			for (Element a : select2) {
//				System.out.println(a);
				String url = a.attr("href");
				System.out.println(url);
				if(!url.startsWith("http")) {
					url="http:"+url;
				}
//				System.out.println(url);
				if(!url.contains("subject")&&!url.contains("sports")) {
					Connection connect2 = Jsoup.connect(url);
					Document document = connect2.get();
					Elements select3 = document.select(".article");
					String content=null;
					for (Element element : select3) {
						//System.out.println(element);
						content = element.text();
//						System.out.println(content);
					}
					String title = a.attr("title");
					 title = title.replace("|", "").replace("*", "").replace("\"", "").replace("?", "").replace("/", "")
					.replace("\\", "").replace(">", "").replace("<", "").replace(":", "");
//					 以标题作为文本的名称,已内容作为文本的内容存在本地磁盘
					 FileUtillo.writeFile("D:\\文件\\"+title+".txt", content, "utf-8");
				}
			}
		}
	}
}
