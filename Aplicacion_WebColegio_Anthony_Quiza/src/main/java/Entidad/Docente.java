package Entidad;

public class Docente {
    //ATRIBUTOS
    private int IdDocente;
    private String nombres;
    private String apellidos;
    private String especialidad;
    private String fechaIngreso;
    //CONSTRUCTORES
    public Docente(){
    }
    public Docente(String nombres, String apellidos, String especialidad, String fechaIngreso) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.especialidad = especialidad;
        this.fechaIngreso = fechaIngreso;
    }
    //METODOS GETTER AND SETTER
    public int getIdDocente() {
        return IdDocente;
    }
    public void setIdDocente(int IdDocente) {
        this.IdDocente = IdDocente;
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
    public String getEspecialidad() {
        return especialidad;
    }
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    public String getFechaIngreso() {
        return fechaIngreso;
    }
    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }    
}
