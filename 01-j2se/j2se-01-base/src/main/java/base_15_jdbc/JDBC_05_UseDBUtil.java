package base_15_jdbc;

import base_15_jdbc.util.DBUtilProperties;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

//import cn.com.gsl._15_jdbc.util.DBUtil;

public class JDBC_05_UseDBUtil {
	public static void main(String[] args) {
		// 1.ʹ�ù������������
//		Connection conn = DBUtil.getConn();
		Connection conn = DBUtilProperties.getConn();
		
		try {
			// 2.����PreparedStatement
			String sql = "select * From goods g ";
			PreparedStatement stat = conn.prepareStatement(sql);
			
			// 3.���ؽ����
			ResultSet rs = stat.executeQuery();
			
			while (rs.next()) {
				System.out.println(rs.getString("goods_name"));
			}
		} catch (SQLException e) {
			System.out.println("sql�����쳣");
			e.printStackTrace();
		} catch (NullPointerException e) {
			System.out.println("���ӿ�ָ���쳣");
			e.printStackTrace();
		}
	
		DBUtilProperties.close(conn);
	}
}
