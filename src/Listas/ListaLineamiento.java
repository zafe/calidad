package Listas;



import Clases.Lineamiento;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Marcos
 */
public class ListaLineamiento{
    private ArrayList<Lineamiento> listaLineamiento;
    private int actual=0;

    ListaLineamiento() {
    }
    public int getActual() {
        return actual;
    }
    public void setActual(int actual) {
        this.actual = actual;
    }
    public ArrayList<Lineamiento> getListaLineamiento() {
        return listaLineamiento;
    }

    public ListaLineamiento(ResultSet rs) {
        listaLineamiento= new ArrayList<Lineamiento>();
        try{
            while (rs.next()){
                Lineamiento l= new Lineamiento();
                l.setComisiones(rs.getInt("Comisiones"));
                l.setHoraSemanal(rs.getString("horaSemanal"));
                l.setComisiones(rs.getInt("cantidadComision"));
                l.setCategoria(rs.getInt("cargo_CargoId"));
                l.setDedicacion(rs.getFloat("Dedicacion"));
              
      
                listaLineamiento.add(l);
            }
        }catch(SQLException a){
            a.printStackTrace();
        }
    }
    public ListaLineamiento(ArrayList<Lineamiento> listaLineamiento) {
        this.listaLineamiento = listaLineamiento;
    }
  
  
    public Lineamiento get(){
        return listaLineamiento.get(actual);
    }
    public Lineamiento siguiente(){
        actual++;
        if(actual==listaLineamiento.size())
            actual=0;
        return listaLineamiento.get(actual);
    }
    public Lineamiento anterior(){
        actual--;
        if(actual<0)
            actual=listaLineamiento.size()-1;
        return listaLineamiento.get(actual);
    }
    public void actualizar(ResultSet rs){
        listaLineamiento= new ArrayList<Lineamiento>();
        try{
            while (rs.next()){
                Lineamiento l= new Lineamiento();
                l.setComisiones(rs.getInt("Comisiones"));
                l.setHoraSemanal(rs.getString("horaSemanal"));
                l.setComisiones(rs.getInt("canComisiones"));
                l.setCategoria(rs.getInt("cargo_CargoId"));
                l.setDedicacion(rs.getFloat("Dedicacion"));
                listaLineamiento.add(l);
            }
        }catch(SQLException a){
            a.printStackTrace();
        }
    }



}
