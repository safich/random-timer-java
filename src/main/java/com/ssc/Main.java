package com.ssc;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int startSeconds = 4 * 60 + 27;
        int endSeconds = 3 * 3600 + 24 * 60 + 7;

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Нажмите Enter, чтобы сгенерировать случайное время, или введите 'exit' для выхода.");

        while (true) {
            System.out.print("Нажмите Enter для нового времени: ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Выход из программы...");
                break;
            }

            int randomSeconds = startSeconds + random.nextInt(endSeconds - startSeconds + 1);

            int hours = randomSeconds / 3600;
            int minutes = (randomSeconds % 3600) / 60;
            int seconds = randomSeconds % 60;

            String randomTime = String.format("%02d:%02d:%02d", hours, minutes, seconds);
            System.out.println("Случайное время: " + randomTime);
        }
        scanner.close();
    }
}