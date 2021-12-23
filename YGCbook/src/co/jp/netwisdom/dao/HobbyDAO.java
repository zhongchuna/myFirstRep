package co.jp.netwisdom.dao;

import java.sql.SQLException;
import java.util.List;
import java.util.Vector;

import cn.key.dbManager.JdbcTemplate;
import cn.key.mapping.UserInfoMapping;
import co.jp.netwisdom.entity.UserInfo;


public class HobbyDAO {

	private JdbcTemplate template = new JdbcTemplate();
	public boolean insertHobby(String username,String[] hobbyArray) {
		
		int row =0;
		String sql = "insert into hobby values(?,?)";
		for(int i=0;i<hobbyArray.length;i++){
			Object[] values =new Object[]{username, hobbyArray[i]};
			try {
				row = row +template.updata(sql, values);
			}catch(Exception e){
				e.printStackTrace(); 
			}	 
		}  
		return row == hobbyArray.length;
	}
}
