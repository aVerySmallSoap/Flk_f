package Controllers;

import Interfaces.IConnector;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@SuppressWarnings("unused")
public class ConnectionController implements IConnector {

    private final String SCHEMA;
    private final String User;
    private final String Pass;

    public ConnectionController(String Schema, String User, String Pass){
        this.SCHEMA = Schema;
        this.User = User;
        this.Pass = Pass;
    }

    @Override
    public Connection getConnection(){
        try{
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/"+SCHEMA.trim(), User.trim(), Pass.trim());
        }catch (SQLException e){
            throw new RuntimeException();
        }
    }
}
