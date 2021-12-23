package co.jp.netwisdom.dao;

import java.sql.SQLException;
import java.util.List;
import java.util.Vector;

import cn.key.dbManager.JdbcTemplate;
import cn.key.mapping.UserInfoMapping;
import co.jp.netwisdom.entity.UserInfo;


public class UserInfoDAO {

	private JdbcTemplate template = new JdbcTemplate();
	public boolean insertUserInfo(String username,String password,String sex,String major,String intro) {
		
		int row =0;
		String sql = "insert into userinfo values (?,?,?,?,?)";
		
		Object[] values =new Object[]{username, password, sex, major, intro};
 
		try {
			row =template.updata(sql, values);
		}catch(Exception e){
			e.printStackTrace(); 
		}
		
		return row == 1;
	}
	public List<UserInfo> findUserInfo(String username,String sex,String major) {
		String sql = "select * from userinfo where " ;
		if(!"".equals(username)){
			sql = sql + " username ='"+username+"' and";
		}
			
		
		if(!"".equals(major)){ 
			sql = sql + " and major ='"+major+"'";
		}
		List<UserInfo> list = new Vector<UserInfo>();
		try {
			list = template.selete(sql, new UserInfoMapping());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return  list;        
	}
	
}
