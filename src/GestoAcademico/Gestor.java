package GestoAcademico;

import java.util.ArrayList;
import java.util.HashMap;

import exception.*;

public class Gestor implements ServiciosAcademicosI{
    private ArrayList<Estudiante> estudiantes;
    private ArrayList<Curso> cursos;
    private HashMap<Integer, ArrayList<Integer>> inscritosCurso;

    public Gestor() {
        estudiantes = new ArrayList<>();
        cursos = new ArrayList<>();
        inscritosCurso = new HashMap<>();
    }
    @Override
    public void matricularEstudiante(Estudiante estudiante){
        if (!estudiantes.contains(estudiante)){
            estudiantes.add(estudiante);
        }
    }
    @Override
    public void agregarCurso(Curso curso) {
        if (!cursos.contains(curso)){
            cursos.add(curso);
        }
    }
    @Override
    public void inscribirEstudianteCurso(Estudiante estudiante, int idCurso) throws EstudianteYaInscritoException {
        ArrayList<Integer> estudiantesInscritos = inscritosCurso.getOrDefault(idCurso, new ArrayList<>());


        if (estudiantesInscritos.contains(estudiante.getId())) {
            throw new EstudianteYaInscritoException("El estudiante con id:" + estudiante.getId()+ " ya está inscrito en este curso");
        }

        estudiantesInscritos.add(estudiante.getId());
        inscritosCurso.put(idCurso, estudiantesInscritos);
    }
    @Override
    public void desinscribirEstudianteCurso(int idEstudiante, int idCurso) throws EstudianteNoInscritoEnCursoException {
        ArrayList<Integer> estudiantesInscritos = inscritosCurso.getOrDefault(idCurso, new ArrayList<>());

        if (!estudiantesInscritos.contains(idEstudiante)) {
            throw new EstudianteNoInscritoEnCursoException("El estudiante con id: " +idEstudiante+" no está inscrito en este curso");
        }

        estudiantesInscritos.remove((Integer) idEstudiante);
        inscritosCurso.put(idCurso, estudiantesInscritos);
    }

    public HashMap getinscritosCurso() {
        return inscritosCurso;
    }
}
