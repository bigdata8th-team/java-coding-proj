package base_15_jdbc;

import java.sql.*;

/*
 * ��ֹsqlע�빥��
 */

public class JDBC_04_SqlSafe {
	public static void main(String[] args) {
		PreparedStatement stat = null;
		ResultSet rs = null;
		
		try (
				Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bsr_data1", "root", "root");
				) {
			
			//1	ʹ��mysql���ݿ⣬����mysql���ݿ�����
			Class.forName("com.mysql.jdbc.Driver");
			
			//3	?ռλ��
			String sql = "select * From user_info u where u.USER_NAME=? and u.`PASSWORD`=?";//3	?ռλ��
			
			//4	���PreparedStatement
			stat = conn.prepareStatement(sql);
			
			//��ռλ����ֵ�� setInt�����ռλ������ֵΪint���ͣ�
			//1�����һ��ռλ����8����value
			stat.setString(1, "qwerqwer");
			stat.setString(2, " ' or '1'='1");
			
			//5	query�ǲ�ѯ����˼��ִ��sql���
			rs = stat.executeQuery();
			
			while (rs.next()) {
				System.out.println(rs.getString("user_name"));
			}
		} catch (SQLException e) {
			System.out.println("sql����쳣");
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			System.out.println("δ�ҵ�������");
			e.printStackTrace();
		}
	}
}
