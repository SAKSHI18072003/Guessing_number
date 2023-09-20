package com.Sudhir;

import java.util.Random;
import java.util.Scanner;

public class Guess_Number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random random=new Random();
        while(true){
            int trgNum= random.nextInt(10)+1;
            int attempts=0;

            while(attempts<5){
                System.out.println("Enter number to guess: ");
                int guessNum=sc.nextInt();
                attempts++;

                if(guessNum==trgNum){
                    System.out.println("Congratulation! You guess the number in " +attempts + " in attempts");
                    break;
                }
                else if(guessNum<trgNum){
                    System.out.println("Please try a higher number");
                    System.out.println("Try again! only "  +(5-attempts) +  " left");
                }

                else if(guessNum>trgNum){
                    System.out.println("Please try lower number");
                    System.out.println("Try again! only " +(5-attempts) +  " attempts left");
                }
                if(attempts==5){
                    System.out.println("You run out of attempts");
                    System.out.println("The number was " +trgNum);
                    break;
                }
            }

        }
    }
}
