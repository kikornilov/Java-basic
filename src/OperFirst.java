import java.util.Scanner;

public class OperFirst {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите значение 'x': ");
        float x = in.nextFloat();
        System.out.print("Введите значение 'y': ");
        float y = in.nextFloat();
        System.out.print("Введите значение 'z': ");
        float z = in.nextFloat();
        System.out.printf("Вы ввели числа: %f, %f, %f \n", x, y, z);
        double average = (x + y + z) / 3;
        System.out.printf("Среднее арифметическое введенных чисел: %f \n", average);
        double averageHalf = average / 2;
        double averageHalfRound = Math.floor(averageHalf);
        if (averageHalfRound > 3) {
            System.out.println("Программа выполнена корректно");
        }
        in.close();
    }
}
