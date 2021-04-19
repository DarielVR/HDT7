public class Association <K extends Comparable<K>, D> implements Comparable<K> {

    private K key;
    private D data;

    public Association (K key, D data) {
        this.key = key;
        this.data = data;
    }

    public void put (K key, D data) {
        this.key = key;
        this.data = data;
    }

    public D getData () {
        return data;
    }


    public K getKey () {
        return key;
    }

    @Override
    public int compareTo(K key) {
        // TODO Auto-generated method stub
        return key.compareTo(key);
    }
    
}
