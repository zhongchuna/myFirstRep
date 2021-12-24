package co.jp.netwisdom.servlet;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.jp.netwisdom.dao.HobbyDAO;
import co.jp.netwisdom.dao.UserInfoDAO;
import co.jp.netwisdom.entity.Hobby;
import co.jp.netwisdom.entity.UserInfo;
public class UserInfoRegServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
	
		//从前台接收到注册页面客户输入的信息
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		String sex = req.getParameter("sex");
		String major = req.getParameter("major");
		String intro = req.getParameter("intro");
		String[] hobbyArray = req.getParameterValues("hobby");
	     
		//插入数据库 userinfo 
		UserInfoDAO daoForUserInfo = new UserInfoDAO();
		//插入数据库 hobby
		HobbyDAO daoForHobby = new HobbyDAO();
		UserInfo userInfo = new UserInfo();
		userInfo.setUsername(username);
		userInfo.setPassword(password);
		userInfo.setSex(sex);
		userInfo.setMajor(major);
		userInfo.setIntro(intro);
		Hobby hobby =new Hobby(username,hobbyArray);
		
		 
		if(daoForUserInfo.insertUserInfo(userInfo)&&daoForHobby.insertHobby(hobby)){
			resp.sendRedirect("userInfoRegSucess.jsp");
		}
		 
	} 
	  
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		this.doGet(req, resp);
	}

}

	