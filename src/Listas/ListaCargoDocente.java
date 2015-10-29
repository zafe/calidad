package Listas;

import Clases.CargoDocente;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Marcos
 */
public class ListaCargoDocente {
    private ArrayList<CargoDocente> listaCargoDocente;
    private int actual=0;

    ListaCargoDocente() {
    }
    public int getActual() {
        return actual;
    }
    public void setActual(int actual) {
        this.actual = actual;
    }
    public ArrayList<CargoDocente> getListaCargoDocente() {
        return listaCargoDocente;
    }

    public ListaCargoDocente(ResultSet rs) {
        listaCargoDocente= new ArrayList<CargoDocente>();
        try{
            while (rs.next()){
                CargoDocente c1= new CargoDocente();
                //c1.setCargoDocenteId(rs.getInt("CargoDocenteId"));
                c1.setCargoId(rs.getInt("Cargo_CargoId"));
                c1.setAsignaturaId(rs.getInt("Asignatura_AsignaturaId"));
                c1.setDocenteId(rs.getInt("Docente_DocenteId"));
                listaCargoDocente.add(c1);
            }
        }catch(SQLException a){
            a.printStackTrace();
        }
    }
    public ListaCargoDocente(ArrayList<CargoDocente> listaCargoDocente) {
        this.listaCargoDocente = listaCargoDocente;
    }
   /* public void agregarCliente(Docente cliente){
        listaDocente.add(cliente);
    }
    public Docente get(){
        return listaDocente.get(actual);
    }
    public Docente siguiente(){
        actual++;
        if(actual==listaDocente.size())
            actual=0;
        return listaDocente.get(actual);
    }
    public Docente anterior(){
        actual--;
        if(actual<0)
            actual=listaDocente.size()-1;
        return listaDocente.get(actual);
    }*/
    public void actualizar(ResultSet rs){
        listaCargoDocente= new ArrayList<CargoDocente>();
        try{
            while (rs.next()){
                CargoDocente c1= new CargoDocente();
                c1.setCargoDocenteId(rs.getInt("CargoDocenteId"));
                c1.setCargoId(rs.getInt("Cargo_CargoId"));
                c1.setAsignaturaId(rs.getInt("Asignatura_AsignaturaId"));
                c1.setDocenteId(rs.getInt("Docente_DocenteId"));
                listaCargoDocente.add(c1);
            }
        }catch(SQLException a){
            a.printStackTrace();
        }
    }



}
