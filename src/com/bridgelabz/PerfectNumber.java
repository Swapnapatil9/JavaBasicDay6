package com.bridgelabz;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("Enter the number: ");
        int num= scanner.nextInt();
        int sum=0;
        int number=num;
        for (int i=1;i<num-1;i++){
            if(num%i==0){
                sum+=i;
            }
        }
        if(sum==num){
            System.out.println("The number is a Perfect Number");
        }else{
            System.out.println("The number is Not a Perfect Number");
        }
    }
}
