import java.sql.Connection;
import java.sql.DriveManager;
import java.sql.SQLException;

public class DatabaseHandler exdends Configs{
    Connection dbConnection;

    public Connection getDbConnectino()
        throws ClassNotFoundException, SQLException{
        String connectionString = "jdbc:mysql//" + dbHost + ":"
                + dbPort + "/" + dbName;

        Class.forName("com.mysql.jdbc.driver");

        dbConnection = DriverManager.getConnection(connectionString,
                dbUser, dbPass);
        return dbConnection;
    }
}