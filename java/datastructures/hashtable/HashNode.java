public class HashNode<K, V> {
    k key;
    V value;
    final int hashCode;

    public HashNode(K key, V value, int hashCode) {
        this.key = key;
        this.value = value;
        this.hashCode = hashCode;
    }
    
}
