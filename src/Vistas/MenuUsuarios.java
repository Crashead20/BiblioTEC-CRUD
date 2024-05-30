package Vistas;

import Config.Conexion;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class MenuUsuarios extends javax.swing.JFrame {
    
    Conexion con = new Conexion();
    Connection cn;
    Statement st;
    ResultSet rs;
    DefaultTableModel modelo1;
    int id;
    
    
    public MenuUsuarios() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        //LISTAMOS TABLAS AL INICIAR CON EL PROGRAMA
        listarUsuarios();
 
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
        jTableUsuarios = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jtfIdUsuario = new javax.swing.JTextField();
        btnAgregarUsuario = new javax.swing.JButton();
        btnEliminarUsuario = new javax.swing.JButton();
        btnModificarUsuario = new javax.swing.JButton();
        jLabel47 = new javax.swing.JLabel();
        jtfNombre = new javax.swing.JTextField();
        jLabel48 = new javax.swing.JLabel();
        jtfEdad = new javax.swing.JTextField();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jtfPrestamoA = new javax.swing.JTextField();
        jtfTelefono = new javax.swing.JTextField();
        jtfDireccion = new javax.swing.JTextField();

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

        btnSeccionUsuarios.setBackground(new java.awt.Color(204, 102, 255));
        btnSeccionUsuarios.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnSeccionUsuarios.setForeground(new java.awt.Color(243, 241, 229));
        btnSeccionUsuarios.setText("Usuarios");
        btnSeccionUsuarios.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(243, 241, 229), 2));
        btnSeccionUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeccionUsuariosActionPerformed(evt);
            }
        });

        btnSeccionPrestamos.setBackground(new java.awt.Color(18, 188, 85));
        btnSeccionPrestamos.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnSeccionPrestamos.setForeground(new java.awt.Color(243, 241, 229));
        btnSeccionPrestamos.setText("Prestamos");
        btnSeccionPrestamos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(243, 241, 229), 2));
        btnSeccionPrestamos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeccionPrestamosActionPerformed(evt);
            }
        });

        jTableUsuarios.setBackground(new java.awt.Color(243, 241, 229));
        jTableUsuarios.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(243, 241, 229), 2));
        jTableUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "IdUsuario", "Nombre", "Edad", "Direccion", "Telefono", "Prestamo Activo"
            }
        ));
        jTableUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableUsuariosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableUsuarios);
        if (jTableUsuarios.getColumnModel().getColumnCount() > 0) {
            jTableUsuarios.getColumnModel().getColumn(0).setMinWidth(80);
            jTableUsuarios.getColumnModel().getColumn(0).setPreferredWidth(80);
            jTableUsuarios.getColumnModel().getColumn(0).setMaxWidth(50);
        }

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
        jLabel1.setText("Menu Principal / Usuarios");
        jLabel1.setOpaque(true);
        jLabel1.setPreferredSize(new java.awt.Dimension(840, 50));

        jPanel3.setBackground(new java.awt.Color(129, 255, 131));

        jLabel45.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel45.setText("Edicion Usuarios:");

        jLabel46.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel46.setText("Id Usuario:");

        jtfIdUsuario.setEditable(false);
        jtfIdUsuario.setBackground(new java.awt.Color(243, 241, 229));
        jtfIdUsuario.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

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

        jLabel47.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel47.setText("Nombre:");

        jtfNombre.setBackground(new java.awt.Color(243, 241, 229));
        jtfNombre.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jLabel48.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel48.setText("Edad:");

        jtfEdad.setBackground(new java.awt.Color(243, 241, 229));
        jtfEdad.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jLabel49.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel49.setText("Direccion:");

        jLabel50.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel50.setText("Telefono:");

        jLabel51.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel51.setText("Prestamo Activo:");

        jtfPrestamoA.setBackground(new java.awt.Color(243, 241, 229));
        jtfPrestamoA.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jtfTelefono.setBackground(new java.awt.Color(243, 241, 229));
        jtfTelefono.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jtfDireccion.setBackground(new java.awt.Color(243, 241, 229));
        jtfDireccion.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel45)
                        .addGap(82, 82, 82))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(btnAgregarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnModificarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(52, 52, 52)
                                .addComponent(btnEliminarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel50, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel47, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel48, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel49, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel51, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel46, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, Short.MAX_VALUE)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jtfIdUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)
                                    .addComponent(jtfNombre)
                                    .addComponent(jtfEdad)
                                    .addComponent(jtfDireccion)
                                    .addComponent(jtfTelefono)
                                    .addComponent(jtfPrestamoA))))))
                .addGap(73, 73, 73))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel45)
                .addGap(40, 40, 40)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfIdUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel46))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel47)
                    .addComponent(jtfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel48)
                    .addComponent(jtfEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel49))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel50)
                    .addComponent(jtfTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel51)
                    .addComponent(jtfPrestamoA, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
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
        
    }//GEN-LAST:event_btnSeccionUsuariosActionPerformed

    private void btnSeccionPrestamosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeccionPrestamosActionPerformed
        MenuPrestamo  menuPrestamos = new MenuPrestamo();
        menuPrestamos.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnSeccionPrestamosActionPerformed

    private void btnAgregarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarUsuarioActionPerformed
        Agregar();
        listarUsuarios();
        nuevo();
    }//GEN-LAST:event_btnAgregarUsuarioActionPerformed

    private void btnEliminarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarUsuarioActionPerformed
        Eliminar();
        listarUsuarios();
        nuevo();
    }//GEN-LAST:event_btnEliminarUsuarioActionPerformed

    private void btnModificarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarUsuarioActionPerformed
        Modificar();
        listarUsuarios();
        nuevo();
    }//GEN-LAST:event_btnModificarUsuarioActionPerformed

    private void jTableUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableUsuariosMouseClicked
        int row = jTableUsuarios.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(null, "No se Selecciono");
        } else {
            id = Integer.parseInt((String) jTableUsuarios.getValueAt(row, 0).toString());
            String nombre = (String) jTableUsuarios.getValueAt(row, 1);
            String edad = (String) jTableUsuarios.getValueAt(row, 2);
            String direccion = (String) jTableUsuarios.getValueAt(row, 3);
            String telefono = (String) jTableUsuarios.getValueAt(row, 4);
            String prestamoA = (String) jTableUsuarios.getValueAt(row, 5);
            jtfIdUsuario.setText("" + id);
            jtfNombre.setText(nombre);
            jtfEdad.setText(edad);
            jtfDireccion.setText(direccion);
            jtfTelefono.setText(telefono);
            jtfPrestamoA.setText(prestamoA);
        }
    }//GEN-LAST:event_jTableUsuariosMouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuUsuarios().setVisible(true);
            }
        });
    }
    //LISTAR TABLAS PRINCIPALES
    void listarUsuarios() {
        String sql = "select * from usuarios";
        try {
            cn = con.getConnection();
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            Object[] usuarios = new Object[6]; 
            modelo1=(DefaultTableModel) jTableUsuarios.getModel();
            while (rs.next()) {
                usuarios[0] = rs.getInt("id_usuario");
                usuarios[1] = rs.getString("nombreUsuario");
                usuarios[2] = rs.getString("edad");
                usuarios[3] = rs.getString("direccion");
                usuarios[4] = rs.getString("telefono");
                usuarios[5] = rs.getString("prestamoActivo");
                modelo1.addRow(usuarios);
            }
          jTableUsuarios.setModel(modelo1);

        } catch (Exception e) {
        }
    }
    //Agregar los elementos de los espacios
    void Agregar() {
        String nombre = jtfNombre.getText();
        String edad = jtfEdad.getText();
        String direccion = jtfDireccion.getText();
        String telefono = jtfTelefono.getText();
        String prestamoA = jtfPrestamoA.getText();
        try {
            if (nombre.equals("") || edad.equals("") || direccion.equals("") || telefono.equals("") || prestamoA.equals("") ) {
                JOptionPane.showMessageDialog(null, "Debe Ingresar Datos");
                limpiarTabla(modelo1);               
            } else {
                String sql = "insert into usuarios(nombreUsuario,edad,direccion,telefono,prestamoActivo) "
                        + "values('" + nombre + "','" + edad + "','" + direccion + "','" + telefono + "','" + prestamoA + "')";
                cn = con.getConnection();
                st = cn.createStatement();
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Usuario Registrado con Exito");
                limpiarTabla(modelo1);   
            }
        } catch (Exception e) {
        }
    }
    
    //FUNCION MODIFICAR CON ELEMENTO SELECCIONADO DE LA TABLA
    void Modificar() {
        String nombre = jtfNombre.getText();
        String edad = jtfEdad.getText();
        String direccion = jtfDireccion.getText();
        String telefono = jtfTelefono.getText();
        String prestamoA = jtfPrestamoA.getText();
        String sql = "update usuarios set nombreUsuario='" + nombre + "',edad='" + edad + "',direccion='" + direccion + "' ,telefono='" + telefono + "' ,prestamoActivo='" + prestamoA + "'  where id_usuario=" + id;
        try {
            if (nombre != null || edad != null || direccion != null || telefono != null || prestamoA != null) {
                cn = con.getConnection();
                st = cn.createStatement();
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Usuario Modificado");
                limpiarTabla(modelo1);
                
            } else {
                JOptionPane.showMessageDialog(null, "Error...!!!");
            }

        } catch (Exception e) {
        }

    }
    
    void Eliminar() {
        String sql = "delete from usuarios where id_usuario=" + id;        
        int fila = jTableUsuarios.getSelectedRow();
        if (fila < 0) {
            JOptionPane.showMessageDialog(null,"Usuario no Seleccionado");
        } else {
                try {
                    cn = con.getConnection();
                    st = cn.createStatement();
                    st.executeUpdate(sql);
                    JOptionPane.showMessageDialog(null, "Usuario Eliminado");
                    limpiarTabla(modelo1);
                    
                } catch (Exception e) {
                }
               
        }

    }
    
    //Limpiar la tabla para volverla a listar
    void limpiarTabla(DefaultTableModel model) {
        for (int i = 0; i <jTableUsuarios.getRowCount(); i++) {
            model.removeRow(i);
            i = i - 1;
        }

    }
    
     void nuevo() {
        jtfIdUsuario.setText("");
        jtfNombre.setText("");
        jtfEdad.setText("");
        jtfDireccion.setText("");
        jtfTelefono.setText("");
        jtfPrestamoA.setText("");
        jtfNombre.requestFocus();
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableUsuarios;
    private javax.swing.JTextField jtfDireccion;
    private javax.swing.JTextField jtfEdad;
    private javax.swing.JTextField jtfIdUsuario;
    private javax.swing.JTextField jtfNombre;
    private javax.swing.JTextField jtfPrestamoA;
    private javax.swing.JTextField jtfTelefono;
    // End of variables declaration//GEN-END:variables
}
