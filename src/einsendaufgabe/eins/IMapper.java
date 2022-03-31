package einsendaufgabe.eins;


public interface IMapper<K, V> {

    K toKey(V value);

    V toValue(K key);
}