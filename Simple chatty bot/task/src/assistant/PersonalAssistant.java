package assistant;

import java.util.Scanner;

public class PersonalAssistant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello! My name is Aid.");
        System.out.println("I was created in 2018.");
        System.out.println("Please, remind me your name.");

        // reading a name
        String name = scanner.nextLine();

        System.out.println("What a great name you have " + name + "!");
        System.out.println("Let me guess your age.");
        System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");

        // reading all remainders
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int age = ((a % 3) * 70 + (b % 5) * 21 + (c % 7) * 15) % 105;
        System.out.println("Your age is " + age + "; that's a good time to start programming!");
        System.out.println("Now I will prove to you that I can count to any number you want.");
        int number = scanner.nextInt();

        for (int i = 0; i <= number; i++) {
            System.out.println(i + "!");
        }
        System.out.println("Let's test your programming knowledge.");
        System.out.println("Why do we use methods?");
        System.out.println("1. To repeat a statement multiple times.");
        System.out.println("2. To decompose a program into several small subroutines.");
        System.out.println("3. To determine the execution time of a program.");
        System.out.println("4. To interrupt the execution of a program.");

        int inputNumber = scanner.nextInt();
        do {
            if (inputNumber != 2) {
                System.out.println("Please, try again.");
                inputNumber = scanner.nextInt();
            }
        } while (inputNumber != 2);
        System.out.println("Congratulations, have a nice day!");
    }
}
