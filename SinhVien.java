/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlimuonsach;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author Minh Chau
 */
public class SinhVien {
    private String hoVaTen;
    private String mSSV;
    private String dOB;
    private String lop;

    public SinhVien(String hoVaTen, String mSSV, String dOB, String lop) {
        this.hoVaTen = hoVaTen;
        this.mSSV = mSSV;
        this.dOB = dOB;
        this.lop = lop;
    }

    public String getHoVaTen() {
        return hoVaTen;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public String getmSSV() {
        return mSSV;
    }

    public void setmSSV(String mSSV) {
        this.mSSV = mSSV;
    }

    public String getdOB() {
        return dOB;
    }

    public void setdOB(String dOB) {
        this.dOB = dOB;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    @Override
    public String toString() {
        return  this.hoVaTen + " " + this.mSSV + " " + this.dOB + " " + this.lop ;
    }
}
