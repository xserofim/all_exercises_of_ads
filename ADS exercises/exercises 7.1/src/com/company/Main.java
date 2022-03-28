//Hello my name is Asadulla. This is solution of Exercise 7.1.
package com.company;

import java.util.Scanner;

public class Main {
    //We are creating the main method for all future manipulation
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students: ");//Asking the user to enter total number of students
        int[] scores = new int[input.nextInt()];
        char[] grades = new char[scores.length];
        System.out.print("Enter " + scores.length + " scores: ");//Asking the user to enter the total scores of this students
        for(int i = 0; i < scores.length; i++){
            scores[i] = input.nextInt();
        }
        getGrades(scores , grades);//calling function to give variables and for the calcutation
        for(int i = 0; i < scores.length; i++){
            System.out.println("Student " + i + " score is " + scores[i] + " and grades is " + grades[i]);
        }//This code showing the final result of this program
    }
    //We are creating the method for showing the highest score between each student
    public static int max(int[] array){
        int max = array[0];
        for(int i = 1; i < array.length; i++){
            if(array[i] > max){
                max = array[i];
            }
        }
        return max;
    }
    //And by a condition of exercise we are creating method for assigns the grades considered from grading scheme
    public static void getGrades(int[] scores, char[] grades){
        int best = max(scores);
        for(int i = 0; i < scores.length; i++){
            if(scores[i] >= best - 10){
                grades[i] = 'A';
            }
            else if(scores[i] >= best - 20){
                grades[i] = 'B';
            }
            else if(scores[i] >= best - 30){
                grades[i] = 'C';
            }
            else if(scores[i] >= best - 40){
                grades[i] = 'D';
            }
            else{
                grades[i] = 'F';
            }
        }
    }
}
