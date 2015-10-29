/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Ventana2.java
 *
 * Created on 26-oct-2013, 9:26:17
 */

package Ventanas;


import Listas.ListaAsignatura;
import Clases.Asignatura;
import Abstracta.BD;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Marcos
 */
public class GrillaAsignatura extends javax.swing.JInternalFrame {
    private Asignatura Asignatura;
    private ListaAsignatura lista;
    DefaultTableModel model;
   
    /** Creates new form Ventana2 */
    public GrillaAsignatura() {
        Asignatura = new Asignatura();
        initComponents();
        jPanelModificacion.setVisible(false);
        txtAsignaturaId.setVisible(false);
        mostrar();      
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
        jScrollPane2 = new javax.swing.JScrollPane();
        grilla = new javax.swing.JTable();
        txtAsignaturaId = new javax.swing.JTextField();
        jPanelModificacion = new javax.swing.JPanel();
        txtNom = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtc2 = new javax.swing.JTextField();
        txtCodigo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        btnRegistrarModificacion = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jArea = new javax.swing.JComboBox();
        jLabel24 = new javax.swing.JLabel();
        jCondicion = new javax.swing.JComboBox();
        jLabel25 = new javax.swing.JLabel();
        jComboNivel = new javax.swing.JComboBox();
        jComboCarga4 = new javax.swing.JComboBox();
        jLabel26 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        txtc1 = new javax.swing.JTextField();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        setBorder(null);
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Gestion de Asignaturas");

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        grilla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nombre", "Nivel", "CargaSemanal", "Area", "Condicion"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        grilla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grillaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(grilla);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(txtAsignaturaId, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(txtAsignaturaId, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        jPanelModificacion.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel11.setFont(new java.awt.Font("Levenim MT", 0, 11)); // NOI18N
        jLabel11.setText("Nombre");

        txtc2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtc2KeyTyped(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Levenim MT", 0, 11)); // NOI18N
        jLabel8.setText("Codigo");

        btnRegistrarModificacion.setText("Modificar");
        btnRegistrarModificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarModificacionActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Levenim MT", 0, 11)); // NOI18N
        jLabel19.setText("Area");

        jArea.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Programacion", "Computacion", "Sistemas de Informacion", "Gestion Ingenieril", "Modelos" }));

        jLabel24.setFont(new java.awt.Font("Levenim MT", 0, 11)); // NOI18N
        jLabel24.setText("Modalidad");

        jCondicion.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Anual", "1ER Cuatrimestre", "2DO Cuatrimestre" }));

        jLabel25.setFont(new java.awt.Font("Levenim MT", 0, 11)); // NOI18N
        jLabel25.setText("Nivel");

        jComboNivel.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5" }));

        jComboCarga4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2", "3", "4", "5", "6" }));
        jComboCarga4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboCarga4ActionPerformed(evt);
            }
        });

        jLabel26.setFont(new java.awt.Font("Levenim MT", 0, 11)); // NOI18N
        jLabel26.setText("Carga Semanal");

        javax.swing.GroupLayout jPanelModificacionLayout = new javax.swing.GroupLayout(jPanelModificacion);
        jPanelModificacion.setLayout(jPanelModificacionLayout);
        jPanelModificacionLayout.setHorizontalGroup(
            jPanelModificacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelModificacionLayout.createSequentialGroup()
                .addGroup(jPanelModificacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelModificacionLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanelModificacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelModificacionLayout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(13, 13, 13))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelModificacionLayout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanelModificacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNom, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                        .addGroup(jPanelModificacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel26)
                            .addComponent(jLabel25))
                        .addGap(10, 10, 10)
                        .addGroup(jPanelModificacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboCarga4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboNivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(jPanelModificacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanelModificacionLayout.createSequentialGroup()
                                .addComponent(jLabel24)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCondicion, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanelModificacionLayout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanelModificacionLayout.createSequentialGroup()
                        .addGap(246, 246, 246)
                        .addComponent(btnRegistrarModificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtc2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25))
        );
        jPanelModificacionLayout.setVerticalGroup(
            jPanelModificacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelModificacionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelModificacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelModificacionLayout.createSequentialGroup()
                        .addGroup(jPanelModificacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboCarga4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelModificacionLayout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(jPanelModificacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel26)
                                    .addGroup(jPanelModificacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel19)
                                        .addComponent(jArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelModificacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboNivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel25)
                            .addGroup(jPanelModificacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jCondicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel24)))
                        .addGroup(jPanelModificacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelModificacionLayout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(txtc2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelModificacionLayout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(btnRegistrarModificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanelModificacionLayout.createSequentialGroup()
                        .addGroup(jPanelModificacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(17, 17, 17)
                        .addGroup(jPanelModificacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelModificacionLayout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel11))
                            .addComponent(txtNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        txtc1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtc1KeyTyped(evt);
            }
        });

        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Edit.png"))); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnModificar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnModificar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Delete.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEliminar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnEliminar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/New.png"))); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAgregar.setVerifyInputWhenFocusTarget(false);
        btnAgregar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnAgregar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnModificar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSalir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelModificacion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelModificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
    int fila;
    fila=this.grilla.getSelectedRow();
    if(fila>=0 )
    {
        jPanelModificacion.setVisible(true);
        Asignatura c= new Asignatura();
        c.setAsignaturaId(Integer.parseInt(txtAsignaturaId.getText()));
            if(c.buscar()){
                txtCodigo.setText(""+c.getCodigo());
                txtNom.setText(c.getNombre());
               
               
               
            }
    }else
        {
         JOptionPane.showMessageDialog(null,"No selecciono ninguna asignatura");
        }
        
        
      //  ModificarAsig ma = new ModificarAsig();
    
    //    ma.setVisible(true);
        /* if(txtc.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Ingrese un Codigo para Modificar");
        }
        else{
            Asignatura c= new Asignatura();
            c.setAsignaturaId(Integer.parseInt(txtc.getText()));
            c.setCodigo(Integer.parseInt(txtCod.getText()));
            c.setNombre(txtNom.getText());
            String carga = (String) jComboCarga.getSelectedItem();
            int cargaSemanal =Integer.parseInt(carga);
            String ni = (String) jComboNivel.getSelectedItem();
            int nivel =Integer.parseInt(ni);
            c.setNivel(nivel);
            c.setCargaSemanal(cargaSemanal);
            c.modificar();
            JOptionPane.showMessageDialog(this, "La modificacion se realizo exitosamente");
            Asignatura = new Asignatura();
            mostrar();
            txtNom.setText("");
        
            txtc.setText("");
       
        }*/
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
    int fila;
    fila=this.grilla.getSelectedRow();
    if(fila>=0 )
    {
        Asignatura c = new Asignatura();
        c.setAsignaturaId(Integer.parseInt(txtAsignaturaId.getText()));
        c.bajas();
        JOptionPane.showMessageDialog(this, "La eliminacion se realizo exitosamente");
        mostrar();                
    }else
        {
         JOptionPane.showMessageDialog(null,"No selecciono ninguna asignatura");
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void grillaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grillaMouseClicked
{
int fila;
fila = grilla.rowAtPoint(evt.getPoint());
     if (fila >-1)
     {
       String Codigo= String.valueOf(grilla.getValueAt(fila, 0));
       try{
             Connection cn = BD.getConnection();
             Statement stmt = cn.createStatement();
             ResultSet rs = stmt.executeQuery("select max(AsignaturaId) from Asignatura where Codigo="+Codigo);
             while (rs.next()) {
                                txtAsignaturaId.setText(String.valueOf(rs.getInt(1)));
                                }
             rs.close();
             stmt.close();
             cn.close();
            
     
        }
         catch(Exception e)
         {
          System.out.println(e);
         }
     } 
}
    }//GEN-LAST:event_grillaMouseClicked

    private void txtc1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtc1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtc1KeyTyped

    private void txtc2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtc2KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtc2KeyTyped

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        NuevaAsignatura na = new NuevaAsignatura();
        na.setVisible(true);
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnRegistrarModificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarModificacionActionPerformed
        if(txtCodigo.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Ingrese un Codigo para Modificar");
        }
        else{
            Asignatura c= new Asignatura();
               String carga = (String) jComboCarga4.getSelectedItem();
                int cargaSemanal =Integer.parseInt(carga);
              System.out.println("car"+cargaSemanal);
                
                String ni = (String) jComboNivel.getSelectedItem();
                int nivel =Integer.parseInt(ni);
                System.out.println("ni"+nivel);
              
                String area = (String) jArea.getSelectedItem();
                //String area = Integer.parseInt(a);
                System.out.println("area"+area);
              
                String condicion = (String) jCondicion.getSelectedItem();
                System.out.println("condi"+condicion);
              
            c.setAsignaturaId(Integer.parseInt(txtAsignaturaId.getText()));
            
            c.setCodigo(Integer.parseInt(txtCodigo.getText()));
            c.setNombre(txtNom.getText());
            c.setNivel(nivel);
            c.setCargaSemanal(cargaSemanal);
            c.setArea(area);
            c.setCondicion(condicion);
              System.out.println("Id"+txtAsignaturaId.getText());
                System.out.println("cod"+txtCodigo.getText());
                System.out.println("nombre"+txtNom.getText());
                System.out.println("carga"+cargaSemanal);
                System.out.println("nivel"+nivel);
                System.out.println("cond"+condicion);
            c.modificar();
            JOptionPane.showMessageDialog(this, "La modificacion se realizo exitosamente");
            mostrar();
            jPanelModificacion.setVisible(false);
        }

    }//GEN-LAST:event_btnRegistrarModificacionActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
    this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_btnSalirActionPerformed

    private void jComboCarga4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboCarga4ActionPerformed

       
    }//GEN-LAST:event_jComboCarga4ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnRegistrarModificacion;
    private javax.swing.JButton btnSalir;
    public static javax.swing.JTable grilla;
    private javax.swing.JComboBox jArea;
    private javax.swing.JComboBox jComboCarga4;
    private javax.swing.JComboBox jComboNivel;
    private javax.swing.JComboBox jCondicion;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanelModificacion;
    private javax.swing.JScrollPane jScrollPane2;
    public static javax.swing.JTextField txtAsignaturaId;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtNom;
    private javax.swing.JTextField txtc1;
    private javax.swing.JTextField txtc2;
    // End of variables declaration//GEN-END:variables
  void mostrar() {
         try{
             ListaAsignatura lista = new ListaAsignatura(Asignatura.leer());
             DefaultTableModel info=new DefaultTableModel();
            
             info.addColumn("Codigo");
             info.addColumn("Nombre");
             info.addColumn("Nivel");
             info.addColumn("CargaSemanal");
             info.addColumn("Area");
             info.addColumn("Condicion");
             
             for(int i=0; i<lista.getListaAsignatura().size();i++){
                Object[]fila=new Object[]{
                lista.getListaAsignatura().get(i).getCodigo(),    
                lista.getListaAsignatura().get(i).getNombre(),
                lista.getListaAsignatura().get(i).getNivel(),
                lista.getListaAsignatura().get(i).getCargaSemanal(),
                lista.getListaAsignatura().get(i).getArea(),
                lista.getListaAsignatura().get(i).getCondicion()
                
                };
                 info.addRow(fila);
            }
                 grilla.setModel(info);
        }catch(Exception a){
            a.printStackTrace();
        }

    }
/* private void filtrar() {
     try{
        Asignatura c = new Asignatura();
        ListaAsignatura lista = new ListaAsignatura(Asignatura.filtrar());
        DefaultTableModel info=new DefaultTableModel();
       // info.addColumn("AsignaturaId");
        info.addColumn("Codigo");
        info.addColumn("Nombre");
        info.addColumn("Nivel");
        info.addColumn("CargaSemanal");
        info.addColumn("Area");
        info.addColumn("Condicion");
        Asignatura.setAsignaturaId(Integer.parseInt(Asig.getText()));
        if(Asignatura.buscar())
            for(int i=0; i<lista.getListaAsignatura().size();i++){
                Object[]fila=new Object[]{
        //        lista.getListaAsignatura().get(i).getAsignaturaId(),
                lista.getListaAsignatura().get(i).getCodigo(),    
                lista.getListaAsignatura().get(i).getNombre(),
                lista.getListaAsignatura().get(i).getNivel(),
                lista.getListaAsignatura().get(i).getCargaSemanal(),
                lista.getListaAsignatura().get(i).getArea(),
                lista.getListaAsignatura().get(i).getCondicion()
        };
            info.addRow(fila);
          }
            grilla.setModel(info);
    }catch(Exception a){
      a.printStackTrace();
      }
  }
  */

}
