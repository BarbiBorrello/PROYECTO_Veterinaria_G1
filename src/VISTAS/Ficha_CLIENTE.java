/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VISTAS;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import veterinaria_MODELO.Cliente;
import static VISTAS.Menu_PRINCIPAL_VETERINARIA.escritorio;
import java.util.List;
import javax.swing.table.DefaultTableModel;

import veterinaria_MODELO.Mascota;

/**
 *
 * @author Barbara
 */
public class Ficha_CLIENTE extends javax.swing.JInternalFrame {

    /**
     * Creates new form Ficha_CLIENTE
     */
    public Ficha_CLIENTE() {
        initComponents();

        // inicio la funcion de validacion de campos para el formulario
        validacionDeCampos();

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
        jlN_DE_CLIENTE = new javax.swing.JLabel();
        jlNOMBRE = new javax.swing.JLabel();
        jlCONTACTO_ALTERNATIVO = new javax.swing.JLabel();
        jlAPELLIDO2 = new javax.swing.JLabel();
        jlDIRECCION1 = new javax.swing.JLabel();
        jlTELEFONO1 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jrbACTIVO = new javax.swing.JRadioButton();
        jLMascotasASuCargo = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTMascotasde1Cliente = new javax.swing.JTable();
        jLSalir = new javax.swing.JLabel();
        jLAgregarCliente = new javax.swing.JLabel();
        jLBorrarCliente = new javax.swing.JLabel();
        jLModificarCliente = new javax.swing.JLabel();
        jLBuscarCliente = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLLimpiar = new javax.swing.JLabel();
        jtexto_Apellido = new javax.swing.JTextField();
        jtexto_Nombre = new javax.swing.JTextField();
        jtexto_Direccion = new javax.swing.JTextField();
        jtexto_ContactoA = new javax.swing.JTextField();
        jtexto_Telefono = new javax.swing.JTextField();
        jtNCliente = new javax.swing.JTextField();
        jlAgregarMascota_desde_Cliente = new javax.swing.JLabel();
        jRDesactivarCliente = new javax.swing.JRadioButton();
        jtexto_dni = new javax.swing.JTextField();

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
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 72, 580, 10));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 580, 10));

        jlDNI.setBackground(new java.awt.Color(255, 255, 255));
        jlDNI.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlDNI.setForeground(new java.awt.Color(255, 255, 255));
        jlDNI.setText("DNI :");
        jPanel1.add(jlDNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, -1, -1));

        jlN_DE_CLIENTE.setBackground(new java.awt.Color(255, 255, 255));
        jlN_DE_CLIENTE.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlN_DE_CLIENTE.setForeground(new java.awt.Color(255, 255, 255));
        jlN_DE_CLIENTE.setText("N°  de Cliente:");
        jPanel1.add(jlN_DE_CLIENTE, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

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
        jrbACTIVO.setEnabled(false);
        jPanel1.add(jrbACTIVO, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 170, 70, 20));

        jLMascotasASuCargo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLMascotasASuCargo.setForeground(new java.awt.Color(51, 0, 204));
        jLMascotasASuCargo.setText("MASCOTAS A SU CARGO :");
        jLMascotasASuCargo.setEnabled(false);
        jPanel1.add(jLMascotasASuCargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 360, -1, -1));

        jTMascotasde1Cliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "N° de Paciente", "Alias", "Especie"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTMascotasde1Cliente);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 490, 70));

        jLSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/close.png"))); // NOI18N
        jLSalir.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jLSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLSalirMouseClicked(evt);
            }
        });
        jPanel1.add(jLSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 80, 60, 50));

        jLAgregarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/add.png"))); // NOI18N
        jLAgregarCliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jLAgregarCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLAgregarClienteMouseClicked(evt);
            }
        });
        jPanel1.add(jLAgregarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 60, 50));

        jLBorrarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/delete.png"))); // NOI18N
        jLBorrarCliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jLBorrarCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLBorrarClienteMouseClicked(evt);
            }
        });
        jPanel1.add(jLBorrarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, 60, 50));

        jLModificarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/edit.png"))); // NOI18N
        jLModificarCliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jLModificarCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLModificarClienteMouseClicked(evt);
            }
        });
        jPanel1.add(jLModificarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 80, 60, 50));

        jLBuscarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/search.png"))); // NOI18N
        jLBuscarCliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jLBuscarCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLBuscarClienteMouseClicked(evt);
            }
        });
        jPanel1.add(jLBuscarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 60, 50));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 610, -1));

        jLLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/clear.png"))); // NOI18N
        jLLimpiar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jLLimpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLLimpiarMouseClicked(evt);
            }
        });
        jPanel1.add(jLLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 80, 60, 50));
        jPanel1.add(jtexto_Apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, 210, -1));
        jPanel1.add(jtexto_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, 210, -1));
        jPanel1.add(jtexto_Direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 220, 210, -1));
        jPanel1.add(jtexto_ContactoA, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 300, 290, -1));
        jPanel1.add(jtexto_Telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 260, 210, -1));

        jtNCliente.setEditable(false);
        jtNCliente.setEnabled(false);
        jPanel1.add(jtNCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 70, -1));

        jlAgregarMascota_desde_Cliente.setIcon(new javax.swing.ImageIcon("C:\\Users\\Barbara\\Desktop\\Agregar_Mascota_ICONO.png")); // NOI18N
        jlAgregarMascota_desde_Cliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jlAgregarMascota_desde_Cliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlAgregarMascota_desde_ClienteMouseClicked(evt);
            }
        });
        jPanel1.add(jlAgregarMascota_desde_Cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 360, 60, 60));

        jRDesactivarCliente.setBackground(new java.awt.Color(255, 255, 255));
        jRDesactivarCliente.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jRDesactivarCliente.setText("Desactivar");
        jRDesactivarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRDesactivarClienteActionPerformed(evt);
            }
        });
        jPanel1.add(jRDesactivarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 170, -1, -1));
        jPanel1.add(jtexto_dni, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 170, 110, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 514, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLBuscarClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLBuscarClienteMouseClicked
        // TODO add your handling code here:

        String clienteN = JOptionPane.showInputDialog(this, "Ingrese el numero de DNI ");

        // el n° existe que lo busque
        if (!clienteN.isEmpty()) {

            Cliente encontrado = Menu_PRINCIPAL_VETERINARIA.cd.buscarClientexDNI(Long.parseLong(clienteN));

            if (encontrado != null) {
                cargarFormularioConCliente(encontrado);
                cargarMascotasCliente();
                
            } else {
                int result2 = JOptionPane.showOptionDialog(this, "¿Desea cargar un nuevo cliente?", "Cliente inexitente", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, new String[]{"SI", "NO"}, "Salir");
                // si = agregar cliente
                // no= salir

                if (result2 == 0) {
                    JOptionPane.showMessageDialog(this, "Cargar cliente nuevo ");
                } else {
                    JOptionPane.showMessageDialog(this, "Salir ");

                }
            }

        } else {
            JOptionPane.showMessageDialog(this, "No se ingreso DNI");

        }


    }//GEN-LAST:event_jLBuscarClienteMouseClicked
    


    private void jLSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLSalirMouseClicked
        // TODO add your handling code here:

        dispose();
    }//GEN-LAST:event_jLSalirMouseClicked

    private void jlAgregarMascota_desde_ClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlAgregarMascota_desde_ClienteMouseClicked
        // TODO add your handling code here:
        Menu_PRINCIPAL_VETERINARIA.mostrarFichaMascota();

    }//GEN-LAST:event_jlAgregarMascota_desde_ClienteMouseClicked

    private void jLLimpiarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLLimpiarMouseClicked
        // TODO add your handling code here:

        limpiarFormulario();
    }//GEN-LAST:event_jLLimpiarMouseClicked

    private void jLAgregarClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLAgregarClienteMouseClicked
        // TODO add your handling code here:
        if (validarFormularioCliente()) {
            Cliente cliente = crearUnClienteDesdeElForm();

            Cliente checkeo = Menu_PRINCIPAL_VETERINARIA.cd.buscarClientexDNI(Long.parseLong(jtexto_dni.getText()));

            if (checkeo != null) {
                JOptionPane.showMessageDialog(this, "DNI existente en el sistema");
            } else {
                Menu_PRINCIPAL_VETERINARIA.cd.agregarCliente(cliente);
                JOptionPane.showMessageDialog(this, "Cliente creado exitosamente (vista)");
                jtNCliente.setText(Integer.toString(cliente.getId_cliente()));
            }

        }
    }//GEN-LAST:event_jLAgregarClienteMouseClicked

    private void jLBorrarClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLBorrarClienteMouseClicked
        // TODO add your handling code here:
        if (validarFormularioCliente()) {
            Cliente cliente = crearUnClienteDesdeElForm();
            cliente.setId_cliente(Integer.parseInt(jtNCliente.getText()));
            cliente.setActivo(false);
            Menu_PRINCIPAL_VETERINARIA.cd.borrarCliente(cliente.getId_cliente());
            cargarFormularioConCliente(cliente);
        }


    }//GEN-LAST:event_jLBorrarClienteMouseClicked

    private void jLModificarClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLModificarClienteMouseClicked
        // TODO add your handling code here:
        
         if (validarFormularioCliente()) {
            Cliente cliente = crearUnClienteDesdeElForm();
            
            if(jtNCliente.getText().isEmpty()){
               JOptionPane.showMessageDialog(this, "Primero busque al cliente"); 
            }
            cliente.setId_cliente(Integer.parseInt(jtNCliente.getText()));
            Menu_PRINCIPAL_VETERINARIA.cd.modificarCliente(Integer.parseInt(jtNCliente.getText()),cliente);
            cargarFormularioConCliente(cliente);
        }    
        
    }//GEN-LAST:event_jLModificarClienteMouseClicked

    private void jRDesactivarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRDesactivarClienteActionPerformed
        // TODO add your handling code here:
        
        if(jtNCliente != null){
        jRDesactivarCliente.setSelected(true);}
        JOptionPane.showMessageDialog(this, "Confirma desactivar cliente?");
        Menu_PRINCIPAL_VETERINARIA.cd.borrarCliente(Integer.parseInt(jtNCliente.getText()));
    }//GEN-LAST:event_jRDesactivarClienteActionPerformed

private void validacionDeCampos() {

        Menu_PRINCIPAL_VETERINARIA.vcampos.SNumero(jtexto_dni);
        Menu_PRINCIPAL_VETERINARIA.vcampos.SLetras(jtexto_Apellido);
        Menu_PRINCIPAL_VETERINARIA.vcampos.SLetras(jtexto_Nombre);
        Menu_PRINCIPAL_VETERINARIA.vcampos.SNumero(jtexto_Telefono);

    }

    private void cargarFormularioConCliente(Cliente cliente) {

        limpiarFormulario();

        jtNCliente.setText(Integer.toString(cliente.getId_cliente()));
        jtexto_dni.setText(Long.toString(cliente.getDni()));
        jrbACTIVO.setSelected(cliente.getActivo());
        jtexto_Apellido.setText(cliente.getApellido());
        jtexto_Nombre.setText(cliente.getNombreD());
        jtexto_Direccion.setText(cliente.getDireccion());
        jtexto_Telefono.setText(cliente.getTelefono());
        jtexto_ContactoA.setText(cliente.getContactoA());
        // falta Tabla Mascota//         

    }

    private void limpiarFormulario() {
        jtNCliente.setText("");
        jtexto_dni.setText("");
        jrbACTIVO.setSelected(false);
        jtexto_Apellido.setText("");
        jtexto_Nombre.setText("");
        jtexto_Direccion.setText("");
        jtexto_Telefono.setText("");
        jtexto_ContactoA.setText("");
        // falta Tabla Mascota//

    }

    private Cliente crearUnClienteDesdeElForm() {

        Cliente cliente = new Cliente();

        //     cliente.setId_cliente(Integer.parseInt(jtNCliente.getText())); LO TRAE DESDE LA BD //
        cliente.setDni(Long.parseLong(jtexto_dni.getText()));
        cliente.setActivo(true);
        cliente.setApellido(jtexto_Apellido.getText());
        cliente.setNombreD(jtexto_Nombre.getText());
        cliente.setDireccion(jtexto_Direccion.getText());
        cliente.setTelefono(jtexto_Telefono.getText());
        cliente.setContactoA(jtexto_ContactoA.getText());

        return cliente;
    }

    private boolean validarFormularioCliente() {

        Cliente cliente = new Cliente();

        if (jtexto_dni.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "El campo DNI no puede estar vacio");
            jtexto_dni.requestFocus();
            return false;

        } else if (jtexto_Apellido.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "El campo Apellido del cliente no puede estar vacio");
            jtexto_Apellido.requestFocus();
            return false;

        } else if (jtexto_Nombre.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "El campo Nombre del cliente no puede estar vacio");
            jtexto_Nombre.requestFocus();
            return false;

        } else if (jtexto_Direccion.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "El campo Direccion del cliente no puede estar vacio");
            jtexto_Direccion.requestFocus();
            return false;

        } else if (jtexto_Telefono.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "El campo Telefono del cliente no puede estar vacio");
            jtexto_Telefono.requestFocus();
            return false;

        } else if (jtexto_ContactoA.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "El campo Telefono del cliente no puede estar vacio");
            jtexto_ContactoA.requestFocus();
            return false;
        }
        return true;

    }

    private void cargarMascotasCliente() {

        List<Mascota> listarMascotas = Menu_PRINCIPAL_VETERINARIA.cd.buscarMascotas_x_Cliente(Integer.parseInt(jtNCliente.getText()));

        DefaultTableModel model = (DefaultTableModel) jTMascotasde1Cliente.getModel();

        model.setRowCount(0); // BORRA TODAS LAS LINEAS Y VUELVE A 0//
        if(listarMascotas != null){
                    for (Mascota mascota : listarMascotas) {
            model.addRow(new Object[]{mascota.getId_mascota()
                    , mascota.getAlias()
                    , mascota.getEspecie()});
        }
        }else{
            JOptionPane.showMessageDialog(this, "El cliente no tiene ninguna mascota a su cargo");
        }

    }
     
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLAgregarCliente;
    private javax.swing.JLabel jLBorrarCliente;
    private javax.swing.JLabel jLBuscarCliente;
    private javax.swing.JLabel jLLimpiar;
    private javax.swing.JLabel jLMascotasASuCargo;
    private javax.swing.JLabel jLModificarCliente;
    private javax.swing.JLabel jLSalir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRDesactivarCliente;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTable jTMascotasde1Cliente;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel jlAPELLIDO2;
    private javax.swing.JLabel jlAgregarMascota_desde_Cliente;
    private javax.swing.JLabel jlCONTACTO_ALTERNATIVO;
    private javax.swing.JLabel jlDIRECCION1;
    private javax.swing.JLabel jlDNI;
    private javax.swing.JLabel jlNOMBRE;
    private javax.swing.JLabel jlN_DE_CLIENTE;
    private javax.swing.JLabel jlTELEFONO1;
    private javax.swing.JRadioButton jrbACTIVO;
    private javax.swing.JTextField jtNCliente;
    private javax.swing.JTextField jtexto_Apellido;
    private javax.swing.JTextField jtexto_ContactoA;
    private javax.swing.JTextField jtexto_Direccion;
    private javax.swing.JTextField jtexto_Nombre;
    private javax.swing.JTextField jtexto_Telefono;
    private javax.swing.JTextField jtexto_dni;
    // End of variables declaration//GEN-END:variables
}
