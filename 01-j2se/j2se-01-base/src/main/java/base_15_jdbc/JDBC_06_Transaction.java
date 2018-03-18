package base_15_jdbc;

import base_15_jdbc.util.DBCPUtil;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * ������
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
			conn.setAutoCommit(false);//�ر��Զ��ύ
			stat.executeUpdate("INSERT INTO location VALUES (111, 'haha')");//5	ִ��sql���
			stat.executeUpdate("INSERT INTO location VALUES (222, 'haha')");//5	ִ��sql���
			stat.executeUpdate("INSERT INTO location VALUES (333, 'haha')");//5	ִ��sql���
			conn.commit();//�ֶ��ύ
		} catch (SQLException e) {
			try {
				conn.rollback();//�ع�
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			System.out.println("sql�����쳣");
			e.printStackTrace();
		}finally{
			//DBUtil1.close(conn);
		}
	}
}
