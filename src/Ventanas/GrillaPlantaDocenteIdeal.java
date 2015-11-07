/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Ventana2.java
 *
 * 
 */

package Ventanas;


import Abstracta.BD;
import Clases.Asignatura;
import Listas.ListaLineamiento;
import com.mysql.jdbc.ResultSetMetaData;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;


/**
 *
 * @author Marcos
 */
public class GrillaPlantaDocenteIdeal extends javax.swing.JInternalFrame {
    private Asignatura Asignatura;
    private ListaLineamiento lista;
    DefaultTableModel model;
    public int codigo;
    /** Creates new form Ventana2 */
    public GrillaPlantaDocenteIdeal() {
        Asignatura = new Asignatura();
        initComponents();
        mostrar();   
        txtId.setVisible(false);
        txtPlantaDocenteId.setVisible(false);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtPlantaDocente = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtContenidoPlantaDocente = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        txtc = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        btnSalir1 = new javax.swing.JButton();
        txtId = new javax.swing.JTextField();
        txtPlantaDocenteId = new javax.swing.JTextField();

        setBorder(null);
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Planta docente (Ideal)");

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jtPlantaDocente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Asignatura", "HoraSemanal", "Nivell"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtPlantaDocente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtPlantaDocenteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtPlantaDocente);

        jtContenidoPlantaDocente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nombre", "CantidadComisiones", "Dedicaciones"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtContenidoPlantaDocente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtContenidoPlantaDocenteMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jtContenidoPlantaDocente);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane3))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        txtc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcKeyTyped(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Print.png"))); // NOI18N
        jButton2.setText("Reporte Por Asignatura");
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        btnSalir1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Salir.png"))); // NOI18N
        btnSalir1.setText("Salir");
        btnSalir1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSalir1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnSalir1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSalir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalir1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 242, Short.MAX_VALUE)
                .addComponent(btnSalir1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSalir1)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });

        txtPlantaDocenteId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPlantaDocenteIdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtId)
                    .addComponent(txtPlantaDocenteId))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtPlantaDocenteId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtcKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcKeyTyped
        char c = evt.getKeyChar();
        if(c<'0' || c>'9')evt.consume(); 
    }//GEN-LAST:event_txtcKeyTyped

    private void jtPlantaDocenteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtPlantaDocenteMouseClicked
    codigo=Integer.parseInt(String.valueOf(jtPlantaDocente.getModel().getValueAt(jtPlantaDocente.getSelectedRow(), 0)));
        try {
                  Asignatura d=Asignatura.buscarAsignaturaCodigo(codigo);
            
            txtId.setText(String.valueOf(d.getCodigo()));
            buscar();
          
            } 
        catch (Exception ex) {
            System.out.println("Error Al Seleccionar Elemento:" + ex.getMessage());
        }        
   
          
      
    }//GEN-LAST:event_jtPlantaDocenteMouseClicked

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    private void jtContenidoPlantaDocenteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtContenidoPlantaDocenteMouseClicked
            
        txtPlantaDocenteId.setText(String.valueOf(jtContenidoPlantaDocente.getModel().getValueAt(jtContenidoPlantaDocente.getSelectedRow(), 0)));
     
      
    }//GEN-LAST:event_jtContenidoPlantaDocenteMouseClicked

    private void txtPlantaDocenteIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPlantaDocenteIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPlantaDocenteIdActionPerformed

    private void btnSalir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalir1ActionPerformed
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_btnSalir1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        try {
            
            Connection miConexion = BD.getConnection();
           // JOptionPane.showMessageDialog(null,"Conexion");
            String ubicacionReporte = "C:\\Users\\Marcos\\Desktop\\Trabajo\\GestionColegios\\NetBeansProjects\\Calidad_1\\src\\Reportes\\PlantaIdeal.jasper";
                 
//JOptionPane.showMessageDialog(null,ubicacionReporte);        
//    String ubicacionReporte1 = System.getProperty("user.dir") + "/src/Reportes/DatoAlumno.jasper";
            JasperReport jasperReport = (JasperReport) JRLoader.loadObjectFromFile(ubicacionReporte);
        //    JasperReport jasperReport1 = (JasperReport) JRLoader.loadObjectFromFile(ubicacionReporte1);
            Map  parametro = new HashMap();
            parametro.put("IdAsignatura",codigo);//JOptionPane.showInputDialog(null, "Ingrese el Codigo de Alumno",Codigo));
            JasperPrint print = JasperFillManager.fillReport(jasperReport, parametro, miConexion);
        //    JasperPrint print1 = JasperFillManager.fillReport(jasperReport1, parametro, miConexion);
            JasperViewer view = new JasperViewer(print, false);
            view.setVisible(true);
        } catch (JRException ex) {
            Logger.getLogger(GrillaPlantaDocenteIdeal.class.getName()).log(Level.SEVERE, null, ex);
        }        // TODO add your handling code here:
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalir1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jtContenidoPlantaDocente;
    private javax.swing.JTable jtPlantaDocente;
    public static javax.swing.JTextField txtId;
    public static javax.swing.JTextField txtPlantaDocenteId;
    private javax.swing.JTextField txtc;
    // End of variables declaration//GEN-END:variables
public void buscar(){
     try{
        DefaultTableModel info=new DefaultTableModel();
        this.jtContenidoPlantaDocente.setModel(info);
        Connection cn = BD.getConnection();
        Statement stmt = cn.createStatement();
         ResultSet rs = stmt.executeQuery("SELECT c.Nombre,l.CantidadComision,l.Dedicacion FROM mydb.Lineamiento l inner join mydb.cargo c on l.Cargo_CargoId=c.CargoId inner join mydb.cargo_has_docente cd on cd.Cargo_CargoId=c.CargoId inner join mydb.asignatura a on a.AsignaturaId=cd.Asignatura_AsignaturaId where a.Codigo='"+txtId.getText()+"'");
        //Obteniendo la informacion de las columnas que estan siendo consultadas
        ResultSetMetaData rsMd = (ResultSetMetaData) rs.getMetaData();
        //La cantidad de columnas que tiene la consulta
        int cantidadColumnas = rsMd.getColumnCount();
        //Establecer como cabezeras el nombre de las colimnas
        for (int i = 1; i <= cantidadColumnas; i++) {
        info.addColumn(rsMd.getColumnLabel(i));
        }
        //Creando las filas para el JTable
        while (rs.next()) {
        Object[] fila = new Object[cantidadColumnas];
        for (int i = 0; i < cantidadColumnas; i++) {
         fila[i]=rs.getObject(i+1);
        }
        info.addRow(fila);
        }
        rs.close();
        cn.close();
        }
        catch (Exception ex) {
             ex.printStackTrace();
   }   
}
public void mostrar(){
     try{
        DefaultTableModel info=new DefaultTableModel();
        this.jtPlantaDocente.setModel(info);
        Connection cn = BD.getConnection();
        Statement stmt = cn.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT a.Codigo,a.Nombre,a.CargaSemanal,a.Nivel FROM mydb.Asignatura a");
        //Obteniendo la informacion de las columnas que estan siendo consultadas
        ResultSetMetaData rsMd = (ResultSetMetaData) rs.getMetaData();
        //La cantidad de columnas que tiene la consulta
        int cantidadColumnas = rsMd.getColumnCount();
        //Establecer como cabezeras el nombre de las colimnas
        for (int i = 1; i <= cantidadColumnas; i++) {
        info.addColumn(rsMd.getColumnLabel(i));
        }
        //Creando las filas para el JTable
        while (rs.next()) {
        Object[] fila = new Object[cantidadColumnas];
        for (int i = 0; i < cantidadColumnas; i++) {
         fila[i]=rs.getObject(i+1);
        }
        info.addRow(fila);
        }
        rs.close();
        cn.close();
        }
        catch (Exception ex) {
             ex.printStackTrace();
        }   
 }

}
