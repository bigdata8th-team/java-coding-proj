package base_15_jdbc;

import base_15_jdbc.util.DBCPUtil;

import java.sql.*;

/**
 * 自动返回主键
 * @author Administrator
 *
 */
public class JDBC_08_AutoReturnKey {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement stat = null;//预编译
		ResultSet rs = null;//结果集
		String sql = "";
		try{
			//conn = DBUtil1.getConn();
			conn = DBCPUtil.getConn();
			//conn.setAutoCommit(false);//关闭自动提交
			sql = "INSERT INTO location (location_name) VALUES ('haha')";
			stat = conn.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);//加了一个参数，自动返回主键
			stat.executeUpdate();//向员工表插入信息，希望获得相应的员工ID
			rs = stat.getGeneratedKeys();//将刚生成的主键返回值装入rs结果集中
			int userId = 0;
			if(rs.next()){
				userId = rs.getInt(1);//获得主键返回值
				//rs.getString("字段名");
			}
			System.out.println(userId);
			//stat.executeUpdate("insert into 财务表 values(...,"+userId+",....)");
			//stat.executeUpdate("insert into 考勤表 values(...,user_id,....)");
			//conn.commit();//手动提交
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
