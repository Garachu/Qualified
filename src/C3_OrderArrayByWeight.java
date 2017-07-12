
import java.util.Arrays;

/**
 *
 * @author meg
 */
public class C3_OrderArrayByWeight {

    public static void main(String args[]) {
        String list = "56 65 74 100 99 68 86 180 90";
        int weight;
        //split separates the array elements
        //trim removes any whitespace around the number
        //parseInt parses each number
        //Finally dump the result in an array
        int[] arr = Arrays.stream(list.split(" "))
                .map(String::trim).mapToInt(Integer::parseInt).toArray();
        System.out.println(Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void bubbleSort(int[] array) {
        boolean swapped = true;
        int j = 0;
        int tmp;
        while (swapped) {
            swapped = false;
            j++;
            for (int i = 0; i < array.length - j; i++) {
                if (sumDigits(array[i]) > sumDigits(array[i + 1])) {
                    tmp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = tmp;
                    swapped = true;
                }
            }
        }
    }

    public static int sumDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum = sum + num % 10;
            num = num / 10;
        }
        System.out.println(sum);
        return sum;
    }

}
