package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import biz.NewsBiz;
import biz.TopicBiz;
import biz.impl.NewsBizImpl;
import biz.impl.TopicBizImpl;
import entity.News;
import entity.Topic;

/**
 * Servlet implementation class IndexServlet
 */
@WebServlet("/IndexServlet")
public class IndexServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public IndexServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//查询所有主题
		TopicBiz topicBiz=new TopicBizImpl();
		List<Topic> lstTopics=topicBiz.findTopics();
		
		//查询所有新闻
		NewsBiz newsBiz=new NewsBizImpl();
		List<News> lstNews=newsBiz.findNews();
		
		//将数据放入作用域中
		HttpSession session=request.getSession();
		session.setAttribute("allTopics", lstTopics);
		session.setAttribute("allNews", lstNews);
		
		//转向index.jsp
		response.sendRedirect("index.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
