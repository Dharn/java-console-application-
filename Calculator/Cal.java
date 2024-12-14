import java.util.Scanner;
import java.io.*;
public class Cal {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int operator;
        int user;
        double num1, num2, num3, result = 0;
        double ans = 0;
        System.out.println("\t \t \t WELCOME TO BASIC CALCULATOR");
        System.out.println("How many number you can calculate 2 or 3");
        user = s.nextInt();

        if (user == 2) {
            System.out.println("1.Addition \n 2.Subtract \n 3.Multi \n 4.Divide \n 5.modulo ");
            System.out.println("Enter the operator");
            operator = s.nextInt();
            System.out.println("Enter the fist number");
            num1 = s.nextInt();
            System.out.println("Enter the second number");
            num2 = s.nextInt();
            if (operator == 1) {
                System.out.println(Calculator.add(num1, num2));
            } else if (operator == 2) {
                System.out.println(Calculator.sub(num1, num2));
            } else if (operator == 3) {
                System.out.println(Calculator.mul(num1, num2));
            } else if (operator == 4) {
                System.out.println(Calculator.div(num1, num2));
            } else if (operator == 5) {
                System.out.println(Calculator.mod(num1, num2));
            }
        }
        if (user == 3) {
            System.out.println("1.Addition \n 2.Subtract \n 3.Multi \n 4.Divide \n 5.modulo ");
            System.out.println("Enter the operator");
            operator = s.nextInt();
            System.out.println("Enter the fist number");
            num1 = s.nextInt();
            System.out.println("Enter the second number");
            num2 = s.nextInt();
            System.out.println("Enter the third number");
            num3 = s.nextInt();
            if (operator == 1) {
                System.out.println(Calculator.add(num1, num2, num3));
            } else if (operator == 2) {
                System.out.println(Calculator.sub(num1, num2, num3));
            } else if (operator == 3) {
                System.out.println(Calculator.mul(num1, num2, num3));
            } else if (operator == 4) {
                System.out.println(Calculator.div(num1, num2, num3));
            } else if (operator == 5) {
                System.out.println(Calculator.mod(num1, num2, num3));
            }
        }
    }
}

