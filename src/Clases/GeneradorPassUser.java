
package Clases;


public class GeneradorPassUser {

    //GENERAR USUARIOS
    public String generarUser(String nombre,String apellido){
        String user="";
        char pr=nombre.charAt(0);
        String set=apellido;
        user=pr+set;
        return user;
    }

    //GENERAR CONTRASEÑA
    public String generarPass(String nombre,String dni,String apellido){
        String pass="";
        char pr=nombre.charAt(0);
        char set=apellido.charAt(0);
        pass=pr+""+dni+""+set;
        return pass;
    }
}
