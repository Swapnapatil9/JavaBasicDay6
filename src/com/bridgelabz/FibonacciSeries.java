package com.bridgelabz;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("Enter the number: ");
        int count= scanner.nextInt();
        int n1=0,n2=1;
        System.out.println(n1+"");
        System.out.println(n2+"");
        for (int i=2;i<count;i++){
            int n3=n1+n2;
            System.out.println(""+n3);
            n1=n2;
            n2=n3;
        }
    }
}
