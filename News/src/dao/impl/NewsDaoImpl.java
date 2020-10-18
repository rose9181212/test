package dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dao.BaseDao;
import dao.NewsDao;
import entity.News;

/**
 * 数据访问层接口实现类：新闻
 * @author 123
 *
 */
public class NewsDaoImpl extends BaseDao implements NewsDao {

	@Override
	public List<News> getAllNews() {
		String sql="select * from news";
		
		ResultSet rs=exceuteQuery(sql);
		List<News> lstNews=new ArrayList<News>();
		
		try {
			while(rs.next()){
				News news=new News();
				
				news.setNid(rs.getInt("nid"));
				news.setTnid(rs.getInt("ntid"));
				news.setNtitle(rs.getString("ntitle"));
				news.setNcreateDate(rs.getString("ncreateDate"));
				
				lstNews.add(news);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			closeAll();
		}
		
		return lstNews;
	}

}
