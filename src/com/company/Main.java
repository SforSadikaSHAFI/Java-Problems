package com.company;
import java.util.Scanner;

public class Main {
    static void printFibonacci(int n){
        int n1 = 0;
        int n2 = 1;
        int n3 = 0;
        System.out.print(n1+"+"+n2);
        for(int i=0; i<n-2; i++){
            n3=n1+n2;
            System.out.print("+"+n3);
            n1 = n2;
            n2 = n3;
        }

    }
    public static void main(String[] args) {
	// write your code here

        System.out.print("Enter the number: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        printFibonacci(n);


    }
}
