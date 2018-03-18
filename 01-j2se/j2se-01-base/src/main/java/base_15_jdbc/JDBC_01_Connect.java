package base_15_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

/*
 * 1.加载mysql驱动
 * 2.建立连接
 * 3.建立statement声明
 * 4.搭建sql语句
 * 5.执行
 * 6.关闭连接
 */


public class JDBC_01_Connect {
	public static void main(String[] args) {
		java.sql.Statement statement = null;    // sql语句空间
		ResultSet result = null;    // 结果集
		
		try (
				// 2.获得连接 6.关闭连接
				Connection connection = DriverManager.getConnection(
						"jdbc:mysql://localhost:3306/bsr_data1", "root", "root");
				) {
			// 1.加载msql驱动，获得驱动类信息
			Class.forName("com.mysql.jdbc.Driver"); 
			
			
			// 3.获得Statement
			statement = connection.createStatement();
			
			// 4.编写sql语句
			String sql = "select * from goods g where g.GOODS_ID = 8 and g.USER_ID=2";
			
			// 5.执行
			// 查询表
			result = statement.executeQuery(sql);
		
			// 打印所有列名
			int count = result.getMetaData().getColumnCount();
			for (int i = 1; i <= count; i++) {
				System.out.print(result.getMetaData().getColumnName(i) + "\t");
			}
			System.out.println("");
					
			while (result.next()) {
				System.out.println(result.getString("GOODS_NAME"));
			}
			
			// 增加、删除、修改，对主键，不能重复
			statement.executeUpdate("insert into student values (84, '小高', 28, '男', null);");
		} catch (ClassNotFoundException e) {
			System.out.println("未找到驱动类");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("sql操作异常");
			e.printStackTrace();
		}
	}
}
