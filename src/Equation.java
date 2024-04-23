import java.util.Scanner;

public class Equation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите уравнение: ");
        String startEquation = in.nextLine();
        int positionX = startEquation.indexOf('x');
        char operator = startEquation.charAt(1);
        char a = '0';
        char b = '0';
        int x = 0;
        String stringA = " ";
        String stringB = " ";
        System.out.print(operator);
        if (operator == '+') {
            switch (positionX) {
                case 0:
                    a = startEquation.charAt(2);
                    b = startEquation.charAt(4);
                    stringA = Character.toString(a);
                    stringA = "-" + stringA;
                    stringB = Character.toString(b);
                    break;
                case 2:
                    a = startEquation.charAt(0);
                    b = startEquation.charAt(4);
                    stringA = Character.toString(a);
                    stringA = "-" + stringA;
                    stringB = Character.toString(b);
                    break;
                case 4:
                    a = startEquation.charAt(0);
                    b = startEquation.charAt(2);
                    stringA = Character.toString(a);
                    stringB = Character.toString(b);
                    break;
            }
            int resultA = Integer.parseInt(stringA);
            int resultB = Integer.parseInt(stringB);
            x = resultA + resultB;
        }
        else {
            switch (positionX) {
                case 0:
                    a = startEquation.charAt(2);
                    b = startEquation.charAt(4);
                    stringA = Character.toString(a);
                    stringB = Character.toString(b);
                    break;
                case 2:
                    a = startEquation.charAt(0);
                    b = startEquation.charAt(4);
                    stringA = Character.toString(a);
                    stringB = Character.toString(b);
                    stringB = "-" + stringB;
                    break;
                case 4:
                    a = startEquation.charAt(0);
                    b = startEquation.charAt(2);
                    stringA = Character.toString(a);
                    stringB = Character.toString(b);
                    break;
            }
            int resultA = Integer.parseInt(stringA);
            int resultB = Integer.parseInt(stringB);
            x = resultA + resultB;
            System.out.printf("Значение x: %d", x);
        }
    }
}
