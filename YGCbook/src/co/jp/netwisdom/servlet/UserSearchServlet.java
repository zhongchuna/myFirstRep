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
import co.jp.netwisdom.entity.UserInfo;
public class UserSearchServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		 
		//从前台接收到客户输入的搜索信息
		String username = req.getParameter("username");
		String sex= req.getParameter("sex");
		String major = req.getParameter("major");
		
		UserInfoDAO dao = new UserInfoDAO();
		List<UserInfo> list = new ArrayList<>();
		 list = dao.selectUserInfo(username, sex, major); 
		
		 req.setAttribute("list",list); 
		 req.getRequestDispatcher("userSearch.jsp").forward(req, resp);
	}	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		this.doGet(req, resp);
	}

}

	