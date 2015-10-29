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
public class Usuario extends Entidad {

     private int legajo;
     private String usuario;
     private String password;
     private String nivel;
     

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    
    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    
     public Usuario(){

    }
    public Usuario (int legajo,String usuario,String password,String nivel)
     {
        this.legajo=legajo;
        this.usuario=usuario;
        this.password=password;
        this.nivel=nivel;
    }

    @Override
    public void altas() {
        String consulta = "INSERT INTO Usuario VALUES ("
                + ""+this.legajo+","
                + "'"+this.usuario+"',"
                + "'"+this.password+"',"
                + "'"+this.nivel+"')";

        Conexion con = new Conexion();
        con.conectar();
        try{

        con.getConexion().createStatement().execute(consulta);
        }
        catch(SQLException a){
            System.out.println("NO SE PUDO REALIZAR EL ALTA: "+consulta);
            a.printStackTrace();
        }

    }
    @Override
    public void bajas() {
          String consulta = "DELETE FROM Usuario "
                + "where Empleado_Legajo="+this.legajo;

            Conexion con = new Conexion();
        con.conectar();
        try{

        con.getConexion().createStatement().execute(consulta);
        }
        catch(SQLException a){
            System.out.println("NO SE PUDO REALIZAR EL ALTA: "+consulta);
            a.printStackTrace();
        }
    }

    @Override
    public void modificar() {
         String consulta = "update Usuario set "
                + " usuario= '"+this.usuario+"',"
                + "password= '"+this.password+"', "
                + "nivel= '"+this.nivel+"' "
                + "where Empleado_Legajo="+this.legajo;

        Conexion con = new Conexion();
        con.conectar();
        try{

        con.getConexion().createStatement().execute(consulta);
        }
        catch(SQLException a){
            System.out.println("NO SE PUDO REALIZAR LA MODIFICACION: "+consulta);
            a.printStackTrace();
        }
    }

    @Override
    public ResultSet leer() throws SQLException {
         ResultSet rs=null;

        String consulta="select * from Usuario ";

        Conexion con=new Conexion();

        con.conectar();
        try{

            rs=con.getConexion().createStatement().executeQuery(consulta);


        }
        catch(SQLException a){a.printStackTrace();}

        return rs;

    }

    @Override
    public boolean buscar() {
          boolean hallado= false;

        String consulta="select * from Usuario  where Empleado_Legajo="+this.legajo;

        ResultSet rs;

        Conexion con=new Conexion();

        con.conectar();

        try{

            rs=con.getConexion().createStatement().executeQuery(consulta);
            if(rs.next()){
                this.legajo=rs.getInt("Empleado_Legajo");
                this.usuario=rs.getString("Usuario");
                this.password=rs.getString("Password");
                this.nivel=rs.getString("Nivel");
              
                hallado=true;
            }
        }

        catch(SQLException a){
            a.printStackTrace();
        }

        return hallado;


    }

    @Override
    public ResultSet filtrar() throws SQLException {

         ResultSet rs=null;

        String consulta="select * from Usuario where Empleado_Legajo= "+this.legajo;

        Conexion con=new Conexion();

        con.conectar();
        try{

            rs=con.getConexion().createStatement().executeQuery(consulta);


        }
        catch(SQLException a){a.printStackTrace();}

        return rs;

    }

   public boolean buscarUsuario() {
          boolean hallado= false;

        String consulta="select * from Usuario  where usuario='"+this.usuario+"'";

        ResultSet rs;

        Conexion con=new Conexion();

        con.conectar();

        try{

            rs=con.getConexion().createStatement().executeQuery(consulta);
            if(rs.next()){
                this.legajo=rs.getInt("Empleado_Legajo");
                this.usuario=rs.getString("Usuario");
                this.password=rs.getString("Password");
                this.nivel=rs.getString("Nivel");
                hallado=true;
            }
        }

        catch(SQLException a){
            a.printStackTrace();
        }

        return hallado;
    }

}

   
   
   