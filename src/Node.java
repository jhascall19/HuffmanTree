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
    public Node(Comparable k, Value v, int size){
        this.key = (Comparable) k;
        this.value = (Comparable) v;
        this.size = size;

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

    @Override
    public String toString(){
        String pho;
        pho = key.toString();
        pho = pho + "," + value.toString();
        return pho;
    }
}