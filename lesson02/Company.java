package com.example.lesson02.BaiTap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Company {
    @Qualifier("nhanvien")
    @Autowired
    private Person nguoi;

    public Person getNguoi() {
        return nguoi;
    }
}
