package edu.umss.ejercicios.dataaccess;

import edu.umss.ejercicios.model.Estudiante;

import java.util.List;

public interface EstudianteDAO {
    List<Estudiante> obtenerEstudiantes();
    void registrarNuevoEstudiante(Estudiante estudiante);
    void actualizarEstudiante(Estudiante estudiante);
    void eliminarEstudiante(String codigoSIS);
}
