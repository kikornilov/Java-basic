import java.util.Scanner;

public class CountingNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите целое положительное число: ");
        int myNumber = in.nextInt();
        int sumOdd = 0;
        for (int i = 1; i <= myNumber; i = i + 2){
            sumOdd = sumOdd + i;
        }
        System.out.printf("Сумма нечетных чисел до %d равна %d", myNumber, sumOdd);
    }
}
