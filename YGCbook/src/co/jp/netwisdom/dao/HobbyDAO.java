package co.jp.netwisdom.dao;

import cn.key.dbManager.JdbcTemplate;
import co.jp.netwisdom.entity.Hobby;


public class HobbyDAO {

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
}
