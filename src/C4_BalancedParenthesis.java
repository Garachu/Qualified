
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 *
 * @author meg
 */
public class C4_BalancedParenthesis {

    private static final Map<Character, Character> brackets = new HashMap<Character, Character>();

    //Static block is mostly used for changing the default values of static variables.
    //This block gets executed when the class is loaded in the memory.
    //A class can have multiple Static blocks, which will execute in the same sequence in which they have been written into the program.
    static {
        brackets.put('[', ']');
        brackets.put('{', '}');
        brackets.put('(', ')');
    }

    public static void main(String args[]) {
        String str = ("([)]");
        if (str.length() == 0) {
            throw new IllegalArgumentException("String length should be greater than 0");
        }
        // odd number would always result in false
        if ((str.length() % 2) != 0) {
            System.out.println("Not Balanced");
            return;
        }

        //
        final Stack<Character> stack = new Stack<Character>();
        int len = str.length();
        System.out.println("String ==\t" + str + "len == \t" + len);
        for (int i = 0; i < len; i++) {
            System.out.println("i =================================== " + i);
            if (brackets.containsKey(str.charAt(i))) {
                System.out.println("Pass \t" + i + "\t" + str.charAt(i));
                stack.push(str.charAt(i));
            } else if (stack.empty() || (str.charAt(i) != brackets.get(stack.pop()))) {
                System.out.println("Fail \t" + i + "\t" + str.charAt(i));
                System.out.println("Not Balanced");
                return;
            }
        }
        System.out.println("Balanced");
    }

}
