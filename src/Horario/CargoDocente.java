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
public class CargoDocente extends Entidad {
    
    private int cargoDocenteId;
    private int docenteId;
    private int cargoId;
    private int asignaturaId;
    
    public int getCargoDocenteId() {
        return cargoDocenteId;
    }

    public void setCargoDocenteId(int cargoDocenteId) {
        this.cargoDocenteId = cargoDocenteId;
    }

    public int getDocenteId() {
        return docenteId;
    }

    public void setDocenteId(int docenteId) {
        this.docenteId = docenteId;
    }

    public int getCargoId() {
        return cargoId;
    }

    public void setCargoId(int cargoId) {
        this.cargoId = cargoId;
    }

    public int getAsignaturaId() {
        return asignaturaId;
    }

    public void setAsignaturaId(int asignaturaId) {
        this.asignaturaId = asignaturaId;
    }

    public CargoDocente(){
    }
    
    public CargoDocente (int cargoDocenteId,int cargoId,int docenteId,int asignatura)
     {
        this.cargoDocenteId=cargoDocenteId;
        this.cargoId=cargoId;
        this.docenteId=docenteId;
        this.asignaturaId=asignaturaId;
                     
    }
    @Override
    public void altas() {
        String consulta = "INSERT INTO Docente VALUES ("
                + " "+this.cargoDocenteId+","
                + " "+this.cargoId+","
                + " "+this.docenteId+","
                + " "+this.asignaturaId+")";
                Conexion con = new Conexion();
                con.conectar();
        try{
            con.getConexion().createStatement().execute(consulta);
        }catch(SQLException a){
            System.out.println("NO SE PUDO REALIZAR EL ALTA: "+consulta);
            a.printStackTrace();
        }
    }
/*    
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
 */   
/*
    @Override
    public void modificar() {
                String consulta = "update Docente set "
                + "'"+this.nombre+"',"
                + "'"+this.apellido+"',"
                + " "+this.cargoId+","
                + " "+this.asignaturaId+","
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
                this.apellido=rs.getString("Apellido");
                this.cargoId=rs.getInt("CargoId");
                this.asignaturaId=rs.getInt("AsignaturaId");
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
       public static ArrayList<CargoDocente> listarDocentePorNombre(String nombre) {
        return listar("Nombre", nombre + "%", "like");
    }
       public static ArrayList<CargoDocente> listarDocentePorLegajo(String legajo) {
        return listar("Legajo", legajo + "%", "like");
    }
       private static ArrayList<CargoDocente> listar(String atributo, String parametro, String comparador) {
        return consultarSQL("select Legajo,Nombre,Apellido,CargoId,AsignaturaId from Docente where " + atributo + " " + comparador + " '" + parametro + "'");
    }
       private static ArrayList<CargoDocente> consultarSQL(String sql) {
       ArrayList<CargoDocente> list = new ArrayList<CargoDocente>();
       Connection cn = BD.getConnection();
        try {
            CargoDocente d;
            Statement stmt = cn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                d = new CargoDocente();
                d.setLegajo(rs.getInt("Legajo"));
                d.setNombre(rs.getString("Nombre"));
                d.setApellido(rs.getString("Apellido"));
                d.setCargoId(rs.getInt("CargoId"));
                d.setAsignaturaId(rs.getInt("AsignaturaId"));
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
  */

    @Override
    public void bajas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void modificar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ResultSet leer() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean buscar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ResultSet filtrar() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}



