package Modelo;

import Entidad.Alumno;
import Util.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import Interfaces.MVC_Inter;
import java.sql.SQLException;

public class ModeloAlumno implements MVC_Inter{
    
    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Alumno a = new Alumno();
    //Alumno alumno = new Alumno();

    @Override
    public List listar() {
        ArrayList<Alumno> list = new ArrayList<>();
        String sql = "select * from tbalumno";
        try{
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                Alumno alum = new Alumno();
                alum.setIdAlumno(rs.getInt("idtbAlumno"));
                alum.setNombres(rs.getString("nombre"));
                alum.setApellidos(rs.getString("apellido"));
                alum.setEdad(rs.getInt("edad"));
                list.add(alum);
            }
        }catch(Exception e){
            
        }
        return list;
    }

    @Override
    public Alumno list(int id) {
        String sql = "select * from tbalumno where idtbAlumno="+id;
        try{
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                a.setIdAlumno(rs.getInt("idtbAlumno"));
                a.setNombres(rs.getString("nombre"));
                a.setApellidos(rs.getString("apellido"));
                a.setEdad(rs.getInt("edad"));
            }
        }catch(Exception e){
            
        }
        return a;
    }

    @Override
    public boolean agregar(Alumno alum) {
        String sql = "insert into tbalumno(nombre, apellido, edad) values ('"+alum.getNombres()+"','"+alum.getApellidos()+"','"+alum.getEdad()+"')";
        try{
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        }catch(Exception e){
            
        }
        return false;
    }

    @Override
    public boolean actualizar(Alumno alum) {
        String sql = "Update tbalumno set nombre='"+alum.getNombres()+"',apellido='"+alum.getApellidos()+"',edad='"+alum.getEdad()+"' where idtbAlumno=" + alum.getIdAlumno();
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
        String sql = "delete from tbalumno where idtbAlumno="+id;
        try{
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        }catch(Exception e){
            
        }
        return false;
    }

    @Override
    public List<Alumno> buscar(String texto) {
        List<Alumno> lista = new ArrayList<Alumno>();
        Alumno alum = null;
        //String sql = "select * from tbalumno where nombre like '%"+texto+"%'";
        String sql = "select idtbAlumno, nombre, apellido, edad from tbalumno WHERE nombre like '%"+texto+"%'";
        try{
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                alum = new Alumno();
                //Alumno alum = new Alumno();
                //alum.setIdAlumno(rs.getInt("idtbAlumno"));
                alum.setNombres(rs.getString("nombre"));
                alum.setApellidos(rs.getString("apellido"));
                alum.setEdad(rs.getInt("edad"));
                lista.add(alum);
            }
        }catch(Exception e){
        }
        return lista;
    }
    /*public List<Alumno> buscar(String texto) {
        //ArrayList<Alumno> lista = new ArrayList<>();
        List<Alumno> lista = new ArrayList<Alumno>();
        Alumno alum = null;
        //String sql = "select * from tbalumno where nombre like '%"+texto+"%'";
        String sql = "select nombre, apellido, edad from tbalumno WHERE nombre like '%"+texto+"%'";
        con = cn.getConnection();
        try{
            ps = con.prepareStatement(sql);
            ps.setString(1, texto);
            rs = ps.executeQuery();
            while(rs.next()){
                alum = new Alumno();
                //Alumno alum = new Alumno();
                //alum.setIdAlumno(rs.getInt(1));
                alum.setNombres(rs.getString(1));
                alum.setApellidos(rs.getString(2));
                alum.setEdad(rs.getInt(3));
                lista.add(alum);
            }
            con.close();
        }catch(Exception e){
        }
        return lista;
        //return alumno;
    }*/
    /*@Override
    public List buscar(String texto) {
        //ArrayList<Alumno> lista = new ArrayList<>();
        List<Alumno> lista = new ArrayList<>();
        Alumno alum = null;
        //String sql = "select * from tbalumno where nombre like '%"+texto+"%'";
        String sql = "select idtbAlumno, nombre, apellido, edad from tbalumno WHERE nombre like '%"+texto+"%'";
        try{
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                alum = new Alumno();
                //Alumno alum = new Alumno();
                alum.setIdAlumno(rs.getInt("idtbAlumno"));
                alum.setNombres(rs.getString("nombre"));
                alum.setApellidos(rs.getString("apellido"));
                alum.setEdad(rs.getInt("edad"));
                lista.add(alum);
            }
        }catch(Exception e){
        }
        return lista;
        //return alumno;
    }*/
    
}
