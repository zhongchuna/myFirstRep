package co.jp.netwisdom.servlet;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.jp.netwisdom.dao.HobbyDAO;
import co.jp.netwisdom.dao.UserInfoDAO;
import co.jp.netwisdom.entity.Hobby;
import co.jp.netwisdom.entity.UserInfo;
public class UserUpdateServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		 
		//从前台接收到客户输入的搜索信息
		String username = req.getParameter("username");
		//根据名字表找名字表相关信息
		UserInfoDAO dao = new UserInfoDAO();
		
		UserInfo userinfo =new UserInfo();
		userinfo = dao.selectUserInfo(username); 
		
		//根据爱好表找相关信息 
	     HobbyDAO daoForHobby = new HobbyDAO();
		 List<Hobby> listForHobby =new ArrayList<>();
		 Hobby hobby = new Hobby();
		 hobby= daoForHobby.selectHobby1(username);
		
		 
		 req.setAttribute("userinfo",userinfo );
		 req.setAttribute("hobby",hobby);
		 		 
		 req.getRequestDispatcher("userUpdate.jsp").forward(req, resp);
	}	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		this.doGet(req, resp);
	}

}

	