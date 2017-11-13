import sun.awt.SunHints;

import java.util.ArrayList;
import java.util.PriorityQueue;

/**
 * Created by jhascall19 on 11/7/17.
 */

public class  HuffmanTree  {
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
        Node n;
        PriorityQueue queue = new PriorityQueue();

        for (int i = 0; i <chars.size() ; i++) {
         n = new Node<Integer, Character>(count.get(i),(Character)chars.get(i));
         queue.add(n);


        }
        for (int q = 0; q < queue.size(); q++) {

        }


                         }


}

