package base_15_jdbc;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * ���ݿ���ӦjavaBean(domain,entity,pojo��ʵ����)��ʵ���Ǻ����ݿ����Ӧ����
 * �Ѽ�¼װ��һ����������
 * ��n������װ��list������
 * @author Administrator
 *
 */
public class JDBC_09_DBList {
	public static void main(String[] args) {
		PreparedStatement stat = null;//Ԥ����
		ResultSet rs = null;//�����
		try(
				Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bsr_data1","root","root");//2	�����ݿ�
				){
			Class.forName("com.mysql.jdbc.Driver");//1	ʹ��mysql���ݿ⣬����mysql���ݿ�����
			
			String sql = "select * from goods g";//3	?ռλ��
			stat = conn.prepareStatement(sql);//4	���PreparedStatement
			rs = stat.executeQuery();//5	ִ��sql���
			List<Goods> list = new ArrayList<Goods>();
			//�Խ�������б���
			while(rs.next()){
				Goods goods = new Goods();
				goods.setGoodsName(rs.getString("goods_name"));
				goods.setUserId(rs.getInt("user_id"));
				list.add(goods);
			}
			System.out.println(list);
		} catch (ClassNotFoundException e) {
			System.out.println("δ�ҵ�������");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("sql�����쳣");
			e.printStackTrace();
		}
	}
}
