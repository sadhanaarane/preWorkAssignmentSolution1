package com.greatlearning.prework;

import java.util.Scanner;

public class Main{
    public static boolean isPalindrome(int num){
        int originalNum = num;
        int reversedNum = 0;
        while (num > 0) {
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
            num /= 10;
        }
        return originalNum == reversedNum;
    }

    public static void printStars(int n){
        if(n > 0) {
	    	for (int i = n; i >= 1; i--) {
	            for (int j = 1; j <= i; j++) {
	                System.out.print("*");
	            }
	            System.out.println();
	        }
        }
        else
        	System.out.println("Enter valid number.");
    }

    public static boolean isPrime(int num){
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void printFibonacci(int n){
        int prev = 0, current = 1;
        if(n == 0) {
        	System.out.println("The fibonacci series is: " + prev);
        }
        else if(n == 1) {
        	System.out.print("The fibonacci series is: " + prev + "," + current);
        }
        else {
        	System.out.print("The fibonacci series is: " + prev + "," + current);
        	while(n > 1){
	            int next = prev + current;
	            System.out.print("," + next);
	            prev = current;
	            current = next;
	            n -= 1;
        	}
        }
        System.out.println();
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
        	System.out.println();
            
            System.out.println("1. Check for palindrome number");
            System.out.println("2. Print pattern of stars");
            System.out.println("3. Check for prime number");
            System.out.println("4. Print Fibonacci series");
            System.out.println("5. Exit");
            System.out.println("Select an operation to perform: ");
            choice = scanner.nextInt();

            switch (choice){
                case 1:{
                    System.out.print("Enter a number: ");
                    int num = scanner.nextInt();
                    if (isPalindrome(num)) {
                        System.out.println(num + " is a palindrome number.");
                    } else {
                        System.out.println(num + " is not a palindrome number.");
                    }
                    break;
                }
                case 2:{
                    System.out.print("Enter the number of rows: ");
                    int rows = scanner.nextInt();
                    printStars(rows);
                    break;
                }
                case 3:{
                    System.out.print("Enter a number: ");
                    int num = scanner.nextInt();
                    if (isPrime(num)) {
                        System.out.println(num + " is a prime number.");
                    } else {
                        System.out.println(num + " is not a prime number.");
                    }
                    break;
                }
                case 4:{
                    System.out.print("Enter the size of the Fibonacci series: ");
                    int n = scanner.nextInt();
                    printFibonacci(n);
                    break;
                }
                case 5:{
                    System.out.println("Exiting the program. Goodbye!");
                    break;
                }
                default:{
                    System.out.println("Invalid choice. Enter a valid no.1");
                }
            }

        } while (choice != 5);

        scanner.close();
    }
}
