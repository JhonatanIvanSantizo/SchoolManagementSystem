package GestoAcademico;

public class Curso {
    private int id;
    private String nombre;
    private String descripcion;
    private double numeroCreditos;
    private double version;

    public Curso(int id, String nombre, String descripcion, double numeroCreditos, double version) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.numeroCreditos = numeroCreditos;
        this.version = version;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getNumeroCreditos() {
        return numeroCreditos;
    }

    public void setNumeroCreditos(double numeroCreditos) {
        this.numeroCreditos = numeroCreditos;
    }

    public double getVersion() {
        return version;
    }

    public void setVersion(double version) {
        this.version = version;
    }
}
