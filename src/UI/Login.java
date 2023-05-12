

package UI;

import java.awt.Color;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Kirby
 */
public class Login extends javax.swing.JFrame {

    private String nombre;
    private String correo;
    /**
     * Creates new form Login
     */
    public Login() {
        nombre = "";
        correo = "";
        
        initComponents();
        panel_loginEncargado.setVisible(false);
        panel_loginAdmin.setVisible(false);
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        panel_Opciones = new javax.swing.JPanel();
        lab_Registro = new javax.swing.JLabel();
        ClosePage_1 = new javax.swing.JLabel();
        panel_RegistroAdmin = new javax.swing.JPanel();
        icon_admin = new javax.swing.JLabel();
        bt_RegistroAdmin = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        panel_RegistroEncargado = new javax.swing.JPanel();
        icon_Encargado = new javax.swing.JLabel();
        bt_RegistroEncargado = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        panel_loginEncargado = new javax.swing.JPanel();
        lab_Usuario = new javax.swing.JLabel();
        tf_Usuario = new javax.swing.JTextField();
        lab_Contraseña = new javax.swing.JLabel();
        passfield_Contraseña = new javax.swing.JPasswordField();
        panel_EntrarEncargado = new javax.swing.JPanel();
        lab_EntrarEncargado = new javax.swing.JLabel();
        panel_VolverEncargado = new javax.swing.JPanel();
        lab_VolverEncargado = new javax.swing.JLabel();
        panel_loginAdmin = new javax.swing.JPanel();
        lab_Correo = new javax.swing.JLabel();
        tf_Correo = new javax.swing.JTextField();
        lab_Contraseña1 = new javax.swing.JLabel();
        passfield_Contraseña1 = new javax.swing.JPasswordField();
        panel_EntrarAdmin = new javax.swing.JPanel();
        lab_EntrarAdmin = new javax.swing.JLabel();
        panel_VolverAdmin = new javax.swing.JPanel();
        lab_VolverAdmin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(800, 500));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel_Opciones.setBackground(new java.awt.Color(51, 51, 51));
        panel_Opciones.setPreferredSize(new java.awt.Dimension(400, 300));
        panel_Opciones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lab_Registro.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        lab_Registro.setForeground(new java.awt.Color(255, 255, 255));
        lab_Registro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lab_Registro.setText("Registro");
        panel_Opciones.add(lab_Registro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 56, 794, -1));

        ClosePage_1.setBackground(new java.awt.Color(255, 255, 255));
        ClosePage_1.setForeground(new java.awt.Color(255, 255, 255));
        ClosePage_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/eliminar.png"))); // NOI18N
        ClosePage_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClosePage_1MouseClicked(evt);
            }
        });
        panel_Opciones.add(ClosePage_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(762, 6, -1, -1));

        panel_RegistroAdmin.setBackground(new java.awt.Color(51, 51, 51));
        panel_RegistroAdmin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        icon_admin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icon_admin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/empresario.png"))); // NOI18N

        bt_RegistroAdmin.setBackground(java.awt.Color.darkGray);
        bt_RegistroAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_RegistroAdminMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bt_RegistroAdminMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bt_RegistroAdminMouseExited(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Administrador");

        javax.swing.GroupLayout bt_RegistroAdminLayout = new javax.swing.GroupLayout(bt_RegistroAdmin);
        bt_RegistroAdmin.setLayout(bt_RegistroAdminLayout);
        bt_RegistroAdminLayout.setHorizontalGroup(
            bt_RegistroAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bt_RegistroAdminLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        bt_RegistroAdminLayout.setVerticalGroup(
            bt_RegistroAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bt_RegistroAdminLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout panel_RegistroAdminLayout = new javax.swing.GroupLayout(panel_RegistroAdmin);
        panel_RegistroAdmin.setLayout(panel_RegistroAdminLayout);
        panel_RegistroAdminLayout.setHorizontalGroup(
            panel_RegistroAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_RegistroAdminLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_RegistroAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(icon_admin, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                    .addComponent(bt_RegistroAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panel_RegistroAdminLayout.setVerticalGroup(
            panel_RegistroAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_RegistroAdminLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(icon_admin, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(bt_RegistroAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        panel_Opciones.add(panel_RegistroAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(447, 121, -1, -1));

        panel_RegistroEncargado.setBackground(new java.awt.Color(51, 51, 51));
        panel_RegistroEncargado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        panel_RegistroEncargado.setPreferredSize(new java.awt.Dimension(200, 250));

        icon_Encargado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icon_Encargado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/usuario.png"))); // NOI18N

        bt_RegistroEncargado.setBackground(java.awt.Color.darkGray);
        bt_RegistroEncargado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_RegistroEncargadoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bt_RegistroEncargadoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bt_RegistroEncargadoMouseExited(evt);
            }
        });

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Encargado");

        javax.swing.GroupLayout bt_RegistroEncargadoLayout = new javax.swing.GroupLayout(bt_RegistroEncargado);
        bt_RegistroEncargado.setLayout(bt_RegistroEncargadoLayout);
        bt_RegistroEncargadoLayout.setHorizontalGroup(
            bt_RegistroEncargadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bt_RegistroEncargadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        bt_RegistroEncargadoLayout.setVerticalGroup(
            bt_RegistroEncargadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bt_RegistroEncargadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout panel_RegistroEncargadoLayout = new javax.swing.GroupLayout(panel_RegistroEncargado);
        panel_RegistroEncargado.setLayout(panel_RegistroEncargadoLayout);
        panel_RegistroEncargadoLayout.setHorizontalGroup(
            panel_RegistroEncargadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_RegistroEncargadoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_RegistroEncargadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(icon_Encargado, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                    .addComponent(bt_RegistroEncargado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panel_RegistroEncargadoLayout.setVerticalGroup(
            panel_RegistroEncargadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_RegistroEncargadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(icon_Encargado, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(bt_RegistroEncargado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        panel_Opciones.add(panel_RegistroEncargado, new org.netbeans.lib.awtextra.AbsoluteConstraints(139, 121, -1, -1));

        panel_loginEncargado.setBackground(new java.awt.Color(51, 51, 51));

        lab_Usuario.setForeground(new java.awt.Color(255, 255, 255));
        lab_Usuario.setText("Nombre");

        tf_Usuario.setBackground(new java.awt.Color(51, 51, 51));
        tf_Usuario.setForeground(new java.awt.Color(255, 255, 255));
        tf_Usuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204)));
        tf_Usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_UsuarioActionPerformed(evt);
            }
        });

        lab_Contraseña.setForeground(new java.awt.Color(255, 255, 255));
        lab_Contraseña.setText("Contraseña");

        passfield_Contraseña.setBackground(new java.awt.Color(51, 51, 51));
        passfield_Contraseña.setForeground(new java.awt.Color(255, 255, 255));
        passfield_Contraseña.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 154, 204)));
        passfield_Contraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passfield_ContraseñaActionPerformed(evt);
            }
        });

        panel_EntrarEncargado.setBackground(java.awt.Color.darkGray);
        panel_EntrarEncargado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panel_EntrarEncargadoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panel_EntrarEncargadoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panel_EntrarEncargadoMouseExited(evt);
            }
        });

        lab_EntrarEncargado.setForeground(new java.awt.Color(255, 255, 255));
        lab_EntrarEncargado.setText("Entrar");

        javax.swing.GroupLayout panel_EntrarEncargadoLayout = new javax.swing.GroupLayout(panel_EntrarEncargado);
        panel_EntrarEncargado.setLayout(panel_EntrarEncargadoLayout);
        panel_EntrarEncargadoLayout.setHorizontalGroup(
            panel_EntrarEncargadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_EntrarEncargadoLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(lab_EntrarEncargado)
                .addContainerGap(49, Short.MAX_VALUE))
        );
        panel_EntrarEncargadoLayout.setVerticalGroup(
            panel_EntrarEncargadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_EntrarEncargadoLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lab_EntrarEncargado)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        panel_VolverEncargado.setBackground(java.awt.Color.darkGray);
        panel_VolverEncargado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panel_VolverEncargadoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panel_VolverEncargadoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panel_VolverEncargadoMouseExited(evt);
            }
        });

        lab_VolverEncargado.setForeground(new java.awt.Color(255, 255, 255));
        lab_VolverEncargado.setText("Volver");

        javax.swing.GroupLayout panel_VolverEncargadoLayout = new javax.swing.GroupLayout(panel_VolverEncargado);
        panel_VolverEncargado.setLayout(panel_VolverEncargadoLayout);
        panel_VolverEncargadoLayout.setHorizontalGroup(
            panel_VolverEncargadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_VolverEncargadoLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(lab_VolverEncargado)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_VolverEncargadoLayout.setVerticalGroup(
            panel_VolverEncargadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_VolverEncargadoLayout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(lab_VolverEncargado)
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout panel_loginEncargadoLayout = new javax.swing.GroupLayout(panel_loginEncargado);
        panel_loginEncargado.setLayout(panel_loginEncargadoLayout);
        panel_loginEncargadoLayout.setHorizontalGroup(
            panel_loginEncargadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_loginEncargadoLayout.createSequentialGroup()
                .addContainerGap(100, Short.MAX_VALUE)
                .addGroup(panel_loginEncargadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lab_Usuario)
                    .addComponent(lab_Contraseña))
                .addGap(41, 41, 41)
                .addGroup(panel_loginEncargadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(passfield_Contraseña, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(tf_Usuario))
                .addGap(111, 111, 111))
            .addGroup(panel_loginEncargadoLayout.createSequentialGroup()
                .addGap(173, 173, 173)
                .addGroup(panel_loginEncargadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panel_EntrarEncargado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel_VolverEncargado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_loginEncargadoLayout.setVerticalGroup(
            panel_loginEncargadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_loginEncargadoLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(panel_VolverEncargado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panel_loginEncargadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lab_Usuario)
                    .addComponent(tf_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_loginEncargadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lab_Contraseña)
                    .addComponent(passfield_Contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(panel_EntrarEncargado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        panel_Opciones.add(panel_loginEncargado, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 122, -1, -1));

        panel_loginAdmin.setBackground(new java.awt.Color(51, 51, 51));

        lab_Correo.setForeground(new java.awt.Color(255, 255, 255));
        lab_Correo.setText("Correo");

        tf_Correo.setBackground(new java.awt.Color(51, 51, 51));
        tf_Correo.setForeground(new java.awt.Color(255, 255, 255));
        tf_Correo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204)));
        tf_Correo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_CorreoActionPerformed(evt);
            }
        });

        lab_Contraseña1.setForeground(new java.awt.Color(255, 255, 255));
        lab_Contraseña1.setText("Contraseña");

        passfield_Contraseña1.setBackground(new java.awt.Color(51, 51, 51));
        passfield_Contraseña1.setForeground(new java.awt.Color(255, 255, 255));
        passfield_Contraseña1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 154, 204)));
        passfield_Contraseña1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passfield_Contraseña1ActionPerformed(evt);
            }
        });

        panel_EntrarAdmin.setBackground(java.awt.Color.darkGray);
        panel_EntrarAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panel_EntrarAdminMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panel_EntrarAdminMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panel_EntrarAdminMouseExited(evt);
            }
        });

        lab_EntrarAdmin.setForeground(new java.awt.Color(255, 255, 255));
        lab_EntrarAdmin.setText("Entrar");

        javax.swing.GroupLayout panel_EntrarAdminLayout = new javax.swing.GroupLayout(panel_EntrarAdmin);
        panel_EntrarAdmin.setLayout(panel_EntrarAdminLayout);
        panel_EntrarAdminLayout.setHorizontalGroup(
            panel_EntrarAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_EntrarAdminLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(lab_EntrarAdmin)
                .addContainerGap(49, Short.MAX_VALUE))
        );
        panel_EntrarAdminLayout.setVerticalGroup(
            panel_EntrarAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_EntrarAdminLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lab_EntrarAdmin)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        panel_VolverAdmin.setBackground(java.awt.Color.darkGray);
        panel_VolverAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panel_VolverAdminMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panel_VolverAdminMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panel_VolverAdminMouseExited(evt);
            }
        });

        lab_VolverAdmin.setForeground(new java.awt.Color(255, 255, 255));
        lab_VolverAdmin.setText("Volver");

        javax.swing.GroupLayout panel_VolverAdminLayout = new javax.swing.GroupLayout(panel_VolverAdmin);
        panel_VolverAdmin.setLayout(panel_VolverAdminLayout);
        panel_VolverAdminLayout.setHorizontalGroup(
            panel_VolverAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_VolverAdminLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(lab_VolverAdmin)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_VolverAdminLayout.setVerticalGroup(
            panel_VolverAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_VolverAdminLayout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(lab_VolverAdmin)
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout panel_loginAdminLayout = new javax.swing.GroupLayout(panel_loginAdmin);
        panel_loginAdmin.setLayout(panel_loginAdminLayout);
        panel_loginAdminLayout.setHorizontalGroup(
            panel_loginAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_loginAdminLayout.createSequentialGroup()
                .addContainerGap(98, Short.MAX_VALUE)
                .addGroup(panel_loginAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lab_Correo)
                    .addComponent(lab_Contraseña1))
                .addGap(41, 41, 41)
                .addGroup(panel_loginAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(passfield_Contraseña1, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(tf_Correo))
                .addGap(111, 111, 111))
            .addGroup(panel_loginAdminLayout.createSequentialGroup()
                .addGap(173, 173, 173)
                .addGroup(panel_loginAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panel_EntrarAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel_VolverAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_loginAdminLayout.setVerticalGroup(
            panel_loginAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_loginAdminLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(panel_VolverAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panel_loginAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lab_Correo)
                    .addComponent(tf_Correo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_loginAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lab_Contraseña1)
                    .addComponent(passfield_Contraseña1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(panel_EntrarAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        panel_Opciones.add(panel_loginAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 510, 250));

        getContentPane().add(panel_Opciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 498));

        pack();
    }// </editor-fold>                        

    private void ClosePage_1MouseClicked(java.awt.event.MouseEvent evt) {                                         
        // TODO add your handling code here:
        System.exit(0);
    }                                        

    private void bt_RegistroAdminMouseEntered(java.awt.event.MouseEvent evt) {                                              
        // TODO add your handling code here:
        bt_RegistroAdmin.setBackground(Color.GRAY);
    }                                             

    private void bt_RegistroAdminMouseExited(java.awt.event.MouseEvent evt) {                                             
        // TODO add your handling code here:
        bt_RegistroAdmin.setBackground(Color.DARK_GRAY);
    }                                            

    private void bt_RegistroEncargadoMouseEntered(java.awt.event.MouseEvent evt) {                                                  
        // TODO add your handling code here:
        bt_RegistroEncargado.setBackground(Color.GRAY);
    }                                                 

    private void bt_RegistroEncargadoMouseExited(java.awt.event.MouseEvent evt) {                                                 
        // TODO add your handling code here:
        bt_RegistroEncargado.setBackground(Color.DARK_GRAY);
    }                                                

    private void bt_RegistroEncargadoMouseClicked(java.awt.event.MouseEvent evt) {                                                  
        // TODO add your handling code here:
        panel_RegistroAdmin.setVisible(false);
        panel_RegistroEncargado.setVisible(false);
        panel_loginEncargado.setVisible(true);
    }                                                 

    private void tf_UsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_UsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_UsuarioActionPerformed

    private void panel_VolverEncargadoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_VolverEncargadoMouseEntered
        // TODO add your handling code here:
        panel_VolverEncargado.setBackground(Color.GRAY);
    }//GEN-LAST:event_panel_VolverEncargadoMouseEntered

    private void panel_VolverEncargadoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_VolverEncargadoMouseExited
        // TODO add your handling code here:
        panel_VolverEncargado.setBackground(Color.DARK_GRAY);
    }//GEN-LAST:event_panel_VolverEncargadoMouseExited

    private void passfield_ContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passfield_ContraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passfield_ContraseñaActionPerformed

    private void panel_VolverEncargadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_VolverEncargadoMouseClicked
        // TODO add your handling code here:
        panel_RegistroAdmin.setVisible(true);
        panel_RegistroEncargado.setVisible(true);
        panel_loginEncargado.setVisible(false);
    }//GEN-LAST:event_panel_VolverEncargadoMouseClicked

    private void panel_EntrarEncargadoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_EntrarEncargadoMouseEntered
        // TODO add your handling code here:
        panel_EntrarEncargado.setBackground(Color.GRAY);
    }//GEN-LAST:event_panel_EntrarEncargadoMouseEntered

    private void panel_EntrarEncargadoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_EntrarEncargadoMouseExited
        // TODO add your handling code here:
        panel_EntrarEncargado.setBackground(Color.DARK_GRAY);
    }//GEN-LAST:event_panel_EntrarEncargadoMouseExited

    private void panel_EntrarEncargadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_EntrarEncargadoMouseClicked
        // TODO add your handling code here:
        Home h = new Home();
        this.setVisible(false);
        h.setVisible(true);
        h.bt_Menu.setVisible(false);
    }//GEN-LAST:event_panel_EntrarEncargadoMouseClicked

    private void tf_CorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_CorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_CorreoActionPerformed

    private void passfield_Contraseña1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passfield_Contraseña1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passfield_Contraseña1ActionPerformed

    private void panel_EntrarAdminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_EntrarAdminMouseClicked
        // TODO add your handling code here:
        Home h = new Home();
        this.setVisible(false);
        h.setVisible(true);
    }//GEN-LAST:event_panel_EntrarAdminMouseClicked

    private void panel_EntrarAdminMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_EntrarAdminMouseEntered
        // TODO add your handling code here:
        panel_EntrarAdmin.setBackground(Color.GRAY);
    }//GEN-LAST:event_panel_EntrarAdminMouseEntered

    private void panel_EntrarAdminMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_EntrarAdminMouseExited
        // TODO add your handling code here:
        panel_EntrarAdmin.setBackground(Color.DARK_GRAY);
    }//GEN-LAST:event_panel_EntrarAdminMouseExited

    private void panel_VolverAdminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_VolverAdminMouseClicked
        // TODO add your handling code here:
        panel_RegistroAdmin.setVisible(true);
        panel_RegistroEncargado.setVisible(true);
        panel_loginAdmin.setVisible(false);
    }//GEN-LAST:event_panel_VolverAdminMouseClicked

    private void panel_VolverAdminMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_VolverAdminMouseEntered
        // TODO add your handling code here:
        panel_VolverAdmin.setBackground(Color.GRAY);
    }//GEN-LAST:event_panel_VolverAdminMouseEntered

    private void panel_VolverAdminMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_VolverAdminMouseExited
        // TODO add your handling code here:
        panel_VolverAdmin.setBackground(Color.DARK_GRAY);
    }//GEN-LAST:event_panel_VolverAdminMouseExited

    private void bt_RegistroAdminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_RegistroAdminMouseClicked
        // TODO add your handling code here:
        panel_RegistroAdmin.setVisible(false);
        panel_RegistroEncargado.setVisible(false);
        panel_loginAdmin.setVisible(true);
    }//GEN-LAST:event_bt_RegistroAdminMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JLabel ClosePage_1;
    private javax.swing.JPanel bt_RegistroAdmin;
    private javax.swing.JPanel bt_RegistroEncargado;
    private javax.swing.JLabel icon_Encargado;
    private javax.swing.JLabel icon_admin;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lab_Contraseña;
    private javax.swing.JLabel lab_Contraseña1;
    private javax.swing.JLabel lab_Correo;
    private javax.swing.JLabel lab_EntrarAdmin;
    private javax.swing.JLabel lab_EntrarEncargado;
    private javax.swing.JLabel lab_Registro;
    private javax.swing.JLabel lab_Usuario;
    private javax.swing.JLabel lab_VolverAdmin;
    private javax.swing.JLabel lab_VolverEncargado;
    private javax.swing.JPanel panel_EntrarAdmin;
    private javax.swing.JPanel panel_EntrarEncargado;
    private javax.swing.JPanel panel_Opciones;
    private javax.swing.JPanel panel_RegistroAdmin;
    private javax.swing.JPanel panel_RegistroEncargado;
    private javax.swing.JPanel panel_VolverAdmin;
    private javax.swing.JPanel panel_VolverEncargado;
    private javax.swing.JPanel panel_loginAdmin;
    private javax.swing.JPanel panel_loginEncargado;
    private javax.swing.JPasswordField passfield_Contraseña;
    private javax.swing.JPasswordField passfield_Contraseña1;
    private javax.swing.JTextField tf_Correo;
    private javax.swing.JTextField tf_Usuario;
    // End of variables declaration                   
}

