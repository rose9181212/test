package dao;

import java.util.List;

import entity.News;

public interface NewsDao {

	/**
	 * 查询所有新闻
	 * @return
	 */
	List<News> getAllNews();
}
