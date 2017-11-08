import java.util.ArrayList;

/**
 * Created by jhascall19 on 11/7/17.
 */

public class  HuffmanTree {
    private
    HuffmanTree(String a){
       ArrayList chars = new ArrayList();
       ArrayList count = new ArrayList();
        int counter = 0;

        for (int i = 0; i <a.length()-1 ; i++) {
            chars.add(a.charAt(i));
            for (int q = 0; q < a.length()-1 ; q++) {
                if ((char)chars.get(i) == a.charAt(q)){
                    counter ++;
                }
            }
        count.add(counter);
            counter = 0;
        }

    }


}

