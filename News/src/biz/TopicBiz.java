package biz;

import java.util.List;

import entity.Topic;

public interface TopicBiz {
	//查询所有的主题
	List<Topic> findTopics();
}
