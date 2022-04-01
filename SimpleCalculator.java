package java101;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        //hesap makinesini switch-case kullanarak yapınız.

        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number");
        double a = input.nextInt();

        System.out.println("Enter second number");
        double b = input.nextDouble();

        System.out.println("Choose: +,-,/.*");
        String x = input.next();

        switch (x) {
            case "+" -> System.out.println("result: " + (a + b));
            case "-" -> System.out.println("result: " + (a - b));
            case "*" -> System.out.println("result: " + (a * b));
            case "/" -> System.out.println("result: " + (a / b));
            default -> System.out.println("Wrong operator");
        }
    }
}
