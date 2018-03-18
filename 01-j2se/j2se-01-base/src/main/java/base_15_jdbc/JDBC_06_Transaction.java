package base_15_jdbc;

import base_15_jdbc.util.DBCPUtil;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * 事务处理
 * @author Administrator
 *
 */
public class JDBC_06_Transaction {
	public static void main(String[] args) {
		Connection conn = null;
		Statement stat = null;
		try{
			//conn = DBUtil1.getConn();
			conn = DBCPUtil.getConn();
			stat = conn.createStatement();
			conn.setAutoCommit(false);//关闭自动提交
			stat.executeUpdate("INSERT INTO location VALUES (111, 'haha')");//5	执行sql语句
			stat.executeUpdate("INSERT INTO location VALUES (222, 'haha')");//5	执行sql语句
			stat.executeUpdate("INSERT INTO location VALUES (333, 'haha')");//5	执行sql语句
			conn.commit();//手动提交
		} catch (SQLException e) {
			try {
				conn.rollback();//回滚
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			System.out.println("sql操作异常");
			e.printStackTrace();
		}finally{
			//DBUtil1.close(conn);
		}
	}
}
