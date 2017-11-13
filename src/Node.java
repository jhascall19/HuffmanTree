public class Node<Key extends Comparable<Key>, Value> {
    private int size;
    //other instance data here
//methods- getters, setters, toString
    private Node left;
    private Node Right;
    private Comparable key;
    private Comparable value;

    public void set(Comparable key,Comparable value){
        this.key = key;
        this.value = value;

    }
    public Node(Comparable k, Value v){
        this.key = (Comparable) k;
        this.value = (Comparable) v;


    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public Comparable getKey() {
        return key;
    }

    public Comparable getValue() {
        return value;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public void setRight(Node right) {
        Right = right;
    }

    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return Right;
    }

    public void setValue(Comparable value) {
        this.value = value;
    }

    public boolean isLeaf(Node n){
        if (n.getRight() != null || n.getLeft() != null){
            return false;
        }else{
            return true;
        }
    }

    public int compareTo(Node n, Node o){
        if (n.getKey().compareTo(o.getKey()) > 0) {
            return 1;
        }
            else if(n.getKey().compareTo(o.getKey()) < 0) {
            return -1;

        }else {
            return 0;
        }
    }

    @Override
    public String toString(){
        String pho;
        pho = key.toString();
        pho = pho + "," + value.toString();
        return pho;
    }
}