package Interfaces;

import Entidad.Docente;
import java.util.List;

public interface MVC_Inter1 {
    public List listar();
    public Docente list(int id);
    public boolean agregar(Docente docen);
    public boolean actualizar(Docente docen);
    public boolean eliminar(int id);
    public List<Docente> buscar(String texto);
}
