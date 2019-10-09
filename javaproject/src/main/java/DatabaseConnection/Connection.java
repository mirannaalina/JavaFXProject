package DatabaseConnection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Connection {
    //db connection variables

    static Connection connection =null;
    static String databaseName = "";

    static String url ="jdbc:mysql://localhost:3306/" + databaseName;

    static String username="root";
    static String password="a4bh3p4j7wal1731";

    public static void main(String[] args) throws InstantiationException, IllegalAccessException ,ClassNotFoundException{
        Class.forName("com.mysql.jdbc.Driver").newInstance();
        try {
            //connection = DriverManager.getConnection(url, username, password);
            //PreparedStatement ps = connection.prepareStatement("INSERT INTO 'Geografie". 'Europa')//id/tari/caracteristici

            //int status = ps.executeUpdate();

        }catch( Exception e){
            e.printStackTrace();
        }
    }
}
