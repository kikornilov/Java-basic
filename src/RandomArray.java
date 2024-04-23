import java.util.Random;

public class RandomArray {
    public static void main(String[] args) {
        int [] myArray = new int[15];
        int maxValue = -20;
        int minValue = 20;
        for (int i = 0; i < myArray.length; i++){
            Random rn = new Random();
            myArray[i] = rn.nextInt(40) - 20;
            if (myArray[i] > maxValue){
                maxValue = myArray[i];
            }
            if (myArray[i] < minValue){
                minValue = myArray[i];
            }
        }
        System.out.printf("\nМаксимальный элемент массива: %d \n", maxValue);
        System.out.printf("Минимальный элемент массива: %d \n", minValue);
        int absMax = Math.abs(maxValue);
        int absMin = Math.abs(minValue);
        if (absMax > absMin){
            System.out.printf("Большее по модулю: %d", absMax);
        }
        else {
            System.out.printf("Большее по модулю: %d", absMin);
        }
    }
}
