package biz.impl;

import java.util.List;

import biz.TopicBiz;
import dao.TopicDao;
import dao.impl.TopicDaoImpl;
import entity.Topic;
/**
 * ҵ���߼���ʵ���ࣺ����
 * @author 123
 *
 */
public class TopicBizImpl implements TopicBiz {

	TopicDao topicDao=new TopicDaoImpl();
	
	@Override
	public List<Topic> findTopics() {
		// TODO Auto-generated method stub
		return topicDao.getTopics();
	}

}
