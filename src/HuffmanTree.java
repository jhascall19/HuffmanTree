import java.util.ArrayList;

/**
 * Created by jhascall19 on 11/7/17.
 */

public class  HuffmanTree {
    HuffmanTree(String a) {
        ArrayList chars = new ArrayList();
        ArrayList<Integer> count = new ArrayList();
        for (int i = 0; i < a.length() - 1; i++) {

            if (chars.contains(a.charAt(i))) {
                int loc = chars.indexOf(a.charAt(i));
                count.set(loc, count.get(loc) + 1);
            } else {
                chars.add(a.charAt(i));
                count.add(1);
            }
        }

        
    }


}

