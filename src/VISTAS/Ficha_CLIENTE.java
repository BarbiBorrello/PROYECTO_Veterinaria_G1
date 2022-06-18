/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VISTAS;

import static VISTAS.Menu_PRINCIPAL_VETERINARIA.escritorio;
import java.awt.Graphics;
import java.awt.Image;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import veterinaria_MODELO.Cliente;
import veterinaria_MODELO.Mascota;

/**
 *
 * @author Barbara
 */
public class Ficha_CLIENTE extends javax.swing.JInternalFrame {

    /**
     * Creates new form Ficha_CLIENTE2
     */
    public Ficha_CLIENTE() {
        initComponents();

        // inicio la funcion de validacion de campos para el formulario
      
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
            String str="/IMAGENES/fondo_cliente.png";
            ImageIcon icon = new ImageIcon(getClass().getResource(str));
            Image image = icon.getImage();

            public void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(image, 0, 0,getWidth(),getHeight(), this);
            }
        };
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jlDNI = new javax.swing.JLabel();
        jlNOMBRE = new javax.swing.JLabel();
        jlCONTACTO_ALTERNATIVO = new javax.swing.JLabel();
        jlAPELLIDO2 = new javax.swing.JLabel();
        jlDIRECCION1 = new javax.swing.JLabel();
        jlTELEFONO1 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jrbACTIVO = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLBuscarCliente_C = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jtexto_Apellido = new javax.swing.JTextField();
        jtexto_Nombre = new javax.swing.JTextField();
        jtexto_Direccion = new javax.swing.JTextField();
        jtexto_ContactoA = new javax.swing.JTextField();
        jtexto_Telefono = new javax.swing.JTextField();
        jTDNI = new javax.swing.JTextField();

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

        jlDNI.setBackground(new java.awt.Color(255, 255, 255));
        jlDNI.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlDNI.setForeground(new java.awt.Color(255, 255, 255));
        jlDNI.setText("DNI :");
        jPanel1.add(jlDNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, -1, -1));

        jlNOMBRE.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlNOMBRE.setForeground(new java.awt.Color(255, 255, 255));
        jlNOMBRE.setText("Nombre: ");
        jPanel1.add(jlNOMBRE, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 70, 20));

        jlCONTACTO_ALTERNATIVO.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlCONTACTO_ALTERNATIVO.setForeground(new java.awt.Color(255, 255, 255));
        jlCONTACTO_ALTERNATIVO.setText("Contacto Alternativo: ");
        jPanel1.add(jlCONTACTO_ALTERNATIVO, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 160, 20));

        jlAPELLIDO2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlAPELLIDO2.setForeground(new java.awt.Color(255, 255, 255));
        jlAPELLIDO2.setText("Apellido: ");
        jPanel1.add(jlAPELLIDO2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 70, 20));

        jlDIRECCION1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlDIRECCION1.setForeground(new java.awt.Color(255, 255, 255));
        jlDIRECCION1.setText("Direccion:");
        jPanel1.add(jlDIRECCION1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 220, 70, 20));

        jlTELEFONO1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlTELEFONO1.setForeground(new java.awt.Color(255, 255, 255));
        jlTELEFONO1.setText("Telefono:");
        jPanel1.add(jlTELEFONO1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 260, 70, 20));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 590, 20));

        jrbACTIVO.setBackground(new java.awt.Color(255, 255, 255));
        jrbACTIVO.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jrbACTIVO.setText("Activo");
        jrbACTIVO.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jrbACTIVO, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 170, 70, 20));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 0, 204));
        jLabel1.setText("MASCOTAS A SU CARGO :");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 370, -1, -1));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable2);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 400, 350, 70));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/close.png"))); // NOI18N
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 100, 60, 50));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/add.png"))); // NOI18N
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 60, 50));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/delete.png"))); // NOI18N
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, 60, 50));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/edit.png"))); // NOI18N
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 100, 60, 50));

        jLBuscarCliente_C.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/search.png"))); // NOI18N
        jLBuscarCliente_C.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLBuscarCliente_C.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLBuscarCliente_CMouseClicked(evt);
            }
        });
        jPanel1.add(jLBuscarCliente_C, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 60, 50));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 610, -1));

        jLabel8.setText("Agregar Mascota");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 370, -1, 30));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/clear.png"))); // NOI18N
        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 100, 60, 50));
        jPanel1.add(jtexto_Apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, 210, -1));
        jPanel1.add(jtexto_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, 210, -1));
        jPanel1.add(jtexto_Direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 220, 210, -1));
        jPanel1.add(jtexto_ContactoA, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 300, 290, -1));
        jPanel1.add(jtexto_Telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 260, 210, -1));
        jPanel1.add(jTDNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, 110, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 630, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 514, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLBuscarCliente_CMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLBuscarCliente_CMouseClicked
        // TODO add your handling code here:
        
                if (!jTDNI.getText().isEmpty()) {
            // con el DNI del cliente busco al cliente //
            Cliente c = Menu_PRINCIPAL_VETERINARIA.cd.buscarClientexDNI(Long.parseLong(jTDNI.getText()));
            
           
//  opcion de cargar un nuevo cliente //
            if (c == null) {
                // si el dni no existe //   

                String[] options = {"Si", "No"};

                int x = JOptionPane.showOptionDialog(null, "¿Desea agregar un nuevo cliente?",
                        "Selecciona una opcion",
                        JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);

                //si //
                if (x == 0) {

                    escritorio.removeAll();
                    Menu_PRINCIPAL_VETERINARIA.mostrarFichaCliente();

// lleva el usuario a la ficha del cliente para que lo agregue a la base de datos //
// si elige "NO"  se limpia para nueva carga de visita //
                } else {
                    jTDNI.setText("");
                }

            } 

        } else {
            JOptionPane.showMessageDialog(null, "Por favor coloque un DNI");
            jTDNI.requestFocus();
        }

    }//GEN-LAST:event_jLBuscarCliente_CMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLBuscarCliente_C;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextField jTDNI;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel jlAPELLIDO2;
    private javax.swing.JLabel jlCONTACTO_ALTERNATIVO;
    private javax.swing.JLabel jlDIRECCION1;
    private javax.swing.JLabel jlDNI;
    private javax.swing.JLabel jlNOMBRE;
    private javax.swing.JLabel jlTELEFONO1;
    private javax.swing.JRadioButton jrbACTIVO;
    private javax.swing.JTextField jtexto_Apellido;
    private javax.swing.JTextField jtexto_ContactoA;
    private javax.swing.JTextField jtexto_Direccion;
    private javax.swing.JTextField jtexto_Nombre;
    private javax.swing.JTextField jtexto_Telefono;
    // End of variables declaration//GEN-END:variables
}
