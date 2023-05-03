package Interfaces;

import java.sql.Connection;
import java.sql.SQLException;

@SuppressWarnings("RedundantThrows")
public interface IConnector {
    Connection getConnection() throws SQLException;
}
