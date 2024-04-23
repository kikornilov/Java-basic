import java.util.Scanner;

public class Conversion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        String firstNumber = in.next();
        System.out.print("Введите второе число: ");
        Integer secondNumber = in.nextInt();
        Integer firstNumberInt = Integer.parseInt(firstNumber);
        if (firstNumberInt.compareTo(secondNumber) == 1 | firstNumberInt.compareTo(secondNumber) == 0){
            int outLarger = firstNumberInt;
            System.out.printf("Большее число: %d ", outLarger);
            double outSmaller = secondNumber;
            System.out.printf("Меньшее число: %f ", outSmaller);
        }
        else {
            int outLarger = secondNumber;
            System.out.printf("Большее число: %d ", outLarger);
            double outSmaller = firstNumberInt;
            System.out.printf("Меньшее число: %f ", outSmaller);
        }
    }
}
