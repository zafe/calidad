/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Listas;

import Clases.Categoria;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Marcos
 */

public class ListaCategoria {
    private ArrayList<Categoria> listaCategoria;
    private int actual=0;

    ListaCategoria() {
    }
    public int getActual() {
        return actual;
    }
    public void setActual(int actual) {
        this.actual = actual;
    }
    public ArrayList<Categoria> getListaCategoria() {
        return listaCategoria;
    }
    public ListaCategoria(ResultSet rs) {
        listaCategoria= new ArrayList<Categoria>();
        try{
            while (rs.next()){
                Categoria c1= new Categoria();
                c1.setCodigo(rs.getInt("CargoId"));
                c1.setDescripcion(rs.getString("Descripcion"));
                listaCategoria.add(c1);
            }
           }catch(SQLException a){
             a.printStackTrace();
           }
    }
    public ListaCategoria(ArrayList<Categoria> listaCategoria) {
        this.listaCategoria = listaCategoria;
    }
    public void agregarCategoria(Categoria categoria){
        listaCategoria.add(categoria);
    }
    public Categoria get(){
        return listaCategoria.get(actual);
    }
    public Categoria siguiente(){
        actual++;
        if(actual==listaCategoria.size())
            actual=0;
        return listaCategoria.get(actual);
    }
    public Categoria anterior(){
        actual--;
        if(actual<0)
            actual=listaCategoria.size()-1;
        return listaCategoria.get(actual);
    }
    public void actualizar(ResultSet rs){
        listaCategoria= new ArrayList<Categoria>();
        try{
            while (rs.next()){
                Categoria c1= new Categoria();
                c1.setCodigo(rs.getInt("CategoriaId"));
                c1.setDescripcion(rs.getString("Descripcion"));
                listaCategoria.add(c1);
            }
        }catch(SQLException a){
            a.printStackTrace();
        }
    }
}
