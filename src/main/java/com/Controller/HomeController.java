package com.Controller;

public class HomeController {
        public String hello() {
            int i = 0;
            int j =12;
            if (i<j) {
                System.out.println("Not Added Successfully");
            }else {
                System.out.println("added Successfully");
            }
            return "Hello World!";
        }
    }
