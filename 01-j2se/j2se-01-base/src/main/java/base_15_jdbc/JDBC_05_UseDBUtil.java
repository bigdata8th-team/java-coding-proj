package base_15_jdbc;

import base_15_jdbc.util.DBUtilProperties;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

//import cn.com.gsl._15_jdbc.util.DBUtil;

public class JDBC_05_UseDBUtil {
	public static void main(String[] args) {
		// 1.使用工具类进行连接
//		Connection conn = DBUtil.getConn();
		Connection conn = DBUtilProperties.getConn();
		
		try {
			// 2.建立PreparedStatement
			String sql = "select * From goods g ";
			PreparedStatement stat = conn.prepareStatement(sql);
			
			// 3.返回结果集
			ResultSet rs = stat.executeQuery();
			
			while (rs.next()) {
				System.out.println(rs.getString("goods_name"));
			}
		} catch (SQLException e) {
			System.out.println("sql操作异常");
			e.printStackTrace();
		} catch (NullPointerException e) {
			System.out.println("连接空指针异常");
			e.printStackTrace();
		}
	
		DBUtilProperties.close(conn);
	}
}
