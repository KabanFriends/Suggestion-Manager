package com.diamondfire.suggestionsbot.database;

import com.diamondfire.suggestionsbot.util.Config;
import com.mysql.cj.jdbc.MysqlDataSource;

import java.sql.Connection;
import java.sql.SQLException;

public class ConnectionProvider {

    private static final MysqlDataSource source = new MysqlDataSource();

    public static void setup() {
        System.out.println(Config.URL);
        source.setUrl(Config.URL);
        source.setUser(Config.USER);
        source.setPassword(Config.PASSWORD);
    }

    public static Connection getConnection() throws SQLException {
        return source.getConnection();
    }

}
