package com.ssc;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int startSeconds = 4 * 60 + 27;
        int endSeconds = 3 * 3600 + 24 * 60 + 7;

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Press Enter, to generate random timing, or type 'exit' to end.");

        while (true) {
            System.out.print("Press Enter to new timing: ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Exiting...");
                break;
            }

            int randomSeconds = startSeconds + random.nextInt(endSeconds - startSeconds + 1);

            int hours = randomSeconds / 3600;
            int minutes = (randomSeconds % 3600) / 60;
            int seconds = randomSeconds % 60;

            String randomTime = String.format("%02d:%02d:%02d", hours, minutes, seconds);
            System.out.println("Random time: " + randomTime);
        }
        scanner.close();
    }
}