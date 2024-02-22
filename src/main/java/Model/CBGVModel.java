/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author 84818
 */
public class CBGVModel implements Serializable {

    public CBGVModel() {
        ds_CBGV = new ArrayList<>();
    }

    ArrayList<CBGV> ds_CBGV;

    public ArrayList<CBGV> getDs_CBGV() {
        return ds_CBGV;
    }

    public void setDs_CBGV(ArrayList<CBGV> ds_CBGV) {
        this.ds_CBGV = ds_CBGV;
    }

    public void addCBGV(CBGV cbgv) {
        ds_CBGV.add(cbgv);
    }

    public void deleteCBGV(String maSo) {
        ds_CBGV.removeIf(cbgv -> cbgv.getmaSo().equals(maSo));
    }

    public CBGV kiemTraTonTai(String maSo) {
        for (CBGV x : ds_CBGV) {
            if (x.getmaSo().equals(maSo)) {
                return x;
            }
        }
        return null;
    }

    public boolean check() {
        return ds_CBGV.isEmpty();
    }
}
