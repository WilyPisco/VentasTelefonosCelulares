/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.gvillena;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;


public class Pago_Credito extends javax.swing.JFrame {
    public String nombre;
    public String pago;
    public String correo;
    public String ciudad;
    public String pais;
    public String marca_celular;
    public String plan;
    public String direccion;
    

      String tarjeta="",caducidad="",clave="",titular="",precio="";
   BufferedWriter bw ;
    PrintWriter pw;
    FileWriter fw;
    File f;
    
    JSONObject obj = new JSONObject();
    JSONArray list = new JSONArray();
   
   
    
    public Pago_Credito() {
        initComponents();
        txtCaducidad.setText("01/22");
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        panelDatos = new javax.swing.JPanel();
        lblCaducidad = new javax.swing.JLabel();
        lblNumTarjeta = new javax.swing.JLabel();
        lblCodigo = new javax.swing.JLabel();
        lblTitular = new javax.swing.JLabel();
        txtNumTarjeta = new javax.swing.JTextField();
        txtCaducidad = new javax.swing.JTextField();
        txtClave = new javax.swing.JPasswordField();
        txtTitular = new javax.swing.JTextField();
        lblVisa3 = new javax.swing.JLabel();
        lblExpress2 = new javax.swing.JLabel();
        lblPayPal2 = new javax.swing.JLabel();
        lblMasterCard2 = new javax.swing.JLabel();
        rbtnTerminos = new javax.swing.JRadioButton();
        panelImages = new javax.swing.JPanel();
        btnComprar = new javax.swing.JButton();
        lblVisa2 = new javax.swing.JLabel();
        panelControles = new javax.swing.JPanel();
        lblSecurityInf = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JButton();
        lblKey1 = new javax.swing.JLabel();
        lblVisa1 = new javax.swing.JLabel();
        lblExpress1 = new javax.swing.JLabel();
        lblPayPal1 = new javax.swing.JLabel();
        lblMasterCard1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("FORMA DE PAGO");

        lblCaducidad.setText("* Caducidad");

        lblNumTarjeta.setText("* Num. Tarjeta");

        lblCodigo.setText("* Codigo de Seguridad");

        lblTitular.setText("* Titular de la Tarjeta");

        lblVisa3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/_Visa-32.png"))); // NOI18N

        lblExpress2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/_American_Express-32.png"))); // NOI18N

        lblPayPal2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/_Paypal-01-32.png"))); // NOI18N

        lblMasterCard2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Master_Card-32.png"))); // NOI18N

        rbtnTerminos.setText("Acepto los terminos y condicines de la Compra.");

        javax.swing.GroupLayout panelDatosLayout = new javax.swing.GroupLayout(panelDatos);
        panelDatos.setLayout(panelDatosLayout);
        panelDatosLayout.setHorizontalGroup(
            panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosLayout.createSequentialGroup()
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDatosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTitular, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblCodigo, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblCaducidad, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblNumTarjeta, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTitular)
                            .addGroup(panelDatosLayout.createSequentialGroup()
                                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCaducidad, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNumTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtClave, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 105, Short.MAX_VALUE))))
                    .addGroup(panelDatosLayout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(lblVisa3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblExpress2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblPayPal2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblMasterCard2)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDatosLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(rbtnTerminos)
                .addGap(64, 64, 64))
        );
        panelDatosLayout.setVerticalGroup(
            panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblMasterCard2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblVisa3)
                    .addComponent(lblExpress2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPayPal2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumTarjeta)
                    .addComponent(txtNumTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCaducidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCaducidad))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCodigo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTitular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTitular))
                .addGap(18, 18, 18)
                .addComponent(rbtnTerminos)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        btnComprar.setBackground(new java.awt.Color(255, 153, 0));
        btnComprar.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnComprar.setText("COMPRAR");
        btnComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarActionPerformed(evt);
            }
        });

        lblVisa2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/visa_electron-256.png"))); // NOI18N

        javax.swing.GroupLayout panelImagesLayout = new javax.swing.GroupLayout(panelImages);
        panelImages.setLayout(panelImagesLayout);
        panelImagesLayout.setHorizontalGroup(
            panelImagesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelImagesLayout.createSequentialGroup()
                .addGroup(panelImagesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelImagesLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblVisa2))
                    .addGroup(panelImagesLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(btnComprar, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        panelImagesLayout.setVerticalGroup(
            panelImagesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelImagesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblVisa2)
                .addGap(7, 7, 7)
                .addComponent(btnComprar, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 156, Short.MAX_VALUE)
                .addComponent(lblVisa1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblExpress1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPayPal1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMasterCard1)
                .addGap(105, 105, 105)
                .addComponent(lblSecurityInf)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblKey1)
                .addContainerGap())
        );
        panelControlesLayout.setVerticalGroup(
            panelControlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelControlesLayout.createSequentialGroup()
                .addGroup(panelControlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelControlesLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(panelControlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblKey1)
                            .addGroup(panelControlesLayout.createSequentialGroup()
                                .addComponent(lblSecurityInf)
                                .addGap(18, 18, 18))))
                    .addGroup(panelControlesLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelControlesLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelControlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblMasterCard1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblVisa1)
                            .addComponent(lblExpress1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPayPal1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(panelDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(panelImages, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(225, 225, 225)
                                .addComponent(jLabel1)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(panelControles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelImages, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelControles, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
      Direccion_Envio m = new Direccion_Envio();
        m.setVisible(true); // Para darle el tamano y localizarlo en la pantalla 
        m.setLocation(300, 100);
        this.setVisible(false);
    }//GEN-LAST:event_btnRegresarActionPerformed
    public void traerPrecio(String preciocelular){precio=preciocelular;}
    
    public void Compra(){       
       tarjeta=txtNumTarjeta.getText();
       caducidad=txtCaducidad.getText();
       clave=txtClave.getText();
       titular=txtTitular.getText();
       if(txtNumTarjeta.getText().equals("")||txtNumTarjeta.getText().length()!=16){
        JOptionPane.showMessageDialog(null, "Ingrese Numero de Tarjeta Correcta");
        txtNumTarjeta.requestFocus();
       }
       else if(txtCaducidad.getText().equals("")||txtCaducidad.getText().length()!=5){
       JOptionPane.showMessageDialog(null, "Ingrese Fecha de Caducidad Correcta");
       txtCaducidad.requestFocus();
       }
       else if(txtClave.getText().equals("")){
       JOptionPane.showMessageDialog(null, "Ingrese Clave de Tarjeta");
       txtClave.requestFocus();
       }
       else if(txtTitular.getText().equals("")){
       JOptionPane.showMessageDialog(null, "Ingrese Nombre de Titular");
       txtTitular.requestFocus();
       }
       else if(rbtnTerminos.isSelected()==false){              
              JOptionPane.showMessageDialog(null, "Acepte Terminos y Condiciones de Compra\n");              
       }
       else{
        MainForm m=new MainForm();
        m.setVisible(true);
        m.setLocation(100, 0);
        this.setVisible(false);
       }}
    public void RegistrarVentaJson()throws IOException{
      
      f= new File("D:\\ResgistroVentas.txt");
      obj.put("Vendedor", "WILMER PISCO RAMIREZ");
      obj.put("TIENDA", "CLARO PERU SAC");
      JSONObject objc = new JSONObject();
       objc.put("Nombre: ", nombre);              
      objc.put("Email: ", correo);
      objc.put("Ciudad: ", ciudad);
      objc.put("Pais: ", pais);
      objc.put("Marca de Celular: ", marca_celular);
      objc.put("Plan PostPago: ",plan);      
      objc.put("Pago: ", pago);
      obj.put("FACTURA",objc );      
      fw= new FileWriter("D:\\ResgistroVentas.txt");
      fw.write(obj.toJSONString());
      fw.flush();
      fw.close();
  }
    
    
    private void btnComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarActionPerformed
    
        Compra();
          try {
               RegistrarVentaJson(); 
              JOptionPane.showMessageDialog(null, "COMPRA CON EXITO");
          } catch (IOException ex) {
              JOptionPane.showMessageDialog(null, "ERROR AL CREAR FICHERO DE VENTA\n"+ex);
          }
    }//GEN-LAST:event_btnComprarActionPerformed
        public void AbrirCarpeta()
        {

        }
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
            java.util.logging.Logger.getLogger(Pago_Credito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pago_Credito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pago_Credito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pago_Credito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pago_Credito().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnComprar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblCaducidad;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblExpress1;
    private javax.swing.JLabel lblExpress2;
    private javax.swing.JLabel lblKey1;
    private javax.swing.JLabel lblMasterCard1;
    private javax.swing.JLabel lblMasterCard2;
    private javax.swing.JLabel lblNumTarjeta;
    private javax.swing.JLabel lblPayPal1;
    private javax.swing.JLabel lblPayPal2;
    private javax.swing.JLabel lblSecurityInf;
    private javax.swing.JLabel lblTitular;
    private javax.swing.JLabel lblVisa1;
    private javax.swing.JLabel lblVisa2;
    private javax.swing.JLabel lblVisa3;
    private javax.swing.JPanel panelControles;
    private javax.swing.JPanel panelDatos;
    private javax.swing.JPanel panelImages;
    private javax.swing.JRadioButton rbtnTerminos;
    private javax.swing.JTextField txtCaducidad;
    private javax.swing.JPasswordField txtClave;
    private javax.swing.JTextField txtNumTarjeta;
    private javax.swing.JTextField txtTitular;
    // End of variables declaration//GEN-END:variables

}
