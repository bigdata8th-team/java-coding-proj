package base_15_jdbc;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * 数据库表对应javaBean(domain,entity,pojo，实体类)其实就是和数据库相对应的类
 * 把记录装到一个个对象中
 * 将n个对象装入list集合中
 * @author Administrator
 *
 */
public class JDBC_09_DBList {
	public static void main(String[] args) {
		PreparedStatement stat = null;//预编译
		ResultSet rs = null;//结果集
		try(
				Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bsr_data1","root","root");//2	连数据库
				){
			Class.forName("com.mysql.jdbc.Driver");//1	使用mysql数据库，加载mysql数据库驱动
			
			String sql = "select * from goods g";//3	?占位符
			stat = conn.prepareStatement(sql);//4	获得PreparedStatement
			rs = stat.executeQuery();//5	执行sql语句
			List<Goods> list = new ArrayList<Goods>();
			//对结果集进行遍历
			while(rs.next()){
				Goods goods = new Goods();
				goods.setGoodsName(rs.getString("goods_name"));
				goods.setUserId(rs.getInt("user_id"));
				list.add(goods);
			}
			System.out.println(list);
		} catch (ClassNotFoundException e) {
			System.out.println("未找到驱动类");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("sql操作异常");
			e.printStackTrace();
		}
	}
}
