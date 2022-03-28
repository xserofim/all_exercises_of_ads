//Hello my name is Asadulla. This is solution of Exercise 7.2
package com.company;

import java.util.Scanner;

public class Main {
    //We are creating main method for feature manipulation
    public static void main(String[] args) {
        //creating scanner for user to include the integer
        Scanner input = new Scanner(System.in);
        //giving for array the limitation for values
        int[] array = new int[11];
        //Asking user to enter the integers until the 11
        System.out.println("Enter the integers until 11: ");
        //creating loop for putting integers
        for(int i = 0; i < 11; i++){
            array[i] = input.nextInt();
        }
        //calling the funciton
        compare(array);
    }
    //creating function in which we do calculation and comparing
    public static void compare(int[] array){
        //saving the size of array in size integer
        int size = array.length;
        //creating integer which named number
        int number;
        //creating loop for compare all integers which user entered
        for(int i = 0; i < size; i++){
            //giving for the number the integers from forloop
            number = array[i];
            //creating the second loop for the comaparing the all integers
            for(int j = 0; j < size; j++){
                //checking the condition
                if(number  == array[j]){
                    System.out.println(number + " equal to " + array[j]);
                }
                //checking the condition
                else if(number > array[j]){
                    System.out.println(number + " more than " + array[j]);
                }
                //checking the condition
                else if(number < array[j]){
                    System.out.println(number + " lesser than " + array[j]);
                }
                //checking the condition
                else{
                    System.out.println("Error");
                }
            }
        }
    }
}
