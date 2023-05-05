package Interfaces;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public abstract class IPassableConnector implements IConnector{

    /**
     * Connects to the default fallback schema
     * @return Connection
     */
    @Override
    public Connection getConnection(){
        try{
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/table_data","root","root");
        }catch (SQLException e){
            throw new RuntimeException();
        }
    }

    /*User definable connections*/

    /**
     * Connects to a database specified by the user
     * @param URL
     * @param User
     * @param Pass
     * @return Connection
     * @throws SQLException
     */
    public abstract Connection getConnection(String URL, String User, String Pass) throws SQLException;
    /**
     * Connects to a database specified by the user with the default user and password of {@code "root" "root"}
     * @param URL
     * @return Connection
     * @throws SQLException
     */
    public abstract Connection getConnection(String URL) throws SQLException;
    /**
     * Connects to a database specified by the user with the default password of {@code "root"}
     * @param URL
     * @param User
     * @return Connection
     * @throws SQLException
     */
    public abstract Connection getConnection(String URL, String User) throws SQLException;
}
