package dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dao.BaseDao;
import dao.TopicDao;
import entity.Topic;

/**
 * 接口实现类：主题
 * @author 123
 *
 */
public class TopicDaoImpl extends BaseDao implements TopicDao {

	@Override
	public List<Topic> getTopics() {
		
		String sql="select * from topic";
		
		ResultSet rs=exceuteQuery(sql);

		List<Topic> lstTopics=new ArrayList<Topic>();
		
		try {
			while(rs.next()){
				Topic topic=new Topic();
				
				topic.setTid(rs.getInt("tid"));
				topic.setTname(rs.getString("tname"));
				
				lstTopics.add(topic);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			closeAll();
		}
		
		return lstTopics;
	}

}
