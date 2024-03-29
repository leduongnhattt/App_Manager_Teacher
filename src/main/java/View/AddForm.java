/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package View;

import Controller.RefreshController;
import Model.CBGV;
import Model.CBGVModel;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 84818
 */
public class AddForm extends javax.swing.JDialog {

    private CBGVModel list_cbgv;

    public AddForm(java.awt.Frame parent, boolean modal, CBGVModel list_cbgv) {
        super(parent, modal);
        initComponents();
        insertQueQuanToCombobox();
        home = (Home) parent;
        this.list_cbgv = list_cbgv;
        this.setLocationRelativeTo(null);
        setTooltip();
        refreshController = new RefreshController(txtma, txtname, txttuoi, cbbtinh, txtluongcung, txtthuong, txttienphat);
        btnrefresh.addActionListener(refreshController);
    }

    public void setTooltip() {
        txtluongcung.setToolTipText("Nhập lương cứng tại đây");
        txtma.setToolTipText("Nhập mã số tại đây");
        txtname.setToolTipText("Nhập tên tại đây");
        txtthuong.setToolTipText("Nhập số tiền thưởng tại đây");
        txttienphat.setToolTipText("Nhập số tiền phạt tại đây");
        txttuoi.setToolTipText("Nhập tuổi tại đây");
    }
    private boolean isUpdating = false;
    private Home home;
    private RefreshController refreshController;

    public void insertQueQuanToCombobox() {
        String[] array = {"Hà Giang",
            "Cao Bằng",
            "Lào Cai",
            "Sơn La",
            "Lai Châu",
            "Bắc Kạn",
            "Lạng Sơn",
            "Tuyên Quang",
            "Yên Bái",
            "Thái Nguyên",
            "Điện Biên",
            "Phú Thọ",
            "Vĩnh Phúc",
            "Bắc Giang",
            "Bắc Ninh",
            "Hà Nội",
            "Quảng Ninh",
            "Hải Dương",
            "Hải Phòng",
            "Hòa Bình",
            "Hưng Yên",
            "Hà Nam",
            "Thái Bình",
            "Nam Định",
            "Ninh Bình",
            "Thanh Hóa",
            "Nghệ An",
            "Hà Tĩnh",
            "Quảng Bình",
            "Quảng Trị",
            "Thừa Thiên Huế",
            "Đà Nẵng",
            "Quảng Nam",
            "Quảng Ngãi",
            "Kon Tum",
            "Gia Lai",
            "Bình Định",
            "Phú Yên",
            "Đắk Lắk",
            "Khánh Hòa",
            "Đắk Nông",
            "Lâm Đồng",
            "Ninh Thuận",
            "Bình Phước",
            "Tây Ninh",
            "Bình Dương",
            "Đồng Nai",
            "Bình Thuận",
            "Thành phố Hồ Chí Minh",
            "Long An",
            "Bà Rịa – Vũng Tàu",
            "Đồng Tháp",
            "An Giang",
            "Tiền Giang",
            "Vĩnh Long",
            "Bến Tre",
            "Cần Thơ",
            "Kiên Giang",
            "Trà Vinh",
            "Hậu Giang",
            "Sóc Trăng",
            "Bạc Liêu",
            "Cà Mau",};
        for (String tinh : array) {
            cbbtinh.addItem(tinh);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        lbma = new javax.swing.JLabel();
        lbname = new javax.swing.JLabel();
        lbtuoi = new javax.swing.JLabel();
        lbquequan = new javax.swing.JLabel();
        lbluongcung = new javax.swing.JLabel();
        lbthuong = new javax.swing.JLabel();
        lbtienphat = new javax.swing.JLabel();
        btnadd = new javax.swing.JToggleButton();
        btnrefresh = new javax.swing.JToggleButton();
        btnhuy = new javax.swing.JToggleButton();
        txtma = new javax.swing.JTextField();
        txttuoi = new javax.swing.JTextField();
        txtname = new javax.swing.JTextField();
        txtluongcung = new javax.swing.JTextField();
        txttienphat = new javax.swing.JTextField();
        txtthuong = new javax.swing.JTextField();
        cbbtinh = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setText("Thêm giáo viên");

        lbma.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lbma.setText("Mã giáo viên:");

        lbname.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lbname.setText("Họ và tên:");

        lbtuoi.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lbtuoi.setText("Tuổi:");

        lbquequan.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lbquequan.setText("Quê quán:");

        lbluongcung.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lbluongcung.setText("Lương cứng:");

        lbthuong.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lbthuong.setText("Thưởng:");

        lbtienphat.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lbtienphat.setText("Tiền phạt:");

        btnadd.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        btnadd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Oxygen-Icons.org-Oxygen-Actions-list-add-user.24.png"))); // NOI18N
        btnadd.setText("Thêm");
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });

        btnrefresh.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        btnrefresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Hopstarter-Soft-Scraps-Button-Refresh.24.png"))); // NOI18N
        btnrefresh.setText("Làm Mới");

        btnhuy.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        btnhuy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Hopstarter-Button-Button-Delete.24.png"))); // NOI18N
        btnhuy.setText("Hủy Bỏ");
        btnhuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhuyActionPerformed(evt);
            }
        });

        txtma.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        txtma.setToolTipText("Nhập đúng định dạng: CB01");

        txttuoi.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        txtname.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        txtluongcung.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        txttienphat.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        txtthuong.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        cbbtinh.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbtuoi, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lbma)
                                            .addComponent(lbname, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(35, 35, 35)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txttuoi, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtma, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cbbtinh, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(71, 71, 71)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lbtienphat, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txttienphat, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lbthuong, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtthuong, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lbluongcung, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtluongcung, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnadd, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(112, 112, 112)
                                .addComponent(btnrefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(85, 85, 85)
                                .addComponent(btnhuy, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lbquequan)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(294, 294, 294)
                        .addComponent(jLabel2)))
                .addContainerGap(74, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel2)
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbma)
                    .addComponent(lbluongcung)
                    .addComponent(txtma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtluongcung, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbname)
                    .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbthuong)
                    .addComponent(txtthuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbtuoi)
                    .addComponent(txttuoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbtienphat)
                    .addComponent(txttienphat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbquequan)
                    .addComponent(cbbtinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnadd)
                    .addComponent(btnrefresh)
                    .addComponent(btnhuy))
                .addContainerGap(75, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed
        DefaultTableModel tb = (DefaultTableModel) home.tblthongke.getModel();

        String maSo = txtma.getText();
        String name = txtname.getText();
        String tuoiStr = txttuoi.getText();
        String queQuan = (String) cbbtinh.getSelectedItem();
        String luongCungStr = txtluongcung.getText();
        String thuongStr = txtthuong.getText();
        String tienPhatStr = txttienphat.getText();

        if (validateFields(maSo, name, tuoiStr, luongCungStr, thuongStr, tienPhatStr)) {
            int tuoi = Integer.parseInt(tuoiStr);
            double luongCung = Double.parseDouble(luongCungStr);
            double thuong = Double.parseDouble(thuongStr);
            double tienPhat = Double.parseDouble(tienPhatStr);
            CBGV cbgv = list_cbgv.kiemTraTonTai(maSo);
            if (cbgv == null) {
                int rowIndex1 = home.tblthongke.getSelectedRow();
                if (rowIndex1 != -1) {
                    int dialogResult = JOptionPane.showConfirmDialog(null, "Bạn có muốn cập nhật giáo viên hiện có ?", "Warning", JOptionPane.YES_NO_OPTION);
                    if (dialogResult == JOptionPane.YES_OPTION) {
                        String oldMaSo = (String) tb.getValueAt(rowIndex1, 0);
                        CBGV oldCBGV = list_cbgv.kiemTraTonTai(oldMaSo);
                        tb.removeRow(rowIndex1);
                        cbgv = new CBGV(luongCung, thuong, tienPhat, name, tuoi, queQuan, maSo);
                        if (oldCBGV != null) {
                            list_cbgv.deleteCBGV(oldMaSo);
                        }
                        list_cbgv.addCBGV(cbgv);
                        Object[] rowData = new Object[]{maSo, name, tuoi, queQuan, cbgv.tinhLuong()};

                        tb.insertRow(rowIndex1, rowData);
                        JOptionPane.showMessageDialog(rootPane, "Cập nhật thành công!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                    }
                } else {
                    cbgv = new CBGV(luongCung, thuong, tienPhat, name, tuoi, queQuan, maSo);
                    list_cbgv.addCBGV(cbgv);
                    Object[] rowData = new Object[]{maSo, name, tuoi, queQuan, cbgv.tinhLuong()};
                    tb.addRow(rowData);
                    JOptionPane.showMessageDialog(rootPane, "Thêm thành công!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                }
            } else {
                // Tồn tại giáo viên
                int dialogResult = JOptionPane.showConfirmDialog(null, "Bạn có muốn cập nhật giáo viên hiện có ?", "Warning", JOptionPane.YES_NO_OPTION);
                if (dialogResult == JOptionPane.YES_OPTION) {
                    cbgv.setLuongCung(luongCung);
                    cbgv.setluongThuong(thuong);
                    cbgv.setTienPhat(tienPhat);
                    cbgv.setHoTen(name);
                    cbgv.setTuoi(tuoi);
                    cbgv.setQueQuan(queQuan);
                    cbgv.setmaSo(maSo);
                    // Cập nhật bảng

                    int rowIndex = home.tblthongke.getSelectedRow();
                    if (rowIndex != -1) {
                        tb.removeRow(rowIndex);
                        cbgv = new CBGV(luongCung, thuong, tienPhat, name, tuoi, queQuan, maSo);
                        Object[] rowData = new Object[]{maSo, name, tuoi, queQuan, cbgv.tinhLuong()};
                        tb.insertRow(rowIndex, rowData);
                        JOptionPane.showMessageDialog(rootPane, "Cập nhật thành công!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        for (int i = 0; i < tb.getRowCount(); i++) {
                            if (tb.getValueAt(i, 0).equals(maSo)) {
                                tb.removeRow(i);
                                cbgv = new CBGV(luongCung, thuong, tienPhat, name, tuoi, queQuan, maSo);
                                Object[] rowData = new Object[]{maSo, name, tuoi, queQuan, cbgv.tinhLuong()};
                                tb.insertRow(i, rowData);
                                break;
                            }
                        }
                        JOptionPane.showMessageDialog(rootPane, "Cập nhật thành công!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                    }
                }
                refreshController.refresh();
                this.txtma.requestFocus();
            }
        }
    }//GEN-LAST:event_btnaddActionPerformed
    private boolean validateFields(String maSo, String name, String tuoiStr, String luongCungStr, String thuongStr, String tienPhatStr) {
        boolean isOk = true;
        if (!maSo.matches("CB\\d{2}")) {
            JOptionPane.showMessageDialog(rootPane, "Mã số phải theo định dạng 'CB' + 2 chữ số!");
            isOk = false;
        }
        if (maSo.length() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Mã số không được để trống!");
            isOk = false;
        }
        if (name.length() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Tên không được để trống!");
            isOk = false;
        }
        if (!name.matches("[a-zA-ZÀ-ỹ\\s]+")) {
            JOptionPane.showMessageDialog(rootPane, "Họ tên chỉ chứa các chữ cái!");
            isOk = false;
        }

        try {
            int tuoi = Integer.parseInt(tuoiStr);
            if (tuoi < 22 || tuoi > 60) {
                JOptionPane.showMessageDialog(rootPane, "Tuổi phải từ 22 đến 60!");
                isOk = false;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(rootPane, "Tuổi phải là một số nguyên hợp lệ!");
            isOk = false;
        }

        try {
            double luongCung = Double.parseDouble(luongCungStr);
            if (luongCung <= 0) {
                JOptionPane.showMessageDialog(rootPane, "Lương cứng phải lớn hơn 0!");
                isOk = false;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(rootPane, "Lương cứng phải là một số thực hợp lệ!");
            isOk = false;
        }

        try {
            double thuong = Double.parseDouble(thuongStr);
            double tienPhat = Double.parseDouble(tienPhatStr);
            if (thuong < 0 || tienPhat < 0) {
                JOptionPane.showMessageDialog(rootPane, "Thưởng và tiền phạt phải là số không âm!");
                isOk = false;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(rootPane, "Thưởng và tiền phạt phải là số thực hợp lệ!");
            isOk = false;
        }

        return isOk;
    }


    private void btnhuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhuyActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnhuyActionPerformed
    public ArrayList<CBGV> getDs() {
        return list_cbgv.getDs_CBGV();
    }

    public void update() {
        DefaultTableModel tb = (DefaultTableModel) home.tblthongke.getModel();
        int row = home.tblthongke.getSelectedRow();
        String maSo = (String) tb.getValueAt(row, 0);
        String name = (String) tb.getValueAt(row, 1);
        String queQuan = (String) tb.getValueAt(row, 3);
        int tuoi = Integer.parseInt(tb.getValueAt(row, 2) + "");

        CBGV cbgv = list_cbgv.kiemTraTonTai(maSo);
        if (cbgv == null) {
            JOptionPane.showMessageDialog(home, "CBGV with maSo: " + maSo + " already exists. No update performed.");
        } else {
            double luongCung = cbgv.getLuongCung();
            double tienPhat = cbgv.getTienPhat();
            double thuong = cbgv.getluongThuong();

            txtma.setText(maSo);
            txtname.setText(name);
            txttuoi.setText(tuoi + "");
            cbbtinh.setSelectedItem(queQuan);
            txtluongcung.setText((int) luongCung + "");
            txtthuong.setText((int) thuong + "");
            txttienphat.setText((int) tienPhat + "");
            this.setVisible(true);
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
            java.util.logging.Logger.getLogger(AddForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(() -> {
            CBGVModel list_cbgv1 = new CBGVModel();
            AddForm dialog = new AddForm(new javax.swing.JFrame(), true, list_cbgv1);
            dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                @Override
                public void windowClosing(java.awt.event.WindowEvent e) {
                    System.exit(0);
                }
            });
            dialog.setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JToggleButton btnadd;
    private javax.swing.JToggleButton btnhuy;
    private javax.swing.JToggleButton btnrefresh;
    public javax.swing.JComboBox<String> cbbtinh;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lbluongcung;
    private javax.swing.JLabel lbma;
    private javax.swing.JLabel lbname;
    private javax.swing.JLabel lbquequan;
    private javax.swing.JLabel lbthuong;
    private javax.swing.JLabel lbtienphat;
    private javax.swing.JLabel lbtuoi;
    public javax.swing.JTextField txtluongcung;
    public javax.swing.JTextField txtma;
    public javax.swing.JTextField txtname;
    public javax.swing.JTextField txtthuong;
    public javax.swing.JTextField txttienphat;
    public javax.swing.JTextField txttuoi;
    // End of variables declaration//GEN-END:variables
}
