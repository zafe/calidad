/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Clases;
import Abstracta.Entidad;
import java.sql.ResultSet;
import java.sql.SQLException;
import Abstracta.Conexion;
/**
 *
 * @author Marcos
 */
public class Comision extends Entidad {
   private int comisionId; 
   private int nivel;
   private int cantidadAlumnos;
   private String ubicacion;
   private int cantidadComisiones;
    
    public int getComisionId() {
        return comisionId;
    }
    public void setComisionId(int comisionId) {
        this.comisionId = comisionId;
    }
    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getCantidadAlumnos() {
        return cantidadAlumnos;
    }

    public void setCantidadAlumnos(int cantidadAlumnos) {
        this.cantidadAlumnos = cantidadAlumnos;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int getCantidadComisiones() {
        return cantidadComisiones;
    }

    public void setCantidadComisiones(int cantidadComisiones) {
        this.cantidadComisiones = cantidadComisiones;
    }

       
    @Override
    public void altas() {
        String consulta = "INSERT INTO Comision VALUES ("
                + ""+this.comisionId+","
                + ""+this.nivel+","
                + ""+this.cantidadAlumnos+","
                + "'"+this.ubicacion+"',"
                + ""+this.cantidadComisiones+")";
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
          String consulta = "DELETE FROM Comision "
                + "where ComisionId="+this.comisionId;
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
         String consulta = "update Comision set "
                +"cantidadAlumnos="+this.cantidadAlumnos+", "
                +"Ubicacion="+this.ubicacion+", "
                +"cantidadComisiones="+this.cantidadComisiones+""
                +"where Nivel="+this.nivel;
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
         String consulta="select * from Comision";
         Conexion con=new Conexion();
         con.conectar();
        try{
            rs=con.getConexion().createStatement().executeQuery(consulta);
       }catch(SQLException a){
           a.printStackTrace();}
        return rs;
   }

    @Override
    public boolean buscar() {
          boolean hallado= false;
          String consulta="select * from Comision where ComisionId="+this.comisionId;
          ResultSet rs;
          Conexion con=new Conexion();
          con.conectar();
        try{
            rs=con.getConexion().createStatement().executeQuery(consulta);
            if(rs.next()){
                this.comisionId=rs.getInt("comisionId");
                this.nivel=rs.getInt("nivel");
                this.cantidadAlumnos=rs.getInt("cantidadAlumno");
                this.ubicacion=rs.getString("ubicacion");
                this.cantidadComisiones=rs.getInt("cantidadComisiones");
                hallado=true;
            }
        }catch(SQLException a){
            a.printStackTrace();
        }
        return hallado;
    }

    @Override
    public ResultSet filtrar() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     * @return
     * @throws SQLException
     */
 /*   @Override
    public ResultSet filtrar() throws SQLException {
        ResultSet rs=null;
        String consulta="select * from Cargo where CargoId= "+this.cargoId;
        Conexion con=new Conexion();
        con.conectar();
        try{
            rs=con.getConexion().createStatement().executeQuery(consulta);
       }catch(SQLException a){a.printStackTrace();}
        return rs;
    }*/
}


