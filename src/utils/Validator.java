package utils;

import java.util.Scanner;
import java.util.Set;

public class Validator {

    private static final Set<Integer> VALUES = Set.of(
            1, 2, 3, 4, 5
    );
    public static String validateName(Scanner scanner) {
        String str = scanner.nextLine().trim();
        while (str.isEmpty()) {
            System.out.print("Пусто! Введите имя: ");
            str = scanner.nextLine().trim();
        }
        return str;
    }

    public static int validateIntInput(Scanner scanner) {

        while (!scanner.hasNextInt()) {
            String str = scanner.nextLine().trim();
            System.out.printf("\"%s\" - не число!\n", str);
            System.out.print("Введите значение ещё раз: ");
        }
        int inputData = scanner.nextInt();
        while (inputData <= 0) {
            System.out.println("Неверное значение! Введите ещё раз: ");
            while (!scanner.hasNextInt()) {
                String str = scanner.next().trim();
                System.out.printf("\"%s\" - не число!\n", str);
                System.out.println("Введите целое значение: ");
            }
            inputData = scanner.nextInt();
        }
        return inputData;
    }

    public static double validateDoubleInput(Scanner scanner) {
        while (!scanner.hasNextDouble()) {
            String str = scanner.nextLine().trim();
            System.out.printf("\"%s\" - не число!\n", str);
            System.out.print("Введите значение: ");
        }
        double inputData = scanner.nextDouble();
        while (inputData <= 0) {
            System.out.print("Неверное значение! Введите ещё раз: ");
            while (!scanner.hasNextDouble()) {
                String str = scanner.nextLine().trim();
                System.out.printf("\"%s\" - не число!\n", str);
                System.out.print("Введите значение: ");
            }
            inputData = scanner.nextDouble();
        }
        return inputData;
    }

    public static int validateStarsNumber(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            String str = scanner.nextLine().trim();
            System.out.printf("\"%s\" - не число!\n", str);
            System.out.print("Введите значение ещё раз: ");
        }
        int inputData = scanner.nextInt();
        while (VALUES.contains(inputData)) {
            System.out.println("Такого варианта нет! Введите ещё раз: ");
            while (!scanner.hasNextInt()) {
                String str = scanner.next().trim();
                System.out.printf("\"%s\" - не число!\n", str);
                System.out.println("Введите значение: ");
            }
            inputData = scanner.nextInt();
        }
        return inputData;
    }

}
