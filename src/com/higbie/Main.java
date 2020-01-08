package com.higbie;

import com.higbie.Helper.DBHandler;

import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Main {
    static private DBHandler dbHandler;
    static private Connection connection;
    static private PreparedStatement preparedStatement;

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        dbHandler = new DBHandler();
        connection = dbHandler.getDbConnection();
        String insert = "INSERT INTO users(firstname, lastname, username, address, age )"
                + "VALUES(?, ?, ?, ?, ?)";

        preparedStatement = connection.prepareStatement(insert);
        preparedStatement.setString(1, "Paulo");
        preparedStatement.setString(2, "Dichone");
        preparedStatement.setString(3, "pdichone");
        preparedStatement.setString(4, "123 Park Ave");
        preparedStatement.setInt(5, 33);
}
