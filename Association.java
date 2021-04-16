import java.util.Arrays;
import java.util.Map;

public class Association <K extends Comparable<K>, D extends Map> {

    K Key;
    D Data;

    public Association () {

    }

    public void put (K key, D data) {
        this.Key = key;
        this.Data = data;
    }

    public String toString() {
       return Arrays.toString(Data.values().toArray());

    }

    public Object valueFromSubKey (Object subKey) {
        return Data.get(subKey);
    }

    public K getKey () {
        return Key;
    }

    
    
}
