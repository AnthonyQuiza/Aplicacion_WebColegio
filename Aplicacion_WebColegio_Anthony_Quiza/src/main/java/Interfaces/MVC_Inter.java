package Interfaces;

import Entidad.Alumno;
import java.util.List;

public interface MVC_Inter {
    public List listar();
    public Alumno list(int id);
    public boolean agregar(Alumno alum);
    public boolean actualizar(Alumno alum);
    public boolean eliminar(int id);
    public List<Alumno> buscar(String texto);
    //public List buscar(String texto);
    //public Alumno buscar(String texto);
}
