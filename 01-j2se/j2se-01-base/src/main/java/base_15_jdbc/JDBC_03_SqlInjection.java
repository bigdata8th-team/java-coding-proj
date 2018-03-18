package base_15_jdbc;

import java.sql.*;

/*
 * sqlע��
 */

public class JDBC_03_SqlInjection {
	public static void main(String[] args) {
		Connection conn = null;//����
		Statement stat = null;//�����sql�������ݿ���ִ��
		ResultSet rs = null;//�����
		try{
			//com.mysql.jdbc.Driver���ȫ�޶�����������ļ����ص��ڴ���
			//1	ʹ��mysql���ݿ⣬����mysql���ݿ�����
			Class.forName("com.mysql.jdbc.Driver");
			//2	�����ݿ�
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bsr_data1","root","root");
			//3	���Statement
			stat = conn.createStatement();
			
			//4	sql���ע�빥��
			String name = "qwerqwer";
			String pwd = " ' or '1'='1";
			String sql = "select * From user_info u where u.USER_NAME='"+name+"' and u.`PASSWORD`='"+pwd+"'";
 			System.out.println(sql);
 			//5	query�ǲ�ѯ����˼��ִ��sql���
			rs = stat.executeQuery(sql);
			//�Խ�������б���
			while(rs.next()){
				System.out.println(rs.getString("user_name"));//column�ֶ�
			}
			//��ɾ��
			//stat.executeUpdate("INSERT INTO location VALUES (123, 'haha')");//executeUpdate��ɾ��
			//stat.executeUpdate("delete from location where location_id=123");//executeUpdate��ɾ��
		} catch (ClassNotFoundException e) {
			System.out.println("δ�ҵ�������");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("sql�����쳣");
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
