package co.jp.jdbc.test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JDBCTest01 {
	public static void main(String[] args){
		Connection conn = null;
		PreparedStatement ps =null;
		ResultSet rs = null;
		try {
//			1 注册驱动
			Class.forName("com.mysql.jdbc.Driver");
//			2 获取连接
			String url ="jdbc:mysql://localhost:3306/";
			String user ="root";
			String password ="root";
//			3 获取预编译的数据库操作对象
			
//			4执行SQL语句
//			5处理查询结果集
		} catch (Exception e) {
			// TODO: handle exception
		}finally{
			//6释放资源
		}
	} 
}
