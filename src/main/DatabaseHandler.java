package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DatabaseHandler extends Configs{
    private Connection dbConnection;

    public Connection getDbConnection()
        throws ClassNotFoundException, SQLException{
        String connectionString = "jdbc:mysql//" + dbHost + ":"
                + dbPort + "/" + dbName;

        Class.forName("com.mysql.jdbc.driver");

        dbConnection = DriverManager.getConnection(connectionString,
                dbUser, dbPass);
        return dbConnection;
    }

public void signUpUser(String firstName, String lastName, String password, int userId) {
    String insert = "INSERT INTO" + Constant.USER_TABLE + "(" +
            Constant.USER_ID + "," + Constant.USER_FIRSTNAME + " , " +
            Constant.USER_LASTNAME + " ," + Constant.USER_PASSWORD + ")" +
            "VALUES(?,?,?,?)";
    PreparedStatement prSt = getDbConnection().prepareStatement(insert);
    prSt.setString(1, firstName);
    prSt.setInt(2, userId);
    prSt.setString(3,lastName);
    prSt.setString(4, password);

    try {
        prSt.executeUpdate();
    }catch (SQLException e){
        e.printStackTrace();
    }

}
}