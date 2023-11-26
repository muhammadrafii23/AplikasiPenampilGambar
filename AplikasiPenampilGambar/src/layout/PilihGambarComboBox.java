/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package layout;

import java.awt.CardLayout;

/**
 *
 * @author ASUS
 */
public class PilihGambarComboBox extends javax.swing.JFrame {

    /**
     * Creates new form PilihGambarComboBox
     */
    public PilihGambarComboBox() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        comboPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cmbGambar = new javax.swing.JComboBox<>();
        imagePanel = new javax.swing.JPanel();
        lblGlassFish = new javax.swing.JLabel();
        lblavaEE = new javax.swing.JLabel();
        lblPostgreSQL = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PilihGambarComboBox");

        comboPanel.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setText("Pilih Gambar");
        comboPanel.add(jLabel1);

        cmbGambar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "GlassFish", "JavaEE", "PostgreSQL" }));
        cmbGambar.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbGambarItemStateChanged(evt);
            }
        });
        cmbGambar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbGambarActionPerformed(evt);
            }
        });
        comboPanel.add(cmbGambar);

        getContentPane().add(comboPanel, java.awt.BorderLayout.PAGE_START);

        imagePanel.setLayout(new java.awt.CardLayout());

        lblGlassFish.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblGlassFish.setIcon(new javax.swing.ImageIcon(getClass().getResource("/layout/glassfish.jpg"))); // NOI18N
        imagePanel.add(lblGlassFish, "0");
        lblGlassFish.getAccessibleContext().setAccessibleName("0");
        lblGlassFish.getAccessibleContext().setAccessibleDescription("null");

        lblavaEE.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblavaEE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/layout/javaee.jpg"))); // NOI18N
        imagePanel.add(lblavaEE, "1");
        lblavaEE.getAccessibleContext().setAccessibleName("1");
        lblavaEE.getAccessibleContext().setAccessibleDescription("null");

        lblPostgreSQL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPostgreSQL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/layout/postgresql.jpg"))); // NOI18N
        imagePanel.add(lblPostgreSQL, "2");
        lblPostgreSQL.getAccessibleContext().setAccessibleName("2");
        lblPostgreSQL.getAccessibleContext().setAccessibleDescription("null");

        getContentPane().add(imagePanel, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbGambarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbGambarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbGambarActionPerformed

    private void cmbGambarItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbGambarItemStateChanged
        CardLayout c1 = (CardLayout)(imagePanel.getLayout());
        c1.show(imagePanel, String.valueOf(cmbGambar.getSelectedIndex()));
    }//GEN-LAST:event_cmbGambarItemStateChanged

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
            java.util.logging.Logger.getLogger(PilihGambarComboBox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PilihGambarComboBox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PilihGambarComboBox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PilihGambarComboBox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PilihGambarComboBox().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbGambar;
    private javax.swing.JPanel comboPanel;
    private javax.swing.JPanel imagePanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblGlassFish;
    private javax.swing.JLabel lblPostgreSQL;
    private javax.swing.JLabel lblavaEE;
    // End of variables declaration//GEN-END:variables
}
