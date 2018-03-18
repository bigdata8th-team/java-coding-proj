package base_15_jdbc;

import base_15_jdbc.util.DBCPUtil;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * ��������
 * @author Administrator
 *
 */
public class JDBC_07_Batch {
	public static void main(String[] args) {
		Connection conn = null;
		Statement stat = null;
		String sql = "";
		try{
			//conn = DBUtil1.getConn();
			conn = DBCPUtil.getConn();
			conn.setAutoCommit(false);//�ر��Զ��ύ
			stat = conn.createStatement();
			for(int i=1;i<=20;i++){
				sql = "INSERT INTO location VALUES ("+i+", 'haha')";
				stat.addBatch(sql);//�������
				if(i%5==0){//5��һ����
					stat.executeBatch();
				}
			}
			stat.executeBatch();//����ִ��
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
