package Entidad;

public class Alumno {
    //ATRIBUTOS
    private int IdAlumno;
    private String nombres;
    private String apellidos;
    private int edad;
    //CONSTRUCTORES
    public Alumno() {    }
     
    public Alumno(String nombres, String apellidos, int edad) 
    {
        //this.IdAlumno = IdAlumno;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.edad = edad;
    }
    //METODOS GETTER & SETTER
    public int getIdAlumno() {
        return IdAlumno;
    }
    public void setIdAlumno(int IdAlumno) {
        this.IdAlumno = IdAlumno;
    }
    public String getNombres() {
        return nombres;
    }
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
    public String getApellidos() {
        return apellidos;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
}
