package com.example.lesson02.BaiTap;

import org.springframework.stereotype.Component;

@Component("nhanvien")
public class Employee1 implements Person{
    @Override
    public void Work(){
        System.out.println("nhan vien");
    }
    public void Wear(){
        System.out.println("quan ao vest");
    }

}
