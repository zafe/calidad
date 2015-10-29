/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Ventana2.java
 *
 * Created on 26-oct-2013, 9:26:17
 */

package Horario;


import Abstracta.BD;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
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
public class GrillaHorario extends javax.swing.JInternalFrame {
    private Horario horario;
    private ListaHorario lista;
    DefaultTableModel model;
    
   
    /** Creates new form Ventana2 */
    public GrillaHorario() {
        horario= new Horario();
        initComponents();
        grilla.setRowHeight(grilla.getRowHeight() * 2);
        
         txtc.setVisible(false);
        txtAsignaturaId.setVisible(false);
        txtAsignaturaNombre.setVisible(false);
        txtDocenteId.setVisible(false);
        txtDocenteNombre.setVisible(false);
         txtDiaHorario.setVisible(false);
        txtDia.setVisible(false);
        txtHorarioI.setVisible(false);
        txtHorarioF.setVisible(false);
        txtCurso.setVisible(false);
        txtComision.setVisible(false);
   
        
        //mostrar();  
        try {
            Connection con = BD.getConnection();
            Statement stmt = con.createStatement();
            
            ResultSet rs = stmt.executeQuery("select DocenteId,nombre from Docente");
            while (rs.next()) {
                String aux = String.valueOf(rs.getString(1)+" - "+rs.getString(2));
                jDocente.addItem(aux);
              //  txtDocenteId.setText(rs.getString(1));
              //  txtDocenteNombre.setText(rs.getString(2));
              //  System.out.println(txtDocenteNombre.getText());
            }
        } catch (Exception error) {
            System.out.println(error +" 11111111111111111" );
        }    
         
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
        jCurso = new javax.swing.JComboBox();
        jComision = new javax.swing.JComboBox();
        jPanel1 = new javax.swing.JPanel();
        jDocente = new javax.swing.JComboBox();
        jAsignatura = new javax.swing.JComboBox();
        jAula = new javax.swing.JComboBox();
        jDia = new javax.swing.JComboBox();
        jHI = new javax.swing.JComboBox();
        txtDedicacion = new javax.swing.JTextField();
        txtArea = new javax.swing.JTextField();
        txtModalidad = new javax.swing.JTextField();
        txtHorario = new javax.swing.JTextField();
        btnAsignar = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtc = new javax.swing.JTextField();
        txtDocenteNombre = new javax.swing.JTextField();
        txtDocenteId = new javax.swing.JTextField();
        txtAsignaturaId = new javax.swing.JTextField();
        txtAsignaturaNombre = new javax.swing.JTextField();
        txtDia = new javax.swing.JTextField();
        txtHorarioI = new javax.swing.JTextField();
        txtHorarioF = new javax.swing.JTextField();
        txtCurso = new javax.swing.JTextField();
        txtComision = new javax.swing.JTextField();
        txtDiaHorario = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setBorder(null);
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        grilla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Horario", "Lunes", "Martes", "Miercoles", "Jueves", "Viernes"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(grilla);

        jCurso.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5" }));

        jComision.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "k1", "k2", "k3", "k4", "k5", "k6", "k7", "k8" }));

        jDocente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDocenteActionPerformed(evt);
            }
        });

        jAsignatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAsignaturaActionPerformed(evt);
            }
        });

        jAula.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "154", "155", "156", "157" }));

        jDia.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Lunes", "Martes", "Miercoles", "Jueves", "Viernes" }));
        jDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDiaActionPerformed(evt);
            }
        });

        jHI.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5" }));

        btnAsignar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/operacion.png"))); // NOI18N
        btnAsignar.setText("Asignar");
        btnAsignar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAsignarActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Print.png"))); // NOI18N
        jButton3.setText("Imprimir");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel1.setText("Seleccione Docente:");

        jLabel2.setText("Seleccione Asignatura:");

        jLabel3.setText("Seleccione Aula:");

        jLabel4.setText("Seleccione Dia:");

        jLabel5.setText("Dedicacion:");

        jLabel6.setText("Area:");

        jLabel7.setText("Modalidad");

        jLabel8.setText("Modulo");

        jLabel10.setText("Horas Catedras:");

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Salir.png"))); // NOI18N
        jButton4.setText("Salir");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jHI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jDia, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61)
                        .addComponent(txtAsignaturaId, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(txtAsignaturaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(txtDia, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(txtHorarioF, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(txtComision, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(62, 62, 62)
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jDocente, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(txtDedicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(49, 49, 49)
                        .addComponent(jLabel6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jAsignatura, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(txtArea, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(80, 80, 80)
                        .addComponent(jLabel7))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(97, 97, 97)
                        .addComponent(txtc, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDocenteId, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(txtDocenteNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(txtHorarioI, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(txtCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDiaHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jAula, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(txtModalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAsignar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel5))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDocente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDedicacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6))
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jAsignatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel7))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jAula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtModalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtDocenteId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtDocenteNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHorarioI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtDiaHorario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtAsignaturaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtAsignaturaId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHorarioF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtComision, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtHorario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jHI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAsignar, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jLabel11.setText("Seleccione Curso:");

        jLabel12.setText("Seleccione Comision:");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(jLabel12)
                        .addGap(18, 18, 18)
                        .addComponent(jComision, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 524, Short.MAX_VALUE)
                        .addGap(18, 18, 18)))
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComision, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(64, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jDocenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDocenteActionPerformed
        try {  
            Connection con = BD.getConnection();
            Statement stmt = con.createStatement();
           // String pro = (String) jProfesor.getSelectedItem();
           // int profesor =Integer.parseInt(pro);
            String d= String.valueOf(jDocente.getModel().getSelectedItem());
            String numero="";
            for (int i = 0; i < d.length(); i++) {
                if (Character.isDigit(d.charAt(i))) {
                numero=numero+d.charAt(i);
                }
            }
            txtDocenteId.setText(numero);
            System.out.println("numeros: " + numero);
            //String docente = d.substring(0);
            int aux2;
            aux2 = Integer.parseInt(numero);
             ResultSet rs4 = stmt.executeQuery("SELECT Nombre FROM mydb.docente d where d.DocenteId="+aux2);
            txtDocenteNombre.removeAll();
            while(rs4.next()){
                String docenteNombre =String.valueOf(rs4.getString(1));
                txtDocenteNombre.setText(docenteNombre);
            }
            ResultSet rs = stmt.executeQuery("select a.AsignaturaId,a.nombre from mydb.cargo_has_docente cd inner join mydb.asignatura a on cd.Asignatura_AsignaturaId = a.AsignaturaId where cd.Docente_DocenteId="+aux2);
            jAsignatura.removeAllItems();
            while (rs.next()) {
                String aux = String.valueOf(rs.getString(1)+" - "+rs.getString(2));
                jAsignatura.addItem(aux);
               // String AsigNombre=String.valueOf(rs.getString(2));
               // txtAsignaturaNombre.setText(AsigNombre);
            }
                String a= String.valueOf(jAsignatura.getModel().getSelectedItem());
                String numero1="";
                for (int i = 0; i < a.length(); i++) {
                    if (Character.isDigit(a.charAt(i))) {
                    numero1=numero1+a.charAt(i);
                    }
                    //System.out.println("numeros1: " + numero1);
                }
                System.out.println("numeros1: " + numero1);
                txtAsignaturaId.setText(numero1);
               ResultSet rs5 = stmt.executeQuery("SELECT Nombre FROM mydb.asignatura a where a.AsignaturaId="+numero1);
            txtAsignaturaNombre.removeAll();
            while(rs5.next()){
                String AsignaturaNombre =String.valueOf(rs5.getString(1));
                txtAsignaturaNombre.setText(AsignaturaNombre);
            }             



//}// para probar
            
            ResultSet rs1 = stmt.executeQuery("SELECT pd.Dedicaciones from mydb.cargo_has_docente cd inner join mydb.plantadocente pd on pd.CargohasDocente_CargoDocenteId=cd.cargoDocenteId where cd.Docente_DocenteId ='"+aux2+"' and cd.Asignatura_AsignaturaId='"+txtAsignaturaId.getText()+"';");
            txtDedicacion.removeAll();
            while(rs1.next()){
                String dedi= String.valueOf(rs1.getString(1));
                txtDedicacion.setText(dedi);
            }
             //para probar
            ResultSet rs2 = stmt.executeQuery("select area from mydb.cargo_has_docente cd inner join mydb.asignatura a on cd.Asignatura_AsignaturaId = a.AsignaturaId where cd.Docente_DocenteId="+aux2);
            txtArea.removeAll();
            while(rs2.next()){
                String area= String.valueOf(rs2.getString(1));
                txtArea.setText(area);
            }
             ResultSet rs3 = stmt.executeQuery("select condicion from mydb.cargo_has_docente cd inner join mydb.asignatura a on cd.Asignatura_AsignaturaId = a.AsignaturaId where cd.Docente_DocenteId="+aux2);
            txtArea.removeAll();
            while(rs3.next()){
                String condicion= String.valueOf(rs3.getString(1));
                txtModalidad.setText(condicion);
            }
            Horario h = new Horario();
   
        } catch (Exception error) {
            System.out.println(error+" 2222222222222222222222");
        }
    }//GEN-LAST:event_jDocenteActionPerformed

    private void jAsignaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAsignaturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jAsignaturaActionPerformed

    private void btnAsignarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAsignarActionPerformed
    try {
            Connection cn = BD.getConnection();
            Statement stmt = cn.createStatement();
            ResultSet rs = stmt.executeQuery("select max(HorarioId) from Horario");
            while (rs.next()) {
                 txtc.setText(String.valueOf(rs.getInt(1)+1));
                System.out.println(txtc.getText());
            }
            rs.close();
            stmt.close();
            cn.close();
        if(txtDedicacion.getText().equals("")){
                JOptionPane.showMessageDialog(this, "Ingrese un Codigo para Grabar");
            }
            else{
                int HorarioId =Integer.parseInt( txtc.getText());
                int AsignaturaId =Integer.parseInt( txtAsignaturaId.getText());
                String AsignaturaNombre=txtAsignaturaNombre.getText();

                int DocenteId =Integer.parseInt( txtDocenteId.getText());
                String DocenteNombre=txtDocenteNombre.getText();
                
                
          
               
               
                
                String dia = (String) jDia.getSelectedItem();
                String modulo = (String) jHI.getSelectedItem();
                
                String Curso = (String) jCurso.getSelectedItem();
                String Comision = (String) jComision.getSelectedItem();
               
                
                
                
                Horario c= new Horario();
                c.setHorarioId(HorarioId);
                System.out.println("HorarioId: " + HorarioId);
                c.setAsignaturaId(AsignaturaId);
                System.out.println("AsignaturaId: " + AsignaturaId);
                c.setAsignaturaNombre(AsignaturaNombre);
                System.out.println("AsigNombre: " + AsignaturaNombre);
                c.setDocenteId(DocenteId);
                System.out.println("DocenteId: " + DocenteId);
                c.setDocenteNombre(DocenteNombre);
                System.out.println("DocenteNombre: " + DocenteNombre);
                c.setDia(dia);
                System.out.println("Dia: " + dia);
                c.setModulo(modulo);
                System.out.println("HorarioInicio: " + modulo);
                
                c.setCurso(Curso);
                System.out.println("Curso: " + Curso);
                c.setComision(Comision);
                System.out.println("Comision: " + Comision);
                c.altas();
                JOptionPane.showMessageDialog(null,"Una nueva Comision ha sido Registrada");
                mostrar();
               }
          
        } catch (Exception error) {
            System.out.println(error+" 333333333333333333");
        }

    }//GEN-LAST:event_btnAsignarActionPerformed

    private void jDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jDiaActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
 /* try {
            Connection miConexion = BD.getConnection();
            String ubicacionReporte = System.getProperty("C:/Users/Marcos/Documents/NetBeansProjects/Calidad_1/src/Reportes/report1.jrxml");
            JasperReport jasperReport = (JasperReport) JRLoader.loadObject(ubicacionReporte);
            JasperPrint print = JasperFillManager.fillReport(jasperReport, null, miConexion);
            JasperViewer view = new JasperViewer(print, false);
            view.setVisible(true);
        } catch (JRException ex) {
           System.out.println(ex);
        }*/
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
    this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAsignar;
    public static javax.swing.JTable grilla;
    private javax.swing.JComboBox jAsignatura;
    private javax.swing.JComboBox jAula;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox jComision;
    private javax.swing.JComboBox jCurso;
    private javax.swing.JComboBox jDia;
    private javax.swing.JComboBox jDocente;
    private javax.swing.JComboBox jHI;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txtArea;
    private javax.swing.JTextField txtAsignaturaId;
    private javax.swing.JTextField txtAsignaturaNombre;
    private javax.swing.JTextField txtComision;
    private javax.swing.JTextField txtCurso;
    private javax.swing.JTextField txtDedicacion;
    private javax.swing.JTextField txtDia;
    private javax.swing.JTextField txtDiaHorario;
    private javax.swing.JTextField txtDocenteId;
    private javax.swing.JTextField txtDocenteNombre;
    private javax.swing.JTextField txtHorario;
    private javax.swing.JTextField txtHorarioF;
    private javax.swing.JTextField txtHorarioI;
    private javax.swing.JTextField txtModalidad;
    private javax.swing.JTextField txtc;
    // End of variables declaration//GEN-END:variables
  void mostrar() {
         try{
             ListaHorario lista = new ListaHorario(horario.leer());
             DefaultTableModel info=new DefaultTableModel();
             info.addColumn("Horario");
             info.addColumn("Lunes");
             info.addColumn("Martes");
             info.addColumn("Miercoles");
             info.addColumn("Jueves");
             info.addColumn("Viernes");
         
            for(int i=0; i<5;i++){
             
                    Object[]fila=new Object[]{"","","","","",""};
                    fila[0]="Modulo "+(i+1);
                    for(int j=0; j<lista.getListaHorario().size();j++){
                    Horario h= lista.getListaHorario().get(j);
                        if(h.getModulo().equals(""+(i+1)))
                         {
                            if(h.getDia().equals("Lunes")){
                                fila[1]="<html>"+h.getAsignaturaNombre()+"<br/>"+h.getDocenteNombre()+"</html>";
                             }
                             else if(h.getDia().equals("Martes")){
                                fila[2]="<html>"+h.getAsignaturaNombre()+"<br/>"+h.getDocenteNombre()+"</html>";
                                }
                                else if(h.getDia().equals("Miercoles")){
                                        fila[3]="<html>"+h.getAsignaturaNombre()+"<br/>"+h.getDocenteNombre()+"</html>";
                                    }
                                    else if(h.getDia().equals("Jueves")){
                                            fila[4]="<html>"+h.getAsignaturaNombre()+"<br/>"+h.getDocenteNombre()+"</html>";
                                        }
                                        else if(h.getDia().equals("Viernes")){
                                               fila[5]="<html>"+h.getAsignaturaNombre()+"<br/>"+h.getDocenteNombre()+"</html>";
                                            }
                         }
                    }
                   info.addRow(fila);
            }
grilla.setModel(info);

         
//{
                //    lista.getListaHorario().get(i).getModulo(),
                //    lista.getListaHorario().get(i).getAsignaturaNombre()+" - "+lista.getListaHorario().get(i).getDocenteNombre(),
                //    };
                    
           //         if(lista.getListaHorario().get(i).getDia().equals("Lunes")){
                    
                    
               //     }
            //     info.addRow(fila);
               
               /* }
                else
                if(lista.getListaHorario().get(i).getDia().equals("Martes"))
                {
                 Object[]fila=new Object[]{
                lista.getListaHorario().get(i).getModulo(),
                "",
                lista.getListaHorario().get(i).getAsignaturaNombre()+" - "+lista.getListaHorario().get(i).getDocenteNombre(),
               
                };
                 info.addRow(fila);
                
                }
                else
                if(lista.getListaHorario().get(i).getDia().equals("Miercoles"))
                {
                 Object[]fila=new Object[]{
                lista.getListaHorario().get(i).getModulo(),
                "",
                "",
                lista.getListaHorario().get(i).getAsignaturaNombre()+" - "+lista.getListaHorario().get(i).getDocenteNombre(),
                };
                 info.addRow(fila);
                
                }
                else
                if(lista.getListaHorario().get(i).getDia().equals("Jueves"))
                {
                 Object[]fila=new Object[]{
                lista.getListaHorario().get(i).getModulo(),
                "",
                "",
                "",
                lista.getListaHorario().get(i).getAsignaturaNombre()+" - "+lista.getListaHorario().get(i).getDocenteNombre(),
                };
                 info.addRow(fila);
                
                }
                else
                if(lista.getListaHorario().get(i).getDia().equals("Viernes"))
                {
                 Object[]fila=new Object[]{
                lista.getListaHorario().get(i).getModulo(),
                "",
                "",
                "",
                "",
                lista.getListaHorario().get(i).getAsignaturaNombre()+" - "+lista.getListaHorario().get(i).getDocenteNombre(),
                };
                 info.addRow(fila);         
                }
              grilla.setModel(info);
             }
                       */
                                   
        }catch(Exception a){
            a.printStackTrace();
        }

    }
 
}
