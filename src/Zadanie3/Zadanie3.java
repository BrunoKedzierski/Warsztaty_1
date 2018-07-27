package Zadanie3;

import java.util.Scanner;

public class Zadanie3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Guess a number between 1 do 100 and i'll guess it \n" + "Type too much, too small or correct");
        int min = 0;
        int max = 100;
        int guess = (max-min)/2 + min;
        boolean end = false;
        while(!end){

            System.out.println("I guess " + guess);
            String userInput = scan.nextLine();
            if(userInput.equalsIgnoreCase("too much")){
                max = guess;
            }
            else if(userInput.equalsIgnoreCase("too small")){
                min=guess;
            }
            else if(userInput.equalsIgnoreCase("correct")){
                System.out.println("I won");
                end = true;
            }
            else {
                System.out.println("nie oszukuj");
            }
             guess = (max-min)/2 + min;
        }
    }
}
