import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        float x = in.nextFloat();
        System.out.print("Введите второе число: ");
        float y = in.nextFloat();
        System.out.print("Введите один из символов арифметической операции (’+’, ‘-’, ‘*’ или ‘/’): ");
        char op = in.next().charAt(0);
        double answer = 0;
        switch(op) {
            case '+': answer = x + y;
            break;
            case '-': answer = x - y;
            break;
            case '/': answer = x / y;
            break;
            case '*': answer = x * y;
            break;
        }
        System.out.printf("Ответ: %f", answer);
    }
}
