/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VISTAS;

import java.awt.Graphics;
import java.awt.Image;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import veterinaria_MODELO.Tratamiento;
import veterinaria_MODELO.Visita;

/**
 *
 * @author Barbara
 */
public class Consultas_VISITAS extends javax.swing.JInternalFrame {

    /**
     * Creates new form Ficha_CLIENTE2
     */
    public Consultas_VISITAS() {
        initComponents();
        inicializarComboTratamientos();
        jTable2.setAutoCreateRowSorter(true);

    }

    private void inicializarComboTratamientos() {
        List<Tratamiento> t = Menu_PRINCIPAL_VETERINARIA.td.obtenerTratamientos();
        jComboBox1.addItem(null);
        for (Tratamiento t1 : t) {

            jComboBox1.addItem(t1);

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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel(){
            String str="/IMAGENES/fondo_VISITAS.png";
            ImageIcon icon = new ImageIcon(getClass().getResource(str));
            Image image = icon.getImage();

            public void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(image, 0, 0,getWidth(),getHeight(), this);
            }
        };
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jlNOMBRE = new javax.swing.JLabel();
        jlDIRECCION1 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jrbACTIVO = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jtSintomas = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 580, 10));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 580, 10));

        jlNOMBRE.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlNOMBRE.setForeground(new java.awt.Color(255, 255, 255));
        jlNOMBRE.setText("Tratamiento :");
        jPanel1.add(jlNOMBRE, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 110, 20));

        jlDIRECCION1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlDIRECCION1.setForeground(new java.awt.Color(255, 255, 255));
        jlDIRECCION1.setText("Sintomas:");
        jPanel1.add(jlDIRECCION1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 220, 80, 20));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 590, 10));

        jrbACTIVO.setBackground(new java.awt.Color(255, 255, 255));
        jrbACTIVO.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jrbACTIVO.setSelected(true);
        jrbACTIVO.setText("Activa");
        jrbACTIVO.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jrbACTIVO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbACTIVOActionPerformed(evt);
            }
        });
        jPanel1.add(jrbACTIVO, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 260, 70, 20));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 0, 204));
        jLabel1.setText("VISITAS");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 310, 90, -1));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Alias", "Tipo Tratamiento", "Fecha", "Sintomas", "Activo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 560, 120));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/close.png"))); // NOI18N
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 100, 60, 50));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/search.png"))); // NOI18N
        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 60, 50));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 610, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/clear.png"))); // NOI18N
        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, 60, 50));

        jtSintomas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtSintomasActionPerformed(evt);
            }
        });
        jPanel1.add(jtSintomas, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 220, 130, -1));

        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 150, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 630, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel2MouseClicked


    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
        model.setRowCount(0); // BORRA TODAS LAS LINEAS Y VUELVE A 0//

        jtSintomas.setText("");
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        ArrayList<String> filtros = new ArrayList<String>();
        ArrayList<String> valores = new ArrayList<String>();

        if (jComboBox1.getSelectedItem() != null) {
            filtros.add("id_tratamiento");
            valores.add(Integer.toString(((Tratamiento) jComboBox1.getSelectedItem()).getId_tratamiento()));
        }
        if (jrbACTIVO.isSelected()) {
            filtros.add("activo");
            valores.add("1");
        } else if (!jrbACTIVO.isSelected()) {
            filtros.add("activo");
            valores.add("0");
        }

        if (!jtSintomas.getText().equals("")) {
            filtros.add("sintomas");
            valores.add(jtSintomas.getText());
        }

        List<Visita> visitas = Menu_PRINCIPAL_VETERINARIA.vd.listarVisitasConFiltro(filtros, valores);
        if (visitas.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No se encontraron visitas");
        } else {
            rellenarTabla(visitas);
        }

    }//GEN-LAST:event_jLabel6MouseClicked

    private void jtSintomasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtSintomasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtSintomasActionPerformed

    private void jrbACTIVOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbACTIVOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrbACTIVOActionPerformed
    private void rellenarTabla(List<Visita> visitas) {
        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
        model.setRowCount(0); // BORRA TODAS LAS LINEAS Y VUELVE A 0//
        for (Visita visita : visitas) {
            model.addRow(new Object[]{visita.getIdvisita(),visita.getMascota().getAlias(),visita.getTratamiento().getTipo_tratamiento(),  visita.getFecha_visita(), visita.getSintomas(), visita.isActivo()});

        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Tratamiento> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel jlDIRECCION1;
    private javax.swing.JLabel jlNOMBRE;
    private javax.swing.JRadioButton jrbACTIVO;
    private javax.swing.JTextField jtSintomas;
    // End of variables declaration//GEN-END:variables
}
