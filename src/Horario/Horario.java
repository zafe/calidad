/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Horario;
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
public class Horario extends Entidad {
    private int horarioId;

    private int asignaturaId;
    private String asignaturaNombre;
    private int docenteId;
    private String docenteNombre;
    private String dia;
    private String modulo;
    private String curso;
    private String comision;
   
     public int getHorarioId() {
        return horarioId;
    }

    public void setHorarioId(int horarioId) {
        this.horarioId = horarioId;
    }

    public int getAsignaturaId() {
        return asignaturaId;
    }

    public void setAsignaturaId(int asignaturaId) {
        this.asignaturaId = asignaturaId;
    }

    public String getAsignaturaNombre() {
        return asignaturaNombre;
    }

    public void setAsignaturaNombre(String asignaturaNombre) {
        this.asignaturaNombre = asignaturaNombre;
    }

    public int getDocenteId() {
        return docenteId;
    }

    public void setDocenteId(int docenteId) {
        this.docenteId = docenteId;
    }

    public String getDocenteNombre() {
        return docenteNombre;
    }

    public void setDocenteNombre(String docenteNombre) {
        this.docenteNombre = docenteNombre;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getModulo() {
        return modulo;
    }

    public void setModulo(String modulo) {
        this.modulo = modulo;
    }
    
    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getComision() {
        return comision;
    }

    public void setComision(String comision) {
        this.comision = comision;
    }
  
@Override
    public void altas() {
        String consulta = "INSERT INTO Horario VALUES ("
                
                + ""+this.horarioId+","
                + ""+this.asignaturaId+","
                + "'"+this.asignaturaNombre+"',"
                + ""+this.docenteId+","
                + "'"+this.docenteNombre+"',"
                + "'"+this.dia+"',"
                + "'"+this.modulo+"',"
                + "'"+this.curso+"',"
                + "'"+this.comision+"')";
        
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
   /* public void bajas() {
          String consulta = "DELETE FROM Asignatura "
                + "where Codigo="+this.codigo;
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
               // + "Codigo='"+this.codigo+"', " 
                + "Nombre='"+this.nombre+"', "
                + "Nivel='"+this.nivel+"', "
                + "CargaSemanal='"+this.cargaSemanal+"' "
                + "where Codigo="+this.codigo;
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
          String consulta="select * from Asignatura where Codigo="+this.codigo;
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
   
    public ResultSet filtrar() throws SQLException {
        ResultSet rs=null;
        String consulta="select * from Horario where HorarioId= "+this.horarioId;
        Conexion con=new Conexion();
        con.conectar();
        try{
            rs=con.getConexion().createStatement().executeQuery(consulta);
       }catch(SQLException a){a.printStackTrace();}
        return rs;
    }
    /*public static Horario  buscarAsignaturaCodigo(int codigo) throws SQLException {
        return buscarAsignaturaCodigo(codigo, null);
    }*/

    /*public static Horario buscarAsignaturaCodigo(int codigo, Horario c) throws SQLException {
        Connection cnn = BD.getConnection();
        PreparedStatement ps = null;
        ps = cnn.prepareStatement("select *  from Asignatura where Codigo=?");
        
        ps.setInt(1, codigo);
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            if (c == null) {
                c = new Horario() {
                };
            }
            c.setCodigo(codigo);
            c.setNombre(rs.getString("Nombre"));
            c.setNivel(rs.getInt("Nivel"));
            c.setCargaSemanal(rs.getInt("CargaSemanal"));
            c.setAsignaturaId(rs.getInt("AsignaturaId"));
            
        }
        cnn.close();
        ps.close();
        return c;
    }

      public static Horario buscarAsignaturaNombre(String nombre) throws SQLException {
        return buscarAsignaturaNombre(nombre, null);
    }

    public static Horario buscarAsignaturaNombre(String nombre, Horario c) throws SQLException {
        Connection cnn = BD.getConnection(); 
        PreparedStatement ps = null;
        ps = cnn.prepareStatement("select * from Asignatura where Nombre=?");
        ps.setString(1, nombre);
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            c = c == null ? new Horario() {
            } : c;

            c.setNombre(nombre);
            c.setCodigo(rs.getInt("Codigo"));
            c.setNivel(rs.getInt("Nivel"));
            c.setCargaSemanal(rs.getInt("CargaSemanal"));
            c.setAsignaturaId(rs.getInt("AsignaturaId"));
          
        } else {
            c = null;
        }
        cnn.close();
        ps.close();
        return c;
    }

    public static boolean actualizarAsignatura(Horario c) throws SQLException {
        Connection cnn = BD.getConnection();
        PreparedStatement ps = null;

        ps = cnn.prepareStatement("update asignatura set Nombre=?,Nivel=?,CargaSemanal=? where Codigo=" + c.getCodigo());
        ps.setString(1, c.getNombre());
        ps.setInt(2, c.getNivel());
        ps.setInt(3, c.getCargaSemanal());
        int rowsUpdated = ps.executeUpdate();
        cnn.close();
        ps.close();
        if (rowsUpdated > 0) {
            return true;
        } else {
            return false;
        }
    }

    public static ArrayList<Horario> mostrarAsignatura() throws SQLException {
        Connection cnn = BD.getConnection();
        PreparedStatement ps = null;
        ArrayList<Horario> lista = new ArrayList<Horario>();

        ps = cnn.prepareStatement("select *from asignatura");
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            Horario c = new Horario() {
            };
              c.setNombre(rs.getString("Nombre"));
            c.setCodigo(rs.getInt("Codigo"));
            c.setNivel(rs.getInt("Nivel"));
            c.setCargaSemanal(rs.getInt("CargaSemanal"));
      

            lista.add(c);
        }
        cnn.close();
        ps.close();
        return lista;
    }

    public static ArrayList<Horario> listarAsignaturaPorNombre(String nombre) {
        return listar("Nombre", nombre + "%", "like");
    }

    public static ArrayList<Horario> listarAsignaturaPorCodigo(String codigo) {
        return listar("Codigo", codigo + "%", "like");
    }

    private static ArrayList<Horario> listar(String atributo, String parametro, String comparador) {
        return consultarSQL("select * from asignatura where " + atributo + " " + comparador + " '" + parametro + "'");
    }

    private static ArrayList<Horario> consultarSQL(String sql) {
        ArrayList<Horario> list = new ArrayList<Horario>();
        Connection cn = BD.getConnection();
        try {
            Horario cli;
            Statement stmt = cn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                cli = new Horario();
                cli.setCodigo(rs.getInt("Codigo"));
                cli.setNombre(rs.getString("Nombre"));
                cli.setNivel(rs.getInt("Nivel"));
                cli.setCargaSemanal(rs.getInt("CargaSemanal"));
                
                
                list.add(cli);
            }
            cn.close();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            return null;
        }
        return list;
    }*/

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
       ResultSet rs=null;
         String consulta="select * from Horario ";
         Conexion con=new Conexion();
         con.conectar();
     try{
         rs=con.getConexion().createStatement().executeQuery(consulta);
     }catch(SQLException a){a.printStackTrace();}
        return rs;
    }

    @Override
    public boolean buscar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}



