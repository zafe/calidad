/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Clases;
import Abstracta.BD;
import Abstracta.Entidad;
import java.sql.ResultSet;
import java.sql.SQLException;
import Abstracta.Conexion;
import java.sql.Connection;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Marcos
 */
public class Empleado extends Entidad {

     private int legajo;
     private int dni;
     private String nombre;
     private String apellido;
     private int idcategoria;

    public int getIdcategoria() {
        return idcategoria;
    }

    public void setIdcategoria(int idcategoria) {
        this.idcategoria = idcategoria;
    }

    
    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
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

    public Empleado(){

    }
    public Empleado (int legajo, int dni, String nombre, String apellido,
             int idCategoria)
     {
        this.legajo=legajo;
        this.nombre=nombre;
        this.apellido=apellido;
        this.idcategoria=idcategoria;
    }
    

    @Override
    public void altas() {
        String consulta = "INSERT INTO Empleado VALUES ("
                + ""+this.legajo+","
                + "'"+this.nombre+"',"
                + "'"+this.apellido+"',"
                + "'"+this.dni+"',"
                + "'"+this.idcategoria+"')";

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
          String consulta = "DELETE FROM Empleado "
                + "where Legajo="+this.legajo;

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
         String consulta = "update Empleado set "
                + " nombre='"+this.nombre+"',"
                + " apellido='"+this.apellido+"',"
                + "dni="+this.dni+","
                + "Categoria_CategoriaId= "+this.idcategoria+" "
                + "where Legajo="+this.legajo;

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
        String consulta="select * from Empleado ";
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
        String consulta="select * from Empleado  where Legajo="+this.legajo;
        ResultSet rs;
        Conexion con=new Conexion();
        con.conectar();
        try{

            rs=con.getConexion().createStatement().executeQuery(consulta);
            if(rs.next()){
                this.legajo=rs.getInt("Legajo");
                this.nombre=rs.getString("Nombre");
                this.apellido=rs.getString("Apellido");
                this.dni=rs.getInt("dni");
                this.idcategoria=rs.getInt("Categoria_CategoriaId");
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
        String consulta="select * from Empleado where Legajo= "+this.legajo;
        Conexion con=new Conexion();
        con.conectar();
        try{
            rs=con.getConexion().createStatement().executeQuery(consulta);
        }
        catch(SQLException a){a.printStackTrace();}
        return rs;
    }
 public static ArrayList<Empleado> listarEmpleadoPorNombre(String nombre) {
        return listar("Nombre", nombre + "%", "like");
    }
      public static ArrayList<Empleado> listarEmpleadoPorCodigo(String codigo) {
        return listar("Legajo", codigo + "%", "like");
    }

  private static ArrayList<Empleado> listar(String atributo, String parametro, String comparador) {
        return consultarSQL("select * from Empleado where " + atributo + " " + comparador + " '" + parametro + "'");
    }

    private static ArrayList<Empleado> consultarSQL(String sql) {
        ArrayList<Empleado> list = new ArrayList<Empleado>();
        Connection cn = BD.getConnection();
        try {
            Empleado p;
            Statement stmt = cn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                p = new Empleado();
                p.setLegajo(rs.getInt("Legajo"));
                p.setNombre(rs.getString("Nombre"));
                p.setApellido(rs.getString("Apellido"));
                p.setDni(rs.getInt("dni"));
                p.setIdcategoria(rs.getInt("Categoria_CategoriaId"));
                list.add(p);
            }
            cn.close();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            return null;
        }
        return list;
    }
}

   
   
   