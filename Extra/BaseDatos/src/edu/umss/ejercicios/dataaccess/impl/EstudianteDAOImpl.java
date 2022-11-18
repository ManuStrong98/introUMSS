package edu.umss.ejercicios.dataaccess.impl;

import edu.umss.ejercicios.dataaccess.EstudianteDAO;
import edu.umss.ejercicios.dbconnect.DBManager;
import edu.umss.ejercicios.model.Estudiante;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EstudianteDAOImpl implements EstudianteDAO {
    @Override
    public List<Estudiante> obtenerEstudiantes() {
        List<Estudiante> estudiantes = new ArrayList<>();
        Connection conn = null;
        try {
            conn = DBManager.abrirConexion();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT codigo_sis, nombre, apellido_paterno, apellido_materno, fecha_nacimiento FROM estudiante");

            while (rs.next()) {
                Estudiante estudiante = new Estudiante(
                        rs.getString("codigo_sis"),
                        rs.getString("nombre"),
                        rs.getString("apellido_paterno"),
                        rs.getString("apellido_materno"),
                        rs.getDate("fecha_nacimiento")
                );
                estudiantes.add(estudiante);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                DBManager.cerrarConexion(conn);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return estudiantes;
    }

    @Override
    public void registrarNuevoEstudiante(Estudiante estudiante) {
        Connection conn = null;
        try {
            conn = DBManager.abrirConexion();
            PreparedStatement stmt = conn.prepareStatement("INSERT INTO estudiante VALUES (?, ?, ?, ?, ?)");
            stmt.setString(1, estudiante.getCodigoSIS());
            stmt.setString(2, estudiante.getNombre());
            stmt.setString(3, estudiante.getApellidoPaterno());
            stmt.setString(4, estudiante.getApellidoMaterno());
            stmt.setDate(5, new java.sql.Date(estudiante.getFechaNacimiento().getTime()));
            stmt.execute();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                DBManager.cerrarConexion(conn);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void actualizarEstudiante(Estudiante estudiante) {
        Connection conn = null;
        try {
            conn = DBManager.abrirConexion();
            PreparedStatement stmt = conn.prepareStatement("UPDATE estudiante SET nombre=?, apellido_paterno=?, apellido_materno=?, fecha_nacimiento=? WHERE codigo_sis=?");

            stmt.setString(1, estudiante.getNombre());
            stmt.setString(2, estudiante.getApellidoPaterno());
            stmt.setString(3, estudiante.getApellidoMaterno());
            stmt.setDate(4, new java.sql.Date(estudiante.getFechaNacimiento().getTime()));
            stmt.setString(5, estudiante.getCodigoSIS());

            stmt.execute();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                DBManager.cerrarConexion(conn);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void eliminarEstudiante(String codigoSIS) {
        Connection conn = null;
        try {
            conn = DBManager.abrirConexion();
            PreparedStatement stmt = conn.prepareStatement("DELETE FROM estudiante WHERE codigo_sis=?");

            stmt.setString(0, codigoSIS);
            stmt.execute();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                DBManager.cerrarConexion(conn);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
