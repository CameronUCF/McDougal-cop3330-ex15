/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Cameron McDougal
 */

package org.example;
import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        String passInput;

        System.out.println("What is the password?");
        passInput = scanner.nextLine();

        scanner.close();

        if(passInput.equals("abc$123"))
            System.out.println("Welcome");
        else
            System.out.println("I don't know you.");
    }
}
