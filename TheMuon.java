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
public class TheMuon extends SinhVien{
    private int soPhieuMuon;
    private String soHieuSach;
    private String ngayMuon;
    private String ngayTra;

    public TheMuon(String hoVaTen, String mSSV, String dOB, String lop, String soHieuSach ,String ngayMuon , String ngayTra ) {
        super(hoVaTen, mSSV, dOB, lop);
        this.soPhieuMuon=soPhieuMuon;
        this.soHieuSach=soHieuSach;
        this.ngayMuon=ngayMuon;
        this.ngayTra=ngayTra;
    }
    
    public int getSoPhieuMuon() {
        return soPhieuMuon;
    }

    public void setSoPhieuMuon(int soPhieuMuon) {
        this.soPhieuMuon = soPhieuMuon;
    }

    public String getNgayMuon() {
        return ngayMuon;
    }

    public void setNgayMuon(String ngayMuon) {
        this.ngayMuon = ngayMuon;
    }

    public String getNgayTra() {
        return ngayTra;
    }

    public void setNgayTra(String ngayTra) {
        this.ngayTra = ngayTra;
    }

    public String getSoHieuSach() {
        return soHieuSach;
    }

    public void setSoHieuSach(String soHieuSach) {
        this.soHieuSach = soHieuSach;
    }

    @Override
    public String toString() {
        return super.toString()+ " "  + this.soHieuSach+" "+this.ngayMuon+ " " + this.ngayTra ;
    }         
}
