/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Horario;

import Abstracta.BD;
import Abstracta.Conexion;
import Abstracta.Entidad;
import java.sql.Connection;
import java.util.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
/**
 *
 * @author Marcos
 */
public class Docente extends Entidad {
    private int docenteId;
    private int legajo;
    private String nombre;
    private String email;
    private Date fecha;
    private String observacion;
    private String condicion;
    
    public int getDocenteId() {
        return docenteId;
    }

    public void setDocenteId(int docenteId) {
        this.docenteId = docenteId;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public String getCondicion() {
        return condicion;
    }

    public void setCondicion(String condicion) {
        this.condicion = condicion;
    }

    public Docente(){
    }
    
    public Docente (int legajo, String nombre,String email, Date fecha,String observacion,String condicion)
     {
        this.legajo=legajo;
        this.nombre= nombre;
        this.email=email;
        this.fecha=fecha;
        this.observacion=observacion;
        this.condicion=condicion;
               
    }
    @Override
    public void altas() {
        String consulta = "INSERT INTO Docente VALUES ("
                + ""+this.legajo+","
                + "'"+this.nombre+"',"
                + "'"+this.email+"',"
                + "'"+this.fecha+"',"
                + "'"+this.condicion+"',"
                + "'"+this.observacion+"')";
                Conexion con = new Conexion();
                con.conectar();
        try{
            con.getConexion().createStatement().execute(consulta);
        }catch(SQLException a){
            System.out.println("NO SE PUDO REALIZAR EL ALTA: "+consulta);
            a.printStackTrace();
        }
    }
    @Override
    public void bajas() {
            String consulta = "DELETE FROM Docente "
            + "where legajo="+this.legajo;
            Conexion con = new Conexion();
            con.conectar();
        try{
            con.getConexion().createStatement().execute(consulta);
        }catch(SQLException a){
            System.out.println("NO SE PUDO REALIZAR LA BAJA: "+consulta);
            a.printStackTrace();
        }
    }

    @Override
    public void modificar() {
                String consulta = "update Docente set "
                + "'"+this.nombre+"',"
                + "'"+this.email+"',"
                + "'"+this.fecha+"',"
                + "'"+this.condicion+"',"
                + "'"+this.observacion+"'"                        
                + "where legajo="+this.legajo;
                Conexion con = new Conexion();
                con.conectar();
        try{
            con.getConexion().createStatement().execute(consulta);
       }catch(SQLException a){
               System.out.println("NO SE PUDO REALIZAR LA MODIFICACION: "+consulta);
               a.printStackTrace();
         }
    }

    @Override
    public ResultSet leer() throws SQLException {
         ResultSet rs=null;
         String consulta="select * from Docente ";
         Conexion con=new Conexion();
         con.conectar();
     try{
         rs=con.getConexion().createStatement().executeQuery(consulta);
     }catch(SQLException a){a.printStackTrace();}
        return rs;
    }

    @Override
    public boolean buscar() {
          boolean hallado= false;
          String consulta="select * from Docente where Legajo="+this.legajo;
          ResultSet rs;
          Conexion con=new Conexion();
          con.conectar();
        try{
            rs=con.getConexion().createStatement().executeQuery(consulta);
            if(rs.next()){
                this.legajo=rs.getInt("Legajo");
                this.nombre=rs.getString("Nombre");
                this.email=rs.getString("email");
                this.fecha=rs.getDate("fecha");
                this.observacion=rs.getString("observacion");
                this.condicion=rs.getString("condicion");
                hallado=true;
            }
        }catch(SQLException a){
            a.printStackTrace();
        }
        return hallado;
    }
    public ResultSet filtrar() throws SQLException {
        ResultSet rs=null;
        String consulta="select * from Docente where Legajo= "+this.legajo;
        Conexion con=new Conexion();
        con.conectar();
        try{
        rs=con.getConexion().createStatement().executeQuery(consulta);
           }
        catch(SQLException a){a.printStackTrace();}
        return rs;
    }
       public static ArrayList<Docente> listarDocentePorNombre(String nombre) {
        return listar("Nombre", nombre + "%", "like");
    }
       public static ArrayList<Docente> listarDocentePorLegajo(String legajo) {
        return listar("Legajo", legajo + "%", "like");
    }
       private static ArrayList<Docente> listar(String atributo, String parametro, String comparador) {
        return consultarSQL("select Legajo,Nombre,Apellido,CargoId,AsignaturaId from Docente where " + atributo + " " + comparador + " '" + parametro + "'");
    }
       private static ArrayList<Docente> consultarSQL(String sql) {
       ArrayList<Docente> list = new ArrayList<Docente>();
       Connection cn = BD.getConnection();
        try {
            Docente d;
            Statement stmt = cn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                d = new Docente();
                d.setLegajo(rs.getInt("Legajo"));
                d.setNombre(rs.getString("Nombre"));
                d.setEmail(rs.getString("email"));
                d.setFecha(rs.getDate("fecha"));
                d.setObservacion(rs.getString("observacion"));
                d.setCondicion(rs.getString("condicion"));
                list.add(d);
            }
            cn.close();
        }catch (SQLException e) {
            System.err.println(e.getMessage());
            return null;
        }
        return list;
     }
  
}



