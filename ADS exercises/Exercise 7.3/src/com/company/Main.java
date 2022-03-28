//Hello my name is Asadulla. This is solution of Exercise 7.3
package com.company;

import java.util.Scanner;

public class Main {
    //We are creating main method for all malipulation
    public static void main(String[] args) {
        int[] counts = new int[100];//this code give us the opportunities to count the occurances of numbers
        System.out.print("Enter the integers between 1 and 100: ");//asking the user to enter the integers between 1 and 100
        count(counts);//calling function to count occurances of numbers
        for(int i = 0; i < counts.length; i++){//This code show the final result of this program
            if(counts[i] > 0){
                System.out.println((i + 1) + " occurs " + counts[i] + " time" + (counts[i] > 1 ? "s" : ""));
            }
        }
    }

    //In this function we are using the method to count integers between 1 and 100 and counts the occerances of each integer
    public static void count(int[] counts){
        Scanner input = new Scanner(System.in);//this code give us ability for user to inout the integer
        int num;//this code created for saving the users integers
        //in this sequences providing the main calculation
        do{
            num = input.nextInt();
            if(num >= 1 && num <= 100){
                counts[num - 1]++;
            }
        }
        while(num != 0);
    }
}
