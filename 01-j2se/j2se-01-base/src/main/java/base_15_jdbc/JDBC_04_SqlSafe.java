package base_15_jdbc;

import java.sql.*;

/*
 * 防止sql注入攻击
 */

public class JDBC_04_SqlSafe {
	public static void main(String[] args) {
		PreparedStatement stat = null;
		ResultSet rs = null;
		
		try (
				Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bsr_data1", "root", "root");
				) {
			
			//1	使用mysql数据库，加载mysql数据库驱动
			Class.forName("com.mysql.jdbc.Driver");
			
			//3	?占位符
			String sql = "select * From user_info u where u.USER_NAME=? and u.`PASSWORD`=?";//3	?占位符
			
			//4	获得PreparedStatement
			stat = conn.prepareStatement(sql);
			
			//给占位符赋值， setInt代表给占位符赋的值为int类型，
			//1代表第一个占位符，8代表value
			stat.setString(1, "qwerqwer");
			stat.setString(2, " ' or '1'='1");
			
			//5	query是查询的意思，执行sql语句
			rs = stat.executeQuery();
			
			while (rs.next()) {
				System.out.println(rs.getString("user_name"));
			}
		} catch (SQLException e) {
			System.out.println("sql语句异常");
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			System.out.println("未找到驱动类");
			e.printStackTrace();
		}
	}
}
