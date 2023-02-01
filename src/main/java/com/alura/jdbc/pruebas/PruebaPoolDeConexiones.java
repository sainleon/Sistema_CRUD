package com.alura.jdbc.pruebas;

import com.alura.jdbc.factory.ConnetionFactory;

import java.sql.Connection;
import java.sql.SQLException;

public class PruebaPoolDeConexiones {
    public static void main(String[] args) throws SQLException {
        ConnetionFactory connetionFactory = new ConnetionFactory();

        for (int i = 0; i < 20; i++) {
            Connection con = connetionFactory.recuperarConexion();
            System.out.println("Abriendo la coneccion de numero ; "+ (i+1));
        }
    }
    
}
