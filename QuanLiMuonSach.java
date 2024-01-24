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
import java.util.Scanner;

/**
 *
 * @author Minh Chau
 */
public class QuanLiMuonSach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<TheMuon> arr = new ArrayList<>();
        System.out.print("Xin moi nhap so luong phieu muon : ");
        int soPhieuMuon = sc.nextInt();
        sc.nextLine();
        System.out.println("------------------------");
        for (int i = 1; i <= soPhieuMuon; i++) {
            System.out.println("Phieu muon thu : " + i);
            System.out.println("Xin moi nhap thong tin : ");
            System.out.print("Ho va ten : ");
            String hoVaTen = sc.nextLine();
            System.out.print("MSSV : ");
            String mSSV = sc.nextLine();
            System.out.print("Ngay Sinh : ");
            String dOB = sc.nextLine();
            System.out.print("Lop : ");
            String lop = sc.nextLine();
            System.out.print("So hieu sach : ");
            String soHieuSach = sc.nextLine();
            System.out.print("Ngay muon sach : ");
            String ngayMuon = sc.nextLine();
            System.out.print("Ngay tra sach : ");
            String ngayTra = sc.nextLine();
            TheMuon tm = new TheMuon(hoVaTen, mSSV, dOB, lop, soHieuSach,ngayMuon,ngayTra);
            arr.add(tm);
        }
        System.out.println("Danh sach cac sinh vien muon sach la : ");
        for (TheMuon item : arr) {
            System.out.println(item.toString());
        }
        
        System.out.print("Xin moi nhap so luong can truy van : ");
        int soluong=sc.nextInt();
        sc.nextLine();
        List<String> searchDOB=new ArrayList<>();
        System.out.print("Xin moi nhap ngay tra de tra cuu :");
        while(soluong-- >0){
            String dOBSearch=sc.nextLine();
            searchDOB.add(dOBSearch);
        }
        for(TheMuon x :arr){
            if(searchDOB.contains(x.getNgayTra())==true){
                System.out.println(x.toString()+" OK");
            }
            else {
                    System.out.println("Khong tim thay ai ");
            }
        }
    }
}
