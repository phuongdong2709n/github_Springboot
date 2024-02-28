package com.vn.devmaster.services.demo.student;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class QuanlyStudent  {
    ArrayList<Student> sv=new ArrayList<>();
    Scanner sc=new Scanner(System.in);
    public void Nhap(){
        System.out.println("nhap thong tin");
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap id:");
        String id=sc.nextLine();
        System.out.println("nhap name:");
        String name=sc.nextLine();
        System.out.println("nhap age:");
        int age=Integer.parseInt( sc.nextLine());
        System.out.println("nhap address:");
        String address=sc.nextLine();
        System.out.println("nhap gpa:");
        Float gpa=Float.parseFloat( sc.nextLine());
        Student st=new Student(id,name,age,address,gpa);
        sv.add(st);
    }

    public void hienThi(){
        System.out.println("danh sach sinh vien.");
        for (Student s:sv){
            System.out.println("id: " +s.getId());
            System.out.println("name: " +s.getName());
            System.out.println("age: " +s.getAge());
            System.out.println("address: " +s.getAddress());
            System.out.println("gpa: " +s.getGpa());
        }
        System.out.println("----------------------");
    }
// Chỉnh sửa sinh viên theo ID
    public void ChinhSua(){
        System.out.println("Nhập ID sinh viên bạn muốn chỉnh sửa: ");
        String d = sc.nextLine();
        for (Student n : sv){
            if (n.getId().equals(d)) {
                System.out.println("Nhập thông tin mới cho sinh viên:");
                System.out.println("Tên mới: ");
                String newName = sc.nextLine();
                System.out.println("Tuổi mới: ");
                int newAge = Integer.parseInt(sc.nextLine());
                System.out.println("Địa chỉ mới: ");
                String newAddress = sc.nextLine();
                System.out.println("GPA mới: ");
                float newGpa = Float.parseFloat(sc.nextLine());

                // Cập nhật thông tin mới cho sinh viên
                n.setName(newName);
                n.setAge(newAge);
                n.setAddress(newAddress);
                n.setGpa(newGpa);

                System.out.println("Thông tin sinh viên đã được cập nhật.");
                return;
            }
        }
        // Nếu không tìm thấy sinh viên với ID tương ứng, thông báo không tìm thấy
        System.out.println("Không tìm thấy sinh viên có ID: " +d);
    }
    //xóa sinh viên theo id
    public  void XoatheoId(){
        System.out.println("Id ban muon xoa: ");
        String xoa=sc.nextLine();
        for (int i = 0; i < sv.size(); i++) {
//            equals dùng dể so sánh với giá trị mình vừa nhập
            if (sv.get(i).getId().equals(xoa)) {
                // Nếu tìm thấy, xóa sinh viên và thông báo đã xóa thành công
                System.out.println("Sinh viên đã được xóa: ");
                System.out.println("Id: " + sv.get(i).getId());
                System.out.println("Name: " + sv.get(i).getName());
                System.out.println("Age: " + sv.get(i).getAge());
                System.out.println("Address: " + sv.get(i).getAddress());
                System.out.println("GPA: " + sv.get(i).getGpa());
                sv.remove(i); // Xóa sinh viên khỏi danh sách
                return;
            }
        }
//        System.out.println("Không tìm thấy sinh viên có ID: " + xoa);

    }

    //sắp xếp sinh viên theo gpa
    public void SapxeptheoGPA(){
        System.out.println("---------sắp xếp tăng dần theo GPA-----------");
        sv.sort((o1, o2) -> Float.compare((float) o1.getGpa(), (float) o2.getGpa()));
        for (Student s: sv){
            System.out.println("Id: " + s.getId());
            System.out.println("Name: " + s.getName());
            System.out.println("Age: " + s.getAge());
            System.out.println("Address: " + s.getAddress());
            System.out.println("GPA: " + s.getGpa());
            System.out.println("--------------------------------------------");
        }
        System.out.println("-----------------------");
    }
    //sắp xếp sinh viên theo tên
    //so sánh tên của các nhân viên theo từ điển thứ tự.
    public void SapxeptheoTen(){
        System.out.println("------------ Sắp xếp theo tên theo từ điển thứ tự. --------------");
        sv.sort(Comparator.comparing(Student::getName));
        for (Student t: sv){
            System.out.println("Id: " + t.getId());
            System.out.println("Name: " + t.getName());
            System.out.println("Age: " + t.getAge());
            System.out.println("Address: " + t.getAddress());
            System.out.println("GPA: " + t.getGpa());
            System.out.println("--------------------------------------------");
        }
        System.out.println("--------------------------------------------");
    }
    public void Thoat(){
        System.exit(0);
    }

}
