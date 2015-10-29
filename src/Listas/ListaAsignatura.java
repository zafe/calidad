/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Listas;

import Clases.Asignatura;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Marcos
 */

public class ListaAsignatura {
    private ArrayList<Asignatura> listaAsignatura;
    private int actual=0;

    ListaAsignatura() {
    }
    public int getActual() {
        return actual;
    }
    public void setActual(int actual) {
        this.actual = actual;
    }
    public ArrayList<Asignatura> getListaAsignatura() {
        return listaAsignatura;
    }
    public ListaAsignatura(ResultSet rs) {
        listaAsignatura= new ArrayList<Asignatura>();
        try{
            while (rs.next()){
                Asignatura c1= new Asignatura();
                c1.setAsignaturaId(rs.getInt("AsignaturaId"));
                c1.setCodigo(rs.getInt("Codigo"));
                c1.setNombre(rs.getString("Nombre"));
                c1.setNivel(rs.getInt("Nivel"));
                c1.setCargaSemanal(rs.getInt("CargaSemanal"));
                c1.setArea(rs.getString("Area"));
                c1.setCondicion(rs.getString("Condicion"));
                listaAsignatura.add(c1);
            }
           }catch(SQLException a){
             a.printStackTrace();
           }
    }
    public ListaAsignatura(ArrayList<Asignatura> listaAsignatura) {
        this.listaAsignatura = listaAsignatura;
    }
    public void agregarAsignatura(Asignatura asignatura){
        listaAsignatura.add(asignatura);
    }
    public Asignatura get(){
        return listaAsignatura.get(actual);
    }
    public Asignatura siguiente(){
        actual++;
        if(actual==listaAsignatura.size())
            actual=0;
        return listaAsignatura.get(actual);
    }
    public Asignatura anterior(){
        actual--;
        if(actual<0)
            actual=listaAsignatura.size()-1;
        return listaAsignatura.get(actual);
    }
    public void actualizar(ResultSet rs){
        listaAsignatura= new ArrayList<Asignatura>();
        try{
            while (rs.next()){
                Asignatura c1= new Asignatura();
                c1.setAsignaturaId(rs.getInt("AsignaturaId"));
                c1.setCodigo(rs.getInt("Codigo"));
                c1.setNombre(rs.getString("Nombre"));
                c1.setNivel(rs.getInt("Nivel"));
                c1.setCargaSemanal(rs.getInt("CargaSemanal"));
                c1.setArea(rs.getString("Area"));
                c1.setCondicion(rs.getString("Condicion"));
                listaAsignatura.add(c1);
            }
        }catch(SQLException a){
            a.printStackTrace();
        }
    }
}
