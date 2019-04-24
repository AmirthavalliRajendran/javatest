package com.kgisl.dataa;

import java.util.Scanner;

/**
 * Char
 */
public class Char {
static String name1;
static String name2;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your first name");
        name1=sc.next();
        System.out.println("Enter your second name");
        name2=sc.next();
        System.out.println("Combine: ");
        System.out.println(name1.concat(name2));
        System.out.println("Length of name 1: "+name1.length());
        System.out.println("Length of name 2: "+name2.length());
    }
}