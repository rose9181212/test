package biz;
//ҵ���߼���ӿڣ�����

import java.util.List;

import entity.News;

public interface NewsBiz {

	/**
	 * ��ȡ��������
	 * @return
	 */
	List<News> findNews();
}
