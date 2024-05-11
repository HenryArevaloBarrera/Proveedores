package org.main.Conexion;

import java.sql.*;

public class Conexion {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/proveedor?serverTimezone=UTC";
        String user = "root";
        String password = "";
        System.out.println("Conectando a la base de datos....");
        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery("SELECT * FROM tipoproducto");
            System.out.println("Conectado a la base de datos");

            connection.close();
            statement.close();
            resultSet.close();
        } catch (SQLException e) {

            System.out.println("No se puede conectar con la base de datos");
        }
        }
    }
