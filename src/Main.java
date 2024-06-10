import GestoAcademico.Curso;
import GestoAcademico.Estudiante;
import GestoAcademico.Gestor;
import exception.EstudianteNoInscritoEnCursoException;
import exception.EstudianteYaInscritoException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante(1,"Jhonatan","Santizo","Estudiando","2006-07-22",1,95.05);
        Estudiante estudiante2 = new Estudiante(2,"Ivan","Martinez","Estudiando","2006-07-22",1,96.12);
        Curso curso1 = new Curso(1,"Matematica","Aritmetica",30,4);
        Curso curso2 = new Curso(2,"Computacion","Programacion",40,2);

        Gestor gestor = new Gestor();

        gestor.agregarCurso(curso1);
        gestor.agregarCurso(curso2);
        gestor.matricularEstudiante(estudiante1);
        gestor.matricularEstudiante(estudiante1);

        try {
            gestor.inscribirEstudianteCurso(estudiante1, curso1.getId());
            gestor.inscribirEstudianteCurso(estudiante2, curso1.getId());
            gestor.inscribirEstudianteCurso(estudiante2, curso2.getId());
            gestor.inscribirEstudianteCurso(estudiante2, curso1.getId());
        } catch (EstudianteYaInscritoException e) {
            System.out.println("Error: "+e.getMessage()+"\n");
        }
        System.out.println("Estudiantes por curso (idCurso=[idEstudiantes]):");
        System.out.println(gestor.getinscritosCurso()+"\n");
        try {
            gestor.desinscribirEstudianteCurso(estudiante1.getId(), curso1.getId());
            gestor.desinscribirEstudianteCurso(estudiante2.getId(), curso1.getId());
            gestor.desinscribirEstudianteCurso(estudiante1.getId(), curso1.getId());
        } catch (EstudianteNoInscritoEnCursoException e) {
            System.out.println("Error: "+e.getMessage()+"\n");
        }
        System.out.println("Estudiantes por curso (idCurso=[idEstudiantes]):");
        System.out.println(gestor.getinscritosCurso());
    }
}