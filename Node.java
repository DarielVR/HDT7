public class Node <E extends Comparable<E>> implements Comparable<E>{
    int id;
    E value;
    Node<E> left;
    Node<E> right;

    Node(E value, int id) {
        this.id = id;
        this.value = value;
        right = null;
        left = null;
    }

    @Override
    public int compareTo(E value) {
        // TODO Auto-generated method stub
        return this.value.compareTo(value);
    }
}
