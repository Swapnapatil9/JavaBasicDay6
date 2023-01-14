package com.bridgelabz;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("Enter the number: ");
        int num= scanner.nextInt();
        boolean flag=true;
        if(num<2){
            flag= false;
        }else {
            for(int i=2;i<=num/2;i++){
                if(num%i==0){
                    flag =false;
                    break;
                }
            }
        }
       String check= flag ? "is a Prime Number" : "is not a Prime Number";
        System.out.println(num +""+check);
    }
}
