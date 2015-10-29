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
public class Docente extends Entidad {

    private int docenteId;
    private int legajo;
    private String nombre;
    private String email;
    private String fecha;
    private String observacion;
    private String condicion;

    public String getCondicion() {
        return condicion;
    }

    public void setCondicion(String condicion) {
        this.condicion = condicion;
    }

    public int getDocenteId() {
        return docenteId;
    }

    public void setDocenteId(int docenteId) {
        this.docenteId = docenteId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public Docente() {
    }

    public Docente(int legajo, String nombre, String apellido, int cargoId,
            int asignaturaId, String email, String fecha, String observacion, String condicion) {
        this.legajo = legajo;
        this.nombre = nombre;
        this.email = email;
        this.fecha = fecha;
        this.observacion = observacion;
        this.condicion = condicion;

    }

    @Override
    public void altas() {
        String consulta = "INSERT INTO Docente VALUES ("
                + "" + this.docenteId + ","
                + "" + this.legajo + ","
                + "'" + this.nombre + "',"
                + "'" + this.email + "',"
                + "'" + this.fecha + "',"
                + "'" + this.condicion + "',"
                + "'" + this.observacion + "')";
        Conexion con = new Conexion();
        con.conectar();
        try {
            con.getConexion().createStatement().execute(consulta);
        } catch (SQLException a) {
            System.out.println("NO SE PUDO REALIZAR EL ALTA: " + consulta);
            a.printStackTrace();
        }
    }

    @Override
    public void bajas() {
        String consulta = "DELETE FROM Docente "
                + "where DocenteId=" + this.docenteId;
        Conexion con = new Conexion();
        con.conectar();
        try {
            con.getConexion().createStatement().execute(consulta);
        } catch (SQLException a) {
            System.out.println("NO SE PUDO REALIZAR LA BAJA: " + consulta);
            a.printStackTrace();
        }
    }

    @Override
    public void modificar() {
        String consulta = "update Docente set "
                + "Legajo='" + this.legajo + "',"
                + "Nombre='" + this.nombre + "',"
                + "Email='" + this.email + "',"
                + "Fecha='" + this.fecha + "',"
                + "Condicion='" + this.condicion + "',"
                + "Observacion='" + this.observacion + "'"
                + "where DocenteId=" + this.docenteId;
        Conexion con = new Conexion();
        con.conectar();
        try {
            con.getConexion().createStatement().execute(consulta);
        } catch (SQLException a) {
            System.out.println("NO SE PUDO REALIZAR LA MODIFICACION: " + consulta);
            a.printStackTrace();
        }
    }

    @Override
    public ResultSet leer() throws SQLException {
        ResultSet rs = null;
        String consulta = "select * from Docente ";
        Conexion con = new Conexion();
        con.conectar();
        try {
            rs = con.getConexion().createStatement().executeQuery(consulta);
        } catch (SQLException a) {
            a.printStackTrace();
        }
        return rs;
    }

    @Override
    public boolean buscar() {
        boolean hallado = false;
        String consulta = "select * from Docente where Legajo=" + this.legajo;
        ResultSet rs;
        Conexion con = new Conexion();
        con.conectar();
        try {
            rs = con.getConexion().createStatement().executeQuery(consulta);
            if (rs.next()) {
                this.legajo = rs.getInt("Legajo");
                this.nombre = rs.getString("Nombre");
                this.email = rs.getString("email");
                this.fecha = rs.getString("fecha");
                this.observacion = rs.getString("observacion");
                this.condicion = rs.getString("condicion");
                hallado = true;
            }
        } catch (SQLException a) {
            a.printStackTrace();
        }
        return hallado;
    }

    public ResultSet filtrar() throws SQLException {
        ResultSet rs = null;
        String consulta = "select * from Docente where Legajo= " + this.legajo;
        Conexion con = new Conexion();
        con.conectar();
        try {
            rs = con.getConexion().createStatement().executeQuery(consulta);
        } catch (SQLException a) {
            a.printStackTrace();
        }
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
                d.setFecha(rs.getString("fecha"));
                d.setObservacion(rs.getString("observacion"));
                d.setCondicion(rs.getString("condicion"));
                list.add(d);
            }
            cn.close();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            return null;
        }
        return list;
    }

    public boolean buscar2() {
        boolean hallado = false;
        String consulta = "select * from Docente d inner join  where DocenteId=" + this.legajo;
        ResultSet rs;
        Conexion con = new Conexion();
        con.conectar();
        try {
            rs = con.getConexion().createStatement().executeQuery(consulta);
            if (rs.next()) {
                this.legajo = rs.getInt("Legajo");
                this.nombre = rs.getString("Nombre");
                this.email = rs.getString("email");
                this.fecha = rs.getString("fecha");
                this.observacion = rs.getString("observacion");
                this.condicion = rs.getString("condicion");
                hallado = true;
            }
        } catch (SQLException a) {
            a.printStackTrace();
        }
        return hallado;
    }

    public static Docente buscarDocenteCodigo(int codigo) throws SQLException {
        return buscarDocenteCodigo(codigo, null);
    }

    public static Docente buscarDocenteCodigo(int codigo, Docente d) throws SQLException {
        Connection cnn = BD.getConnection();
        PreparedStatement ps = null;
        ps = cnn.prepareStatement("select DocenteId from Docente where Legajo=?");
        ps.setInt(1, codigo);
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            if (d == null) {
                d = new Docente() {
                };
            }
            d.setLegajo(codigo);
            d.setDocenteId(rs.getInt("DocenteId"));

        }
        cnn.close();
        ps.close();
        return d;
    }

    public boolean buscarDocenteId() {
        boolean hallado = false;
        String consulta = "select * from Docente where DocenteId=" + this.docenteId;
        ResultSet rs;
        Conexion con = new Conexion();
        con.conectar();
        try {
            rs = con.getConexion().createStatement().executeQuery(consulta);
            if (rs.next()) {
                this.legajo = rs.getInt("Legajo");
                this.nombre = rs.getString("Nombre");
                this.email = rs.getString("email");
                this.fecha = rs.getString("fecha");
                this.observacion = rs.getString("observacion");
                this.condicion = rs.getString("condicion");
                hallado = true;
            }
        } catch (SQLException a) {
            a.printStackTrace();
        }
        return hallado;
    }
}
