package base_15_jdbc;

import java.sql.*;

/*
 * 预编译
 * 1.加载JDBC驱动
 * 2.建立连接
 * 3.建立PreparedStatement
 * 4.设置对应的参数
 * 5.进行sql操作
 */

public class JDBC_02_Prepared {
	public static void main(String[] args) {
		
		PreparedStatement stat = null;  // 预编译
		ResultSet rs = null;
		
		try (
				Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bsr_data1", "root", "root");
				){
			
			Class.forName("com.mysql.jdbc.Driver");
			
			String sql = "select * from goods g where g.GOODS_ID = ? and g.USER_ID=?";
			
			stat = conn.prepareStatement(sql);
			stat.setInt(1, 8);
			stat.setInt(2, 2);
			
			// 执行sql语句进行查询
			rs = stat.executeQuery();

			while (rs.next()) {
				System.out.println(rs.getString(4));
			}
			
		} catch (ClassNotFoundException e) {
			System.out.println("未找到驱动类");
			e.printStackTrace();
		} catch (SQLException e1) {
			System.out.println("sql操作异常");
			e1.printStackTrace();
		}
	}
}
