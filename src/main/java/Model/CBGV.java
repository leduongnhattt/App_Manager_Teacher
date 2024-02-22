/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.io.Serializable;

/**
 *
 * @author 84818
 */
public class CBGV extends Person implements Serializable{

    public CBGV(double luongCung, double luongThuong, double tienPhat, String hoTen, int tuoi, String queQuan, String maSo) {
        super(hoTen, tuoi, queQuan, maSo);
        this.luongCung = luongCung;
        this.luongThuong = luongThuong;
        this.tienPhat = tienPhat;
    }

    
      public double getLuongCung() {
        return luongCung;
    }

    public void setLuongCung(double luongCung) {
        this.luongCung = luongCung;
    }

    public double getluongThuong() {
        return luongThuong;
    }

    public void setluongThuong(double luongThuong) {
        this.luongThuong = luongThuong;
    }

    public double getTienPhat() {
        return tienPhat;
    }

    public void setTienPhat(double tienPhat) {
        this.tienPhat = tienPhat;
    }

    private double luongCung;
    private double luongThuong;
    private double tienPhat;

   public long tinhLuong() {
        return (long)(getLuongCung() + getluongThuong() - getTienPhat());
    }
   
}
