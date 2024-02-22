/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.CBGV;
import View.Home;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 84818
 */
public class FileController implements ActionListener {

    public FileController(Home home) {
        this.home = home;
    }
    private Home home;

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Cập nhật dữ liệu")) {
            loadFromFile();
        } else {
            saveToFile();
        }
    }

    public void saveToFile() {
        try {
            FileOutputStream fos = new FileOutputStream("D:\\Java\\QuanLCBGVGUI\\dulieu.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(home.list_cbgv.getDs_CBGV());
            oos.close();
            fos.close();
            JOptionPane.showMessageDialog(home, "Lưu thành công!");
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

    public void loadFromFile() {
        try {
            FileInputStream fis = new FileInputStream("D:\\Java\\QuanLCBGVGUI\\dulieu.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            home.list_cbgv.setDs_CBGV((ArrayList<CBGV>) ois.readObject());
            ois.close();
            fis.close();
            JOptionPane.showMessageDialog(home, "Cập nhật thành công!");

            // Cập nhật bảng
            DefaultTableModel tb = (DefaultTableModel) home.tblthongke.getModel();
            // Xóa tất cả các hàng hiện tại
            tb.setRowCount(0);
            // Thêm các hàng từ danh sách CBGV
            for (CBGV cbgv : home.list_cbgv.getDs_CBGV()) {
                Object[] rowData = new Object[]{cbgv.getmaSo(), cbgv.getHoTen(), cbgv.getTuoi(), cbgv.getQueQuan(), cbgv.tinhLuong()};
                tb.addRow(rowData);
            }
        } catch (EOFException eof) {
            JOptionPane.showMessageDialog(home, "File đang rỗng. Vui lòng nhập dữ liệu!");
            home.addForm();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } catch (ClassNotFoundException c) {
            System.out.println("Class not found");
            c.printStackTrace();
        }
    }
}
