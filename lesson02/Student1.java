package com.example.lesson02.BaiTap;

import org.springframework.stereotype.Component;

@Component("hocsinh")
public class Student1 implements Person {
    @Override
    public void Wear(){
        System.out.println("quan ao hoc sinh");
    }
    public void Work(){
        System.out.println("hoc");
    }
}
