package Abstracta;
/**
 *
 * @author Marcos
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
private String host;
private String usuario;
private String clave="";
private String motor;
private String db;
private Connection conexion;
private String driver;
private boolean conextado=false;
    public Conexion() {
        this.usuario="root";
        this.clave="root";
        this.motor="mysql";
        this.db="mydb";
        this.driver="com.mysql.jdbc.Driver";
        this.host="localhost";
        

    }

    public Conexion(String usuario,String clave,String motor, String db) {
        this.usuario=usuario;
        this.clave=clave;
        this.motor = motor;
        this.db = db;
    }

    public void conectar(){
            String cadenaConexion="jdbc:"+this.motor+"://"+host+"/"+db;
        try {
            Class.forName(this.driver);
            conexion=DriverManager.getConnection(cadenaConexion, usuario, clave);
            this.conextado=true;
        } catch (ClassNotFoundException ex) {System.out.println("Cadena de Conexion="+cadenaConexion);
                                             ex.printStackTrace();
                                             this.conextado=false;
        }
        catch(SQLException f){f.printStackTrace();}
    }

    public Conexion(String usuario, String motor, String db, Connection conexion, String driver) {
        this.usuario = usuario;
        this.motor = motor;
        this.db = db;
        this.conexion = conexion;
        this.driver = driver;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public Connection getConexion() {
        return conexion;
    }

    public void setConexion(Connection conexion) {
        this.conexion = conexion;
    }

    public String getDb() {
        return db;
    }

    public void setDb(String db) {
        this.db = db;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public boolean isConextado() {
        return conextado;
    }

    public void setConextado(boolean conextado) {
        this.conextado = conextado;
    }
   
}


