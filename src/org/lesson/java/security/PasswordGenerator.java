package org.lesson.java.security;

import java.util.Scanner;

public class PasswordGenerator {

    public static void main(String[] args){

        Scanner textInsert = new Scanner(System.in);

        System.out.println("Insert your name");
        String name = textInsert.nextLine();


        System.out.println("Insert your surname");
        String surname = textInsert.nextLine();


        System.out.println("Insert your favourite colour");
        String favouriteColor = textInsert.nextLine();


        System.out.println("Insert your date of birth (all in a number format) ");
        System.out.println("Insert Day");
        int Day = textInsert.nextInt();

        System.out.println("Insert Month");
        int Month = textInsert.nextInt();

        System.out.println("Insert Year");
        int Year = textInsert.nextInt();



        System.out.print("La tua password:" + " " + name + "-" + surname + "-" + favouriteColor + "-" + (Day + Month + Year) );


        textInsert.close();
    }

}