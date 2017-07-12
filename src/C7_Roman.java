/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author meg
 */
public class C7_Roman {

    private static int[] numbers = {1000, 900, 500, 400, 100, 90,
        50, 40, 10, 9, 5, 4, 1};

    private static String[] letters = {"M", "CM", "D", "CD", "C", "XC",
        "L", "XL", "X", "IX", "V", "IV", "I"};

    public static void main(String args[]) {
        System.out.println(toString(1990));
    }

    public static String toString(int num) {
        String roman = "";
        int N = num;

        for (int i = 0; i < numbers.length; i++) {
            while (N >= numbers[i]) {
                roman += letters[i];
                N -= numbers[i];
            }
        }
        return roman;
    }

}
