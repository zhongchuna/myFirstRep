package co.jp.netwisdom.mapping;

import java.sql.ResultSet;
import java.sql.SQLException;

import co.jp.netwisdom.entity.UserInfo;
import cn.key.dbManager.IResultSetMapping;

public class UserInfoMapping implements IResultSetMapping {

	@Override
	public Object mapping(ResultSet rs) throws SQLException {
		int i = 1;
		UserInfo userInfo = new UserInfo(
				rs.getString(i++),
				rs.getString(i++), 
				rs.getString(i++), 
				rs.getString(i++), 
				rs.getString(i++));
		return userInfo;
	}

}
