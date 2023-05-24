package Modelo;

import Entidad.Docente;
import Util.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import Interfaces.MVC_Inter1;
import java.sql.SQLException;

public class ModeloDocente implements MVC_Inter1{
    
    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Docente d = new Docente();

    @Override
    public List listar() {
        ArrayList<Docente> list = new ArrayList<>();
        String sql = "select * from docentes";
        try{
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                Docente docen = new Docente();
                docen.setIdDocente(rs.getInt("idDocente"));
                docen.setNombres(rs.getString("nombre"));
                docen.setApellidos(rs.getString("apellido"));
                docen.setEspecialidad(rs.getString("especialidad"));
                docen.setFechaIngreso(rs.getString("fechaIngreso"));
                list.add(docen);
            }
        }catch(Exception e){
            
        }
        return list;
    }

    @Override
    public Docente list(int id) {
        String sql = "select * from docentes where idDocente="+id;
        try{
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                d.setIdDocente(rs.getInt("idDocente"));
                d.setNombres(rs.getString("nombre"));
                d.setApellidos(rs.getString("apellido"));
                d.setEspecialidad(rs.getString("especialidad"));
                d.setFechaIngreso(rs.getString("fechaIngreso"));
            }
        }catch(Exception e){
            
        }
        return d;
    }

    @Override
    public boolean agregar(Docente docen) {
        String sql = "insert into docentes(nombre, apellido, especialidad, fechaIngreso) values ('"+docen.getNombres()+"','"+docen.getApellidos()+"','"+docen.getEspecialidad()+"','"+docen.getFechaIngreso()+"')";
        try{
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        }catch(Exception e){
            
        }
        return false;
    }

    @Override
    public boolean actualizar(Docente docen) {
        String sql = "Update docentes set nombre='"+docen.getNombres()+"',apellido='"+docen.getApellidos()+"',especialidad='"+docen.getEspecialidad()+"',fechaIngreso='"+docen.getFechaIngreso()+"' where idDocente=" + docen.getIdDocente();
        try{
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        }catch(Exception e){
            
        }
        return false;
    }

    @Override
    public boolean eliminar(int id) {
        String sql = "delete from docentes where idDocente="+id;
        try{
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        }catch(Exception e){
            
        }
        return false;
    }

    @Override
    public List<Docente> buscar(String texto) {
        List<Docente> lista = new ArrayList<Docente>();
        Docente docen = null;
        String sql = "select idDocente, nombre, apellido, especialidad, fechaIngreso from docentes WHERE apellido like '%"+texto+"%' or especialidad like '%"+texto+"%'";
        try{
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                docen = new Docente();
                docen.setNombres(rs.getString("nombre"));
                docen.setApellidos(rs.getString("apellido"));
                docen.setEspecialidad(rs.getString("especialidad"));
                docen.setFechaIngreso(rs.getString("fechaIngreso"));
                lista.add(docen);
            }
        }catch(Exception e){
        }
        return lista;
    }
}
