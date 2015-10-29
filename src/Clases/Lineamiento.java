/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Clases;


import Abstracta.BD;
import Abstracta.Conexion;
import Abstracta.Entidad;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
/**
 *
 * @author Marcos
 */
public class Lineamiento extends Entidad {
    private int lineamientoId;
    private int comisiones;
    private String horaSemanal;
    private int categoria;
    private int canComisiones;
    private float dedicacion;

    public int getLineamientoId() {
        return lineamientoId;
    }

    public void setLineamientoId(int lineamientoId) {
        this.lineamientoId = lineamientoId;
    }

    public int getComisiones() {
        return comisiones;
    }

    public void setComisiones(int comisiones) {
        this.comisiones = comisiones;
    }

    public String getHoraSemanal() {
        return horaSemanal;
    }

    public void setHoraSemanal(String horaSemanal) {
        this.horaSemanal = horaSemanal;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    public int getCanComisiones() {
        return canComisiones;
    }

    public void setCanComisiones(int canComisiones) {
        this.canComisiones = canComisiones;
    }

    public float getDedicacion() {
        return dedicacion;
    }

    public void setDedicacion(float dedicacion) {
        this.dedicacion = dedicacion;
    }
       
   
    public Lineamiento(){
    }
    
    public Lineamiento (int lineamientoId, int comisiones,String horaSemanal, int categoria
            ,int canComisiones,float dedicacion)
     {
        this.lineamientoId=lineamientoId;
        this.comisiones=comisiones;
        this.horaSemanal=horaSemanal;
        this.categoria=categoria;
        this.canComisiones=canComisiones;
        this.dedicacion=dedicacion;
               
    }
    @Override
    public void altas() {
        String consulta = "INSERT INTO Lineamiento VALUES ("
                + ""+this.lineamientoId+","
                + ""+this.comisiones+","
                + "'"+this.horaSemanal+"',"
                + "'"+this.canComisiones+"',"
                + ""+this.categoria+","
                + ""+this.dedicacion+")";
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
            String consulta = "DELETE FROM Lineamiento "
            + "where lineamientoId="+this.lineamientoId;
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
                String consulta = "update Lineamiento set "
                + ""+this.comisiones+","
                + "'"+this.horaSemanal+"',"
                + ""+this.canComisiones+","
                + "'"+this.categoria+"',"
                + ""+this.dedicacion+""                        
                + "where lineamientoId="+this.lineamientoId;
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
         String consulta="select * from lineamiento";
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
          String consulta="select * from Lineamiento where LineamientoId="+this.lineamientoId;
          ResultSet rs;
          Conexion con=new Conexion();
          con.conectar();
        try{
            rs=con.getConexion().createStatement().executeQuery(consulta);
            if(rs.next()){
                this.lineamientoId=rs.getInt("LineamientoId");
                this.comisiones=rs.getInt("Comisiones");
                this.horaSemanal=rs.getString("horaSemanal");
                this.canComisiones=rs.getInt("cantidadComisiones");
                this.categoria=rs.getInt("cargo_CargoId");
                this.dedicacion=rs.getFloat("Dedicacion");
                hallado=true;
            }
        }catch(SQLException a){
            a.printStackTrace();
            
        }
        return hallado;
    }
    public ResultSet filtrar() throws SQLException {
        ResultSet rs=null;
        String consulta="select * from Lineamiento where LineamientoId= "+this.lineamientoId;
        Conexion con=new Conexion();
        con.conectar();
        try{
        rs=con.getConexion().createStatement().executeQuery(consulta);
           }
        catch(SQLException a){a.printStackTrace();}
        return rs;
    }
    //   public static ArrayList<Lineamiento> listarLineamientoPor(String nombre) {
    //    return listar("Nombre", nombre + "%", "like");
    //}
    public static ArrayList<Lineamiento> listarLineamientoPorId(String lineamientoId) {
        return listar("LineamientoId", lineamientoId + "%", "like");
    }
    private static ArrayList<Lineamiento> listar(String atributo, String parametro, String comparador) {
        return consultarSQL("select LineamientoId,Comisiones,horaSemanal,Cargo_CargoId,cantidadComisiones,dedicacion from Lineamiento where " + atributo + " " + comparador + " '" + parametro + "'");
    }
    private static ArrayList<Lineamiento> consultarSQL(String sql) {
       ArrayList<Lineamiento> list = new ArrayList<Lineamiento>();
       Connection cn = BD.getConnection();
        try {
            Lineamiento d;
            Statement stmt = cn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                d = new Lineamiento();
                d.setLineamientoId(rs.getInt("LineamientoId"));
                d.setComisiones(rs.getInt("Comisiones"));
                d.setHoraSemanal(rs.getString("horaSemanal"));
                d.setCategoria(rs.getInt("Cargo_CargoId"));
                d.setCanComisiones(rs.getInt("cantidadComisiones"));
                d.setDedicacion(rs.getFloat("dedicacion"));
                list.add(d);
            }
            cn.close();
        }catch (SQLException e) {
            System.err.println(e.getMessage());
            return null;
        }
        return list;
     }
    
    public static Lineamiento buscarLineamientoCodigo(int lineamientoId) throws SQLException {
        return buscarLineamientoCodigo(lineamientoId, null);
    }

    public static Lineamiento buscarLineamientoCodigo(int lineamientoId, Lineamiento d) throws SQLException {
        Connection cnn = BD.getConnection();
        PreparedStatement ps = null;
        ps = cnn.prepareStatement("select LineamientoId from Lineamiento where LineamientoId=?");
        ps.setInt(1, lineamientoId);
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            if (d == null) {
                d = new Lineamiento() {
                };
            }
            d.setLineamientoId(lineamientoId);
           
            
        }
        cnn.close();
        ps.close();
        return d;
    }
  
}



