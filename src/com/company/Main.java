package com.company;

public class Main {

    public static void main(String[] args) {


        String[] names = new String [3];

        names[0] = " Amina";
        names[1]= " Miyah";
        names[2]= " Mursal";
        for (int n = 0;n<3;n++){
                switch (n) {
                    case 0:
                        System.out.println("Good Morning" + names[0]);
                        break;
                    case 1:
                        System.out.println("Good Afternoon"+ names[1]);
                        break;
                    case 2:
                        System.out.println("Good Evening" + names[2]);

                        break;

                }
        //System.out.println(names[0]+ "Good Morning");
        //System.out.println(names[1]+ "Good Afternoon");
       // System.out.println(names[2]+ "Good Evening");
    }
        }}






