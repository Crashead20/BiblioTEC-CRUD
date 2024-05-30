package Vistas;

import Config.Conexion;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class MenuPrestamo extends javax.swing.JFrame {
    
    Conexion con = new Conexion();
    Connection cn;
    Statement st;
    ResultSet rs;
    DefaultTableModel modelo1;
    int id;
    
    
    public MenuPrestamo() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        //LISTAMOS TABLAS AL INICIAR CON EL PROGRAMA
        listarPrestamos();
 
    }
      
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnInsertar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnSeccionLibros = new javax.swing.JButton();
        btnSeccionUsuarios = new javax.swing.JButton();
        btnSeccionPrestamos = new javax.swing.JButton();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePrestamos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel46 = new javax.swing.JLabel();
        jtfIdPrestamo = new javax.swing.JTextField();
        btnAgregarUsuario = new javax.swing.JButton();
        btnEliminarUsuario = new javax.swing.JButton();
        btnModificarUsuario = new javax.swing.JButton();
        jLabel45 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jtfFechaPrestamo = new javax.swing.JTextField();
        jLabel48 = new javax.swing.JLabel();
        jtfFechaEntrega = new javax.swing.JTextField();
        jLabel49 = new javax.swing.JLabel();
        jtfObservacion = new javax.swing.JTextField();
        jLabel50 = new javax.swing.JLabel();
        jtfPrestatario = new javax.swing.JTextField();
        jLabel51 = new javax.swing.JLabel();
        jtfLibroPrestado = new javax.swing.JTextField();
        jLabel52 = new javax.swing.JLabel();
        jtfPrecioMulta = new javax.swing.JTextField();

        btnInsertar.setBackground(new java.awt.Color(18, 188, 85));
        btnInsertar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnInsertar.setForeground(new java.awt.Color(243, 241, 229));
        btnInsertar.setText("Inicia Sesion");
        btnInsertar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(243, 241, 229), 2));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(243, 241, 229));

        jPanel2.setBackground(new java.awt.Color(129, 255, 131));

        btnSeccionLibros.setBackground(new java.awt.Color(18, 188, 85));
        btnSeccionLibros.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnSeccionLibros.setForeground(new java.awt.Color(243, 241, 229));
        btnSeccionLibros.setText("Libros");
        btnSeccionLibros.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(243, 241, 229), 2));
        btnSeccionLibros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeccionLibrosActionPerformed(evt);
            }
        });

        btnSeccionUsuarios.setBackground(new java.awt.Color(18, 188, 85));
        btnSeccionUsuarios.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnSeccionUsuarios.setForeground(new java.awt.Color(243, 241, 229));
        btnSeccionUsuarios.setText("Usuarios");
        btnSeccionUsuarios.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(243, 241, 229), 2));
        btnSeccionUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeccionUsuariosActionPerformed(evt);
            }
        });

        btnSeccionPrestamos.setBackground(new java.awt.Color(204, 153, 255));
        btnSeccionPrestamos.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnSeccionPrestamos.setForeground(new java.awt.Color(243, 241, 229));
        btnSeccionPrestamos.setText("Prestamos");
        btnSeccionPrestamos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(243, 241, 229), 2));
        btnSeccionPrestamos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeccionPrestamosActionPerformed(evt);
            }
        });

        jTablePrestamos.setBackground(new java.awt.Color(243, 241, 229));
        jTablePrestamos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(243, 241, 229), 2));
        jTablePrestamos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "IdPrestamo", "Fecha Prestamo", "Fecha Entrega", "Observacion", "Prestatario", "Libro Prestado", "Precio Multa"
            }
        ));
        jTablePrestamos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablePrestamosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTablePrestamos);

        jDesktopPane1.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 950, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 566, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(btnSeccionLibros, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnSeccionUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnSeccionPrestamos, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jDesktopPane1)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSeccionLibros, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSeccionUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSeccionPrestamos, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel1.setBackground(new java.awt.Color(243, 241, 229));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 50)); // NOI18N
        jLabel1.setText("Menu Principal / Prestamos");
        jLabel1.setOpaque(true);
        jLabel1.setPreferredSize(new java.awt.Dimension(840, 50));

        jPanel3.setBackground(new java.awt.Color(129, 255, 131));

        jLabel46.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel46.setText("Id Prestamo:");

        jtfIdPrestamo.setEditable(false);
        jtfIdPrestamo.setBackground(new java.awt.Color(243, 241, 229));
        jtfIdPrestamo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        btnAgregarUsuario.setBackground(new java.awt.Color(18, 188, 85));
        btnAgregarUsuario.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnAgregarUsuario.setForeground(new java.awt.Color(243, 241, 229));
        btnAgregarUsuario.setText("Agregar");
        btnAgregarUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(243, 241, 229), 2));
        btnAgregarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarUsuarioActionPerformed(evt);
            }
        });

        btnEliminarUsuario.setBackground(new java.awt.Color(18, 188, 85));
        btnEliminarUsuario.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnEliminarUsuario.setForeground(new java.awt.Color(243, 241, 229));
        btnEliminarUsuario.setText("Eliminar");
        btnEliminarUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(243, 241, 229), 2));
        btnEliminarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarUsuarioActionPerformed(evt);
            }
        });

        btnModificarUsuario.setBackground(new java.awt.Color(18, 188, 85));
        btnModificarUsuario.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnModificarUsuario.setForeground(new java.awt.Color(243, 241, 229));
        btnModificarUsuario.setText("Modificar");
        btnModificarUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(243, 241, 229), 2));
        btnModificarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarUsuarioActionPerformed(evt);
            }
        });

        jLabel45.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel45.setText("Edicion Prestamos:");

        jLabel47.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel47.setText("Fecha Prestamo:");

        jtfFechaPrestamo.setBackground(new java.awt.Color(243, 241, 229));
        jtfFechaPrestamo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jtfFechaPrestamo.setName(""); // NOI18N

        jLabel48.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel48.setText("Fecha Entrega:");

        jtfFechaEntrega.setBackground(new java.awt.Color(243, 241, 229));
        jtfFechaEntrega.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jLabel49.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel49.setText("Observacion:");

        jtfObservacion.setBackground(new java.awt.Color(243, 241, 229));
        jtfObservacion.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jLabel50.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel50.setText("Prestatario:");

        jtfPrestatario.setBackground(new java.awt.Color(243, 241, 229));
        jtfPrestatario.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jLabel51.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel51.setText("Libro Prestado:");

        jtfLibroPrestado.setBackground(new java.awt.Color(243, 241, 229));
        jtfLibroPrestado.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jLabel52.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel52.setText("Precio Multa:");

        jtfPrecioMulta.setBackground(new java.awt.Color(243, 241, 229));
        jtfPrecioMulta.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(156, 156, 156)
                .addComponent(jLabel45)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(btnAgregarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnModificarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(52, 52, 52)
                                .addComponent(btnEliminarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, Short.MAX_VALUE)
                                .addComponent(jtfIdPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel48, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel47, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel49, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel50, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel51, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel52, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jtfPrecioMulta, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jtfFechaPrestamo)
                                    .addComponent(jtfPrestatario)
                                    .addComponent(jtfLibroPrestado, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jtfFechaEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jtfObservacion, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(73, 73, 73))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel45)
                .addGap(37, 37, 37)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfIdPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel46))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel47)
                    .addComponent(jtfFechaPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel48)
                    .addComponent(jtfFechaEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfObservacion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel49))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel50)
                    .addComponent(jtfPrestatario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel51)
                    .addComponent(jtfLibroPrestado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel52)
                    .addComponent(jtfPrecioMulta, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModificarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(95, 95, 95))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 790, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(83, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSeccionLibrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeccionLibrosActionPerformed
        MenuLibros menuLibros = new MenuLibros();
        menuLibros.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnSeccionLibrosActionPerformed

    private void btnSeccionUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeccionUsuariosActionPerformed
        MenuUsuarios  menuUsuarios = new MenuUsuarios();
        menuUsuarios.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnSeccionUsuariosActionPerformed

    private void btnSeccionPrestamosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeccionPrestamosActionPerformed

    }//GEN-LAST:event_btnSeccionPrestamosActionPerformed

    private void jTablePrestamosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablePrestamosMouseClicked
        int row = jTablePrestamos.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(null, "No se Selecciono");
        } else {
            id = Integer.parseInt((String) jTablePrestamos.getValueAt(row, 0).toString());
            String fechaPrestamo = (String) jTablePrestamos.getValueAt(row, 1);
            String fechaEntrega = (String) jTablePrestamos.getValueAt(row, 2);
            String observacion = (String) jTablePrestamos.getValueAt(row, 3);
            String prestatario = (String) jTablePrestamos.getValueAt(row, 4);
            String libroPrestado = (String) jTablePrestamos.getValueAt(row, 5);
            String precioMulta = (String) jTablePrestamos.getValueAt(row, 6);
            jtfIdPrestamo.setText("" + id);
            jtfFechaPrestamo.setText(fechaPrestamo);
            jtfFechaEntrega.setText(fechaEntrega);
            jtfObservacion.setText(observacion);
            jtfPrestatario.setText(prestatario);
            jtfLibroPrestado.setText(libroPrestado);
            jtfPrecioMulta.setText(precioMulta);

        }
    }//GEN-LAST:event_jTablePrestamosMouseClicked

    private void btnModificarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarUsuarioActionPerformed
        Modificar();
        listarPrestamos();
        nuevo();
    }//GEN-LAST:event_btnModificarUsuarioActionPerformed

    private void btnEliminarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarUsuarioActionPerformed
        Eliminar();
        listarPrestamos();
        nuevo();
    }//GEN-LAST:event_btnEliminarUsuarioActionPerformed

    private void btnAgregarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarUsuarioActionPerformed
        Agregar();
        listarPrestamos();
        nuevo();
    }//GEN-LAST:event_btnAgregarUsuarioActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrestamo().setVisible(true);
            }
        });
    }
    //LISTAR TABLAS PRINCIPALES
    void listarPrestamos() {
        String sql = "select * from prestamos";
        try {
            cn = con.getConnection();
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            Object[] prestamos = new Object[7]; 
            modelo1=(DefaultTableModel) jTablePrestamos.getModel();
            while (rs.next()) {
                prestamos[0] = rs.getInt("id_prestamo");
                prestamos[1] = rs.getString("fechaPrestamo");
                prestamos[2] = rs.getString("fechaEntrega");
                prestamos[3] = rs.getString("observacion");
                prestamos[4] = rs.getString("prestatario");
                prestamos[5] = rs.getString("libroPrestado");
                prestamos[6] = rs.getString("precioMulta");
                modelo1.addRow(prestamos);
            }
          jTablePrestamos.setModel(modelo1);

        } catch (Exception e) {
        }
    }
    //Agregar los elementos de los espacios
    void Agregar() {
        String fechaPrestamo = jtfFechaPrestamo.getText();
        String fechaEntrega = jtfFechaEntrega.getText();
        String observacion = jtfObservacion.getText();
        String prestatario = jtfPrestatario.getText();
        String libroPrestado = jtfLibroPrestado.getText();
        String precioMulta = jtfPrecioMulta.getText();
        try {
            if (fechaPrestamo.equals("") || fechaEntrega.equals("") || observacion.equals("") || prestatario.equals("") || libroPrestado.equals("") || precioMulta.equals("")) {
                JOptionPane.showMessageDialog(null, "Debe Ingresar Datos");
                limpiarTabla(modelo1);               
            } else {
                String sql = "insert into prestamos(fechaPrestamo,fechaEntrega,observacion,prestatario,libroPrestado,precioMulta) "
                        + "values('" + fechaPrestamo + "','" + fechaEntrega + "','" + observacion + "','" + prestatario + "','" + libroPrestado + "','" + precioMulta + "')";
                cn = con.getConnection();
                st = cn.createStatement();
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Prestamo Registrado con Exito");
                limpiarTabla(modelo1);   
            }
        } catch (Exception e) {
        }
    }
    
    //FUNCION MODIFICAR CON ELEMENTO SELECCIONADO DE LA TABLA
    void Modificar() {
        String fechaPrestamo = jtfFechaPrestamo.getText();
        String fechaEntrega = jtfFechaEntrega.getText();
        String observacion = jtfObservacion.getText();
        String prestatario = jtfPrestatario.getText();
        String libroPrestado = jtfLibroPrestado.getText();
        String precioMulta = jtfPrecioMulta.getText();
        String sql = "update prestamos set fechaPrestamo='" + fechaPrestamo + "',fechaEntrega='" + fechaEntrega + "',observacion='" + observacion + "' ,prestatario='" + prestatario +
                "' ,libroPrestado='" + libroPrestado + "',precioMulta='" + precioMulta + "'  where id_prestamo=" + id;
        try {
            if (fechaPrestamo != null || fechaEntrega != null || observacion != null || prestatario != null || libroPrestado != null || precioMulta != null) {
                cn = con.getConnection();
                st = cn.createStatement();
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Prestamo Modificado");
                limpiarTabla(modelo1);
                
            } else {
                JOptionPane.showMessageDialog(null, "Error...!!!");
            }

        } catch (Exception e) {
        }

    }
    
    void Eliminar() {
        String sql = "delete from prestamos where id_prestamo=" + id;        
        int fila = jTablePrestamos.getSelectedRow();
        if (fila < 0) {
            JOptionPane.showMessageDialog(null,"Prestamo no Seleccionado");
        } else {
                try {
                    cn = con.getConnection();
                    st = cn.createStatement();
                    st.executeUpdate(sql);
                    JOptionPane.showMessageDialog(null, "Prestamo Eliminado");
                    limpiarTabla(modelo1);
                    
                } catch (Exception e) {
                }
               
        }

    }
    
    //Limpiar la tabla para volverla a listar
    void limpiarTabla(DefaultTableModel model) {
        for (int i = 0; i <jTablePrestamos.getRowCount(); i++) {
            model.removeRow(i);
            i = i - 1;
        }

    }
    
     void nuevo() {
        jtfIdPrestamo.setText("");
        jtfFechaPrestamo.setText("");
        jtfFechaEntrega.setText("");
        jtfObservacion.setText("");
        jtfPrestatario.setText("");
        jtfLibroPrestado.setText("");
        jtfPrecioMulta.setText("");
        jtfFechaPrestamo.requestFocus();
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarUsuario;
    private javax.swing.JButton btnEliminarUsuario;
    private javax.swing.JButton btnInsertar;
    private javax.swing.JButton btnModificarUsuario;
    private javax.swing.JButton btnSeccionLibros;
    private javax.swing.JButton btnSeccionPrestamos;
    private javax.swing.JButton btnSeccionUsuarios;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTablePrestamos;
    private javax.swing.JTextField jtfFechaEntrega;
    private javax.swing.JTextField jtfFechaPrestamo;
    private javax.swing.JTextField jtfIdPrestamo;
    private javax.swing.JTextField jtfLibroPrestado;
    private javax.swing.JTextField jtfObservacion;
    private javax.swing.JTextField jtfPrecioMulta;
    private javax.swing.JTextField jtfPrestatario;
    // End of variables declaration//GEN-END:variables
}
