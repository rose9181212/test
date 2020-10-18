package dao;

import java.util.List;

import entity.Topic;

public interface TopicDao {
	//查询所有的主题
	List<Topic> getTopics();
}
