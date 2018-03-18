package base_15_jdbc.util;

import org.apache.commons.dbcp2.BasicDataSource;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

public class DBCPUtil {
	private static BasicDataSource dataSource = null;//���ݿ����ӳ�
    public DBCPUtil() {
    }
    //��BasicDataSource��ʼ��	initial
    public static void init() {
        Properties dbProps = new Properties();
        // ȡ�����ļ����Ը���ʵ�ʵĲ�ͬ�޸�
        try {
//            dbProps.load(DBCPUtil.class.getClassLoader().getResourceAsStream(
//                    "dbcp.properties"));
        	dbProps.load(new FileInputStream("../dbcp.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
        	//�������ļ���ȡ��ֵ
            String driveClassName = dbProps.getProperty("driver");
            String url = dbProps.getProperty("url");
            String username = dbProps.getProperty("name");
            String password = dbProps.getProperty("password");
            String initialSize = dbProps.getProperty("dataSource.initialSize");
            String minIdle = dbProps.getProperty("dataSource.minIdle");
            String maxIdle = dbProps.getProperty("dataSource.maxIdle");
            String maxWait = dbProps.getProperty("dataSource.maxWait");
            String maxActive = dbProps.getProperty("dataSource.maxActive");

            //�����ӳظ�ֵ
            dataSource = new BasicDataSource();//һ�����ݿ����ӳ�
            dataSource.setDriverClassName(driveClassName);
            dataSource.setUrl(url);
            dataSource.setUsername(username);
            dataSource.setPassword(password);
            // ��ʼ��������
            if (initialSize != null)
                dataSource.setInitialSize(Integer.parseInt(initialSize));
            // ��С��������
            if (minIdle != null)
                dataSource.setMinIdle(Integer.parseInt(minIdle));
            // ����������
            if (maxIdle != null)
                dataSource.setMaxIdle(Integer.parseInt(maxIdle));
            // ��ʱ����ʱ��(�Ժ���Ϊ��λ)
            if (maxWait != null)
                dataSource.setMaxWaitMillis(Long.parseLong(maxWait));
            // ���������
            if (maxActive != null) {
                if (!maxActive.trim().equals("0"))
                    dataSource.setMaxConnLifetimeMillis(Integer.parseInt(maxActive));
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("�������ӳ�ʧ��!��������!!!");
        }
    }
    
    public static Connection getConn() throws SQLException{
    	if(dataSource == null){
    		init();
    	}
    	return dataSource.getConnection();//����DriverManager��ȡ�ˡ�
    }
}
