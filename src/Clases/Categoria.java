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
public class Categoria extends Entidad {
    private int codigo;
    private String descripcion;
    
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    @Override
    public void altas() {
        String consulta = "INSERT INTO Categoria VALUES ("
                + ""+this.codigo+","
                + "'"+this.descripcion+"')";
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
          String consulta = "DELETE FROM Categoria "
                + "where CategoriaId="+this.codigo;
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
    public void modificar() {
         String consulta = "update Categoria set "
                + "Descripcion='"+this.descripcion+"' "
                + "where CategoriaId="+this.codigo;
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
         String consulta="select * from Categoria";
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
          String consulta="select * from Categoria where CategoriaId="+this.codigo;
          ResultSet rs;
          Conexion con=new Conexion();
          con.conectar();
        try{
            rs=con.getConexion().createStatement().executeQuery(consulta);
            if(rs.next()){
                this.codigo=rs.getInt("CategoriaId");
                this.descripcion=rs.getString("Descripcion");
                hallado=true;
            }
        }catch(SQLException a){
            a.printStackTrace();
        }
        return hallado;
    }

    /**
     *
     * @return
     * @throws SQLException
     */
    @Override
    public ResultSet filtrar() throws SQLException {
        ResultSet rs=null;
        String consulta="select * from Categoria where CategoriaId= "+this.codigo;
        Conexion con=new Conexion();
        con.conectar();
        try{
            rs=con.getConexion().createStatement().executeQuery(consulta);
       }catch(SQLException a){a.printStackTrace();}
        return rs;
    }
}


