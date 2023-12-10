package org.example.week10;

import java.sql.*;

public class HelloDB {
    public static void main(String[] args) throws SQLException {

        String url = "jdbc:sqlite:hello.sqlite";
        Connection connection = DriverManager.getConnection(url);
        Statement statement = connection.createStatement();

//        String createTableSQL = "CREATE TABLE cats (name TEXT, age INTEGER)"; //table and columns contents
//        statement.execute(createTableSQL); //actually create table

        //COMMENTED OUT SO NOT TO ADD THE SAME INFO TWICE
//        //add data into rows
//        //SQL uses single quotes for strings
//        String insertDataSQL = "INSERT INTO cats VALUES ('Maru', 10)";
//        //insert statement
//        statement.execute(insertDataSQL);

        //another
//        String insertDataSQL = "INSERT INTO cats VALUES ('Hello Kitty', 67)";
//        statement.execute(insertDataSQL);

        //get all data from database
        String getAllDataSQL = "SELECT * FROM cats";
        // data is returned in a result set
        ResultSet allCatData = statement.executeQuery(getAllDataSQL);

        //be prepared to get a lot or no data with a while loop
        while (allCatData.next()) {
            String name = allCatData.getString("name");
            int age = allCatData.getInt("age");
            System.out.println(name + " is " + age + " years old.");
        }
        connection.close();
    }

}
