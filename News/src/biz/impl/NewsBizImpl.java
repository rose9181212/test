package biz.impl;

import java.util.List;

import biz.NewsBiz;
import dao.impl.NewsDaoImpl;
import entity.News;
/**
 * ҵ���߼���ӿ�ʵ���ࣺ����
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
