package Swagulator;

import java.awt.Toolkit;



public class Swagulator extends javax.swing.JFrame {

    public Swagulator() {
        initComponents();
        setTitle("Aspect Ratio Calculator");
        setIconImage(Toolkit.getDefaultToolkit().getImage("res/arrow.png"));
    }

    @SuppressWarnings("unchecked")
    String ratio = "Wordz";
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        jPanel2.setBackground(new java.awt.Color(238, 0, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 497, Short.MAX_VALUE)
        );

        jPanel1.setBackground(new java.awt.Color(24, 111, 249));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 415, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 146, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(238, 0, 255));

        jPanel4.setBackground(new java.awt.Color(86, 154, 255));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 415, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 555, Short.MAX_VALUE))
        );

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        jLabel2.setText("jLabel2");

        jLabel4.setText("jLabel4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel6.setBackground(new java.awt.Color(26, 57, 104));

        jLabel1.setFont(new java.awt.Font("Leelawadee UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(219, 219, 217));
        jLabel1.setText("Aspect Ratio Calculator V.1");

        jLabel5.setFont(new java.awt.Font("Leelawadee UI", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("0");

        jPanel5.setBackground(new java.awt.Color(78, 136, 224));

        jList1.setBackground(new java.awt.Color(78, 136, 224));
        jList1.setFont(new java.awt.Font("Leelawadee UI", 1, 12)); // NOI18N
        jList1.setForeground(new java.awt.Color(0, 0, 0));
        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "1:1 (Overhead Projection)", "5:4 (Early Television/Computer Display)", "4:3 (Fullscreen)", "1.43:1 (IMAX)", "3:2 (Classic 35mm Film)", "16:10 (Common Computer Display)", "5:3 (European Widescreen)", "16:9 (US Widescreen; HD)", "1.85:1 (Cinema Film)", "21:9 (Anamorphic Widescreen)", "2.76:1 (Ultra Panavision 70)" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jList1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(jList1);

        jButton1.setFont(new java.awt.Font("Leelawadee UI", 1, 12)); // NOI18N
        jButton1.setText("Calculate");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextField1.setFont(new java.awt.Font("Leelawadee UI", 0, 12)); // NOI18N
        jTextField1.setPreferredSize(new java.awt.Dimension(60, 24));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        jLabel3.setText("Input number:");

        jList2.setBackground(new java.awt.Color(78, 136, 224));
        jList2.setFont(new java.awt.Font("Leelawadee UI", 1, 12)); // NOI18N
        jList2.setForeground(new java.awt.Color(0, 0, 0));
        jList2.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Height", "Width" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jList2.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(jList2);

        jLabel7.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        jLabel7.setText("Output the");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jButton1))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jButton1))
        );

        jLabel6.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        jLabel6.setText("Select a ratio");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel5))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(53, 53, 53)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        System.out.println(jList1.getSize());
        double number = Double.valueOf(jTextField1.getText());
        String list1Selection = jList1.getSelectedValue();
        String list2Selection = jList2.getSelectedValue();
        swagulate(number, list1Selection, list2Selection);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void swagulate(double number, String selectedRatio, String calculation) {

        if (calculation == null) {
            jLabel6.setText("Invalid Selection");
            return;
        }
        if (calculation.equals("Height")) {
            jLabel6.setText(selectedRatio + "");
        } else if (calculation.equals("Width")) {
            jLabel6.setText(selectedRatio + "");
        }

        

        math(number, selectedRatio, calculation);
    }

    public void math(double number, String selectedRatio, String calculation) {
    
        double output = 0;

        if (calculation.equals("Height")) {
            
            if (selectedRatio.equals("1:1 (Overhead Projection)")){
                output = number;
            }
            
            if (selectedRatio.equals("5:4 (Early Television/Computer Display)")){
                output = 4*(number/5);
            }
            
            if (selectedRatio.equals("4:3 (Fullscreen)")){
                output = 3*(number/4);
            }
            
            if (selectedRatio.equals("1.43:1 (IMAX)")){
                output = number/1.43;
            }
            
            if (selectedRatio.equals("3:2 (Classic 35mm Film)")){
                output = 2*(number/3);
            }
            
            if (selectedRatio.equals("16:10 (Common Computer Display)")){
                output = 10*(number/16);
            }
            
            if (selectedRatio.equals("5:3 (European Widescreen)")){
                output = 3*(number/5);
            }
            
            if (selectedRatio.equals("16:9 (US Widescreen; HD)")){
                output = 9*(number/16);
            }
            
            if (selectedRatio.equals("1.85:1 (Cinema Film)")){
                output = number/1.85;
            }
            
            if (selectedRatio.equals("21:9 (Anamorphic Widescreen)")){
                output = 9*(number/21);
            }
            
            if (selectedRatio.equals("2.76:1 (Ultra Panavision 70)")){
                output = number/2.76;
            }
            
            textToOutput(output);
            
        } else if (calculation.equals("Width")) {
            
            if (selectedRatio.equals("1:1 (Overhead Projection)")){
                output = number;
            }
            
            if (selectedRatio.equals("5:4 (Early Television/Computer Display)")){
                output = 5*(number/4);
            }
            
            if (selectedRatio.equals("4:3 (Fullscreen)")){
                output = 4*(number/3);
            }
            
            if (selectedRatio.equals("1.43:1 (IMAX)")){
                output = number*1.43;
            }
            
            if (selectedRatio.equals("3:2 (Classic 35mm Film)")){
                output = 3*(number/2);
            }
            
            if (selectedRatio.equals("16:10 (Common Computer Display)")){
                output = 16*(number/10);
            }
            
            if (selectedRatio.equals("5:3 (European Widescreen)")){
                output = 5*(number/3);
            }
            
            if (selectedRatio.equals("16:9 (US Widescreen; HD)")){
                output = 16*(number/9);
            }
            
            if (selectedRatio.equals("1.85:1 (Cinema Film)")){
                output = number*1.85;
            }
            
            if (selectedRatio.equals("21:9 (Anamorphic Widescreen)")){
                output = 21*(number/9);
            }
            
            if (selectedRatio.equals("2.76:1 (Ultra Panavision 70)")){
                output = number*2.76;
            }
            
            textToOutput(output);
            
        }
        
    }
    
    public void textToOutput(double output){
    
        jLabel5.setText(output + "");
        
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
            java.util.logging.Logger.getLogger(Swagulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Swagulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Swagulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Swagulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Swagulator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

}
