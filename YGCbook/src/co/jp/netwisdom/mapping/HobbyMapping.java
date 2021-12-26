package co.jp.netwisdom.mapping;

import java.sql.ResultSet;
import java.sql.SQLException;

import co.jp.netwisdom.entity.Hobby;
import cn.key.dbManager.IResultSetMapping;

public class HobbyMapping implements IResultSetMapping{

	@Override
	public Hobby mapping(ResultSet rs) throws SQLException {
		
		int i =1;
		Hobby hobby =new Hobby(
				rs.getString(i++),
				rs.getString(i++)
				);
		
		return hobby;
	}
	
}
