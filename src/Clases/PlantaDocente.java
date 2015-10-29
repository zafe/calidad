/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Clases;

import Abstracta.Conexion;
import Abstracta.Entidad;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Marcos
 */
public class PlantaDocente extends Entidad {
    private int plantaDocenteId;
    private int cargoDocenteId;
    private int comisiones;
    private float dedicaciones;
    private String tipo;

    public int getPlantaDocenteId() {
        return plantaDocenteId;
    }

    public void setPlantaDocenteId(int plantaDocenteId) {
        this.plantaDocenteId = plantaDocenteId;
    }

    public int getCargoDocenteId() {
        return cargoDocenteId;
    }

    public void setCargoDocenteId(int cargoDocenteId) {
        this.cargoDocenteId = cargoDocenteId;
    }

    public int getComisiones() {
        return comisiones;
    }

    public void setComisiones(int comisiones) {
        this.comisiones = comisiones;
    }

    public float getDedicaciones() {
        return dedicaciones;
    }

    public void setDedicaciones(float dedicaciones) {
        this.dedicaciones = dedicaciones;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public void altas() {
         String consulta = "INSERT INTO PlantaDocente VALUES ("
                + ""+this.plantaDocenteId+","
                + ""+this.cargoDocenteId+","
                + "'"+this.comisiones+"',"
                + "'"+this.dedicaciones+"',"
                + "'"+this.tipo+"')";
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
             String consulta = "DELETE FROM PlantaDocente "
            + "where PlantaDocenteId="+this.plantaDocenteId;
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
