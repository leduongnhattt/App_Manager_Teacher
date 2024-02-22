/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import View.Home;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 84818
 */
public class SalaryController implements ActionListener {

    public SalaryController(Home home) {
        this.home = home;
    }
    private Home home;

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Sắp xếp tăng")) {
            sortAsc();
        } else if (e.getActionCommand().equals("Cập nhật dữ liệu")) {
            transferData();
        } else {
            sortDesc();
        }
    }

    public void transferData() {

        DefaultTableModel tb = (DefaultTableModel) home.tblthongke.getModel();
        if (tb.getRowCount() == 0) {
            JOptionPane.showMessageDialog(home, "Chưa có dữ liệu ở trang chủ, vui lòng quay lại trang chủ để thêm dữ liệu!", "Thông báo", 0);
            return;
        }
        DefaultTableModel tbluong = (DefaultTableModel) home.tblluong.getModel();
        long min = Long.MAX_VALUE;
        long max = Long.MIN_VALUE;
        double avg = 0;
        long sum = 0;
        int lenRow = tb.getRowCount();
        Object[] rowData;
        tbluong.setRowCount(0);
        for (int i = 0; i < lenRow; i++) {
            long luong = (Long) tb.getValueAt(i, 4);
            sum += luong;
            if (luong > max) {
                max = luong;
            }
            if (luong < min) {
                min = luong;
            }
            rowData = new Object[]{tb.getValueAt(i, 0), tb.getValueAt(i, 4)};
            tbluong.insertRow(i, rowData);
        }
        avg = (long) sum / lenRow;
        home.txtluongmin.setText(min + "");
        home.txtluongmax.setText(max + "");
        home.txttongluong.setText(sum + "");
        home.txtluongtb.setText(avg + "");
    }

    public void sortAsc() {
        DefaultTableModel tbluong = (DefaultTableModel) home.tblluong.getModel();

        int rowCount = tbluong.getRowCount();
        if (rowCount == 0) {
            JOptionPane.showMessageDialog(home, "Chưa có dữ liệu ở bảng lương, vui lòng cập nhật dữ liệu!", "Thông báo", 0);
            return;
        }
        Map<String, Long> luongMap = new HashMap<>();
        for (int i = 0; i < rowCount; i++) {
            String ma = (String) tbluong.getValueAt(i, 0);
            Long luong = (Long) tbluong.getValueAt(i, 1);
            luongMap.put(ma, luong);
        }

        // Sắp xếp HashMap dựa trên lương
        List<Map.Entry<String, Long>> luongList = new ArrayList<>(luongMap.entrySet());
        Collections.sort(luongList, Comparator.comparing(Map.Entry::getValue));

        // Cập nhật lại tbluong
        for (int i = 0; i < rowCount; i++) {
            Map.Entry<String, Long> entry = luongList.get(i);
            tbluong.setValueAt(entry.getKey(), i, 0); // Cập nhật mã
            tbluong.setValueAt(entry.getValue(), i, 1); // Cập nhật lương
        }
    }

    public void sortDesc() {
        DefaultTableModel tbluong = (DefaultTableModel) home.tblluong.getModel();
        int rowCount = tbluong.getRowCount();
        if (rowCount == 0) {
            JOptionPane.showMessageDialog(home, "Chưa có dữ liệu ở bảng lương, vui lòng cập nhật dữ liệu!", "Thông báo", 0);
            return;
        }
        // Chuyển đổi dữ liệu thành một HashMap (mã, lương)
        Map<String, Long> luongMap = new HashMap<>();
        for (int i = 0; i < rowCount; i++) {
            String ma = (String) tbluong.getValueAt(i, 0);
            Long luong = (Long) tbluong.getValueAt(i, 1);
            luongMap.put(ma, luong);
        }

        // Sắp xếp HashMap dựa trên lương theo thứ tự giảm dần
        List<Map.Entry<String, Long>> luongList = new ArrayList<>(luongMap.entrySet());
        luongList.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));

        // Cập nhật lại tbluong
        for (int i = 0; i < rowCount; i++) {
            Map.Entry<String, Long> entry = luongList.get(i);
            tbluong.setValueAt(entry.getKey(), i, 0); // Cập nhật mã
            tbluong.setValueAt(entry.getValue(), i, 1); // Cập nhật lương
        }
    }

}
