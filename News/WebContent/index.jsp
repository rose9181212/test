﻿<%@page import="biz.impl.NewsBizImpl"%>
<%@page import="biz.NewsBiz"%>
<%@page import="entity.News"%>
<%@page import="entity.Topic"%>
<%@page import="biz.impl.TopicBizImpl"%>
<%@page import="biz.TopicBiz"%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GBK" />
<title>新闻中国</title>
<link href="CSS/main.css" rel="stylesheet" type="text/css" />
</head>

<%
	//作用域中获取所有主题和新闻
	List<Topic> topics=(List<Topic>)session.getAttribute("allTopics");
	List<News> lstNews=(List<News>)session.getAttribute("allNews");
%>
<%
	if(topics==null||lstNews==null){
		request.getRequestDispatcher("IndexServlet").forward(request, response);
		return ;
	}
	
%>
<body>
<div id="header">
  <div id="top_login">
    <label> 登录名 </label>
    <input type="text" id="uname" value="" class="login_input" />
    <label> 密&#160;&#160;码 </label>
    <input type="password" id="upwd" value="" class="login_input" />
    <input type="button" class="login_sub" value="登录" onclick="login()"/>
    <label id="error"> </label>
    <img src="Images/friend_logo.gif" alt="Google" id="friend_logo" /> </div>
  <div id="nav">
    <div id="logo"> <img src="Images/logo.jpg" alt="新闻中国" /> </div>
    <div id="a_b01"> <img src="Images/a_b01.gif" alt="" /> </div>
    <!--mainnav end-->
  </div>
</div>
<div id="container">
  <div class="sidebar">
    <h1> <img src="Images/title_1.gif" alt="国内新闻" /> </h1>
    <div class="side_list">
      <ul>
        <li> <a href='#'><b> 重庆涉黑富豪黎强夫妇庭审答辩言辞相互矛盾 </b></a> </li>
        <li> <a href='#'><b> 发改委：4万亿投资计划不会挤占民间投资空间 </b></a> </li>
        <li> <a href='#'><b> 河南2个乡镇政绩报告内容完全一致引关注 </b></a> </li>
      </ul>
    </div>
    <h1> <img src="images/title_2.gif" alt="国际新闻" /> </h1>
    <div class="side_list">
      <ul>
        <li> <a href='#'><b> 日本首相鸠山首次全面阐述新政府外交政策 </b></a> </li>
        <li> <a href='#'><b> 黎巴嫩以色列再次交火互射炮弹 </b></a> </li>
        <li> <a href='#'><b> 伊朗将于30日前就核燃料供应方案作出答复 </b></a> </li>
        <li> <a href='#'><b> 与基地有关组织宣称对巴格达连环爆炸负责 </b></a> </li>
      </ul>
    </div>
    <h1> <img src="Images/title_3.gif" alt="娱乐新闻" /> </h1>
    <div class="side_list">
      <ul>
        <li> <a href='#'><b> 施瓦辛格启动影视业回迁计划 推进加州经济复苏 </b></a> </li>
        <li> <a href='#'><b> 《沧海》导演回应观众质疑 自信能超越《亮剑》 </b></a> </li>
        <li> <a href='#'><b> 《海角七号》导演新片开机 吴宇森等出席 </b></a> </li>
        <li> <a href='#'><b> 《四大名捕》敦煌热拍 八主演飙戏火花四溅 </b></a> </li>
      </ul>
    </div>
  </div>
  <div class="main">
    <div class="class_type"> <img src="Images/class_type.gif" alt="新闻中心" /> </div>
    <div class="content">
      <ul class="class_date">
        <li id='class_month'>
        	<%
        		for(Topic topic : topics){
        	%>
         <a href='#'><b> <%=topic.getTname() %> </b></a> 
         	<%} %>
         
          </li>
      </ul>
      <ul class="classlist">
      
      	<%
      		for(int i=0;i<lstNews.size();i++){
      			News news=lstNews.get(i);
      	%>
        <li><a href='newspages/news_add.html'><%=news.getNtitle() %></a><span> <%=news.getNcreateDate() %> </span></li>
       		<%
       			if((i+1)%5==0&&i!=0){
       		%>
        <li class='space'></li>
       	
       	<%
      		}}
       	%>
        <p align="right"> 当前页数:[1/2]&nbsp; <a href="#">下一页</a> <a href="#">末页</a> </p>
      </ul>
    </div>
    <div class="picnews">
      <ul>
        <li> <a href="#"><img src="Images/Picture1.jpg" width="249" alt="" /> </a><a href="#">幻想中穿越时空</a> </li>
        <li> <a href="#"><img src="Images/Picture2.jpg" width="249" alt="" /> </a><a href="#">国庆多变的发型</a> </li>
        <li> <a href="#"><img src="Images/Picture3.jpg" width="249" alt="" /> </a><a href="#">新技术照亮都市</a> </li>
        <li> <a href="#"><img src="Images/Picture4.jpg" width="249" alt="" /> </a><a href="#">群星闪耀红地毯</a> </li>
      </ul>
    </div>
  </div>
</div>
<div id="friend">
  <h1 class="friend_t"> <img src="Images/friend_ico.gif" alt="合作伙伴" /> </h1>
  <div class="friend_list">
    <ul>
      <li> <a href="#">中国政府网</a> </li>
      <li> <a href="#">中国政府网</a> </li>
      <li> <a href="#">中国政府网</a> </li>
      <li> <a href="#">中国政府网</a> </li>
      <li> <a href="#">中国政府网</a> </li>
      <li> <a href="#">中国政府网</a> </li>
      <li> <a href="#">中国政府网</a> </li>
    </ul>
  </div>
</div>
<div id="footer">
  <p class=""> 24小时客户服务热线：010-68988888 &#160;&#160;&#160;&#160; <a href="#">常见问题解答</a> &#160;&#160;&#160;&#160; 新闻热线：010-627488888 <br />
    文明办网文明上网举报电话：010-627488888 &#160;&#160;&#160;&#160; 举报邮箱： <a href="#">jubao@jb-aptech.com.cn</a> </p>
  <p class="copyright"> Copyright &copy; 1999-2009 News China gov, All Right Reserver <br />
    新闻中国 版权所有 </p>
</div>
</body>
</html>
