package context;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DBContext {
    
    private static final String DB="BANGIAY1";
    private static final String USER_NAME="sa";
    private static final String PASSWORD="1234";
    public  Connection getConnection() throws ClassNotFoundException, SQLException{
        Connection conn = null;
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String url="jdbc:sqlserver://localhost:1433;databaseName="+ DB;
        conn = DriverManager.getConnection(url, USER_NAME,PASSWORD);
        return conn;
    }
    public static void main(String[] args) {
        try {
            System.out.println(new DBContext().getConnection());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
 