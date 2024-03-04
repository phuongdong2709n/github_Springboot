package com.example.lesson02.BaiTap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
/*
* để đánh dấu một class là một Spring component.
* Annotation này cho phép Spring hiểu và quản lý class được đánh dấu như một bean trong ứng dụng.
* */
@Component
public class School {
    @Qualifier("hocsinh")
    @Autowired
    private Person nguoi;

    public Person getNguoi() {
        return nguoi;
    }
}
