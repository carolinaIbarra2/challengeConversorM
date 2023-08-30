package challengeconversorm.igu;

import challengeconversorm.logica.ConversorTemperatura;
import javax.swing.JOptionPane;

public class TemperatureWindow extends javax.swing.JFrame {

    double cantidad;
    
   
    public TemperatureWindow() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtAmountEntered = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cbStartingCoin = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        cbEndCoin = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtResultT = new javax.swing.JTextPane();
        btnClearT = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btnConvertirTemperatura = new javax.swing.JButton();

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(521, 328));
        setResizable(false);

        jPanel1.setPreferredSize(new java.awt.Dimension(521, 318));

        jLabel1.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 102));
        jLabel1.setText("CONVERSOR TEMPERATURA");

        jLabel2.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        jLabel2.setText("Digita cantidad:");

        txtAmountEntered.setBackground(new java.awt.Color(255, 204, 204));

        jLabel3.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        jLabel3.setText("De:");

        cbStartingCoin.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        cbStartingCoin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Celsius", "Farenheit", "Kelvin" }));
        cbStartingCoin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbStartingCoinActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        jLabel4.setText("A:");

        cbEndCoin.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        cbEndCoin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Farenheit", "Celsius", "Kelvin", " " }));
        cbEndCoin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbEndCoinActionPerformed(evt);
            }
        });

        jScrollPane2.setViewportView(txtResultT);

        btnClearT.setBackground(new java.awt.Color(255, 255, 204));
        btnClearT.setFont(new java.awt.Font("Segoe Print", 3, 10)); // NOI18N
        btnClearT.setText("LIMPIAR");
        btnClearT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearTActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Segoe Script", 0, 12)); // NOI18N
        jButton1.setText("menu inicial");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnConvertirTemperatura.setBackground(new java.awt.Color(204, 204, 255));
        btnConvertirTemperatura.setFont(new java.awt.Font("Segoe Print", 3, 10)); // NOI18N
        btnConvertirTemperatura.setText("CONVERTIR");
        btnConvertirTemperatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConvertirTemperaturaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addContainerGap(440, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                                .addComponent(cbStartingCoin, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnClearT)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnConvertirTemperatura)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(cbEndCoin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtAmountEntered, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(102, 102, 102))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(126, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(122, 122, 122))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtAmountEntered, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbStartingCoin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbEndCoin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnConvertirTemperatura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(btnClearT, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 527, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 319, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbStartingCoinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbStartingCoinActionPerformed
        
    }//GEN-LAST:event_cbStartingCoinActionPerformed

    private void cbEndCoinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbEndCoinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbEndCoinActionPerformed

    private void btnClearTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearTActionPerformed
        txtAmountEntered.setText(""); // Limpiar el campo de cantidad
        txtResultT.setText("");        // Limpiar el campo de resultado
    }//GEN-LAST:event_btnClearTActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();

        MainWindow mainWindow = new MainWindow();
        mainWindow.setVisible(true);              //ventana visible
        mainWindow.setLocationRelativeTo(null);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnConvertirTemperaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConvertirTemperaturaActionPerformed
      
        double cantidad = 0;
        String temperaturaInicial = cbStartingCoin.getSelectedItem().toString();
        String temperaturaFinal = cbEndCoin.getSelectedItem().toString();
        
        try{
         cantidad = Double.parseDouble(txtAmountEntered.getText());         
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null,"Por favor, ingrese un valor numérico." );
            txtAmountEntered.setText(""); // Limpiar el campo de cantidad
            txtResultT.setText("");        // Limpiar el campo de resultado
        }
        
        ConversorTemperatura conversorTemperatura = new ConversorTemperatura(cantidad);
        double resultado = conversorTemperatura.operacionesConversor(temperaturaInicial, temperaturaFinal);           
        txtResultT.setText(Double.toString(resultado));
    }//GEN-LAST:event_btnConvertirTemperaturaActionPerformed

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClearT;
    private javax.swing.JButton btnConvertirTemperatura;
    private javax.swing.JComboBox<String> cbEndCoin;
    private javax.swing.JComboBox<String> cbStartingCoin;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JTextField txtAmountEntered;
    private javax.swing.JTextPane txtResultT;
    // End of variables declaration//GEN-END:variables
}
