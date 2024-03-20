/**
 * 
 * @param <K> claves del arbol
 * @param <V> valores de las claves del arbol
 */
public class ArbolBinario<K extends Comparable<K>, V> {
    Node<K, V> root;

    /**
     *
     * @param key la clave 
     * @param value el valor de la clave
     */
    public void insert(K key, V value) {
        root = añadirRecursividad(root, key, value);
    }

 /**
     * @param key la clave 
     * @return  el valor de la clave
     */
    public V search(K key) {
        return buscarRecursividad(root, key);
    }

    private V buscarRecursividad(Node<K, V> current, K key) {
        if (current == null) {
            return null; 
        }

        if (key.compareTo(current.key) < 0) {
            return buscarRecursividad(current.left, key); 
        } else if (key.compareTo(current.key) > 0) {
            return buscarRecursividad(current.right, key); 
        } else {
            return current.value; 
        }
    }

    private Node<K, V> añadirRecursividad(Node<K, V> current, K key, V value) {
        if (current == null) {
            return new Node<>(key, value);
        }

        if (key.compareTo(current.key) < 0) {
            current.left = añadirRecursividad(current.left, key, value);
        } else if (key.compareTo(current.key) > 0) {
            current.right = añadirRecursividad(current.right, key, value);
        } else {
            current.value = value; 
        }

        return current;
    }

}