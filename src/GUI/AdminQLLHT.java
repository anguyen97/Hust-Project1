/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import App.QLLHT;
import Object.SubjectClass;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class AdminQLLHT extends javax.swing.JFrame {

    /**
     * Creates new form QLHP
     */
    QLLHT suClassApp = new QLLHT();
    ArrayList<SubjectClass> listLHP = suClassApp.loadFileDSLH();

    public AdminQLLHT() {
        initComponents();
        showSubjectList(listLHP);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        textMaHP = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        textIDLopHoc = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        textBatDau = new javax.swing.JTextField();
        textTietKT = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        selectThu = new javax.swing.JComboBox<>();
        textClassRoom = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_SubjectClass = new javax.swing.JTable();
        btnAdd = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnThoat = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setTitle("Quản lý lớp học");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông tin chi tiết", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        jLabel1.setText("Mã HP");

        textMaHP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                textMaHPMouseReleased(evt);
            }
        });
        textMaHP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textMaHPKeyPressed(evt);
            }
        });

        jLabel2.setText("Mã lớp học");

        textIDLopHoc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textIDLopHocKeyPressed(evt);
            }
        });

        jLabel3.setText("Phòng học");

        jLabel4.setText("Thứ");

        jLabel5.setText("Tiết bắt đầu");

        textBatDau.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textBatDauKeyPressed(evt);
            }
        });

        textTietKT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textTietKTKeyPressed(evt);
            }
        });

        jLabel6.setText("Tiết kết thúc");

        selectThu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2", "3", "4", "5", "6", "7", "CN" }));

        textClassRoom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textClassRoomKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textTietKT, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(textBatDau)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(50, 50, 50)
                        .addComponent(selectThu, 0, 142, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textMaHP)
                            .addComponent(textIDLopHoc, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(textClassRoom))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(textMaHP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(textIDLopHoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(textClassRoom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(selectThu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(textBatDau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textTietKT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Danh sách Lớp", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12))); // NOI18N

        table_SubjectClass.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã học phần", "Mã Lớp học", "Phòng học", "Thứ", "Tiết bắt đầu", "Tiết kết thúc"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table_SubjectClass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_SubjectClassMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table_SubjectClass);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 690, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 438, Short.MAX_VALUE)
        );

        btnAdd.setText("Thêm");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnEdit.setText("Sửa");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnDelete.setText("Xóa");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnThoat.setText("Thoát");
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnAdd)
                        .addGap(51, 51, 51)
                        .addComponent(btnEdit)
                        .addGap(53, 53, 53)
                        .addComponent(btnDelete)
                        .addGap(54, 54, 54)
                        .addComponent(btnThoat)
                        .addGap(197, 197, 197))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(btnEdit)
                    .addComponent(btnDelete)
                    .addComponent(btnThoat))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        // TODO add your handling code here:
        AdminPage admin = new AdminPage();
        admin.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnThoatActionPerformed

    //add an object to table and database
    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed

        //add to table
        DefaultTableModel tableModel = (DefaultTableModel) table_SubjectClass.getModel();
        tableModel.addRow(new Object[]{
            textMaHP.getText(), textIDLopHoc.getText(), textClassRoom.getText(),
            selectThu.getSelectedItem().toString(), textBatDau.getText(), textTietKT.getText()
        });
        //add to file
        SubjectClass lopHoc = new SubjectClass();
        lopHoc.setIdSubject(textMaHP.getText());
        lopHoc.setIdLopHoc(textIDLopHoc.getText());
        lopHoc.setIdClassroom(textClassRoom.getText());
        lopHoc.setThu(selectThu.getSelectedItem().toString());
        lopHoc.setTietBatDau(textBatDau.getText());
        lopHoc.setTietKetThuc(textTietKT.getText());
        listLHP.add(lopHoc);
        suClassApp.saveFileDSLH(listLHP);
        JOptionPane.showMessageDialog(null, "Thao tác thành công", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        try {
            DefaultTableModel tableModel = (DefaultTableModel) table_SubjectClass.getModel();
            int index = table_SubjectClass.getSelectedRow();
            tableModel.setValueAt(textMaHP.getText(), index, 0);
            tableModel.setValueAt(textIDLopHoc.getText(), index, 1);
            tableModel.setValueAt(textClassRoom.getText(), index, 2);
            tableModel.setValueAt(selectThu.getSelectedItem().toString(), index, 3);
            tableModel.setValueAt(textBatDau.getText(), index, 4);
            tableModel.setValueAt(textTietKT.getText(), index, 5);

            listLHP.get(index).setIdSubject(textMaHP.getText());
            listLHP.get(index).setIdLopHoc(textIDLopHoc.getText());
            listLHP.get(index).setIdClassroom(textClassRoom.getText());
            listLHP.get(index).setThu(selectThu.getSelectedItem().toString());
            listLHP.get(index).setTietBatDau(textBatDau.getText());
            listLHP.get(index).setTietKetThuc(textTietKT.getText());
            suClassApp.saveFileDSLH(listLHP);

            JOptionPane.showMessageDialog(null, "Thao tác thành công", "thông báo", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Thao tác không thành công", "thông báo", JOptionPane.INFORMATION_MESSAGE);
        }

    }//GEN-LAST:event_btnEditActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        DefaultTableModel tableModel = (DefaultTableModel) table_SubjectClass.getModel();
        int index = table_SubjectClass.getSelectedRow();
        if (index >= 0) {

            //delete data in arraylist and file
            String idDel = tableModel.getValueAt(index, 0).toString();
            for (int i = 0; i < listLHP.size(); i++) {
                if (listLHP.get(i).getIdSubject().equalsIgnoreCase(idDel)) {
                    listLHP.remove(i);
                    suClassApp.saveFileDSLH(listLHP);
                    //delete data in table
                    tableModel.removeRow(index);
                    JOptionPane.showMessageDialog(null, "Xóa thành công", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                    break;
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Thao tác thất bại", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    //when click a row in table, row's info display in detail info 
    private void table_SubjectClassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_SubjectClassMouseClicked
        // TODO add your handling code here:
        int index = table_SubjectClass.getSelectedRow();
        DefaultTableModel tableModel = (DefaultTableModel) table_SubjectClass.getModel();
        textMaHP.setText(tableModel.getValueAt(index, 0).toString());
        textIDLopHoc.setText(tableModel.getValueAt(index, 1).toString());
        textClassRoom.setText(tableModel.getValueAt(index, 2).toString());
        String thu = tableModel.getValueAt(index, 3).toString();
        switch (thu) {
            case "2": {
                selectThu.setSelectedIndex(0);
            }
            break;
            case "3": {
                selectThu.setSelectedIndex(1);
            }
            break;
            case "4": {
                selectThu.setSelectedIndex(2);
            }
            break;
            case "5": {
                selectThu.setSelectedIndex(3);
            }
            break;
            case "6": {
                selectThu.setSelectedIndex(4);
            }
            break;
            case "7": {
                selectThu.setSelectedIndex(5);
            }
            break;
            case "CN": {
                selectThu.setSelectedIndex(6);
            }
            break;
        }
        textBatDau.setText(tableModel.getValueAt(index, 4).toString());
        textTietKT.setText(tableModel.getValueAt(index, 5).toString());
    }//GEN-LAST:event_table_SubjectClassMouseClicked

    private void textMaHPMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textMaHPMouseReleased
        textMaHP.getKeyListeners();
    }//GEN-LAST:event_textMaHPMouseReleased

    private void textMaHPKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textMaHPKeyPressed
        textMaHP.setText(textMaHP.getText());
    }//GEN-LAST:event_textMaHPKeyPressed

    private void textIDLopHocKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textIDLopHocKeyPressed
        textIDLopHoc.setText(textIDLopHoc.getText());
    }//GEN-LAST:event_textIDLopHocKeyPressed

    private void textClassRoomKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textClassRoomKeyPressed
        textClassRoom.setText(textClassRoom.getText());
    }//GEN-LAST:event_textClassRoomKeyPressed

    private void textBatDauKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textBatDauKeyPressed
        textBatDau.setText(textBatDau.getText());
    }//GEN-LAST:event_textBatDauKeyPressed

    private void textTietKTKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textTietKTKeyPressed
        textTietKT.setText(textTietKT.getText());
    }//GEN-LAST:event_textTietKTKeyPressed

    //show list subject from arraylist to table in frame
    public void showSubjectList(ArrayList<SubjectClass> listLHP) {
        DefaultTableModel model = (DefaultTableModel) table_SubjectClass.getModel();
        Object[] row;
        for (int i = 0; i < listLHP.size(); i++) {
            row = new Object[7];
            row[0] = listLHP.get(i).getIdSubject();
            row[1] = listLHP.get(i).getIdLopHoc();
            row[2] = listLHP.get(i).getIdClassroom();
            row[3] = listLHP.get(i).getThu();
            row[4] = listLHP.get(i).getTietBatDau();
            row[5] = listLHP.get(i).getTietKetThuc();

            model.addRow(row);
        }
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
            java.util.logging.Logger.getLogger(AdminQLLHT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminQLLHT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminQLLHT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminQLLHT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminQLLHT().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnThoat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> selectThu;
    private javax.swing.JTable table_SubjectClass;
    private javax.swing.JTextField textBatDau;
    private javax.swing.JTextField textClassRoom;
    private javax.swing.JTextField textIDLopHoc;
    private javax.swing.JTextField textMaHP;
    private javax.swing.JTextField textTietKT;
    // End of variables declaration//GEN-END:variables

}
