/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import View.Home;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 84818
 */
public class SearchController implements ActionListener {

    public SearchController(Home home) {
        this.home = home;
    }
    private Home home;

    @Override
    public void actionPerformed(ActionEvent e) {
        searchInfor();
    }

    public void searchInfor() {
        home.btnsearch.setEnabled(true);
        DefaultTableModel tb = (DefaultTableModel) home.tblthongke.getModel();
        int lenRow = tb.getRowCount();
        String searchText = home.txtsearch.getText();

        if (searchText != null && !searchText.isEmpty()) {

            for (int i = lenRow - 1; i >= 0; i--) {
                if (searchText.equals(tb.getValueAt(i, 0).toString())) {

                    String ma = tb.getValueAt(i, 0).toString();
                    String hoTen = tb.getValueAt(i, 1).toString();
                    String tuoi = tb.getValueAt(i, 2).toString();
                    String queQuan = tb.getValueAt(i, 3).toString();
                    String luong = tb.getValueAt(i, 4).toString();
                    home.tathongtin.setText("Mã số giáo viên  : " + ma + "\n"
                            + "Họ và tên           : " + hoTen + "\n"
                            + "Tuổi                  : " + tuoi + "\n"
                            + "Quê quán          : " + queQuan + "\n"
                            + "Lương               : " + luong);
                    return;
                }
            }
            JOptionPane.showMessageDialog(home, "Không tìm thấy giáo viên!", "Thông báo", 0);
        }

    }
}
