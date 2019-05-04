package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	//Given two number entered by the user give back the number from the user.

        //This is instanciating an object of type scanner.
        Scanner myScanner=new Scanner(System.in);
        //THis is asking to the user to enter the first number
        System.out.println("Enter the first number:");
        //This is storing the value inside a double variable.
        double firstNumber=myScanner.nextDouble();
        //This is asking to the user to enter the second value.
        System.out.println("Enter the second number: ");
        //This is storing the number entered by the user in a double variable
        double secondNumber=myScanner.nextDouble();

        //This is first calling the method for every operation and then pass to the methods the two values entered by the user.
        System.out.println(addiction(firstNumber,secondNumber));
        System.out.println(subtraction(firstNumber,secondNumber));
        System.out.println(division(firstNumber,secondNumber));
        System.out.println(multiplications(firstNumber,secondNumber));
        System.out.println(remainder(firstNumber,secondNumber));



    }

    //This is creating a method that is gonna return the value double addiction.
    public static double addiction(double firstNumber, double secondNumber){
        double addiction = firstNumber+secondNumber;
        System.out.print("The addiction is equal to= ");
        return addiction;
    }
    //This is creating a method that is gonna return the value double addiction.
    public static  double subtraction(double firstNumber, double secondNumber){
        double subtraction =firstNumber-secondNumber;
        System.out.print("The subtraction is equal to= ");
        return subtraction;
    }
    //This is creating a method that is gonna return the value double moltiplication.
    public static double multiplications(double firstNumbe, double secondNumber){
        double multiplications=firstNumbe*secondNumber;
        System.out.print("The moltiplication is equal to= ");
        return multiplications;
    }
    //This is creating a method that is gonna return the value double division.
    public static double division(double firstNumber, double secondNumber){
        double division =firstNumber/secondNumber;
        System.out.print("The division is equal to= ");
        return division;
    }
    //This is creating a method that is gonna return the value double remainder.
    public static double remainder(double firstNumber, double secondNumber){
        double remainder=firstNumber%secondNumber;
        System.out.print("The remainder of the the number is equal to= ");
        return remainder;
    }
}
