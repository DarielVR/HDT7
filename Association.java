import java.util.Collection;
import java.util.Map;

public class Association <K, V extends Map> {

    Map<K, V> associations;

    public Association () {

    }

    public void put (K key, V values) {
        associations.put(key, values);
    }

    public Collection valuesFromKey (K key) {
        return associations.get(key).values();
    }

    public Object valueFromKeys (K key1, Object key2) {
        return associations.get(key1).get(key2);
    }
    
}
