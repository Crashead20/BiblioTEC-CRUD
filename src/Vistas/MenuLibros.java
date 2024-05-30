package Vistas;

import Config.Conexion;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class MenuLibros extends javax.swing.JFrame {
    
    
    /*Seccion donde se inicializan las variables de conexion que se estaran utilizando
    con frecuencia dentro de las funciones del codigo*/
    Conexion con = new Conexion();
    Connection cn;
    Statement st;
    ResultSet rs;
    DefaultTableModel modelo1;
    int id;//Variable inicializada para las id de las tablas
    
    /*Inicializacion de la ventana en donde se coloca en pantalla completa automaticamente
    e inicializa todos los componentes de la ventana para empezar a utilizarlos*/
    public MenuLibros() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        //LISTAMOS TABLAS AL INICIAR CON EL PROGRAMA
        listarLibros();
 
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
        jTableLibros = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jtfIdLibro = new javax.swing.JTextField();
        btnAgregarLibros = new javax.swing.JButton();
        btnEliminarLibros = new javax.swing.JButton();
        btnModificarLibros = new javax.swing.JButton();
        jLabel47 = new javax.swing.JLabel();
        jtfTitulo = new javax.swing.JTextField();
        jLabel48 = new javax.swing.JLabel();
        jtfAutor = new javax.swing.JTextField();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jtfInventario = new javax.swing.JTextField();
        jtfAno = new javax.swing.JTextField();
        jtfEditorial = new javax.swing.JTextField();

        btnInsertar.setBackground(new java.awt.Color(18, 188, 85));
        btnInsertar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnInsertar.setForeground(new java.awt.Color(243, 241, 229));
        btnInsertar.setText("Inicia Sesion");
        btnInsertar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(243, 241, 229), 2));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(243, 241, 229));

        jPanel2.setBackground(new java.awt.Color(129, 255, 131));

        btnSeccionLibros.setBackground(new java.awt.Color(204, 153, 255));
        btnSeccionLibros.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnSeccionLibros.setForeground(new java.awt.Color(243, 241, 229));
        btnSeccionLibros.setText("Libros");
        btnSeccionLibros.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(243, 241, 229), 2));

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

        jTableLibros.setBackground(new java.awt.Color(243, 241, 229));
        jTableLibros.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(243, 241, 229), 2));
        jTableLibros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "IdLibro", "Titulo", "Autor", "Editorial", "Año", "Inventario"
            }
        ));
        jTableLibros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableLibrosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableLibros);
        if (jTableLibros.getColumnModel().getColumnCount() > 0) {
            jTableLibros.getColumnModel().getColumn(0).setMinWidth(80);
            jTableLibros.getColumnModel().getColumn(0).setPreferredWidth(80);
            jTableLibros.getColumnModel().getColumn(0).setMaxWidth(50);
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
        jLabel1.setText("Menu Principal / Libros");
        jLabel1.setOpaque(true);
        jLabel1.setPreferredSize(new java.awt.Dimension(840, 50));

        jPanel3.setBackground(new java.awt.Color(129, 255, 131));

        jLabel45.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel45.setText("Edicion Libros:");

        jLabel46.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel46.setText("Id Libro:");

        jtfIdLibro.setEditable(false);
        jtfIdLibro.setBackground(new java.awt.Color(243, 241, 229));
        jtfIdLibro.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        btnAgregarLibros.setBackground(new java.awt.Color(18, 188, 85));
        btnAgregarLibros.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnAgregarLibros.setForeground(new java.awt.Color(243, 241, 229));
        btnAgregarLibros.setText("Agregar");
        btnAgregarLibros.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(243, 241, 229), 2));
        btnAgregarLibros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarLibrosActionPerformed(evt);
            }
        });

        btnEliminarLibros.setBackground(new java.awt.Color(18, 188, 85));
        btnEliminarLibros.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnEliminarLibros.setForeground(new java.awt.Color(243, 241, 229));
        btnEliminarLibros.setText("Eliminar");
        btnEliminarLibros.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(243, 241, 229), 2));
        btnEliminarLibros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarLibrosActionPerformed(evt);
            }
        });

        btnModificarLibros.setBackground(new java.awt.Color(18, 188, 85));
        btnModificarLibros.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnModificarLibros.setForeground(new java.awt.Color(243, 241, 229));
        btnModificarLibros.setText("Modificar");
        btnModificarLibros.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(243, 241, 229), 2));
        btnModificarLibros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarLibrosActionPerformed(evt);
            }
        });

        jLabel47.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel47.setText("Titulo");

        jtfTitulo.setBackground(new java.awt.Color(243, 241, 229));
        jtfTitulo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jLabel48.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel48.setText("Autor");

        jtfAutor.setBackground(new java.awt.Color(243, 241, 229));
        jtfAutor.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jLabel49.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel49.setText("Editorial");

        jLabel50.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel50.setText("Año");

        jLabel51.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel51.setText("Inventario");

        jtfInventario.setBackground(new java.awt.Color(243, 241, 229));
        jtfInventario.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jtfAno.setBackground(new java.awt.Color(243, 241, 229));
        jtfAno.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jtfEditorial.setBackground(new java.awt.Color(243, 241, 229));
        jtfEditorial.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnAgregarLibros, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnModificarLibros, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(btnEliminarLibros, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel50, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel47, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel48, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel49, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel51, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtfTitulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtfAutor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtfEditorial, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtfAno, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtfInventario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jtfIdLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(39, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel45)
                .addGap(155, 155, 155))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel45)
                .addGap(40, 40, 40)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfIdLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel46))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel47)
                    .addComponent(jtfTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel48)
                    .addComponent(jtfAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfEditorial, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel49))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel50)
                    .addComponent(jtfAno, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel51)
                    .addComponent(jtfInventario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregarLibros, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModificarLibros, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminarLibros, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
    
    /*Aqui se encuentran las acciones de los botones que se utilizaran a manera de navegacion
    los cuales tienen una variable de tipo objeto la cual mandamos a llamar para poder
    interactuar con la ventana, cada boton tiene la funcion de hacer visible la ventana
    deseada y desactivar en la que se encuentra actualmente, de manera que se pueda mover
    con libertad entre ventadas*/
    
    //Boton para seccion Usuarios
    private void btnSeccionUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeccionUsuariosActionPerformed
        MenuUsuarios  menuUsuarios = new MenuUsuarios();
        menuUsuarios.setVisible(true);//Activa la ventana usuario
        dispose();//Desactiva la ventana en la que se encuentra
    }//GEN-LAST:event_btnSeccionUsuariosActionPerformed
    
    //Boton para seccion Prestamos
    private void btnSeccionPrestamosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeccionPrestamosActionPerformed
        MenuPrestamo  menuPrestamo = new MenuPrestamo();//Inicializa variable objeto
        menuPrestamo.setVisible(true);//Activa la ventana usuario
        dispose();//Desactiva la ventana en la que se encuentra
    }//GEN-LAST:event_btnSeccionPrestamosActionPerformed

    
    /*Botones de accion. En esta seccion se encuentran los botones con los cuales el usuario
    interactuara en la aplicacion, cada uno tiene sus respectivas funciones de accion para
    realizarlas en cuanto el boton sea pulsado*/
    
    //Boton Agregar Libro
    private void btnAgregarLibrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarLibrosActionPerformed
        Agregar();
        listarLibros();
        nuevo();
    }//GEN-LAST:event_btnAgregarLibrosActionPerformed

    //Boton Eliminar Libro
    private void btnEliminarLibrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarLibrosActionPerformed
        Eliminar();
        listarLibros();
        nuevo();
    }//GEN-LAST:event_btnEliminarLibrosActionPerformed

    //Boton Modificar Libro
    private void btnModificarLibrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarLibrosActionPerformed
        Modificar();
        listarLibros();
        nuevo();
    }//GEN-LAST:event_btnModificarLibrosActionPerformed

    
    
    private void jTableLibrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableLibrosMouseClicked
        
        /*Funcion Para seleccionar una linea deseada dentro de la tabla libros
        Mediante esta asignamos los valores que se encuentren dentro de la tabla a los
        campos de texto dentro de la zona de edicion, esta funcion nos ayuda principalmente
        para las funciones de MODIFICAR y ELIMINAR*/
        int row = jTableLibros.getSelectedRow();//Se selecciona la fila dentro de la tabla
        if (row == -1) {
            JOptionPane.showMessageDialog(null, "No se Selecciono");
        } else {
            //Variables en las que se guardan los elementos seleccionados
            id = Integer.parseInt((String) jTableLibros.getValueAt(row, 0).toString());
            String titulo = (String) jTableLibros.getValueAt(row, 1);
            String autor = (String) jTableLibros.getValueAt(row, 2);
            String editorial = (String) jTableLibros.getValueAt(row, 3);
            String ano = (String) jTableLibros.getValueAt(row, 4);
            String inventario = (String) jTableLibros.getValueAt(row, 5);
            //Asignamos las variables previamente asignadas
            jtfIdLibro.setText("" + id);
            jtfTitulo.setText(titulo);
            jtfAutor.setText(autor);
            jtfEditorial.setText(editorial);
            jtfAno.setText(ano);
            jtfInventario.setText(inventario);

        }
    }//GEN-LAST:event_jTableLibrosMouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuLibros().setVisible(true);
            }
        });
    }
    
    /*Esta funcion realiza una consulta SQL con la base de datos con la cual
    recupera los todos los datos que se encuentren dentro de la tabla "libros"
    mediante una conexion y un objeto de tipo array, se guardan las variables y 
    se muestran en la tabla mediante la funcion defaultTableModel, y recuperando
    las variables directo de la base de datos, podemos mostrar todo el contenido
    en la tabla dentro del formulario*/
    void listarLibros() {
        String sql = "select * from libros";//Consulta SQL
        try {
            //Conexion con la base de datos
            cn = con.getConnection();
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            Object[] libros = new Object[6];//Elemento Array para guardar valores
            //Objeto para utilizar la tabla dentro del formulario y obtener el formato
            modelo1=(DefaultTableModel) jTableLibros.getModel();
            while (rs.next()) {
                //Variables dentro del array coincidiendo con la base de datos
                libros[0] = rs.getInt("id_libro");
                libros[1] = rs.getString("titulo");
                libros[2] = rs.getString("autor");
                libros[3] = rs.getString("editorial");
                libros[4] = rs.getString("ano");
                libros[5] = rs.getString("stock");
                modelo1.addRow(libros);
            }
            jTableLibros.setModel(modelo1);
        } catch (Exception e) {
        }
    }
    
    /*Esta funcion nos permite agregar los datos almacenados a la tabla libros
    mediante unas variables guardamos el texto que el usuario haya introducido en los
    campos de texto correspondientes, obteniendo estos datos, podemos conectar con la
    base de datos y realizar una consulta SQL para poder agregar los datos deseados*/
    void Agregar() {
        //Variables de los campos de texto
        String titulo = jtfTitulo.getText();
        String autor = jtfAutor.getText();
        String editorial = jtfEditorial.getText();
        String ano = jtfAno.getText();
        String inventario = jtfInventario.getText();
        try {
            //Condicional para mandar un mensaje de error en caso de que no se introduzca ningun dato y se púlse el boton
            if (titulo.equals("") || autor.equals("") || editorial.equals("") || ano.equals("") || inventario.equals("") ) {
                JOptionPane.showMessageDialog(null, "Debe Ingresar Datos");
                limpiarTabla(modelo1);  
                //Si no estan vacios se ejecuta la sentencia sql con ayuda de las variables que guardamos anteriormente
            } else {
                String sql = "insert into libros(titulo,autor,editorial,ano,stock) "
                            + "values('" + titulo + "','" + autor + "','" + editorial + "','" + ano + "','" + inventario + "')";
                //Conectamos y realizamos la consulta
                cn = con.getConnection();
                st = cn.createStatement();
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Libro Registrado con Exito");
                limpiarTabla(modelo1);//Funcion para limpiar la tabla y mostrar posteriormente datos renovados 
            }
        } catch (Exception e) {
        }
    }
    
    /*FUNCION MODIFICAR CON ELEMENTO SELECCIONADO DE LA TABLA. Con la ayuda de la funcion que se mostro en la
    accion jTableMouseClicked, la cual selecciona los elementos seleccionados en la tabla, podemos ser capaces
    de llenar los campos de la zona de edicion, de manera que quedan de manera facil para su modificacion
    mediante una sentencia SQL mandamos las variables nuevamente para que estas se actualicen con la base de datos
    */
    void Modificar() {
        //Variables en las cuales guardamos los valores introducidos por el usuario
        String titulo = jtfTitulo.getText();
        String autor = jtfAutor.getText();
        String editorial = jtfEditorial.getText();
        String ano = jtfAno.getText();
        String inventario = jtfInventario.getText();
        //Sentencia SQL para actualizar la tabla dentro de la base de datos
        String sql = "update libros set titulo='" + titulo + "',autor='" + autor + "',editorial='" + editorial + "' "
                + ",ano='" + ano + "' ,stock='" + inventario + "'  where id_libro=" + id;
        try {
            if (titulo != null || autor != null || editorial != null || ano != null || inventario != null) {
                //Conectamos y realizamos la consulta
                cn = con.getConnection();
                st = cn.createStatement();
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Libro Modificado");
                limpiarTabla(modelo1);//Funcion para limpiar la tabla y mostrar posteriormente datos renovados
            } else {
                JOptionPane.showMessageDialog(null, "Error...!!!");
            }
        } catch (Exception e) {
        }
    }
    
    
    /*Funcion para eliminar una linea seleccionada con ayuda de la funcion tableMouseClicked 
    Esta funcion basicamente realiza una consulta sql con la cual mediante la variable id, 
    borra todo dato que se relacione con dicha id, en este caso los datos del libro que
    deseemos eliminar*/
    void Eliminar() {
        //Consulta SQL para eliminar los datos mediante id
        String sql = "delete from libros where id_libro=" + id;  
        //Variable para guardar el indice de linea seleccionada
        int fila = jTableLibros.getSelectedRow();
        if (fila < 0) {
            JOptionPane.showMessageDialog(null,"Libro no Seleccionado");
        } else {
                try {
                    //Variables de conexion con la base de datos
                    cn = con.getConnection();
                    st = cn.createStatement();
                    st.executeUpdate(sql);
                    JOptionPane.showMessageDialog(null, "Libro Eliminado");
                    limpiarTabla(modelo1);  //Funcion para limpiar la tabla 
                                            //y mostrar posteriormente datos renovados                   
                } catch (Exception e) {
                }               
        }
    }
    
    /*Funcion que se utiliza dentro de las demas funciones a manera de ayuda
    para poder limpiar la tabla mas comodamente, de manera que se pueda
    listar correctamente mas adelante en las funciones*/
    void limpiarTabla(DefaultTableModel model) {
        for (int i = 0; i <= jTableLibros.getRowCount(); i++) {
            model.removeRow(i);
            i = i - 1;
        }
    }
    
    /*Funcion Utilizada para poder resetear los campos de texto dentro
    de la seccion edicion de elemento, este es util para poder agregar
    elementos con mas comodidad sin necesidad de borrar los elementos de
    manera manual*/
     void nuevo() {
        //Asignamos un valor vacio a los campos de texto
        jtfIdLibro.setText("");
        jtfTitulo.setText("");
        jtfAutor.setText("");
        jtfEditorial.setText("");
        jtfAno.setText("");
        jtfInventario.setText("");
        //Colocamos el cursor en el titulo para seguir escribiendo con comodidad
        jtfTitulo.requestFocus();
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarLibros;
    private javax.swing.JButton btnEliminarLibros;
    private javax.swing.JButton btnInsertar;
    private javax.swing.JButton btnModificarLibros;
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
    private javax.swing.JTable jTableLibros;
    private javax.swing.JTextField jtfAno;
    private javax.swing.JTextField jtfAutor;
    private javax.swing.JTextField jtfEditorial;
    private javax.swing.JTextField jtfIdLibro;
    private javax.swing.JTextField jtfInventario;
    private javax.swing.JTextField jtfTitulo;
    // End of variables declaration//GEN-END:variables
}
