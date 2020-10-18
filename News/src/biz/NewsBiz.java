package biz;
//业务逻辑层接口：新闻

import java.util.List;

import entity.News;

public interface NewsBiz {

	/**
	 * 获取所有新闻
	 * @return
	 */
	List<News> findNews();
}
