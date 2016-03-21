
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Apple
 */
public class DatabaseConnector {

String CONNECTION_URL="jdbc:mysql://localhost/company";
String USERNAME="root";
String PASSWORD="root";
Connection con=null;

public void connect()
{
    try {
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection(CONNECTION_URL, USERNAME, PASSWORD);
    } catch (ClassNotFoundException ex) {
        Logger.getLogger(DatabaseConnector.class.getName()).log(Level.SEVERE, null, ex);
    } catch (SQLException ex) {
        Logger.getLogger(DatabaseConnector.class.getName()).log(Level.SEVERE, null, ex);
    }
}
public Connection getCon(){
	return con;
}
}