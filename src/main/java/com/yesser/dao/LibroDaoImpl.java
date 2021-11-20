package com.yesser.dao;

import com.yesser.conexion.Conexion;
import com.yesser.modelo.Libro;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class LibroDaoImpl implements LibroDao {
    @Override
    public int delete(int id) {
        return 0;
    }

    @Override
    public List<Libro> findAll() {
        return null;
    }

    @Override
    public int insert(Libro libro) {
        int registrar = -1;

        Statement stm= null;
        Connection con=null;

        String sql="INSERT INTO libro values (NULL,'"+libro.getTitulo()+"')";

        try {
            con= Conexion.conectar();
            stm= con.createStatement();
            stm.execute(sql);
            registrar=1;
            stm.close();
            con.close();
        } catch (SQLException e) {
            System.out.println("Error: Clase LibroDaoImple, método registrar");
            e.printStackTrace();
        }
        return registrar;
    }

    @Override
    public int update(Libro libro) {
        int editar = -1;

        Statement stm= null;
        Connection con=null;

        
        String sql="UPDATE libro SET Titulo = '"+libro.getTitulo()+"', Titulo = '"+libro.getTitulo()+"' WHERE id = 3";

        try {
            con= Conexion.conectar();
            stm= con.createStatement();
            stm.execute(sql);
            editar=1;
            stm.close();
            con.close();
        } catch (SQLException e) {
            System.out.println("Error: Clase LibroDaoImple, método editar");
            e.printStackTrace();
        }
        return editar;
    }
}
