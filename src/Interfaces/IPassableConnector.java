package Interfaces;

import java.sql.Connection;
import java.sql.SQLException;

@SuppressWarnings("RedundantThrows")
public abstract class IPassableConnector implements IConnector{

    /**
     * Connects to a database without a user
     * @return Connection
     */
    @SuppressWarnings("unused")
    @Override
    public abstract Connection getConnection();

    /*User definable connections*/

    /**
     * Connects to a database specified by the user
     * @param URL - Database connection url
     * @param User - Username
     * @param Pass - Password
     * @return Connection
     * @throws SQLException - Throws the general SQLException
     */
    @SuppressWarnings("unused")
    public abstract Connection getConnection(String URL, String User, String Pass) throws SQLException;
    /**
     * Connects to a database specified by the user with the default user and password of {@code "root" "root"}
     * @param URL - Database connection url
     * @return Connection
     * @throws SQLException - Throws the general SQLException
     */
    @SuppressWarnings("unused")
    public abstract Connection getConnection(String URL) throws SQLException;
}
