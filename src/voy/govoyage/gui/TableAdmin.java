/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package voy.govoyage.gui;

import com.sun.imageio.plugins.png.RowFilter;
import java.awt.Color;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import voy.govoyage.dao.AdminDAO;
import voy.govoyage.entities.Admin;
import voy.govoyage.util.AffichageRechercheAdmin;
import voy.govoyage.util.affichageTableAdmin;




/**
 *
 * @author Cherni Mohamed
 */
public class TableAdmin extends javax.swing.JFrame {

    /**
     * Creates new form TableAdmin
     */
    public TableAdmin() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        addb = new javax.swing.JButton();
        disconnect = new javax.swing.JButton();
        bupdate = new javax.swing.JButton();
        bdelete = new javax.swing.JButton();
        tlsearch = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new affichageTableAdmin());
        jScrollPane1.setViewportView(jTable1);

        addb.setText("Add");
        addb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbActionPerformed(evt);
            }
        });

        disconnect.setText("Disconnect");
        disconnect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                disconnectActionPerformed(evt);
            }
        });

        bupdate.setText("Update");
        bupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bupdateActionPerformed(evt);
            }
        });

        bdelete.setText("Delete");
        bdelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bdeleteActionPerformed(evt);
            }
        });

        tlsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tlsearchActionPerformed(evt);
            }
        });
        tlsearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tlsearchKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(disconnect)
                        .addGap(121, 121, 121))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(addb)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(bdelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bupdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(434, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addComponent(tlsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(disconnect)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(tlsearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addb)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bupdate)
                        .addGap(18, 18, 18)
                        .addComponent(bdelete))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbActionPerformed
        new AddAdmin().setVisible(true);
        this.hide();
    }//GEN-LAST:event_addbActionPerformed

    private void disconnectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_disconnectActionPerformed
        Login login = new Login();
        login.pass.removeAll();
        login.setVisible(true);
        this.hide();
        
    }//GEN-LAST:event_disconnectActionPerformed

    private void bupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bupdateActionPerformed
        UpdateAdmin ua = new UpdateAdmin();
        ua.tfnom.setText((String) jTable1.getValueAt(jTable1.getSelectedRow(), 1));
        ua.tfprenom.setText((String) jTable1.getValueAt(jTable1.getSelectedRow(), 2));
        ua.tftel.setText((String) jTable1.getValueAt(jTable1.getSelectedRow(), 4).toString());
        ua.tfmail.setText((String) jTable1.getValueAt(jTable1.getSelectedRow(), 3));
        ua.tfpass.setText((String) jTable1.getValueAt(jTable1.getSelectedRow(), 6));
        ua.tfid.setText((String) jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString());
        ua.tfid.setEditable(false);
        ua.tfid.setEnabled(false);
        ua.tflogin.setText((String) jTable1.getValueAt(jTable1.getSelectedRow(), 5));
        ua.tflogin.setEditable(false);
        ua.tflogin.setEnabled(false);
        
       
        
        ua.setVisible(true);
        this.hide();
    }//GEN-LAST:event_bupdateActionPerformed

    private void bdeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bdeleteActionPerformed
        new AdminDAO().delete(new Admin(Integer.parseInt(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString())));
        jTable1.setModel(new affichageTableAdmin());
    }//GEN-LAST:event_bdeleteActionPerformed

    private void tlsearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tlsearchKeyReleased
        jTable1.setModel(new AffichageRechercheAdmin(tlsearch.getText()));
    }//GEN-LAST:event_tlsearchKeyReleased

    private void tlsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tlsearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tlsearchActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        

//1bestcsharp.blogspot.com/2015/05/java-jtable-add-delete-update-row.html#9FOHuxUlsDgMuGYT.99
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
            java.util.logging.Logger.getLogger(TableAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TableAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TableAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TableAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new TableAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addb;
    protected javax.swing.JButton bdelete;
    protected javax.swing.JButton bupdate;
    protected javax.swing.JButton disconnect;
    private javax.swing.JScrollPane jScrollPane1;
    protected javax.swing.JTable jTable1;
    private javax.swing.JTextField tlsearch;
    // End of variables declaration//GEN-END:variables
}
