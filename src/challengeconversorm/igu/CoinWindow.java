package challengeconversorm.igu;

import challengeconversorm.logica.ConversorMonedas;
import challengeconversorm.logica.FactorConversionMonedas;
import javax.swing.JOptionPane;


public class CoinWindow extends javax.swing.JFrame {

    double cantidad;
    double divisa1; 
    double divisa2;

   
    public CoinWindow() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtAmountEntered = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cbStartingCoin = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        cbEndCoin = new javax.swing.JComboBox<>();
        btnConvertMonedas = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtResult = new javax.swing.JTextPane();
        btnClear = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setPreferredSize(new java.awt.Dimension(521, 350));

        jLabel1.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 102));
        jLabel1.setText("CONVERSOR MONEDAS");

        jLabel2.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        jLabel2.setText("Digita cantidad:");

        txtAmountEntered.setBackground(new java.awt.Color(255, 204, 204));
        txtAmountEntered.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAmountEnteredActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        jLabel3.setText("De:");

        cbStartingCoin.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        cbStartingCoin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Peso colombiano", "Dolar", "Euro", "Libras", "Yen", "Won Coreano" }));
        cbStartingCoin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbStartingCoinActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        jLabel4.setText("A:");

        cbEndCoin.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        cbEndCoin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dolar", "Euro", "Libras", "Yen", "Won Coreano", "Peso colombiano" }));
        cbEndCoin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbEndCoinActionPerformed(evt);
            }
        });

        btnConvertMonedas.setBackground(new java.awt.Color(153, 255, 255));
        btnConvertMonedas.setFont(new java.awt.Font("Segoe Print", 3, 10)); // NOI18N
        btnConvertMonedas.setText("CONVERTIR");
        btnConvertMonedas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConvertMonedasActionPerformed(evt);
            }
        });

        jScrollPane2.setViewportView(txtResult);

        btnClear.setBackground(new java.awt.Color(255, 255, 204));
        btnClear.setFont(new java.awt.Font("Segoe Print", 3, 10)); // NOI18N
        btnClear.setText("LIMPIAR");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Segoe Script", 0, 12)); // NOI18N
        jButton1.setText("menu inicial");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btnClear)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                                .addComponent(btnConvertMonedas)
                                .addGap(66, 66, 66))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)
                                    .addComponent(cbStartingCoin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4)
                            .addComponent(cbEndCoin, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtAmountEntered)
                            .addComponent(jScrollPane2))))
                .addContainerGap(51, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAmountEntered, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbEndCoin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbStartingCoin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnConvertMonedas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(35, 35, 35)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(64, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbStartingCoinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbStartingCoinActionPerformed
        
    }//GEN-LAST:event_cbStartingCoinActionPerformed

    private void btnConvertMonedasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConvertMonedasActionPerformed
        //capturar datos
        
        String divisa1 = cbStartingCoin.getSelectedItem().toString();
        String divisa2 = cbEndCoin.getSelectedItem().toString();
        
        double cantidad = 0;
                
        try{
         cantidad = Double.parseDouble(txtAmountEntered.getText());         
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null,"Por favor, ingrese un valor numérico." );
            txtAmountEntered.setText(""); // Limpiar el campo de cantidad
            txtResult.setText("");        // Limpiar el campo de resultado
        }
        
        ConversorMonedas conversorMonedas = new ConversorMonedas(cantidad);
        double resultado = conversorMonedas.operacionesConversor(divisa1, divisa2);           
        txtResult.setText(Double.toString(resultado));
    }//GEN-LAST:event_btnConvertMonedasActionPerformed

    private void cbEndCoinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbEndCoinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbEndCoinActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        txtAmountEntered.setText(""); // Limpiar el campo de cantidad
        txtResult.setText("");        // Limpiar el campo de resultado
    }//GEN-LAST:event_btnClearActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
                
        MainWindow mainWindow = new MainWindow();
        mainWindow.setVisible(true);              //ventana visible
        mainWindow.setLocationRelativeTo(null);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtAmountEnteredActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAmountEnteredActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAmountEnteredActionPerformed

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnConvertMonedas;
    private javax.swing.JComboBox<String> cbEndCoin;
    private javax.swing.JComboBox<String> cbStartingCoin;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txtAmountEntered;
    private javax.swing.JTextPane txtResult;
    // End of variables declaration//GEN-END:variables
}
