
/**
 *
 * @author meg
 */
public class C2_SumOfNumbersDivisibleBy {

    public static void main(String args[]) {
        //Challenge two
        int len = 10;
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            if ((i % 3 == 0) || (i % 5 == 0)) {
                sum = sum + i;
            }

        }
        System.out.println("sum " + sum);

    }

}
