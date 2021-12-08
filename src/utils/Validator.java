package utils;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Set;

public class Validator {

    private static final Set<Integer> VALUES = Set.of(1, 2, 3, 4, 5);

    public static String validateName(Scanner scanner) {

        String inputData;
        while (!scanner.hasNext("[а-яА-ЯёЁa-zA-Z]*")) {
            System.out.print("Неверное значение! Введите имя клиента: ");
            try {
                String str = scanner.nextLine().trim();
            }
            catch (InputMismatchException ex) {
                System.out.print("Введите буквенное значение");
            }

        }

        inputData = scanner.nextLine();
        return inputData;

    }

    public static int validateIntInput(Scanner scanner) {

        int inputData;
        String testString = null;

        while (!scanner.hasNextInt()) {
            String str = scanner.nextLine().trim();
            System.out.printf("\"%s\" - не число!\nВведите значение ещё раз: \n", str);
        }

        inputData = scanner.nextInt();

        while (inputData < 0) {
            System.out.println("Неверное значение! Введите ещё раз: ");
            while (!scanner.hasNextInt()) {
                try {
                    testString = scanner.next().trim();
                }
                catch (InputMismatchException ex) {
                    System.out.printf("\"%s\" - не число!\nВведите целое значение: ", testString);
                }

            }
            inputData = scanner.nextInt();
        }
        return inputData;
    }

    public static double validateDoubleInput(Scanner scanner) {

        double inputData;
        String testString = null;

        while (!scanner.hasNextDouble()) {
            String str = scanner.nextLine().trim();
            System.out.printf("\"%s\" - не число!\nВведите значение: ", str);
        }

        inputData = scanner.nextDouble();

        while (inputData < 0) {
            System.out.print("Неверное значение! Введите ещё раз: ");
            while (!scanner.hasNextDouble()) {
                try {
                    testString = scanner.nextLine().trim();
                }
                catch (InputMismatchException ex) {
                    System.out.printf("\"%s\" - не число!\nВведите значение: ", testString);
                }
            }
            inputData = scanner.nextDouble();
        }
        return inputData;
    }

    public static int validateStarsNumber(Scanner scanner) {

        int inputData;
        String testString = null;
        while (!scanner.hasNextInt()) {
            String str = scanner.nextLine().trim();
            System.out.printf("\"%s\" - не число!\nВведите значение ещё раз: ", str);
        }

        inputData = scanner.nextInt();

        while (!VALUES.contains(inputData)) {
            System.out.println("Такого варианта нет! Введите ещё раз: ");
            while (!scanner.hasNextInt()) {
                try {
                    testString = scanner.next().trim();
                }
                catch (InputMismatchException ex) {
                    System.out.printf("\"%s\" - не число!\n\"Введите значение: \"", testString);
                }

            }
            inputData = scanner.nextInt();
        }
        return inputData;
    }

}
