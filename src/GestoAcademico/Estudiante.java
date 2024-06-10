package GestoAcademico;

public class Estudiante extends Persona{
    private int certificacines;
    private double promedio;

    public Estudiante(int id, String nombre, String apellido, String estadoEscolar, String fechaNacimiento, int certificacines, double promedio) {
        super(id, nombre, apellido, estadoEscolar, fechaNacimiento);
        this.certificacines = certificacines;
        this.promedio = promedio;
    }

    public int getCertificacines() {
        return certificacines;
    }

    public void setCertificacines(int certificacines) {
        this.certificacines = certificacines;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }
}
