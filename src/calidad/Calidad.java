/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package calidad;

/**
 *
 * @author Marcos
 */
import Ventanas.InicioAplicacion;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.UIManager;
public class Calidad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         try{
            JFrame.setDefaultLookAndFeelDecorated(true);
            JDialog.setDefaultLookAndFeelDecorated(true);
//            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
           }
        catch (Exception e){
        e.printStackTrace();
        }
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                               new InicioAplicacion().setVisible(true);
                              }
            }
        );
    }
    
}
