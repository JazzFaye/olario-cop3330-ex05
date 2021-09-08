import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner math = new Scanner(System.in);

        System.out.println("What is the first number? ");
        String number1 = math.nextLine();

        System.out.println("What is the second number? ");
        String number2 = math.nextLine();

        int a = Integer.parseInt(number1);
        int b = Integer.parseInt(number2);

        int sum = a + b;
        int difference = a - b;
        int product = a * b;
        int quotient = a / b;

        System.out.printf("%d + %d = %d", a, b, sum);
        System.out.printf("\n%d - %d = %d", a, b, difference);
        System.out.printf("\n%d * %d = %d", a, b, product);
        System.out.printf("\n%d / %d = %d", a, b, quotient);
    }
}

