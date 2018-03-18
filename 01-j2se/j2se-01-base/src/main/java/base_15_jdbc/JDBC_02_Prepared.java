package base_15_jdbc;

import java.sql.*;

/*
 * Ԥ����
 * 1.����JDBC����
 * 2.��������
 * 3.����PreparedStatement
 * 4.���ö�Ӧ�Ĳ���
 * 5.����sql����
 */

public class JDBC_02_Prepared {
	public static void main(String[] args) {
		
		PreparedStatement stat = null;  // Ԥ����
		ResultSet rs = null;
		
		try (
				Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bsr_data1", "root", "root");
				){
			
			Class.forName("com.mysql.jdbc.Driver");
			
			String sql = "select * from goods g where g.GOODS_ID = ? and g.USER_ID=?";
			
			stat = conn.prepareStatement(sql);
			stat.setInt(1, 8);
			stat.setInt(2, 2);
			
			// ִ��sql�����в�ѯ
			rs = stat.executeQuery();

			while (rs.next()) {
				System.out.println(rs.getString(4));
			}
			
		} catch (ClassNotFoundException e) {
			System.out.println("δ�ҵ�������");
			e.printStackTrace();
		} catch (SQLException e1) {
			System.out.println("sql�����쳣");
			e1.printStackTrace();
		}
	}
}
