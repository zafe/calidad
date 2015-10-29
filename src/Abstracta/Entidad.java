/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Abstracta;

import java.sql.ResultSet;
import java.sql.SQLException;


public abstract class Entidad { //una clase abstracta es algo q no existe, es como una clasificacion
                                //clases de las cuales no pueden crearse ojetos.
                                //Existen a nivel conceptual y como base paraa la herencia.
                                //Reunen los comportamientos comunes

    public abstract void altas();
    public abstract void bajas();
    public abstract void modificar();
    public abstract ResultSet leer() throws SQLException;
    public abstract boolean buscar();
    public abstract ResultSet filtrar()throws SQLException;
    



}