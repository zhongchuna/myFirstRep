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
//			1 ע������
			Class.forName("com.mysql.jdbc.Driver");
//			2 ��ȡ����
			String url ="jdbc:mysql://localhost:3306/";
			String user ="root";
			String password ="root";
//			3 ��ȡԤ��������ݿ��������
			
//			4ִ��SQL���
//			5�����ѯ�����
		} catch (Exception e) {
			// TODO: handle exception
		}finally{
			//6�ͷ���Դ
		}
	} 
}
