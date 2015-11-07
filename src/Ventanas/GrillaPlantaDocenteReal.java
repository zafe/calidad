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



import Clases.PlantaDocente;
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
import javax.swing.JOptionPane;
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
public class GrillaPlantaDocenteReal extends javax.swing.JInternalFrame {
    private Asignatura Asignatura;
    private ListaLineamiento lista;
    DefaultTableModel model;
    public int codigo;

    /** Creates new form Ventana2 */
    public GrillaPlantaDocenteReal() {
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
        btnAgregar = new javax.swing.JButton();
        btnEliminar1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        txtId = new javax.swing.JTextField();
        txtPlantaDocenteId = new javax.swing.JTextField();

        setBorder(null);
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Planta Docente(Real)");

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
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "PlantaDocenteId", "Categoria", "CantidadComisiones", "Dedicaciones", "Docente"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false
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
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 729, Short.MAX_VALUE)
                    .addComponent(jScrollPane3))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        txtc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcKeyTyped(evt);
            }
        });

        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/New.png"))); // NOI18N
        btnAgregar.setText("Agregar P.D");
        btnAgregar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAgregar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnAgregar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnEliminar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Delete.png"))); // NOI18N
        btnEliminar1.setText("Eliminar");
        btnEliminar1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEliminar1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnEliminar1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEliminar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminar1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Print.png"))); // NOI18N
        jButton2.setText("Reporte Por Materia");
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Salir.png"))); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSalir.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnSalir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEliminar1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(149, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnSalir))
                    .addComponent(btnEliminar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPlantaDocenteId)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPlantaDocenteId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminar1ActionPerformed
    int fila;
    fila=this.jtContenidoPlantaDocente.getSelectedRow();
    if(fila>=0 )
    {
     PlantaDocente pd = new PlantaDocente();
     pd.setPlantaDocenteId(Integer.parseInt(txtPlantaDocenteId.getText()));
     pd.bajas();
     
     JOptionPane.showMessageDialog(this, "La eliminacion se realizo exitosamente");
                    
    buscar();
    }else
        {
         JOptionPane.showMessageDialog(null,"No selecciono ningun docente");
        }
     
    }//GEN-LAST:event_btnEliminar1ActionPerformed

    private void txtcKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcKeyTyped
        char c = evt.getKeyChar();
        if(c<'0' || c>'9')evt.consume(); 
    }//GEN-LAST:event_txtcKeyTyped

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
    NuevaPlantaDocenteReal apd= new NuevaPlantaDocenteReal();
    apd.setVisible(true);
      
    }//GEN-LAST:event_btnAgregarActionPerformed

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

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_btnSalirActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        try {
            
            Connection miConexion = BD.getConnection();
           // JOptionPane.showMessageDialog(null,"Conexion");
            String ubicacionReporte = "C:\\Users\\Marcos\\Desktop\\Trabajo\\GestionColegios\\NetBeansProjects\\Calidad_1\\src\\Reportes\\PlantaReal.jasper";
                 
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
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEliminar1;
    private javax.swing.JButton btnSalir;
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
         ResultSet rs = stmt.executeQuery("SELECT pd.PlantaDocenteId,c.Nombre,pd.Comisiones,pd.Dedicaciones,d.Nombre FROM mydb.Plantadocente pd inner join mydb.cargo_has_docente cd on pd.CargohasDocente_CargoDocenteId=cd.CargoDocenteId inner join mydb.Docente d on cd.Docente_DocenteId=d.DocenteId inner join mydb.cargo c on c.CargoId=cd.Cargo_CargoId inner join mydb.asignatura a on cd.Asignatura_AsignaturaId=a.AsignaturaId where a.Codigo='"+txtId.getText()+"'");
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
