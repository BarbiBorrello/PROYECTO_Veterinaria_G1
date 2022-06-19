package VISTAS;

import static VISTAS.Menu_PRINCIPAL_VETERINARIA.escritorio;
import veterinaria_MODELO.Cliente;
import veterinaria_MODELO.Mascota;
import java.awt.Graphics;
import java.awt.Image;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import veterinaria_MODELO.Visita;

public class Ficha_MASCOTA extends javax.swing.JInternalFrame {

    public Ficha_MASCOTA() {
        initComponents();
        jLabel4.setVisible(false);
        jLabel5.setVisible(false);
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
        jPanel1 = new javax.swing.JPanel() {
            String str="/IMAGENES/fondo_MASCOTA.png";
            ImageIcon icon = new ImageIcon(getClass().getResource(str));
            Image image = icon.getImage();

            public void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(image, 0, 0,getWidth(),getHeight(), this);
            }

        };
        jSeparator1 = new javax.swing.JSeparator();
        jlALIAS = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jlNOMBRE = new javax.swing.JLabel();
        jlCONTACTO_ALTERNATIVO = new javax.swing.JLabel();
        jlAPELLIDO2 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLBuscarMascota = new javax.swing.JLabel();
        jlN_DE_CLIENTE1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jlCONTACTO_ALTERNATIVO1 = new javax.swing.JLabel();
        jlALIAS1 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jlAPELLIDO3 = new javax.swing.JLabel();
        jlAPELLIDO4 = new javax.swing.JLabel();
        jlAPELLIDO5 = new javax.swing.JLabel();
        jlAPELLIDO6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jtNPaciente = new javax.swing.JTextField();
        jtAlias = new javax.swing.JTextField();
        jtDNIDuenio = new javax.swing.JTextField();
        jtEspecie = new javax.swing.JTextField();
        jtRaza = new javax.swing.JTextField();
        jtSexo = new javax.swing.JTextField();
        jtPelaje = new javax.swing.JTextField();
        jtPesoActual = new javax.swing.JTextField();
        jtPesoPromedio = new javax.swing.JTextField();
        jtEdad = new javax.swing.JTextField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableVisitas = new javax.swing.JTable();

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

        setPreferredSize(new java.awt.Dimension(700, 700));

        jPanel1.setPreferredSize(new java.awt.Dimension(700, 700));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 580, 20));

        jlALIAS.setBackground(new java.awt.Color(255, 255, 255));
        jlALIAS.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlALIAS.setForeground(new java.awt.Color(255, 255, 255));
        jlALIAS.setText("DUEÑO:");
        jPanel1.add(jlALIAS, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 160, -1, -1));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 580, 10));

        jlNOMBRE.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jlNOMBRE.setForeground(new java.awt.Color(255, 255, 255));
        jlNOMBRE.setText("Raza:");
        jPanel1.add(jlNOMBRE, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 70, 20));

        jlCONTACTO_ALTERNATIVO.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jlCONTACTO_ALTERNATIVO.setForeground(new java.awt.Color(255, 255, 255));
        jlCONTACTO_ALTERNATIVO.setText("F. Nac:");
        jPanel1.add(jlCONTACTO_ALTERNATIVO, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 90, 20));

        jlAPELLIDO2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jlAPELLIDO2.setForeground(new java.awt.Color(255, 255, 255));
        jlAPELLIDO2.setText("Edad :");
        jPanel1.add(jlAPELLIDO2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 300, 90, 20));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, 590, 10));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 0, 204));
        jLabel1.setText("Ultima visita :");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 380, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/close.png"))); // NOI18N
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 90, 60, 50));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/add.png"))); // NOI18N
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, 60, 50));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/delete.png"))); // NOI18N
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, 60, 50));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/edit.png"))); // NOI18N
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 90, 60, 50));

        jLBuscarMascota.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/search.png"))); // NOI18N
        jLBuscarMascota.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLBuscarMascota.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLBuscarMascotaMouseClicked(evt);
            }
        });
        jPanel1.add(jLBuscarMascota, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 60, 50));

        jlN_DE_CLIENTE1.setBackground(new java.awt.Color(255, 255, 255));
        jlN_DE_CLIENTE1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlN_DE_CLIENTE1.setForeground(new java.awt.Color(255, 255, 255));
        jlN_DE_CLIENTE1.setText("N°  de Paciente:");
        jPanel1.add(jlN_DE_CLIENTE1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/clear.png"))); // NOI18N
        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        jLabel7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jLabel7KeyTyped(evt);
            }
        });
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 90, 60, 50));

        jlCONTACTO_ALTERNATIVO1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jlCONTACTO_ALTERNATIVO1.setForeground(new java.awt.Color(255, 255, 255));
        jlCONTACTO_ALTERNATIVO1.setText("Sexo:");
        jPanel1.add(jlCONTACTO_ALTERNATIVO1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 50, 20));

        jlALIAS1.setBackground(new java.awt.Color(255, 255, 255));
        jlALIAS1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlALIAS1.setForeground(new java.awt.Color(255, 255, 255));
        jlALIAS1.setText("ALIAS:");
        jPanel1.add(jlALIAS1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, -1, -1));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 630, 20));

        jlAPELLIDO3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jlAPELLIDO3.setForeground(new java.awt.Color(255, 255, 255));
        jlAPELLIDO3.setText("Especie:");
        jPanel1.add(jlAPELLIDO3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 70, 20));

        jlAPELLIDO4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jlAPELLIDO4.setForeground(new java.awt.Color(255, 255, 255));
        jlAPELLIDO4.setText("Color pelaje :");
        jPanel1.add(jlAPELLIDO4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 210, 90, 20));

        jlAPELLIDO5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jlAPELLIDO5.setForeground(new java.awt.Color(255, 255, 255));
        jlAPELLIDO5.setText("Peso actual :");
        jPanel1.add(jlAPELLIDO5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, 90, 20));

        jlAPELLIDO6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jlAPELLIDO6.setForeground(new java.awt.Color(255, 255, 255));
        jlAPELLIDO6.setText("Peso Prom  :");
        jPanel1.add(jlAPELLIDO6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 270, 90, 20));

        jLabel8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 210, 220, 110));

        jRadioButton1.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton1.setText("Fallecido");
        jRadioButton1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jRadioButton1.setEnabled(false);
        jPanel1.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 340, 80, 20));

        jtNPaciente.setEnabled(false);
        jPanel1.add(jtNPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 70, -1));
        jPanel1.add(jtAlias, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 160, 90, -1));
        jPanel1.add(jtDNIDuenio, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 160, 80, -1));
        jPanel1.add(jtEspecie, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 90, -1));
        jPanel1.add(jtRaza, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, 90, -1));
        jPanel1.add(jtSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, 90, -1));
        jPanel1.add(jtPelaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 210, 80, -1));
        jPanel1.add(jtPesoActual, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 240, 80, -1));
        jPanel1.add(jtPesoPromedio, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 270, 80, -1));
        jPanel1.add(jtEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 300, 80, -1));
        jPanel1.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 300, -1, -1));

        jTableVisitas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null}
            },
            new String [] {
                "Visita N°  ", "Tratamiento", "Fecha ", "Peso", "Descripcion ", "Precios"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Object.class, java.lang.Double.class, java.lang.String.class, java.lang.Double.class
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
        jTableVisitas.setRowHeight(20);
        jScrollPane3.setViewportView(jTableVisitas);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 630, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 504, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel7KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel7KeyTyped
        limpiarFormulario();
    }//GEN-LAST:event_jLabel7KeyTyped

    private void jLBuscarMascotaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLBuscarMascotaMouseClicked
        /* show the option dialog that ask  search method by alias or id_mascota */

        int result = JOptionPane.showOptionDialog(this, "¿Qué desea buscar?", "Buscar", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, new String[]{"Por alias", "Por número de identificación"}, "Por alias");
        if (result == 0) {
            /* search by alias */
            String alias = JOptionPane.showInputDialog(this, "Ingrese el alias de la mascota");
            if (alias != null) {
                List<Mascota> mascotas = Menu_PRINCIPAL_VETERINARIA.md.buscarMascotaxALIAS(alias);
                if (mascotas != null) {
                    /* show JPanel with a combobox */
                    JPanel panel = new JPanel();
                    JComboBox<Mascota> comboBox = new JComboBox<>();
                    for (Mascota mascota : mascotas) {
                        comboBox.addItem(mascota);
                    }
                    panel.add(comboBox);
                    JOptionPane.showMessageDialog(this, panel, "Seleccione una mascota", JOptionPane.QUESTION_MESSAGE);
                    Mascota mascota = (Mascota) comboBox.getSelectedItem();

                    if (mascota != null) {
                        cargarFormularioConMascota(mascota);
                        cargarUltimaVisita(mascota);
                        jLabel4.setVisible(true);
                        jLabel5.setVisible(true);
                    }

                } else {
                    JOptionPane.showMessageDialog(this, "No se encontraron mascotas");
                }
            } else {
                JOptionPane.showMessageDialog(this, "No se ingresó el alias");
            }
        } else if (result == 1) {
            /* search by id_mascota */
            String id_mascota = JOptionPane.showInputDialog(this, "Ingrese el número de identificación de la mascota");
            if (id_mascota != null) {
                Mascota mascota = Menu_PRINCIPAL_VETERINARIA.md.buscarMascota(Integer.parseInt(id_mascota));
                if (mascota != null) {
                    cargarFormularioConMascota(mascota);
                    cargarUltimaVisita(mascota);
                    jLabel4.setVisible(true);
                    jLabel5.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(this, "No se encontró la mascota");
                }
            } else {
                JOptionPane.showMessageDialog(this, "No se ingresó el número de identificación");
            }
        }
    }//GEN-LAST:event_jLBuscarMascotaMouseClicked

    private void cargarUltimaVisita(Mascota mascota) {
        List<Visita> listarVisitas = Menu_PRINCIPAL_VETERINARIA.vd.buscarVisitaxFecha(mascota);
        DefaultTableModel model = (DefaultTableModel) jTableVisitas.getModel();
        model.setRowCount(0); // BORRA TODAS LAS LINEAS Y VUELVE A 0//
        if (listarVisitas != null) {
            Visita visita = listarVisitas.get(0);
            model.addRow(new Object[]{
                visita.getIdvisita(),
                visita.getTratamiento(),
                visita.getFecha_visita(),
                visita.getPeso(),
                visita.getTratamiento().getTipo_tratamiento(),
                visita.getTratamiento().getPrecio()
            });
        }

    }

    private void cargarFormularioConMascota(Mascota mascota) {
        limpiarFormulario();
        jtNPaciente.setText(Integer.toString(mascota.getId_mascota()));
        jtAlias.setText(mascota.getAlias());
        jtDNIDuenio.setText(Long.toString(mascota.getCliente().getDni()));
        jtEspecie.setText(mascota.getEspecie());
        jtRaza.setText(mascota.getRaza());
        jtSexo.setText(mascota.getSexo());
        jtPelaje.setText(mascota.getColor_pelaje());
        jtPesoActual.setText(String.valueOf(mascota.getPeso_actual()));
        jtPesoPromedio.setText(String.valueOf(mascota.getPeso_promedio()));
        jtEdad.setText(Menu_PRINCIPAL_VETERINARIA.md.calcularEdad(mascota.getFecha_nac()));
        jDateChooser1.setDate(Date.from(mascota.getFecha_nac().atStartOfDay(ZoneId.systemDefault()).toInstant()));
        jRadioButton1.setSelected(!mascota.isActivo());
    }

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        limpiarFormulario();
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        if (validarFormulario()) {
            Mascota mascota = crearUnaMascotaDesdeElForm();
            Mascota checkeo = Menu_PRINCIPAL_VETERINARIA.md.buscarMascota(Integer.parseInt(jtNPaciente.getText()));
            
            if (((mascota.getCliente().getDni() == checkeo.getCliente().getDni()) && (mascota.getAlias() == checkeo.getAlias()) && (mascota.getEspecie() == checkeo.getEspecie()))) {
                Menu_PRINCIPAL_VETERINARIA.md.agregar_Mascota(mascota);
                jtNPaciente.setText(Integer.toString(mascota.getId_mascota()));
            } else {
                JOptionPane.showMessageDialog(this, "La mascota que intenta Agregar, tiene igual nombre, especie y dueño, revise los Datos");
            }
        }
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        if (validarFormulario()) {
            Mascota mascota = crearUnaMascotaDesdeElForm();
            mascota.setId_mascota(Integer.parseInt(jtNPaciente.getText()));
            mascota.setActivo(false);
            Menu_PRINCIPAL_VETERINARIA.md.borrarMascota(mascota.getId_mascota());
            cargarFormularioConMascota(mascota);
        }
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        if (validarFormulario()) {
            Mascota mascota = crearUnaMascotaDesdeElForm();
            Menu_PRINCIPAL_VETERINARIA.md.modificarMascota(Integer.parseInt(jtNPaciente.getText()), mascota);
            cargarFormularioConMascota(mascota);
        }
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private boolean validarFormulario() {

        if (jtAlias.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "El campo Alias no puede estar vacio");
            jtAlias.requestFocus();
            return false;

        } else if (jtDNIDuenio.getText().isEmpty()) {
            // show choose dialog to decide if user wants to create a new client or not
            JOptionPane.showMessageDialog(this, "El campo DNI no puede estar vacio");
            jtDNIDuenio.requestFocus();
            return false;
        } else if (Menu_PRINCIPAL_VETERINARIA.cd.buscarClientexDNI(Long.parseLong(jtDNIDuenio.getText())) == null) {
            int option = JOptionPane.showConfirmDialog(this, "El cliente no existe, ¿Desea crearlo?", "Crear cliente", JOptionPane.YES_NO_OPTION);
            if (option == JOptionPane.YES_OPTION) {
                Menu_PRINCIPAL_VETERINARIA.mostrarFichaCliente();
            } else {
                JOptionPane.showMessageDialog(this, "Cliente no creado");
            }
            return false;

        } else if (jtEspecie.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "El campo Especie no puede estar vacio");
            jtEspecie.requestFocus();
            return false;
        } else if (jtRaza.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "El campo Raza no puede estar vacio");
            jtRaza.requestFocus();
            return false;
        } else if (jtSexo.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "El campo Sexo no puede estar vacio");
            jtSexo.requestFocus();
            return false;
        } else if (jtPelaje.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "El campo Color de Pelaje no puede estar vacio");
            jtPelaje.requestFocus();
            return false;
        } else if (jtPesoActual.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "El campo Peso Actual no puede estar vacio");
            jtPesoActual.requestFocus();
            return false;
        } else if (jtPesoPromedio.getText().isEmpty()) {
            jtPesoPromedio.setText(jtPesoActual.getText());
            return true;
        } else if (jDateChooser1.getDate() == null) {
            JOptionPane.showMessageDialog(this, "El campo Fecha de Nacimiento no puede estar vacio");
            return false;
        } else if (jtEdad.getText().isEmpty()) {
            jtEdad.setText(Menu_PRINCIPAL_VETERINARIA.md.calcularEdad(jDateChooser1.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate()));
        }
        return true;
    }

    private Mascota crearUnaMascotaDesdeElForm() {
        Mascota mascota = new Mascota();
        //String alias, String sexo, String especie, String raza, String color_pelaje, LocalDate fecha_nac, double peso_actual, double peso_promedio, boolean activo, Cliente cliente
        mascota.setAlias(jtAlias.getText());
        mascota.setSexo(jtSexo.getText());
        mascota.setEspecie(jtEspecie.getText());
        mascota.setRaza(jtRaza.getText());
        mascota.setColor_pelaje(jtPelaje.getText());
        mascota.setFecha_nac(jDateChooser1.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
        mascota.setPeso_actual(Double.parseDouble(jtPesoActual.getText()));
        mascota.setPeso_promedio(Double.parseDouble(jtPesoPromedio.getText()));
        mascota.setActivo(true);
        mascota.setCliente(Menu_PRINCIPAL_VETERINARIA.cd.buscarClientexDNI(Long.parseLong(jtDNIDuenio.getText())));
        return mascota;
    }

    private void limpiarFormulario() {
        jtNPaciente.setText("");
        jtAlias.setText("");
        jtDNIDuenio.setText("");
        jtEspecie.setText("");
        jtRaza.setText("");
        jtSexo.setText("");
        jtPelaje.setText("");
        jtPesoActual.setText("");
        jtPesoPromedio.setText("");
        jtEdad.setText("");
        jDateChooser1.setDate(null);
        jRadioButton1.setSelected(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLBuscarMascota;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTableVisitas;
    private javax.swing.JLabel jlALIAS;
    private javax.swing.JLabel jlALIAS1;
    private javax.swing.JLabel jlAPELLIDO2;
    private javax.swing.JLabel jlAPELLIDO3;
    private javax.swing.JLabel jlAPELLIDO4;
    private javax.swing.JLabel jlAPELLIDO5;
    private javax.swing.JLabel jlAPELLIDO6;
    private javax.swing.JLabel jlCONTACTO_ALTERNATIVO;
    private javax.swing.JLabel jlCONTACTO_ALTERNATIVO1;
    private javax.swing.JLabel jlNOMBRE;
    private javax.swing.JLabel jlN_DE_CLIENTE1;
    private javax.swing.JTextField jtAlias;
    private javax.swing.JTextField jtDNIDuenio;
    private javax.swing.JTextField jtEdad;
    private javax.swing.JTextField jtEspecie;
    private javax.swing.JTextField jtNPaciente;
    private javax.swing.JTextField jtPelaje;
    private javax.swing.JTextField jtPesoActual;
    private javax.swing.JTextField jtPesoPromedio;
    private javax.swing.JTextField jtRaza;
    private javax.swing.JTextField jtSexo;
    // End of variables declaration//GEN-END:variables
}
