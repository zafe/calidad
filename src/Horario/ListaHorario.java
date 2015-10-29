/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Horario;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Marcos
 */

public class ListaHorario {
    private ArrayList<Horario> listaHorario;
    private int actual=0;

    ListaHorario() {
    }
    public int getActual() {
        return actual;
    }
    public void setActual(int actual) {
        this.actual = actual;
    }
    public ArrayList<Horario> getListaHorario() {
        return listaHorario;
    }
    public ListaHorario(ResultSet rs) {
        listaHorario= new ArrayList<Horario>();
        try{
            while (rs.next()){
                Horario c1= new Horario();
                c1.setHorarioId(rs.getInt("HorarioId"));
                c1.setAsignaturaId(rs.getInt("AsignaturaId"));
                c1.setAsignaturaNombre(rs.getString("AsignaturaNombre"));
                c1.setDocenteId(rs.getInt("DocenteId"));
                c1.setDocenteNombre(rs.getString("DocenteNombre"));
                c1.setDia(rs.getString("Dia"));
                c1.setModulo(rs.getString("modulo"));
                c1.setCurso(rs.getString("Curso"));
                c1.setComision(rs.getString("Comision"));
                listaHorario.add(c1);
            }
           }catch(SQLException a){
             a.printStackTrace();
           }
    }
    public ListaHorario(ArrayList<Horario> listaHorario) {
        this.listaHorario = listaHorario;
    }
    public void agregarHorario(Horario horario){
        listaHorario.add(horario);
    }
    public Horario get(){
        return listaHorario.get(actual);
    }
    public Horario siguiente(){
        actual++;
        if(actual==listaHorario.size())
            actual=0;
        return listaHorario.get(actual);
    }
    public Horario anterior(){
        actual--;
        if(actual<0)
            actual=listaHorario.size()-1;
        return listaHorario.get(actual);
    }
    public void actualizar(ResultSet rs){
        listaHorario= new ArrayList<Horario>();
        try{
            while (rs.next()){
                Horario c1= new Horario();
                c1.setHorarioId(rs.getInt("HorarioId"));
                c1.setAsignaturaId(rs.getInt("AsignaturaId"));
                c1.setAsignaturaNombre(rs.getString("AsignaturaNombre"));
                c1.setDocenteId(rs.getInt("DocenteId"));
                c1.setDocenteNombre(rs.getString("DocenteNombre"));
                c1.setDia(rs.getString("Dia"));
                c1.setModulo(rs.getString("Modulo"));
                c1.setCurso(rs.getString("Curso"));
                c1.setComision(rs.getString("Comision"));
                listaHorario.add(c1);
            }
        }catch(SQLException a){
            a.printStackTrace();
        }
    }
}
