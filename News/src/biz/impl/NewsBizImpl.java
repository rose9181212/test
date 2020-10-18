package biz.impl;

import java.util.List;

import biz.NewsBiz;
import dao.impl.NewsDaoImpl;
import entity.News;
/**
 * 业务逻辑层接口实现类：新闻
 * @author 123
 *
 */
public class NewsBizImpl implements NewsBiz {

	@Override
	public List<News> findNews() {
		// TODO Auto-generated method stub
		return new NewsDaoImpl().getAllNews();
	}

}
