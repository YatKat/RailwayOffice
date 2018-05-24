package model.DBConnection;

import org.apache.tomcat.jdbc.pool.PoolProperties;
import org.apache.tomcat.jdbc.pool.DataSource;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import java.sql.Connection;
import java.sql.SQLException;

public class ConnectionPool {

    private static Connection conn;

    public static Connection getConn() {
        PoolProperties poolProp = new PoolProperties();

        poolProp.setUrl("jdbc:mysql://localhost:3306/railway?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC");
        poolProp.setDriverClassName("com.mysql.cj.jdbc.Driver");
        poolProp.setUsername("root");
        poolProp.setPassword("root");
        poolProp.setMaxActive(100);
        poolProp.setMaxWait(10000);

        DataSource dataSource = new DataSource();
        dataSource.setPoolProperties(poolProp);
        try {
            conn = dataSource.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
//        Context initContext;
//        Context envContext;
//        DataSource ds;
//        try {
//            initContext = new InitialContext();
//            envContext = (Context) initContext.lookup("java:comp/env");
//            ds = (DataSource) envContext.lookup("/jdbc/railway");
//            conn = ds.getConnection();
//        } catch (NamingException e) {
//            e.printStackTrace();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
        return conn;
    }

    public static void closeConn() {
        try {
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
