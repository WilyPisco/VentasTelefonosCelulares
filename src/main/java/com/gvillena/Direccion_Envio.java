
package com.gvillena;

import javax.swing.JOptionPane;

public class Direccion_Envio extends javax.swing.JFrame {
//public static VentasRealizadas ven= new VentasRealizadas();
    Pago_Credito pa= new Pago_Credito();
    
    String nombre,direccion1,direccion2,correo,celular,ciudad,postal,pais,provincia;
    
    public Direccion_Envio() {
        initComponents();
        cboPais.setSelectedIndex(141);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblEnvio = new javax.swing.JLabel();
        panelInformacion = new javax.swing.JPanel();
        lblDir1 = new javax.swing.JLabel();
        txtDireccion2 = new javax.swing.JTextField();
        lblDir2 = new javax.swing.JLabel();
        txtCiudad = new javax.swing.JTextField();
        txtProvincia = new javax.swing.JTextField();
        txtPostal = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        txtCelular = new javax.swing.JTextField();
        lblCiudad = new javax.swing.JLabel();
        lblProvincia = new javax.swing.JLabel();
        lblPostal = new javax.swing.JLabel();
        lblCorreo = new javax.swing.JLabel();
        cboPais = new javax.swing.JComboBox<>();
        lblCelular = new javax.swing.JLabel();
        lblPais = new javax.swing.JLabel();
        txtNom = new javax.swing.JTextField();
        lblNom = new javax.swing.JLabel();
        txtDireccion1 = new javax.swing.JTextField();
        lblShop = new javax.swing.JLabel();
        panelTerminar = new javax.swing.JPanel();
        btnTerminarCompra = new javax.swing.JButton();
        lblVisa = new javax.swing.JLabel();
        panelControles = new javax.swing.JPanel();
        lblSecurityInf = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JButton();
        lblKey1 = new javax.swing.JLabel();
        lblVisa1 = new javax.swing.JLabel();
        lblExpress1 = new javax.swing.JLabel();
        lblPayPal1 = new javax.swing.JLabel();
        lblMasterCard1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblEnvio.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblEnvio.setText("DIRECCION DE ENVIO");

        lblDir1.setText("* Direccion  1");

        lblDir2.setText("Direccion 2");

        lblCiudad.setText("* Ciudad");

        lblProvincia.setText("* Provincia/Estado");

        lblPostal.setText("* Codigo Postal");

        lblCorreo.setText("* E-mail");

        cboPais.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Afganistán ", "Albania ", "Alemania ", "Andorra ", "Angola ", "Antigua y Barbuda ", "Arabia Saudita ", "Argelia ", "Argentina ", "Armenia ", "Australia ", "Austria ", "Azerbaiyán ", "Bahamas ", "Bangladés ", "Barbados ", "Baréin ", "Bélgica ", "Belice ", "Benín ", "Bielorrusia ", "Birmania ", "Bolivia ", "Bosnia-Herzegovina ", "Botsuana ", "Brasil ", "Brunéi ", "Bulgaria ", "Burkina Faso ", "Burundi ", "Bután ", "Cabo Verde ", "Camboya ", "Camerún ", "Canadá ", "Catar ", "Chad ", "Chile ", "China ", "Chipre ", "Colombia ", "Comoras ", "Congo ", "Corea del Norte ", "Corea del Sur ", "Costa de Marfil ", "Costa Rica ", "Croacia ", "Cuba ", "Dinamarca ", "Dominica ", "Ecuador ", "Egipto ", "El Salvador ", "Emiratos Árabes Unidos ", "Eritrea ", "Eslovaquia ", "Eslovenia ", "España ", "Estados Unidos ", "Estonia ", "Etiopía ", "Filipinas ", "Finlandia ", "Fiyi ", "Francia ", "Gabón ", "Gambia ", "Georgia ", "Ghana ", "Granada ", "Grecia ", "Guatemala ", "Guinea ", "Guinea Ecuatorial ", "Guinea-Bisáu ", "Guyana ", "Haití ", "Honduras ", "Hungría ", "India ", "Indonesia ", "Irak ", "Irán ", "Irlanda ", "Islandia ", "Islas Marshall ", "Islas Salomón ", "Israel ", "Italia ", "Jamaica ", "Japón ", "Jordania ", "Kazajistán ", "Kenia ", "Kirguistán ", "Kiribati ", "Kosovo ", "Kuwait ", "Laos ", "Lesoto ", "Letonia ", "Líbano ", "Liberia ", "Libia ", "Liechtenstein ", "Lituania ", "Luxemburgo ", "Macedonia ", "Madagascar ", "Malasia ", "Malaui ", "Maldivas ", "Malí ", "Malta ", "Marruecos ", "Mauricio ", "Mauritania ", "México ", "Micronesia ", "Moldavia ", "Mónaco ", "Mongolia ", "Montenegro ", "Mozambique ", "Namibia ", "Nauru ", "Nepal ", "Nicaragua ", "Níger ", "Nigeria ", "Noruega ", "Nueva Zelanda ", "Omán ", "Países Bajos ", "Pakistán ", "Palaos ", "Palestina ", "Panamá ", "Papúa Nueva Guinea ", "Paraguay ", "Perú ", "Polonia ", "Portugal ", "Reino Unido ", "República Centroafricana ", "República Checa ", "República Democrática del Congo ", "República Dominicana ", "Ruanda ", "Rumania ", "Rusia ", "Samoa ", "San Cristóbal y Nieves ", "San Marino ", "San Vicente y las Granadinas ", "Santa Lucía ", "Santo Tomé y Príncipe ", "Senegal ", "Serbia ", "Seychelles ", "Sierra Leona ", "Singapur ", "Siria ", "Somalia ", "Sri Lanka ", "Suazilandia ", "Sudáfrica ", "Sudán ", "Sudán del Sur ", "Suecia ", "Suiza ", "Surinam ", "Tailandia ", "Taiwán ", "Tanzania ", "Tayikistán ", "Timor Oriental ", "Togo ", "Tonga ", "Trinidad y Tobago ", "Túnez ", "Turkmenistán ", "Turquía ", "Tuvalu ", "Ucrania ", "Uganda ", "Uruguay ", "Uzbekistán ", "Vanuatu ", "Vaticano ", "Venezuela ", "Vietnam ", "Yemen ", "Yibuti ", "Zambia ", "Zimbabue" }));

        lblCelular.setText("* Celular");

        lblPais.setText("* Pais");

        lblNom.setText("* Nombre y Apellidos");

        javax.swing.GroupLayout panelInformacionLayout = new javax.swing.GroupLayout(panelInformacion);
        panelInformacion.setLayout(panelInformacionLayout);
        panelInformacionLayout.setHorizontalGroup(
            panelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInformacionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDir1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblDir2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblCiudad, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblProvincia, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblPostal, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblCorreo, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblCelular, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblPais, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblNom, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNom, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(cboPais, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtDireccion2)
                        .addComponent(txtDireccion1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtProvincia, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtCiudad, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtPostal, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtCelular, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtCorreo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24))
        );
        panelInformacionLayout.setVerticalGroup(
            panelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInformacionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNom)
                    .addComponent(txtNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDir1)
                    .addComponent(txtDireccion1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDir2)
                    .addComponent(txtDireccion2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCiudad)
                    .addComponent(txtCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblProvincia)
                    .addComponent(txtProvincia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPais)
                    .addComponent(cboPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPostal)
                    .addComponent(txtPostal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCorreo)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(panelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCelular)
                    .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        lblShop.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/seo3-23-64.png"))); // NOI18N

        btnTerminarCompra.setBackground(new java.awt.Color(255, 153, 0));
        btnTerminarCompra.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnTerminarCompra.setText("TERMINAR COMPRA");
        btnTerminarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTerminarCompraActionPerformed(evt);
            }
        });

        lblVisa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/visa_electron-256.png"))); // NOI18N

        javax.swing.GroupLayout panelTerminarLayout = new javax.swing.GroupLayout(panelTerminar);
        panelTerminar.setLayout(panelTerminarLayout);
        panelTerminarLayout.setHorizontalGroup(
            panelTerminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTerminarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblVisa)
                .addContainerGap(71, Short.MAX_VALUE))
            .addGroup(panelTerminarLayout.createSequentialGroup()
                .addComponent(btnTerminarCompra)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelTerminarLayout.setVerticalGroup(
            panelTerminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTerminarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblVisa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnTerminarCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        lblSecurityInf.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lblSecurityInf.setText("INFORMACION SEGURA");

        btnRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/back.png"))); // NOI18N
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        lblKey1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lock-128_1.png"))); // NOI18N

        lblVisa1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/_Visa-32.png"))); // NOI18N

        lblExpress1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/_American_Express-32.png"))); // NOI18N

        lblPayPal1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/_Paypal-01-32.png"))); // NOI18N

        lblMasterCard1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Master_Card-32.png"))); // NOI18N

        javax.swing.GroupLayout panelControlesLayout = new javax.swing.GroupLayout(panelControles);
        panelControles.setLayout(panelControlesLayout);
        panelControlesLayout.setHorizontalGroup(
            panelControlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelControlesLayout.createSequentialGroup()
                .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 144, Short.MAX_VALUE)
                .addComponent(lblVisa1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblExpress1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPayPal1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblMasterCard1)
                .addGap(113, 113, 113)
                .addComponent(lblSecurityInf)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblKey1)
                .addContainerGap())
        );
        panelControlesLayout.setVerticalGroup(
            panelControlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelControlesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelControlesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelControlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblKey1)
                    .addGroup(panelControlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblPayPal1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblExpress1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblVisa1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblMasterCard1)
                        .addComponent(lblSecurityInf)))
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(panelInformacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelTerminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lblShop)
                        .addGap(123, 123, 123)
                        .addComponent(lblEnvio))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(panelControles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblEnvio))
                    .addComponent(lblShop))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelInformacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelTerminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelControles, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void DatosEnvio(){
    nombre=txtNom.getText();
    direccion1=txtDireccion1.getText();
    direccion2=txtDireccion2.getText();
    ciudad=txtCiudad.getText();
    provincia=txtProvincia.getText();
    pais=cboPais.getSelectedItem().toString();    
    postal=txtPostal.getText();
    correo=txtCorreo.getText();
    celular=txtCelular.getText();
        if (txtNom.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Ingrese Nombre");
            txtNom.requestFocus();
        }
       else if (txtDireccion1.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Ingrese Direccion");
            txtDireccion1.requestFocus();
        }      
       else if (txtCiudad.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Ingrese Ciudad");
            txtCiudad.requestFocus();
        }
       else if (txtProvincia.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Ingrese Provincia");
            txtProvincia.requestFocus();
        }
       else if (txtPostal.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Ingrese Codigo Postal");
            txtPostal.requestFocus();
        }
       else if (txtCorreo.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Ingrese Correo Electronico");
            txtCorreo.requestFocus();
        }
       else if (txtCelular.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Ingrese Celular");
            txtCelular.requestFocus();
        }
       else{       
        pa.nombre=nombre;
        pa.ciudad=ciudad;
        pa.pais=pais;
        pa.correo=correo;
        pa.direccion=direccion1;
       
       
        pa.setVisible(true); 
        pa.setLocation(300, 100);
        this.setVisible(false);
       }
    
    }
    private void btnTerminarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTerminarCompraActionPerformed
        
        DatosEnvio();
    }//GEN-LAST:event_btnTerminarCompraActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
       MainForm m = new MainForm();
        m.setVisible(true); 
        m.setLocation(100, 0);
        this.setVisible(false);
    }//GEN-LAST:event_btnRegresarActionPerformed

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
            java.util.logging.Logger.getLogger(Direccion_Envio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Direccion_Envio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Direccion_Envio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Direccion_Envio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Direccion_Envio().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnTerminarCompra;
    private javax.swing.JComboBox<String> cboPais;
    private javax.swing.JLabel lblCelular;
    private javax.swing.JLabel lblCiudad;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JLabel lblDir1;
    private javax.swing.JLabel lblDir2;
    private javax.swing.JLabel lblEnvio;
    private javax.swing.JLabel lblExpress1;
    private javax.swing.JLabel lblKey1;
    private javax.swing.JLabel lblMasterCard1;
    private javax.swing.JLabel lblNom;
    private javax.swing.JLabel lblPais;
    private javax.swing.JLabel lblPayPal1;
    private javax.swing.JLabel lblPostal;
    private javax.swing.JLabel lblProvincia;
    private javax.swing.JLabel lblSecurityInf;
    private javax.swing.JLabel lblShop;
    private javax.swing.JLabel lblVisa;
    private javax.swing.JLabel lblVisa1;
    private javax.swing.JPanel panelControles;
    private javax.swing.JPanel panelInformacion;
    private javax.swing.JPanel panelTerminar;
    private javax.swing.JTextField txtCelular;
    private javax.swing.JTextField txtCiudad;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDireccion1;
    private javax.swing.JTextField txtDireccion2;
    private javax.swing.JTextField txtNom;
    private javax.swing.JTextField txtPostal;
    private javax.swing.JTextField txtProvincia;
    // End of variables declaration//GEN-END:variables
}
