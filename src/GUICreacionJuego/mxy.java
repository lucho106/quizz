/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUICreacionJuego;

/**
 *
 * @author lucho
 */
public class mxy extends javax.swing.JFrame {
private int MMX=0,MMY=0;
    /**
     * Creates new form mxy
     */
    public mxy() {
        initComponents();
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        xx = new javax.swing.JTextField();
        yy = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(400, 400));
        setMinimumSize(new java.awt.Dimension(400, 400));
        setPreferredSize(new java.awt.Dimension(400, 400));
        getContentPane().setLayout(null);

        jButton1.setText("siguiente");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(288, 229, 83, 25);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("tamaño del juego");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(12, 25, 359, 57);

        xx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xxActionPerformed(evt);
            }
        });
        getContentPane().add(xx);
        xx.setBounds(103, 126, 56, 54);

        yy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yyActionPerformed(evt);
            }
        });
        getContentPane().add(yy);
        yy.setBounds(288, 122, 56, 58);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel2.setText("x");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(24, 122, 53, 44);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel3.setText("y");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(217, 122, 53, 44);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
        MMX=Integer.parseInt(this.xx.getText());
        MMY=Integer.parseInt(this.yy.getText());
        
        Ventana1 nv = new Ventana1();
        nv.setTamx(MMX);
        nv.setTamy(MMY);
        nv.setVisible(true);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    public int getMMX() {
        return MMX;
    }

    public void setMMX(int MMX) {
        this.MMX = MMX;
    }

    public int getMMY() {
        return MMY;
    }

    public void setMMY(int MMY) {
        this.MMY = MMY;
    }

    private void xxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xxActionPerformed
        
        
        
    }//GEN-LAST:event_xxActionPerformed

    private void yyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yyActionPerformed
        
        
        
    }//GEN-LAST:event_yyActionPerformed

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
            java.util.logging.Logger.getLogger(mxy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mxy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mxy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mxy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mxy().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField xx;
    private javax.swing.JTextField yy;
    // End of variables declaration//GEN-END:variables
}
