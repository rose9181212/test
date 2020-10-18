package test;

import java.util.List;

import biz.NewsBiz;
import biz.TopicBiz;
import biz.impl.NewsBizImpl;
import biz.impl.TopicBizImpl;
import entity.News;
import entity.Topic;

public class Test {

	public static void main(String[] args) {

		//测试查询所有主题
		
		/*TopicBiz topicBiz=new TopicBizImpl();
		
		List<Topic> topics=topicBiz.findTopics();
		
		for (Topic topic : topics) {
			System.out.println(topic);
		}*/
		
		//测试查询所有新闻
		NewsBiz newsBiz=new NewsBizImpl();
		
		List<News> news=newsBiz.findNews();
		
		for (News n : news) {
			System.out.println(n);
		}

	}

}
