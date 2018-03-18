package base_15_jdbc;

import base_15_jdbc.util.DBCPUtil;

import java.sql.*;

/**
 * �Զ���������
 * @author Administrator
 *
 */
public class JDBC_08_AutoReturnKey {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement stat = null;//Ԥ����
		ResultSet rs = null;//�����
		String sql = "";
		try{
			//conn = DBUtil1.getConn();
			conn = DBCPUtil.getConn();
			//conn.setAutoCommit(false);//�ر��Զ��ύ
			sql = "INSERT INTO location (location_name) VALUES ('haha')";
			stat = conn.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);//����һ���������Զ���������
			stat.executeUpdate();//��Ա���������Ϣ��ϣ�������Ӧ��Ա��ID
			rs = stat.getGeneratedKeys();//�������ɵ���������ֵװ��rs�������
			int userId = 0;
			if(rs.next()){
				userId = rs.getInt(1);//�����������ֵ
				//rs.getString("�ֶ���");
			}
			System.out.println(userId);
			//stat.executeUpdate("insert into ����� values(...,"+userId+",....)");
			//stat.executeUpdate("insert into ���ڱ� values(...,user_id,....)");
			//conn.commit();//�ֶ��ύ
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
