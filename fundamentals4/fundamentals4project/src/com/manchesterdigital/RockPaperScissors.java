package com.manchesterdigital;
import java.util.Scanner;
import java.util.Random;
public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        String userChoice = userInput.nextLine();

        Random random = new Random();
        double computerChoice = random.nextDouble();
    }


}

