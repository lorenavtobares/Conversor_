/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversor.Formulario;

/**
 *
 * @author loren
 */
public class Ventana_Principal extends javax.swing.JFrame {

    /**
     * Creates new form Ventana_Principal
     */
    public Ventana_Principal() {
        initComponents();
        this.setSize(700, 500); // tamaño de la ventana
        this.setLocationRelativeTo(null); // posicion de la ventana
        this.setTitle("Conversor"); // titulo de la ventana
        this.setResizable(false);// impide que se cambie el tamaño de la ventana
        
        monedaPantalla.setVisible(false);
        temperaturaPantalla.setVisible(false); 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        monedaSec = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        temperaturaSec = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        sinConversor = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        monedaPantalla = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        listaMoneda = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        boxIngresoMoneda = new javax.swing.JTextField();
        boxResultadoMoneda = new javax.swing.JTextField();
        botonMoneda = new javax.swing.JButton();
        temperaturaPantalla = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        listaTemperatura = new javax.swing.JComboBox<>();
        boxResultadoTemperatura = new javax.swing.JTextField();
        boxIngresoTemperatura = new javax.swing.JTextField();
        botonTemperatura = new javax.swing.JButton();

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/conversor/Imagenes/Portada Informe Anual Geométrico Gris (1).png"))); // NOI18N
        jLabel1.setText("Conversor de Temperatura");

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        monedaSec.setBackground(new java.awt.Color(255, 255, 255));
        monedaSec.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                monedaSecMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel4.setText("Conversor de monedas");

        javax.swing.GroupLayout monedaSecLayout = new javax.swing.GroupLayout(monedaSec);
        monedaSec.setLayout(monedaSecLayout);
        monedaSecLayout.setHorizontalGroup(
            monedaSecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(monedaSecLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel4)
                .addContainerGap(48, Short.MAX_VALUE))
        );
        monedaSecLayout.setVerticalGroup(
            monedaSecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(monedaSecLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(monedaSec, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 240, 30));

        temperaturaSec.setBackground(new java.awt.Color(255, 255, 255));
        temperaturaSec.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                temperaturaSecMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel3.setText("Conversor de Temperatura");

        javax.swing.GroupLayout temperaturaSecLayout = new javax.swing.GroupLayout(temperaturaSec);
        temperaturaSec.setLayout(temperaturaSecLayout);
        temperaturaSecLayout.setHorizontalGroup(
            temperaturaSecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(temperaturaSecLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel3)
                .addContainerGap(42, Short.MAX_VALUE))
        );
        temperaturaSecLayout.setVerticalGroup(
            temperaturaSecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(temperaturaSecLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(temperaturaSec, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 240, 30));

        sinConversor.setBackground(new java.awt.Color(255, 255, 255));
        sinConversor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/conversor/Imagenes/Portada Informe Anual Geométrico Gris (1).png"))); // NOI18N
        sinConversor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sinConversorMouseClicked(evt);
            }
        });
        jPanel1.add(sinConversor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 500));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 500));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        monedaPantalla.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setText("Seleccione el tipo de conversion que desea");

        jLabel7.setText("Ingrese el monto");

        listaMoneda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "De pesos argentinos a dolares", "De dolares a pesos argentinos", "De dolares a euros", "De dolares a libras", "De euros a dolares", "De libras a dolares", " ", " ", " " }));
        listaMoneda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaMonedaActionPerformed(evt);
            }
        });

        jLabel12.setText("Conversion:");

        boxIngresoMoneda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxIngresoMonedaActionPerformed(evt);
            }
        });

        boxResultadoMoneda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxResultadoMonedaActionPerformed(evt);
            }
        });

        botonMoneda.setText("Convertir");
        botonMoneda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMonedaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout monedaPantallaLayout = new javax.swing.GroupLayout(monedaPantalla);
        monedaPantalla.setLayout(monedaPantallaLayout);
        monedaPantallaLayout.setHorizontalGroup(
            monedaPantallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, monedaPantallaLayout.createSequentialGroup()
                .addGroup(monedaPantallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(monedaPantallaLayout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(boxIngresoMoneda, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(monedaPantallaLayout.createSequentialGroup()
                        .addContainerGap(128, Short.MAX_VALUE)
                        .addComponent(jLabel5)))
                .addGap(87, 87, 87))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, monedaPantallaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonMoneda)
                .addGap(155, 155, 155))
            .addGroup(monedaPantallaLayout.createSequentialGroup()
                .addGroup(monedaPantallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(monedaPantallaLayout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(listaMoneda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(monedaPantallaLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jLabel12)
                        .addGap(37, 37, 37)
                        .addComponent(boxResultadoMoneda)))
                .addGap(98, 98, 98))
        );
        monedaPantallaLayout.setVerticalGroup(
            monedaPantallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(monedaPantallaLayout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(listaMoneda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addGroup(monedaPantallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(boxIngresoMoneda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addComponent(botonMoneda)
                .addGap(80, 80, 80)
                .addGroup(monedaPantallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(boxResultadoMoneda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(132, Short.MAX_VALUE))
        );

        temperaturaPantalla.setBackground(new java.awt.Color(255, 255, 255));

        jLabel8.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel8.setText("Seleccione el tipo de temperatura que desea convertir");

        jLabel10.setText("Ingrese la temperatura");

        jLabel11.setText("Resultado");

        listaTemperatura.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Celsius a Fahrenheit  ", "Celsius a Kelvin", "Fahrenheit   a Celsius", "Fahrenheit a Kelvin", "Kelvin a  Celsius", "Kelvin a Fahrenheit" }));
        listaTemperatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaTemperaturaActionPerformed(evt);
            }
        });

        boxIngresoTemperatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxIngresoTemperaturaActionPerformed(evt);
            }
        });

        botonTemperatura.setText("Convertir");
        botonTemperatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonTemperaturaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout temperaturaPantallaLayout = new javax.swing.GroupLayout(temperaturaPantalla);
        temperaturaPantalla.setLayout(temperaturaPantallaLayout);
        temperaturaPantallaLayout.setHorizontalGroup(
            temperaturaPantallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(temperaturaPantallaLayout.createSequentialGroup()
                .addGroup(temperaturaPantallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(temperaturaPantallaLayout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addGroup(temperaturaPantallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(temperaturaPantallaLayout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(18, 18, 18)
                                .addComponent(boxIngresoTemperatura))
                            .addGroup(temperaturaPantallaLayout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(42, 42, 42)
                                .addComponent(boxResultadoTemperatura, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(temperaturaPantallaLayout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jLabel8))
                    .addGroup(temperaturaPantallaLayout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(listaTemperatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(61, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, temperaturaPantallaLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(botonTemperatura)
                .addGap(124, 124, 124))
        );
        temperaturaPantallaLayout.setVerticalGroup(
            temperaturaPantallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(temperaturaPantallaLayout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(listaTemperatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(temperaturaPantallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(boxIngresoTemperatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addComponent(botonTemperatura)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(temperaturaPantallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(boxResultadoTemperatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(204, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(temperaturaPantalla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(monedaPantalla, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(temperaturaPantalla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(monedaPantalla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 460, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void monedaSecMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_monedaSecMouseClicked
        monedaPantalla.setVisible(true);
        temperaturaPantalla.setVisible(false);

        // TODO add your handling code here:
    }//GEN-LAST:event_monedaSecMouseClicked

    private void temperaturaSecMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_temperaturaSecMouseClicked

        monedaPantalla.setVisible(false);
        temperaturaPantalla.setVisible(true);

// TODO add your handling code here:
    }//GEN-LAST:event_temperaturaSecMouseClicked

    private void boxResultadoMonedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxResultadoMonedaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxResultadoMonedaActionPerformed

    private void boxIngresoMonedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxIngresoMonedaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxIngresoMonedaActionPerformed

    private void listaTemperaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaTemperaturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_listaTemperaturaActionPerformed

    private void boxIngresoTemperaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxIngresoTemperaturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxIngresoTemperaturaActionPerformed

    private void listaMonedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaMonedaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_listaMonedaActionPerformed

    private void botonMonedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMonedaActionPerformed
        int posicionLista = listaMoneda.getSelectedIndex();//recibe el tipo de cambio   
        double resultado;            
        double montoIngresado = Double.parseDouble(boxIngresoMoneda.getText()) ;
        switch (posicionLista) {

            case 0:
                resultado= 0.0048 * montoIngresado;
                boxResultadoMoneda.setText(resultado + " ");
                break;
            case 1:
                resultado = montoIngresado * 209.41;
                boxResultadoMoneda.setText(resultado + " ");
                break;
            case 2:
                resultado = montoIngresado * 0.91;
                boxResultadoMoneda.setText(resultado + " ");
                break;
            case 3:
                resultado = montoIngresado * 0.81;
                boxResultadoMoneda.setText(resultado + " ");
                break;
            case 4:
                resultado = montoIngresado * 1.10;
                boxResultadoMoneda.setText(resultado + " ");
                break;
            case 5:
                resultado = montoIngresado * 1.24;
                boxResultadoMoneda.setText(resultado + " ");
                break;

        }


    }//GEN-LAST:event_botonMonedaActionPerformed

    private void botonTemperaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonTemperaturaActionPerformed
        int posicionLista = listaTemperatura.getSelectedIndex();//recibe la posicion de temperatura   
        double resultado;            
        double gradoIngresado = Double.parseDouble(boxIngresoTemperatura.getText()) ;
        
        switch (posicionLista) {

            case 0:
                resultado = (gradoIngresado * 9/5) +32;
                boxResultadoTemperatura.setText(resultado + " ");
                break;
            case 1:
                resultado = gradoIngresado + 273.15;
                boxResultadoTemperatura.setText(resultado + " ");
                break;
            case 2:
                resultado = (gradoIngresado - 32)*5/9;
                boxResultadoTemperatura.setText(resultado + " ");
                break;
            case 3:
                resultado = (gradoIngresado - 32)*5/9 + 273.15 ;
                boxResultadoTemperatura.setText(resultado + " ");
                break;
            case 4:
                resultado = gradoIngresado - 273.15;
                boxResultadoTemperatura.setText(resultado + " ");
                break;
            case 5:
                resultado = (gradoIngresado - 273.15)* 9/5 + 32;
                boxResultadoTemperatura.setText(resultado + " ");
                break;

        }     // TODO add your handling code here:
    }//GEN-LAST:event_botonTemperaturaActionPerformed

    private void sinConversorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sinConversorMouseClicked
        monedaPantalla.setVisible(false);
        temperaturaPantalla.setVisible(false);       // TODO add your handling code here:
    }//GEN-LAST:event_sinConversorMouseClicked

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
            java.util.logging.Logger.getLogger(Ventana_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana_Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonMoneda;
    private javax.swing.JButton botonTemperatura;
    private javax.swing.JTextField boxIngresoMoneda;
    private javax.swing.JTextField boxIngresoTemperatura;
    private javax.swing.JTextField boxResultadoMoneda;
    private javax.swing.JTextField boxResultadoTemperatura;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JComboBox<String> listaMoneda;
    private javax.swing.JComboBox<String> listaTemperatura;
    private javax.swing.JPanel monedaPantalla;
    private javax.swing.JPanel monedaSec;
    private javax.swing.JLabel sinConversor;
    private javax.swing.JPanel temperaturaPantalla;
    private javax.swing.JPanel temperaturaSec;
    // End of variables declaration//GEN-END:variables
}
