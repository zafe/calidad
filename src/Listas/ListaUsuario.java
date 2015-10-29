package Listas;


import Clases.Usuario;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;



public class ListaUsuario {
    private ArrayList<Usuario> listaUsuario;
    private int actual=0;

    ListaUsuario() {
    }

    public int getActual() {
        return actual;
    }

    public void setActual(int actual) {
        this.actual = actual;
    }

    public ArrayList<Usuario> getListaUsuario() {
        return listaUsuario;
    }

   
    public ListaUsuario(ResultSet rs) {
        listaUsuario= new ArrayList<Usuario>();

        try{
            while (rs.next()){
                Usuario e= new Usuario();
                e.setLegajo(rs.getInt("Empleado_Legajo"));
                 e.setUsuario(rs.getString("Usuario"));
                e.setPassword(rs.getString("Password"));
                e.setNivel(rs.getString("nivel"));
                listaUsuario.add(e);
            }
        }catch(SQLException a){
            a.printStackTrace();
        }

    }

    public ListaUsuario(ArrayList<Usuario> listaUsuario) {
        this.listaUsuario = listaUsuario;
    }

   

}
