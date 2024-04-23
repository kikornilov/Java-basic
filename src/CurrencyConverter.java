import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите текущий курс: ");
        double currentRate = in.nextDouble();
        System.out.print("Введите количество рублей: ");
        double numberOfRubles = in.nextDouble();
        double result = numberOfRubles / currentRate;
        String roundingValue = String.format("%.2f",result);
        System.out.printf("Итого: %s", roundingValue, " долларов");
    }
}
