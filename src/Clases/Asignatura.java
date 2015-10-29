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
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.ArrayList;
/**
 *
 * @author Marcos
 */
public class Asignatura extends Entidad {
    private int asignaturaId;
    private int codigo;
    private String nombre;
    private int nivel;
    private int cargaSemanal;
    private String area;
    private String condicion;

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getCondicion() {
        return condicion;
    }

    public void setCondicion(String condicion) {
        this.condicion = condicion;
    }

public int getCodigo() {
    return codigo;
}

public void setCodigo(int codigo) {
    this.codigo = codigo;
}   

public int getAsignaturaId() {
    return asignaturaId;
}

public void setAsignaturaId(int asignaturaId) {
    this.asignaturaId = asignaturaId;
}

public String getNombre() {
    return nombre;
}

public void setNombre(String nombre) {
    this.nombre = nombre;
}

public int getNivel() {
    return nivel;
}

public void setNivel(int nivel) {
    this.nivel = nivel;
}

public int getCargaSemanal() {
    return cargaSemanal;
}

public void setCargaSemanal(int cargaSemanal) {
    this.cargaSemanal = cargaSemanal;
}
  
@Override
    public void altas() {
        String consulta = "INSERT INTO Asignatura VALUES ("
                + ""+this.asignaturaId+","
                + ""+this.codigo+","
                + "'"+this.nombre+"',"
                + ""+this.nivel+","
                + ""+this.cargaSemanal+","
                + "'"+this.area+"',"
                + "'"+this.condicion+"')";
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
          String consulta = "DELETE FROM Asignatura "
                + "where AsignaturaId="+this.asignaturaId;
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
         String consulta = "update Asignatura set "
                + "Codigo='"+this.codigo+"', " 
                + "Nombre='"+this.nombre+"', "
                + "Nivel='"+this.nivel+"', "
                + "CargaSemanal='"+this.cargaSemanal+"',"
                + "Area='"+this.area+"',"
                + "Condicion='"+this.condicion+"'"
                + "where AsignaturaId="+this.asignaturaId;
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
         String consulta="select * from Asignatura";
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
          String consulta="select * from Asignatura where AsignaturaId="+this.asignaturaId;
          ResultSet rs;
          Conexion con=new Conexion();
          con.conectar();
        try{
            rs=con.getConexion().createStatement().executeQuery(consulta);
            if(rs.next()){
                this.asignaturaId=rs.getInt("AsignaturaId");
                this.codigo=rs.getInt("Codigo");
                this.nombre=rs.getString("Nombre");
                this.nivel=rs.getInt("Nivel");
                this.cargaSemanal=rs.getInt("CargaSemanal");
                this.area=rs.getString("Area");
                this.condicion=rs.getString("Condicion");
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
        String consulta="select * from Asignatura where Codigo= "+this.codigo;
        Conexion con=new Conexion();
        con.conectar();
        try{
            rs=con.getConexion().createStatement().executeQuery(consulta);
       }catch(SQLException a){a.printStackTrace();}
        return rs;
    }
    public static Asignatura  buscarAsignaturaCodigo(int codigo) throws SQLException {
        return buscarAsignaturaCodigo(codigo, null);
    }

    public static Asignatura buscarAsignaturaCodigo(int codigo, Asignatura c) throws SQLException {
        Connection cnn = BD.getConnection();
        PreparedStatement ps = null;
        ps = cnn.prepareStatement("select *  from Asignatura where Codigo=?");
        
        ps.setInt(1, codigo);
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            if (c == null) {
                c = new Asignatura() {
                };
            }
            c.setCodigo(codigo);
            c.setNombre(rs.getString("Nombre"));
            c.setNivel(rs.getInt("Nivel"));
            c.setCargaSemanal(rs.getInt("CargaSemanal"));
            c.setAsignaturaId(rs.getInt("AsignaturaId"));
            c.setArea(rs.getString("Area"));
            c.setCondicion(rs.getString("Condicion"));
        }
        cnn.close();
        ps.close();
        return c;
    }

      public static Asignatura buscarAsignaturaNombre(String nombre) throws SQLException {
        return buscarAsignaturaNombre(nombre, null);
    }

    public static Asignatura buscarAsignaturaNombre(String nombre, Asignatura c) throws SQLException {
        Connection cnn = BD.getConnection(); 
        PreparedStatement ps = null;
        ps = cnn.prepareStatement("select * from Asignatura where Nombre=?");
        ps.setString(1, nombre);
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            c = c == null ? new Asignatura() {
            } : c;

            c.setNombre(nombre);
            c.setCodigo(rs.getInt("Codigo"));
            c.setNivel(rs.getInt("Nivel"));
            c.setCargaSemanal(rs.getInt("CargaSemanal"));
            c.setAsignaturaId(rs.getInt("AsignaturaId"));
            c.setArea(rs.getString("Area"));
            c.setCondicion(rs.getString("Condicion"));
        } else {
            c = null;
        }
        cnn.close();
        ps.close();
        return c;
    }

    public static boolean actualizarAsignatura(Asignatura c) throws SQLException {
        Connection cnn = BD.getConnection();
        PreparedStatement ps = null;

        ps = cnn.prepareStatement("update asignatura set Nombre=?,Nivel=?,CargaSemanal=?,Area=?,Condicion=? where Codigo=" + c.getCodigo());
        ps.setString(1, c.getNombre());
        ps.setInt(2, c.getNivel());
        ps.setInt(3, c.getCargaSemanal());
        ps.setString(4, c.getArea());
        ps.setString(5, c.getCondicion());
        
        int rowsUpdated = ps.executeUpdate();
        cnn.close();
        ps.close();
        if (rowsUpdated > 0) {
            return true;
        } else {
            return false;
        }
    }

    public static ArrayList<Asignatura> mostrarAsignatura() throws SQLException {
        Connection cnn = BD.getConnection();
        PreparedStatement ps = null;
        ArrayList<Asignatura> lista = new ArrayList<Asignatura>();

        ps = cnn.prepareStatement("select *from asignatura");
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            Asignatura c = new Asignatura() {
            };
            c.setNombre(rs.getString("Nombre"));
            c.setCodigo(rs.getInt("Codigo"));
            c.setNivel(rs.getInt("Nivel"));
            c.setCargaSemanal(rs.getInt("CargaSemanal"));
            c.setArea(rs.getString("Area"));
            c.setCondicion(rs.getString("Condicion"));    

            lista.add(c);
        }
        cnn.close();
        ps.close();
        return lista;
    }

    public static ArrayList<Asignatura> listarAsignaturaPorNombre(String nombre) {
        return listar("Nombre", nombre + "%", "like");
    }

    public static ArrayList<Asignatura> listarAsignaturaPorCodigo(String codigo) {
        return listar("Codigo", codigo + "%", "like");
    }

    private static ArrayList<Asignatura> listar(String atributo, String parametro, String comparador) {
        return consultarSQL("select * from asignatura where " + atributo + " " + comparador + " '" + parametro + "'");
    }

    private static ArrayList<Asignatura> consultarSQL(String sql) {
        ArrayList<Asignatura> list = new ArrayList<Asignatura>();
        Connection cn = BD.getConnection();
        try {
            Asignatura cli;
            Statement stmt = cn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                cli = new Asignatura();
                cli.setCodigo(rs.getInt("Codigo"));
                cli.setNombre(rs.getString("Nombre"));
                cli.setNivel(rs.getInt("Nivel"));
                cli.setCargaSemanal(rs.getInt("CargaSemanal"));
                cli.setArea(rs.getString("Area"));
                cli.setCondicion(rs.getString("Condicion")); 
                
                list.add(cli);
            }
            cn.close();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            return null;
        }
        return list;
    }
}



