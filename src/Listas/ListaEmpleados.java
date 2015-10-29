package Listas;


import Clases.Empleado;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;



public class ListaEmpleados {
    private ArrayList<Empleado> listaEmpleado;
    private int actual=0;

    ListaEmpleados() {
    }

    public int getActual() {
        return actual;
    }

    public void setActual(int actual) {
        this.actual = actual;
    }

    public ArrayList<Empleado> getListaEmpleado() {
        return listaEmpleado;
    }

   
    public ListaEmpleados(ResultSet rs) {
        listaEmpleado= new ArrayList<Empleado>();

        try{
            while (rs.next()){
                Empleado e= new Empleado();
                e.setLegajo(rs.getInt("Legajo"));
                e.setNombre(rs.getString("Nombre"));
                e.setDni(rs.getInt("Dni"));
                e.setApellido(rs.getString("Apellido"));
                e.setIdcategoria(rs.getInt("Categoria_CategoriaId"));
                listaEmpleado.add(e);
            }
        }catch(SQLException a){
            a.printStackTrace();
        }

    }

    public ListaEmpleados(ArrayList<Empleado> listaEmpleado) {
        this.listaEmpleado = listaEmpleado;
    }

    public void agregarEmpleado(Empleado empleado){
        listaEmpleado.add(empleado);

    }

    public Empleado get(){
        return listaEmpleado.get(actual);
    }

    public Empleado siguiente(){
        actual++;
        if(actual==listaEmpleado.size())
            actual=0;

        return listaEmpleado.get(actual);

    }

    public Empleado anterior(){
        actual--;
        if(actual<0)
            actual=listaEmpleado.size()-1;

        return listaEmpleado.get(actual);
    }

    public void actualizar(ResultSet rs){
        listaEmpleado= new ArrayList<Empleado>();

        try{
            while (rs.next()){
                Empleado e= new Empleado();
                e.setLegajo(rs.getInt("Legajo"));
                e.setNombre(rs.getString("Nombre"));
                e.setApellido(rs.getString("Apellido"));
                e.setDni(rs.getInt("Dni"));
                e.setIdcategoria(rs.getInt("Categoria_CategoriaId"));
                listaEmpleado.add(e);
            }
        }catch(SQLException a){
            a.printStackTrace();
        }
    }



}
