import java.util.ArrayList;

/**
 * Created by jhascall19 on 11/7/17.
 */

public class  HuffmanTree {
    private
    HuffmanTree(String a){
        ArrayList cars= new ArrayList();
        ArrayList target = new ArrayList();
        for (int i = 0; i < a.length(); i++) {
            cars.add(a.charAt(i));
        }
        target.add(cars.get(0));
        int counter=0;
        int length = cars.size();

        for (int i = 0; i <cars.size() ; i++) {

            if (cars.get(i).equals(target)){
                cars.remove(i);
                counter++;
            }else {
                target = (char) cars.get(i);

            }


        }
    }


}

