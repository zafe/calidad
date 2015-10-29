package Horario;

import Clases.Docente;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Marcos
 */
public class ListaDocentes {
    private ArrayList<Docente> listaDocente;
    private int actual=0;

    ListaDocentes() {
    }
    public int getActual() {
        return actual;
    }
    public void setActual(int actual) {
        this.actual = actual;
    }
    public ArrayList<Docente> getListaDocente() {
        return listaDocente;
    }

    public ListaDocentes(ResultSet rs) {
        listaDocente= new ArrayList<Docente>();
        try{
            while (rs.next()){
                Docente c1= new Docente();
                c1.setLegajo(rs.getInt("Legajo"));
                c1.setNombre(rs.getString("Nombre"));
      
                listaDocente.add(c1);
            }
        }catch(SQLException a){
            a.printStackTrace();
        }
    }
    public ListaDocentes(ArrayList<Docente> listaCliente) {
        this.listaDocente = listaCliente;
    }
    public void agregarCliente(Docente cliente){
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
    }
    public void actualizar(ResultSet rs){
        listaDocente= new ArrayList<Docente>();
        try{
            while (rs.next()){
                Docente c1= new Docente();
                c1.setLegajo(rs.getInt("Legajo"));
                c1.setNombre(rs.getString("Nombre"));
                listaDocente.add(c1);
            }
        }catch(SQLException a){
            a.printStackTrace();
        }
    }



}
