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
public class Person implements Serializable{

    public Person() {
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }
    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

  
    public String getmaSo() {
        return maSo;
    }

    public void setmaSo(String maSo) {
        this.maSo = maSo;
    }

    public Person(String hoTen, int tuoi, String queQuan, String maSo) {
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.queQuan = queQuan;
        this.maSo = maSo;
    }
    private String hoTen;
    private int tuoi;
    private String queQuan;
    private String maSo;
}
