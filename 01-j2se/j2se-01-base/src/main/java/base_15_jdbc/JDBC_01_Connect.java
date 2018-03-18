package base_15_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

/*
 * 1.����mysql����
 * 2.��������
 * 3.����statement����
 * 4.�sql���
 * 5.ִ��
 * 6.�ر�����
 */


public class JDBC_01_Connect {
	public static void main(String[] args) {
		java.sql.Statement statement = null;    // sql���ռ�
		ResultSet result = null;    // �����
		
		try (
				// 2.������� 6.�ر�����
				Connection connection = DriverManager.getConnection(
						"jdbc:mysql://localhost:3306/bsr_data1", "root", "root");
				) {
			// 1.����msql�����������������Ϣ
			Class.forName("com.mysql.jdbc.Driver"); 
			
			
			// 3.���Statement
			statement = connection.createStatement();
			
			// 4.��дsql���
			String sql = "select * from goods g where g.GOODS_ID = 8 and g.USER_ID=2";
			
			// 5.ִ��
			// ��ѯ��
			result = statement.executeQuery(sql);
		
			// ��ӡ��������
			int count = result.getMetaData().getColumnCount();
			for (int i = 1; i <= count; i++) {
				System.out.print(result.getMetaData().getColumnName(i) + "\t");
			}
			System.out.println("");
					
			while (result.next()) {
				System.out.println(result.getString("GOODS_NAME"));
			}
			
			// ���ӡ�ɾ�����޸ģ��������������ظ�
			statement.executeUpdate("insert into student values (84, 'С��', 28, '��', null);");
		} catch (ClassNotFoundException e) {
			System.out.println("δ�ҵ�������");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("sql�����쳣");
			e.printStackTrace();
		}
	}
}
