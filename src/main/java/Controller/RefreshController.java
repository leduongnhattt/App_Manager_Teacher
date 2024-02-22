/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import View.AddForm;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JTextField;

/**
 *
 * @author 84818
 */
public class RefreshController implements ActionListener{

    public RefreshController(JTextField txtma, JTextField txtname, JTextField txttuoi, JComboBox cbbqueQuan, JTextField txtluongCung, JTextField txtthuong, JTextField txttienPhat) {
        this.txtma = txtma;
        this.txtname = txtname;
        this.txttuoi = txttuoi;
        this.cbbqueQuan = cbbqueQuan;
        this.txtluongCung = txtluongCung;
        this.txtthuong = txtthuong;
        this.txttienPhat = txttienPhat;
    }


    
  private JTextField txtma;
  private JTextField txtname;
  private JTextField txttuoi;
  private JComboBox cbbqueQuan;
  private JTextField txtluongCung;
  private JTextField txtthuong;
  private JTextField txttienPhat;
    @Override
    public void actionPerformed(ActionEvent e) {
     refresh();
    }
    public void refresh()
    {
         this.txtma.setText("");
        this.txtname.setText("");
        this.txttuoi.setText("");
        this.cbbqueQuan.setSelectedIndex(0);
        this.txtluongCung.setText("");
        this.txtthuong.setText("");
        this.txttienPhat.setText("");
    }
    
}
