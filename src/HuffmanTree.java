
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Created by jhascall19 on 11/7/17.
 */

public class  HuffmanTree  {
   private  Node top;
    HuffmanTree(String a) {

        // making 2 parrallel arraylists that contain # time appeared and character (Lines 14-25)
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
        // Priority Queue (lines 27-31)
        Node n;
        PriorityQueue<Node> queue = new PriorityQueue();

        for (int i = 0; i <chars.size() ; i++) {
         n = new Node<Integer, Character>(count.get(i),(Character)chars.get(i));
         queue.add(n);
        }
        // feeding priority queue into tree format (Lines 33- 51 )

        if (!queue.isEmpty()) {
            while (queue.size() > 1) {
                Node left = queue.poll();
                Node right = queue.poll();

                Node root = new Node((int) right.getKey() + (int) left.getKey(), "*");
                root.setLeft(left);
                root.setRight(right);
                queue.add(root);

            }

         }
         top = queue.poll();
        }
        // To String public (Lines 54-57)
        public String toString(){
              String  stringOut = toString(top);
            return stringOut;
        }
        // to string recursive (Lines 58-73)
        private String toString(Node n) {
            String rec = "";
            if (n == null) {
                return rec;
            } else if (n.isLeaf()) {
                rec += "1";
                int charNum = (int)top.getValue().toString().charAt(0);
                rec += Integer.toBinaryString(charNum);
            }else {
                rec += 0;
                rec += toString(top.getLeft());
                rec += toString(top.getRight());

            }
            return rec;
        }

    public static void main(String[] args) {
            String strang = "The dog gandered at the ganderer";
            HuffmanTree h = new HuffmanTree(strang);
        System.out.println("Huffman code: " + h.toString());
        System.out.print("Original Code: " );
        for (int i = 0; i < strang.length(); i++) {
            System.out.print(Integer.toBinaryString(strang.charAt(i)));
        }

    }


    }


