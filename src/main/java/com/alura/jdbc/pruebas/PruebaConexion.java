package com.alura.jdbc.pruebas;

import com.alura.jdbc.factory.ConnetionFactory;

import java.sql.Connection;
import java.sql.SQLException;

public class PruebaConexion {

    public static void main(String[] args) throws SQLException {

        Connection con = new ConnetionFactory().recuperarConexion();

        System.out.println("Cerrando la conexión");

        con.close();
    }

}
