/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Jazz Faye Olario
 */

import java.util.Scanner;   //Using class scanner

public class App {
    public static void main(String[] args) {
        // main method begins execution of Java application
        Scanner math = new Scanner(System.in);   //Scanner to obtain input
        System.out.println("What is the first number? ");
        String number1 = math.nextLine();   //Reads first number from the user

        System.out.println("What is the second number? ");
        String number2 = math.nextLine();   //Reads second number from the user

        int a = Integer.parseInt(number1);  //Convert the first number to integer
        int b = Integer.parseInt(number2);  //Convert the second number to integer

        int sum = a + b;    //Formula to get the sum
        int difference = a - b; //Formula to get the difference
        int product = a * b;    //Formula to get the product
        int quotient = a / b;   //Formula to get the quotient

        System.out.printf("%d + %d = %d", a, b, sum);   //display both the numbers and their sum
        System.out.printf("\n%d - %d = %d", a, b, difference);  //display both the numbers and their difference
        System.out.printf("\n%d * %d = %d", a, b, product); //display both the numbers and their product
        System.out.printf("\n%d / %d = %d", a, b, quotient);    //display both the numbers and their quotient
    }
}

