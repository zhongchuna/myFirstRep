package co.jp.netwisdom.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import cn.key.dbManager.JdbcTemplate;
import co.jp.netwisdom.entity.Hobby;
import co.jp.netwisdom.mapping.HobbyMapping;


public class HobbyDAO {
 /**
  * 此方法为注册技能使用的方法
  */
	private JdbcTemplate template = new JdbcTemplate();
	public boolean insertHobby(Hobby hobby) {
		
		int row =0;
		String sql = "insert into hobby values(?,?)";
		for(String rs:hobby.getHobbyArray()){
			Object[] values =new Object[]{hobby.getUsername(), rs};
			try {
				row = row +template.updata(sql, values);
			}catch(Exception e){
				e.printStackTrace(); 
			}	 
		}  
		return row == hobby.getHobbyArray().length;
	}

/**
 * 此方法为查询爱好机能使用的方法 
 */
	public List<Hobby> selectHobby(String username){
		String sql ="select username,group_concat(hobby) as hobby from hobby group by username  ";
		if(!username.equals("")){
			sql = sql + " having username ='"+username+"'";
			System.out.println("#####"+sql);
			
		}
		List<Hobby> list =new ArrayList<>();
		try {
			list =template.selete(sql,new HobbyMapping());
		} catch (SQLException e) {
		
			e.printStackTrace();
		} 
		return list;
	} 
}
