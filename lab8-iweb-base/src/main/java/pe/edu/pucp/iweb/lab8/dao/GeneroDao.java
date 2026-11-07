package pe.edu.pucp.iweb.lab8.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import pe.edu.pucp.iweb.lab8.beans.Genero;

public class GeneroDao extends BaseDao{ // TODO: heredar de BaseDao

    /**
     * Ejercicio 2: todos los géneros ordenados por nombre.
     */
    public ArrayList<Genero> listar() {
        // TODO
        ArrayList<Genero> generos = new ArrayList<>();

        try (Connection conn=this.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("select * from genero order by nombre ");) {
            while (rs.next()){
                Genero genero = new Genero();
                

            }
        }
        catch (SQLException throwables){
            throwables.printStackTrace();
        }




        return new ArrayList<>();
    }
}
