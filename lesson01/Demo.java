package com.vn.devmaster.services.demo.student;

import java.util.ArrayList;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        QuanlyStudent qly=new QuanlyStudent();
        while (true){
            Scanner sc=new Scanner(System.in);
            System.out.println("Menu.");
            System.out.println("1.Nhập dữ liệu.");
            System.out.println("2.Hiển thị dữ liệu.");
            System.out.println("3.Chinh sua sinh vien theo id.");
            System.out.println("4.xoa sinh vien theo id.");
            System.out.println("5.Sap xep sinh vien theo gpa.");
            System.out.println("6.Sap xep sinh vien theo ten.");
            System.out.println("7.Thoát.");
            System.out.println("Chọn từ 1 đến 7.");
            int chon=sc.nextInt();
            switch (chon){
                case 1:
                    qly.Nhap();
                    break;
                case 2:
                    qly.hienThi();
                    break;
                case 3:
                    qly.ChinhSua();
                    break;
                case 4:
                    qly.XoatheoId();
                    break;
                case 5:
                    qly.SapxeptheoGPA();
                    break;
                case 6:
                    qly.SapxeptheoTen();
                    break;
                case 7:
                    qly.Thoat();
                    break;
                default:
                    System.out.println("nhap lai so");
                    break;
            }
        }
    }
}
