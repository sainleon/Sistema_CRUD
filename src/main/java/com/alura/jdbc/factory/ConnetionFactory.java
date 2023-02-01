package com.alura.jdbc.factory;
import com.mchange.v2.c3p0.ComboPooledDataSource;
import javax.sql.DataSource;
import java.sql.*;
public class ConnetionFactory {

    private DataSource dataSource;

    public ConnetionFactory(){
        var poolDataSource = new ComboPooledDataSource();
        poolDataSource.setJdbcUrl("jdbc:mysql://localhost/control_de_stock?useTimeZone=true&serverTimeZone=UTC");
        poolDataSource.setUser("root");
        poolDataSource.setPassword("12345678");
        poolDataSource.setMaxPoolSize(10);

        this.dataSource = poolDataSource;

    }


    public Connection recuperarConexion() {
        try {
            return this.dataSource.getConnection();
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
    }
}
