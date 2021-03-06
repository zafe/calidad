/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * jLogin.java
 *
 * Created on 23-oct-2013, 8:49:53
 */

package Ventanas;


import Ventanas.InicioAplicacion;
import Clases.Usuario;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import Ventanas.Menu;
import java.awt.Image;
import java.util.List;

/**
 *
 * @author Marcos
 */
public class Login extends javax.swing.JFrame {
     private InicioAplicacion splashFrame;
    /** Creates new form jLogin */
     public Login(InicioAplicacion splashFrame){
         this.splashFrame=splashFrame;
         initComponents();
    this.setIconImage(new ImageIcon(getClass().getResource("/Imagenes/LogoUTN_nvgsb.png")).getImage());
   

         setProgress(0,"Cargando Componentes del sistema");
         setProgress(20,"Conectandose a la Base de Datos");
         setProgress(40,"Cargando modulos");
         setProgress(60,"Carga de modulos terminada");
         setProgress(80,"Cargando Interfaces");
             setProgress(90,"Interfaces Cargadas");
             setProgress(100,"Bienvenido al Sistema");
             txtn.setVisible(false);
     }
    public Login() {
        initComponents();
        this.setLocationRelativeTo(null);
         txtn.setVisible(false);

    }
     private void setProgress(int percent, String informacion){
         splashFrame.getJLabel().setText(informacion);
         splashFrame.getJProgressBar().setValue(percent);
   try{
       Thread.sleep(1000);
   }catch (InterruptedException ex){
   JOptionPane.showMessageDialog(null,"No se pudo cargar la imagen");
   
   }
    };
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel10 = new javax.swing.JPanel();
        txtc3 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtP = new javax.swing.JPasswordField();
        txtU = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtn = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login de Usuarios");
        setUndecorated(true);
        setResizable(false);

        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Credenciales del Usuario", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12))); // NOI18N

        txtc3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtc3KeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setText("Clave:");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel5.setText("Usuario:");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1422213648_Login.png"))); // NOI18N

        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setText("Validar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel5)
                                .addComponent(txtU, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(20, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtn, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtn, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(11, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
     System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     try{
     String usuario= txtU.getText();
     String pass = txtP.getText();
     String nivel =txtn.getText();
     Usuario e = new Usuario();
     e.setUsuario(txtU.getText());
     e.setPassword(txtP.getText());
     if(txtU.getText().length()>0 && txtP.getText().length()>0){
        if(validarUsuario(txtU.getText(),txtP.getText())){
          if(e.buscarUsuario()){
              txtn.setText(e.getNivel());
             if( txtn.getText().equals("administrador")){
               JOptionPane.showMessageDialog(null,"Bienvenido Administrador");
                  this.dispose();
                  Menu m = new Menu();
                  m.setVisible(true);

              }else if(txtn.getText().equals("Empleado")){
                  JOptionPane.showMessageDialog(null,"Bienvenido Empleado");
                  this.dispose();
                 // Menu2 m2 = new Menu2();
                 // m2.setVisible(true);
              }else if(txtn.getText().equals("Contador")){
                  JOptionPane.showMessageDialog(null,"Bienvenido Contador");
                  this.dispose();
                 // Menu3 m3 = new Menu3();
                 // m3.setVisible(true);
              }
            }
         }
      }else{
         JOptionPane.showMessageDialog(null, "Error: Legajo o Contraseña incorrectos");
         txtU.setText("");    //limpiar campos
         txtP.setText("");        
         txtU.requestFocusInWindow();
      }
         }catch (Exception e){
            e.printStackTrace();
            System.out.println(e);
        }
    

    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtc3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtc3KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtc3KeyTyped

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPasswordField txtP;
    private javax.swing.JTextField txtU;
    private javax.swing.JTextField txtc3;
    private javax.swing.JTextField txtn;
    // End of variables declaration//GEN-END:variables
    boolean validarUsuario(String elUsr, String elPw)  throws IOException
    {
        try
        {

            Connection unaConexion  = DriverManager.getConnection ("jdbc:mysql://localhost/mydb","root", "fernando");
            // Preparamos la consulta
            Statement instruccionSQL = unaConexion.createStatement();
            ResultSet resultadosConsulta = instruccionSQL.executeQuery ("SELECT Usuario , Password FROM mydb.Usuario where usuario='"+elUsr+"' AND password='"+ elPw+"'");

            if( resultadosConsulta.first() )        // si es valido el primer reg. hay una fila, tons el usuario y su pw existen
                return true;        //usuario validado correctamente
            else
                return false;        //usuario validado incorrectamente

        } catch (Exception e)
        {
            e.printStackTrace();
            return false;
        }

    }
}
