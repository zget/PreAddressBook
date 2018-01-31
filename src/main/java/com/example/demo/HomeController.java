package com.example.demo;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class HomeController {

    Person p1=new Person("gech","dere","828 kenn",301765387,"geydbhj@gmail.com");
    Person p2=new Person("ave","grt","828 ghh",301465387,"gedbhj@gmail.com");
    Person p3=new Person("alm","ert","234 kenn",201765387,"geydbhj@yahoo.com");
    Person p4=new Person("wer","ket","234 kenn",202765387,"wer23@gmail.com");
    Person p5=new Person("wert","trfg","789 kenn",301765387,"tyu78@gmail.com");

    @RequestMapping("/")
    public ArrayList<Person> populateList() {
        ArrayList<Person> list=new ArrayList<Person>();
        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);
        list.add(p5);



        return list;
    }
}
