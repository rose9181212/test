package dao;

import java.util.List;

import entity.News;

public interface NewsDao {

	/**
	 * ��ѯ��������
	 * @return
	 */
	List<News> getAllNews();
}
