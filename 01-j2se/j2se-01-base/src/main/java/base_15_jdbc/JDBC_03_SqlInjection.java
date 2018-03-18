package base_15_jdbc;

import java.sql.*;

/*
 * sql注入
 */

public class JDBC_03_SqlInjection {
	public static void main(String[] args) {
		Connection conn = null;//连接
		Statement stat = null;//负责把sql语句放数据库上执行
		ResultSet rs = null;//结果集
		try{
			//com.mysql.jdbc.Driver类的全限定名，把这个文件加载到内存中
			//1	使用mysql数据库，加载mysql数据库驱动
			Class.forName("com.mysql.jdbc.Driver");
			//2	连数据库
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bsr_data1","root","root");
			//3	获得Statement
			stat = conn.createStatement();
			
			//4	sql语句注入攻击
			String name = "qwerqwer";
			String pwd = " ' or '1'='1";
			String sql = "select * From user_info u where u.USER_NAME='"+name+"' and u.`PASSWORD`='"+pwd+"'";
 			System.out.println(sql);
 			//5	query是查询的意思，执行sql语句
			rs = stat.executeQuery(sql);
			//对结果集进行遍历
			while(rs.next()){
				System.out.println(rs.getString("user_name"));//column字段
			}
			//增删改
			//stat.executeUpdate("INSERT INTO location VALUES (123, 'haha')");//executeUpdate增删改
			//stat.executeUpdate("delete from location where location_id=123");//executeUpdate增删改
		} catch (ClassNotFoundException e) {
			System.out.println("未找到驱动类");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("sql操作异常");
			e.printStackTrace();
		}finally{
			try {
				if(conn!=null){
					conn.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
