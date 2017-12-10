/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gvillena;

import com.google.gson.Gson;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.SpinnerListModel;

/**
 *
 * @author alumno
 */
public class MainForm extends javax.swing.JFrame {
    
    Pago_Credito pa= new Pago_Credito();

    ArrayList<TelefonoMovil> ListaTelefonosMoviles;
    ArrayList<PlanPostPago> ListaPlanesPostPago;
        private String plan;
        private String marcaCelular;
    /**
     * Creates new form MainForm
     */
    public MainForm() {
        
        initComponents();
       
        // Inicializando
        ListaTelefonosMoviles = new ArrayList<TelefonoMovil>();
        ListaPlanesPostPago = new ArrayList<PlanPostPago>();                                      
                
        String jsonClaro = "";
        String jsonPlanes = "";
        
        Scanner scannerClaro;
        Scanner scannerPlanes;
        try 
        {
            scannerClaro = new Scanner(new FileReader("D:\\jsonClaro.txt"));                                    
            scannerPlanes = new Scanner(new FileReader("D:\\jsonPlanes.txt"));
            
            StringBuilder sbClaro = new StringBuilder();                         
            
            while (scannerClaro.hasNext()) {                
                sbClaro.append(scannerClaro.next());
            }
            
            StringBuilder sbPlanes = new StringBuilder();            
            while (scannerPlanes.hasNext()) {
                sbPlanes.append(scannerPlanes.next());                
            }
            
            jsonClaro = sbClaro.toString();
            jsonPlanes = sbPlanes.toString();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        // 
        Gson gson = new Gson();
        
        // 
        TelefonoMovil[] listaClaro = null;
        PlanPostPago[] listaPlanes = null;
        
        //
        listaClaro = gson.fromJson(jsonClaro, TelefonoMovil[].class);         
        listaPlanes = gson.fromJson(jsonPlanes, PlanPostPago[].class);         
        
        // 
        for (int i = 0; i < listaClaro.length; i++) {                        
            ListaTelefonosMoviles.add(listaClaro[i]);
        }
        
        //
        for (int i = 0; i < listaPlanes.length; i++) {                        
            ListaPlanesPostPago.add(listaPlanes[i]);
        }                
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        buttonGroup1 = new javax.swing.ButtonGroup();
        pblEquiposMovilles = new javax.swing.JScrollPane();
        lstEquiposMoviles = new javax.swing.JList();
        lblTEquiposMoviles = new javax.swing.JLabel();
        lblTituloApp = new javax.swing.JLabel();
        spPlanesPostpago = new javax.swing.JSpinner();
        lblDescripcion = new javax.swing.JLabel();
        plCaracteristicas = new javax.swing.JPanel();
        plPantalla = new javax.swing.JPanel();
        lblPantallaImg = new javax.swing.JLabel();
        lblPantalla = new javax.swing.JLabel();
        lblTPantalla = new javax.swing.JLabel();
        plCamara = new javax.swing.JPanel();
        lblCamara = new javax.swing.JLabel();
        lblTCamara = new javax.swing.JLabel();
        lblCamaraImg = new javax.swing.JLabel();
        plProcesador = new javax.swing.JPanel();
        lblProcesador = new javax.swing.JLabel();
        lblTProcesador = new javax.swing.JLabel();
        lblProcesadorImg = new javax.swing.JLabel();
        lblTElige = new javax.swing.JLabel();
        plBeneficiosPlan = new javax.swing.JPanel();
        plMinutos = new javax.swing.JPanel();
        lblMinutosT = new javax.swing.JLabel();
        lblMinutos = new javax.swing.JLabel();
        plInternet = new javax.swing.JPanel();
        lblInternetT = new javax.swing.JLabel();
        lblInternet = new javax.swing.JLabel();
        plRPC = new javax.swing.JPanel();
        lblRPCT = new javax.swing.JLabel();
        lblRPC = new javax.swing.JLabel();
        plSMS = new javax.swing.JPanel();
        lblSMST = new javax.swing.JLabel();
        lblSMS = new javax.swing.JLabel();
        lblTPrecio = new javax.swing.JLabel();
        lblPrecio = new javax.swing.JLabel();
        btnComprar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        lstEquiposMoviles.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lstEquiposMoviles.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstEquiposMovilesValueChanged(evt);
            }
        });
        pblEquiposMovilles.setViewportView(lstEquiposMoviles);

        lblTEquiposMoviles.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblTEquiposMoviles.setText("EQUIPOS DISPONIBLES");

        lblTituloApp.setFont(new java.awt.Font("Dialog", 1, 40)); // NOI18N
        lblTituloApp.setText("TIENDA CLARO");

        spPlanesPostpago.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        spPlanesPostpago.setModel(new javax.swing.SpinnerListModel(new String[] {"Claro MAX 99", "Claro MAX 149", "Claro MAX 189"}));
        spPlanesPostpago.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spPlanesPostpagoStateChanged(evt);
            }
        });

        lblDescripcion.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        lblDescripcion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDescripcion.setText("TELEFONO MOVIL");

        plPantalla.setPreferredSize(new java.awt.Dimension(250, 159));
        plPantalla.setLayout(new java.awt.GridBagLayout());

        lblPantallaImg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPantallaImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon-pantalla.png"))); // NOI18N
        lblPantallaImg.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 3, 0, 3);
        plPantalla.add(lblPantallaImg, gridBagConstraints);

        lblPantalla.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        lblPantalla.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPantalla.setText("-");
        lblPantalla.setFocusable(false);
        lblPantalla.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        plPantalla.add(lblPantalla, gridBagConstraints);

        lblTPantalla.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblTPantalla.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTPantalla.setText("PANTALLA");
        lblTPantalla.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblTPantalla.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        plPantalla.add(lblTPantalla, gridBagConstraints);

        plCaracteristicas.add(plPantalla);

        plCamara.setPreferredSize(new java.awt.Dimension(250, 159));
        plCamara.setLayout(new java.awt.GridBagLayout());

        lblCamara.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        lblCamara.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCamara.setText("-");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 6, 0, 6);
        plCamara.add(lblCamara, gridBagConstraints);

        lblTCamara.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblTCamara.setText("CAMARA");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        plCamara.add(lblTCamara, gridBagConstraints);

        lblCamaraImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon-camara.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.insets = new java.awt.Insets(0, 12, 0, 12);
        plCamara.add(lblCamaraImg, gridBagConstraints);

        plCaracteristicas.add(plCamara);

        plProcesador.setPreferredSize(new java.awt.Dimension(250, 159));
        plProcesador.setLayout(new java.awt.GridBagLayout());

        lblProcesador.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        lblProcesador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblProcesador.setText("-");
        lblProcesador.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 6, 0, 0);
        plProcesador.add(lblProcesador, gridBagConstraints);

        lblTProcesador.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblTProcesador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTProcesador.setText("PROCESADOR");
        lblTProcesador.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 5);
        plProcesador.add(lblTProcesador, gridBagConstraints);

        lblProcesadorImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon-procesador.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 5);
        plProcesador.add(lblProcesadorImg, gridBagConstraints);

        plCaracteristicas.add(plProcesador);

        lblTElige.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        lblTElige.setText("¡Elige el mejor plan para ti!");

        java.awt.GridBagLayout plBeneficiosPlanLayout = new java.awt.GridBagLayout();
        plBeneficiosPlanLayout.columnWidths = new int[] {0, 4, 0};
        plBeneficiosPlanLayout.rowHeights = new int[] {0, 4, 0};
        plBeneficiosPlan.setLayout(plBeneficiosPlanLayout);

        plMinutos.setLayout(new java.awt.BorderLayout());

        lblMinutosT.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblMinutosT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMinutosT.setText("MINUTOS");
        plMinutos.add(lblMinutosT, java.awt.BorderLayout.CENTER);

        lblMinutos.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblMinutos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMinutos.setText("Ilimitado");
        plMinutos.add(lblMinutos, java.awt.BorderLayout.PAGE_START);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(21, 29, 21, 29);
        plBeneficiosPlan.add(plMinutos, gridBagConstraints);

        plInternet.setLayout(new java.awt.BorderLayout());

        lblInternetT.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblInternetT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInternetT.setText("INTERNET");
        plInternet.add(lblInternetT, java.awt.BorderLayout.PAGE_END);

        lblInternet.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblInternet.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInternet.setText("Ilimitado");
        plInternet.add(lblInternet, java.awt.BorderLayout.PAGE_START);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(21, 29, 21, 29);
        plBeneficiosPlan.add(plInternet, gridBagConstraints);

        plRPC.setLayout(new java.awt.BorderLayout());

        lblRPCT.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblRPCT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRPCT.setText("RPC");
        plRPC.add(lblRPCT, java.awt.BorderLayout.CENTER);

        lblRPC.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblRPC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRPC.setText("Ilimitado");
        plRPC.add(lblRPC, java.awt.BorderLayout.PAGE_START);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(21, 29, 21, 29);
        plBeneficiosPlan.add(plRPC, gridBagConstraints);

        plSMS.setLayout(new java.awt.BorderLayout());

        lblSMST.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblSMST.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSMST.setText("SMS");
        plSMS.add(lblSMST, java.awt.BorderLayout.CENTER);

        lblSMS.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblSMS.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSMS.setText("Ilimitado");
        plSMS.add(lblSMS, java.awt.BorderLayout.PAGE_START);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(21, 29, 21, 29);
        plBeneficiosPlan.add(plSMS, gridBagConstraints);

        lblTPrecio.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblTPrecio.setText("Precio: ");

        lblPrecio.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        lblPrecio.setText("S/. 2700");

        btnComprar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnComprar.setText("¡COMPRAR!");
        btnComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTituloApp)
                        .addContainerGap(844, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pblEquiposMovilles, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTEquiposMoviles))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(plCaracteristicas, javax.swing.GroupLayout.PREFERRED_SIZE, 790, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(204, 204, 204)
                                .addComponent(lblDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(174, 174, 174)
                                .addComponent(lblTElige))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnComprar, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addGap(141, 141, 141)
                                            .addComponent(lblTPrecio)
                                            .addGap(18, 18, 18)
                                            .addComponent(lblPrecio))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(20, 20, 20)
                                            .addComponent(spPlanesPostpago, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(30, 30, 30)
                                    .addComponent(plBeneficiosPlan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(34, 34, 34))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lblTituloApp)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTEquiposMoviles)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pblEquiposMovilles, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(plCaracteristicas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(lblTElige)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(plBeneficiosPlan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(spPlanesPostpago, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblTPrecio)
                                    .addComponent(lblPrecio))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnComprar)
                        .addContainerGap(54, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
        //
        DefaultListModel<String> listaEquiposClaroModel = new DefaultListModel<String>();                
        for (TelefonoMovil telefonoMovil : ListaTelefonosMoviles) {
            listaEquiposClaroModel.addElement(telefonoMovil.getDescripcion());
        }                                
        lstEquiposMoviles.setModel(listaEquiposClaroModel);                
        
        //
        ArrayList<String> listaPlanesString = new ArrayList<String>();        
        for (PlanPostPago planPostPago : ListaPlanesPostPago) {
            listaPlanesString.add(planPostPago.getNombrePlan());
        }
        spPlanesPostpago.setModel(new SpinnerListModel(listaPlanesString));           
        
    }//GEN-LAST:event_formWindowOpened

    private void lstEquiposMovilesValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstEquiposMovilesValueChanged
        
        if (!evt.getValueIsAdjusting()) {
            int indiceSeleccionado = lstEquiposMoviles.getSelectedIndex();           
            if (indiceSeleccionado == 0) {                
                TelefonoMovil telMovSel = ListaTelefonosMoviles.get(indiceSeleccionado);                
                
                String descripcion = telMovSel.getDescripcion();
                String pantalla = telMovSel.getPantalla();
                String camara = telMovSel.getCamara();
                String procesador = telMovSel.getProcesador();
                marcaCelular="GalaxyS7";
                lblDescripcion.setText(descripcion);
                lblPantalla.setText(pantalla);
                lblCamara.setText(camara);
                lblProcesador.setText(procesador);
                lblPrecio.setText("2700.00");
                        
            }
            else  if (indiceSeleccionado == 1) {
                
                TelefonoMovil telMovSel = ListaTelefonosMoviles.get(indiceSeleccionado);                
                
                String descripcion = telMovSel.getDescripcion();
                String pantalla = telMovSel.getPantalla();
                String camara = telMovSel.getCamara();
                String procesador = telMovSel.getProcesador();
                marcaCelular="iPhone7";
                lblDescripcion.setText(descripcion);
                lblPantalla.setText(pantalla);
                lblCamara.setText(camara);
                lblProcesador.setText(procesador);
                lblPrecio.setText("3700.00");
                        
            }
        }        
    }//GEN-LAST:event_lstEquiposMovilesValueChanged

    private void spPlanesPostpagoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spPlanesPostpagoStateChanged
        
        String planSeleccionado = String.valueOf(spPlanesPostpago.getValue());        
        
        String codigoPlan = "";
        
        for (PlanPostPago planPostPago : ListaPlanesPostPago) {
            if (planPostPago.getNombrePlan().equals(planSeleccionado)) {
                
                codigoPlan = planPostPago.getCodigoPlan();
                plan=planPostPago.getNombrePlan();
                
                lblMinutos.setText(planPostPago.getMinutos());
                lblInternet.setText(planPostPago.getInternet());
                lblRPC.setText(planPostPago.getRpc());                
                lblSMS.setText(planPostPago.getSms());                                        
            }
        }
        
        // Cambiando el precio 
        TelefonoMovil tlfMvlSel = ListaTelefonosMoviles.get(lstEquiposMoviles.getSelectedIndex());            
        double precioMovil = tlfMvlSel.getPrecios().get(codigoPlan);
                
        System.out.println("¿ESTE ES? -> " + tlfMvlSel.getDescripcion());
        System.out.println("¿ESTE ES EL CODIGO DEL PLAN? -> " + codigoPlan); 
        System.out.println("¿ESTE ES EL PRECIO? -> " + precioMovil);
        String precio=String.valueOf( precioMovil);
        
        lblPrecio.setText("S/ " + precioMovil);                
        
    }//GEN-LAST:event_spPlanesPostpagoStateChanged

    private void btnComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarActionPerformed
        pa.plan=plan;
        pa.precio=lblPrecio.getText();
        pa.marca_celular=marcaCelular;
        Direccion_Envio m = new Direccion_Envio();
        m.setVisible(true); // Para darle el tamano y localizarlo en la pantalla 
        m.setLocation(300, 100);
        this.setVisible(false);
    }//GEN-LAST:event_btnComprarActionPerformed

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
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
             MainForm m =  new MainForm();
                m.setVisible(true);
                m.setLocation(100,0);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnComprar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel lblCamara;
    private javax.swing.JLabel lblCamaraImg;
    private javax.swing.JLabel lblDescripcion;
    private javax.swing.JLabel lblInternet;
    private javax.swing.JLabel lblInternetT;
    private javax.swing.JLabel lblMinutos;
    private javax.swing.JLabel lblMinutosT;
    private javax.swing.JLabel lblPantalla;
    private javax.swing.JLabel lblPantallaImg;
    public static javax.swing.JLabel lblPrecio;
    private javax.swing.JLabel lblProcesador;
    private javax.swing.JLabel lblProcesadorImg;
    private javax.swing.JLabel lblRPC;
    private javax.swing.JLabel lblRPCT;
    private javax.swing.JLabel lblSMS;
    private javax.swing.JLabel lblSMST;
    private javax.swing.JLabel lblTCamara;
    private javax.swing.JLabel lblTElige;
    private javax.swing.JLabel lblTEquiposMoviles;
    private javax.swing.JLabel lblTPantalla;
    private javax.swing.JLabel lblTPrecio;
    private javax.swing.JLabel lblTProcesador;
    private javax.swing.JLabel lblTituloApp;
    public static javax.swing.JList lstEquiposMoviles;
    private javax.swing.JScrollPane pblEquiposMovilles;
    private javax.swing.JPanel plBeneficiosPlan;
    private javax.swing.JPanel plCamara;
    private javax.swing.JPanel plCaracteristicas;
    private javax.swing.JPanel plInternet;
    private javax.swing.JPanel plMinutos;
    private javax.swing.JPanel plPantalla;
    private javax.swing.JPanel plProcesador;
    private javax.swing.JPanel plRPC;
    private javax.swing.JPanel plSMS;
    public static javax.swing.JSpinner spPlanesPostpago;
    // End of variables declaration//GEN-END:variables

    
}
