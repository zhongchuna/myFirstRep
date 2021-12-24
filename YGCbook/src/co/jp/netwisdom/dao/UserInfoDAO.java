package co.jp.netwisdom.dao;

import java.sql.SQLException;
import java.util.List;
import java.util.Vector;

import cn.key.dbManager.JdbcTemplate;
import cn.key.mapping.UserInfoMapping;
import co.jp.netwisdom.entity.UserInfo;


public class UserInfoDAO {

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
	
	
}
