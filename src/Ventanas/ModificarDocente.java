/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Ventanas;

import Clases.Docente;
import Listas.ListaDocentes;
import static Ventanas.GrillaDocente.jtDatosDocente;
import static Ventanas.GrillaDocente.txtDocenteId;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Marcos
 */
public class ModificarDocente extends javax.swing.JFrame {
private Docente Docente;    
    /**
     * Creates new form ModificarDoc
     */
    public ModificarDocente() {
        initComponents();
        Docente d= new Docente();
        Docente Docente = new Docente();
        d.setDocenteId(Integer.parseInt(txtDocenteId.getText()));
           if(d.buscarDocenteId()){
                txtCodigo.setText(""+d.getLegajo());
                txtn.setText(d.getNombre());
                txte.setText(""+d.getEmail());
                txto.setText(""+d.getObservacion());
               
            }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelModificacion = new javax.swing.JPanel();
        txtc1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jCondicion = new javax.swing.JComboBox();
        jLabel22 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        txto = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        txtn = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txte = new javax.swing.JTextField();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        Modificar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Modificar Docente");

        jPanelModificacion.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        txtc1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtc1KeyTyped(evt);
            }
        });

        jLabel4.setText("Condicion");

        jCondicion.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Interino", "Ordinario" }));

        jLabel22.setFont(new java.awt.Font("Levenim MT", 0, 11)); // NOI18N
        jLabel22.setText("E-mail");

        jLabel24.setFont(new java.awt.Font("Levenim MT", 0, 11)); // NOI18N
        jLabel24.setText("Legajo");

        txtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoActionPerformed(evt);
            }
        });
        txtCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCodigoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodigoKeyTyped(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Levenim MT", 0, 11)); // NOI18N
        jLabel25.setText("Observacion");

        jLabel23.setFont(new java.awt.Font("Levenim MT", 0, 11)); // NOI18N
        jLabel23.setText("Nombre");

        txtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnActionPerformed(evt);
            }
        });
        txtn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtnKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnKeyTyped(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Levenim MT", 0, 11)); // NOI18N
        jLabel21.setText("Fecha de Contrato");

        Modificar.setText("Modificar");
        Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelModificacionLayout = new javax.swing.GroupLayout(jPanelModificacion);
        jPanelModificacion.setLayout(jPanelModificacionLayout);
        jPanelModificacionLayout.setHorizontalGroup(
            jPanelModificacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelModificacionLayout.createSequentialGroup()
                .addGroup(jPanelModificacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelModificacionLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanelModificacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelModificacionLayout.createSequentialGroup()
                                .addComponent(jLabel24)
                                .addGap(18, 18, 18)
                                .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelModificacionLayout.createSequentialGroup()
                                .addComponent(jLabel25)
                                .addGap(46, 46, 46)
                                .addComponent(txto, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelModificacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanelModificacionLayout.createSequentialGroup()
                                    .addComponent(jLabel21)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(10, 10, 10))
                                .addGroup(jPanelModificacionLayout.createSequentialGroup()
                                    .addGroup(jPanelModificacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel23))
                                    .addGap(4, 4, 4)
                                    .addGroup(jPanelModificacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtn, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txte, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanelModificacionLayout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCondicion, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanelModificacionLayout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(Modificar)))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanelModificacionLayout.setVerticalGroup(
            jPanelModificacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelModificacionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelModificacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24))
                .addGap(18, 18, 18)
                .addGroup(jPanelModificacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelModificacionLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel23))
                    .addComponent(txtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelModificacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(txte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanelModificacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel21)
                    .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelModificacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel25)
                    .addComponent(txto, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelModificacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jCondicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(Modificar)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelModificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelModificacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtc1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtc1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtc1KeyTyped

    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed

    }//GEN-LAST:event_txtCodigoActionPerformed

    private void txtCodigoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoKeyReleased

    }//GEN-LAST:event_txtCodigoKeyReleased

    private void txtCodigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoKeyTyped
        char c = evt.getKeyChar();
        if(c<'0' || c>'9')evt.consume();
    }//GEN-LAST:event_txtCodigoKeyTyped

    private void txtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnActionPerformed

    private void txtnKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnKeyReleased

    }//GEN-LAST:event_txtnKeyReleased

    private void txtnKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnKeyTyped

    }//GEN-LAST:event_txtnKeyTyped

    private void ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarActionPerformed
      if(txtDocenteId.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Ingrese un Codigo para Modificar");
        }
        else{
            Docente d= new Docente();
            d.setDocenteId(Integer.parseInt(txtDocenteId.getText()));
            d.setLegajo(Integer.parseInt(txtCodigo.getText()));
            d.setNombre(txtn.getText());
            d.setEmail(txte.getText());
            Date fecha = jDateChooser2.getDate();
            SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String s = formato.format(fecha);
            d.setFecha(s);
            String condicion = (String) jCondicion.getSelectedItem();
            d.setCondicion(condicion);
            d.setObservacion(txto.getText());
            d.modificar();
            mostrar();
          
        }

    }//GEN-LAST:event_ModificarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ModificarDocente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModificarDocente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModificarDocente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModificarDocente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModificarDocente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Modificar;
    private javax.swing.JComboBox jCondicion;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanelModificacion;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtc1;
    private javax.swing.JTextField txte;
    private javax.swing.JTextField txtn;
    private javax.swing.JTextField txto;
    // End of variables declaration//GEN-END:variables
void mostrar() {
         try{
             Docente d = new Docente();
            ListaDocentes lista = new ListaDocentes(d.leer());
            DefaultTableModel info=new DefaultTableModel();
           
            info.addColumn("Legajo");
            info.addColumn("Nombre");
            info.addColumn("Email");
            info.addColumn("Fecha");
            info.addColumn("Condicion");
            info.addColumn("Observacion");
             
            for(int i=0; i<lista.getListaDocente().size();i++){
               Object[]fila=new Object[]{
              
               lista.getListaDocente().get(i).getLegajo(),    
               lista.getListaDocente().get(i).getNombre(),
               lista.getListaDocente().get(i).getEmail(),
               lista.getListaDocente().get(i).getFecha(),
               lista.getListaDocente().get(i).getCondicion(),
               lista.getListaDocente().get(i).getObservacion()
               };
               info.addRow(fila);
            }
               jtDatosDocente.setModel(info);
        }catch(Exception a){
            a.printStackTrace();
        }

}
}

