package GestoAcademico;

public class Persona {
    private int id;
    private String nombre;
    private String apellido;
    private String fechaNacimiento;
    private String estadoEscolar;

    public Persona(int id, String nombre, String apellido, String estadoEscolar, String fechaNacimiento) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.estadoEscolar = estadoEscolar;
        this.fechaNacimiento = fechaNacimiento;
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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getEstadoEscolar() {
        return estadoEscolar;
    }

    public void setEstadoEscolar(String estadoEscolar) {
        this.estadoEscolar = estadoEscolar;
    }
}
