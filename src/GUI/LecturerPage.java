/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import App.MarkApp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class LecturerPage extends javax.swing.JFrame {

    /**
     * Creates new form QLGV
     */
    public LecturerPage() {
        initComponents();
    }

    MarkApp markApp = new MarkApp();

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnCapNhatTT = new javax.swing.JButton();
        btnCapNhatDiem = new javax.swing.JButton();
        btnHeThong = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        selectSearch = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Giảng viên");

        jPanel1.setBackground(new java.awt.Color(255, 204, 51));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/sta-icon3.png"))); // NOI18N

        btnCapNhatTT.setBackground(new java.awt.Color(255, 255, 102));
        btnCapNhatTT.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        btnCapNhatTT.setText("Cập nhật thông tin");
        btnCapNhatTT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapNhatTTActionPerformed(evt);
            }
        });

        btnCapNhatDiem.setBackground(new java.awt.Color(255, 255, 102));
        btnCapNhatDiem.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        btnCapNhatDiem.setText("Cập nhật điểm SV");
        btnCapNhatDiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapNhatDiemActionPerformed(evt);
            }
        });

        btnHeThong.setBackground(new java.awt.Color(255, 255, 102));
        btnHeThong.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        btnHeThong.setText("Hệ thống");
        btnHeThong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHeThongActionPerformed(evt);
            }
        });

        btnExit.setBackground(new java.awt.Color(255, 204, 51));
        btnExit.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        btnExit.setText("exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        selectSearch.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        selectSearch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TRA CỨU", "Tra cứu SV", "Tra cứu HP", "Tra cứu Lớp SV" }));
        selectSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnCapNhatTT, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHeThong, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(btnExit)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCapNhatDiem, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                    .addComponent(selectSearch, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCapNhatTT, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCapNhatDiem, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(181, 181, 181)
                                .addComponent(btnHeThong, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(selectSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnExit)))
                .addContainerGap(63, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHeThongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHeThongActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Hệ thống đang bảo trì", "Trang cá nhân giảng viên", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnHeThongActionPerformed

    private void btnCapNhatDiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapNhatDiemActionPerformed
        String dateInput[] = markApp.loadDateMark().split("-");
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date();
        System.out.println(dateFormat.format(date));
        String dateNow = dateFormat.format(date);
        try {
            if (dateFormat.parse(dateInput[0]).before(dateFormat.parse(dateNow))
                    && dateFormat.parse(dateInput[1]).after(dateFormat.parse(dateNow))) {
                LecturerQLDSV lecturerQLDSV = new LecturerQLDSV();
                lecturerQLDSV.setVisible(true);
                dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Thời gian hiện tại ngoài thời gian được nhập điểm\n", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            }

        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(null, "Thời gian nhập điểm chưa được cập nhật", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }
        
    }//GEN-LAST:event_btnCapNhatDiemActionPerformed

    private void btnCapNhatTTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapNhatTTActionPerformed
        LecturerUpdateInfo updateInfo = new LecturerUpdateInfo();
        updateInfo.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnCapNhatTTActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        Login logIn = new Login();
        logIn.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnExitActionPerformed

    private void selectSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectSearchActionPerformed
        String selected = selectSearch.getSelectedItem().toString();
        switch (selected) {
            case "Tra cứu": {

            }
            break;
            case "Tra cứu SV": {
                SearchStudent searchStudent = new SearchStudent();
                searchStudent.setVisible(true);
            }
            break;
            case "Tra cứu HP": {
                SearchSubject searchSubject = new SearchSubject();
                searchSubject.setVisible(true);
            }
            break;
            case "Tra cứu Lớp SV": {

            }
            break;
        }

    }//GEN-LAST:event_selectSearchActionPerformed

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
            java.util.logging.Logger.getLogger(LecturerPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LecturerPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LecturerPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LecturerPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LecturerPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCapNhatDiem;
    private javax.swing.JButton btnCapNhatTT;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnHeThong;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> selectSearch;
    // End of variables declaration//GEN-END:variables
}
