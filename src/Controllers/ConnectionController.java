package Controllers;

import Interfaces.IPassableConnector;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionController extends IPassableConnector {

    private static ConnectionController controller;

    private ConnectionController(){}


    public static ConnectionController getInstance(){
        if(controller == null){
            controller = new ConnectionController();
        }
        return controller;
    }

    public Connection getConnection(String URL) {
        try{
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/"+URL.trim(), "root","root");
        }catch (SQLException ex){
            throw new RuntimeException();
        }
    }

    public Connection getConnection(String URL, String User) {
        try{
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/"+URL.trim(), User,"");
        }catch (SQLException ex){
            throw new RuntimeException();
        }
    }

    public Connection getConnection(String URL, String User, String Pass) {
        try{
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/"+URL.trim(), User,Pass);
        }catch (SQLException ex){
            throw new RuntimeException();
        }
    }
}
