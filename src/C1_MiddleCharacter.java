
/**
 *
 * @author meg
 */
public class C1_MiddleCharacter {

    public static void main(String args[]) {
        //Challenge one
        String word = "test";
        System.out.println("test == " + word.substring(1, 3));
        int pos, len;
        if (word.length() % 2 == 0) {
            pos = word.length() / 2 - 1;
            len = 2;
        } else {
            pos = word.length() / 2;
            len = 1;
        }
        //If you don't specify endIndex, java substring() method will return all the characters from startIndex.
        //startIndex : starting index is inclusive
        //endIndex : ending index is exclusive
        System.out.println(word.substring(pos, pos + len));

    }

}
