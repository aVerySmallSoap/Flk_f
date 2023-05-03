package Controllers;

import Interfaces.IConnector;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionController implements IConnector {

    private static ConnectionController controller;

    private ConnectionController(){}

    public static ConnectionController getInstance(){
        if(controller == null){
            controller = new ConnectionController();
        }
        return controller;
    }

    public Connection getConnection() {
        try{
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/table_data","root","root");
        }catch (SQLException ex){
            throw new RuntimeException(ex);
        }
    }
}
