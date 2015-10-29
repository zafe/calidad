/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Listas;
import Clases.Comision;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Marcos
 */

public class ListaComision {
    private ArrayList<Comision> listaComision;
    private int actual=0;

    ListaComision() {
    }
    public int getActual() {
        return actual;
    }
    public void setActual(int actual) {
        this.actual = actual;
    }
    public ArrayList<Comision> getListaComision() {
        return listaComision;
    }
    public ListaComision(ResultSet rs) {
        listaComision= new ArrayList<Comision>();
        try{
            while (rs.next()){
                Comision c1= new Comision();
                c1.setComisionId(rs.getInt("ComisionId"));
                c1.setNivel(rs.getInt("Nivel"));
                c1.setCantidadAlumnos(rs.getInt("cantidadAlumno"));
                c1.setCantidadComisiones(rs.getInt("cantidadComisiones"));
                c1.setUbicacion(rs.getString("ubicacion"));
                listaComision.add(c1);
            }
           }catch(SQLException a){
             a.printStackTrace();
           }
    }
    public ListaComision(ArrayList<Comision> listaComision) {
        this.listaComision = listaComision;
    }
    public void agregarComision(Comision comision){
        listaComision.add(comision);
    }
    public Comision get(){
        return listaComision.get(actual);
    }
    public Comision siguiente(){
        actual++;
        if(actual==listaComision.size())
            actual=0;
        return listaComision.get(actual);
    }
    public Comision anterior(){
        actual--;
        if(actual<0)
            actual=listaComision.size()-1;
        return listaComision.get(actual);
    }
    public void actualizar(ResultSet rs){
        listaComision= new ArrayList<Comision>();
        try{
            while (rs.next()){
                 Comision c1= new Comision();
                c1.setComisionId(rs.getInt("ComisionId"));
                c1.setNivel(rs.getInt("Nivel"));
                c1.setCantidadAlumnos(rs.getInt("cantidadAlumnos"));
                c1.setCantidadComisiones(rs.getInt("cantidadComisiones"));
                c1.setUbicacion(rs.getString("ubicacion"));
                listaComision.add(c1);
            }
        }catch(SQLException a){
            a.printStackTrace();
        }
    }
}
