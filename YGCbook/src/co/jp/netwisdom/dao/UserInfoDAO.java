package co.jp.netwisdom.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.jsp.tagext.TryCatchFinally;

import cn.key.dbManager.JdbcTemplate;
import co.jp.netwisdom.entity.UserInfo;
import co.jp.netwisdom.mapping.UserInfoMapping;


public class UserInfoDAO {
	/*
	 * 用户信息表插入 注册时servlet调用的方法
	 */
	private JdbcTemplate template = new JdbcTemplate();
	public boolean insertUserInfo( UserInfo userInfo) {
		
		int row =0;
		String sql = "insert into userinfo values (?,?,?,?,?)";
		
		Object[] values =new Object[]{
				userInfo.getUsername(),
				userInfo.getPassword(),
				userInfo.getSex(),
				userInfo.getMajor(),
				userInfo.getIntro() 
				};
 
		try {
			row =template.updata(sql, values);
		}catch(Exception e){
			e.printStackTrace(); 
		}
		
		return row == 1;
	}
	/*
	 * 
	 * 用户信息表的查询时servlet调用的方法
	 * 
	 */
	public List<UserInfo> selectUserInfo(String username,String sex,String major){
		String sql = "select * from userinfo  where 1=1";
		
			if(!username.equals("")){
				sql = sql + " and username ='"+username+"'";
			
			}
			if(sex !=null){
				sql = sql + " and sex ='"+ sex + "'";
			}
			if(!major.equals("")){
				sql = sql + " and major ='"+ major + "'";
			}
			List<UserInfo> list=new ArrayList<>();
		
			try {
				list = template.selete(sql, new UserInfoMapping());
			} catch (SQLException e) {
			
				e.printStackTrace();
			}
	
		return list;
	}
	
}
