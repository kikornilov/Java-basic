import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Выберите что переводить: 1 - масса, 2 - расстояние ");
        int quantity = in.nextInt();
        double first = 0;
        double second = 0;
        double third = 0;
        double fourth = 0;
        if (quantity == 1){
            System.out.print("Выберите единицу измерения: 1 - грамм, 2 - карат, 3 - тонна, 4 - фунт ");
            int measure = in.nextInt();
            System.out.print("Введите число: ");
            float amt = in.nextFloat();
            switch (measure){
                case 1: first = amt;
                    second = amt * 0.2;
                    third = amt * 1000000;
                    fourth = amt * 453.592;
                    break;
                case 2: first = amt * 5;
                    second = amt;
                    third = amt * 5000000;
                    fourth = amt * 2267.962;
                    break;
                case 3: first = amt * 0.000001;
                    second = amt * 0.000005;
                    third = amt;
                    fourth = amt * 0.000453592;
                    break;
                case 4: first = amt * 0.002205;
                    second = amt * 0.000441;
                    third = amt * 2204.62;
                    fourth = amt;
                    break;
            }
            System.out.printf("Граммы: %f \nКараты: %f \nТонны: %f \nФунты: %f \n", first, second, third, fourth);
        }
        else {
            System.out.print("Выберите единицу измерения: 1 - метр, 2 - миля, 3 - ярд, 4 - фут ");
            int measure = in.nextInt();
            System.out.print("Введите число: ");
            float amt = in.nextFloat();
            switch (measure) {
                case 1:
                    first = amt;
                    second = amt * 1609.34;
                    third = amt * 0.9144;
                    fourth = amt * 0.3048;
                    break;
                case 2:
                    first = amt * 0.000621;
                    second = amt;
                    third = amt * 0.000568;
                    fourth = amt * 0.000189;
                    break;
                case 3:
                    first = amt * 1.09;
                    second = amt * 1760;
                    third = amt;
                    fourth = amt * 0.333333;
                    break;
                case 4:
                    first = amt * 0.3048;
                    second = amt * 5280;
                    third = amt * 3;
                    fourth = amt;
                    break;
            }
            System.out.printf("Метров: %f \nМиль: %f \nЯрд: %f \nФутов: %f \n", first, second, third, fourth);
        }
    }
}
