import java.util.Objects;
import java.util.Scanner;

public class LoopArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String x = "Вова";
        String y = "452";
        String z = "Ту99";
        System.out.print("Введите размер массива: ");
        int arraySize = in.nextInt();
        String[] myArray = new String[arraySize];
        for (int i = 0; i < arraySize; i++) {
            System.out.print("Введите элемент массива: ");
            myArray[i] = in.next();
        }
        for (int i = 0; i < arraySize; i++) {
            if (Objects.equals(myArray[i], x) | Objects.equals(myArray[i], y) | Objects.equals(myArray[i], z)){
                System.out.print("Данное значение имеется в константах");
                break;
            }
        }
    }
}
