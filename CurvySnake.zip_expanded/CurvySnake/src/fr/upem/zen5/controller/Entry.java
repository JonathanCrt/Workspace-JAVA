package fr.upem.zen5.controller;

import java.util.Map;

/**Class to manage an association of to element.*/

public class Entry<K, V> implements Map.Entry<K, V>, Cloneable {

    private final K key;

    private V value;

    public Entry(K key, V value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public K getKey() {
        return key;
    }

    @Override
    public V getValue() {
        return value;
    }

    @Override
    public V setValue(V value) {
        V old = this.value;
        this.value = value;
        return old;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o)
        	return true;
        if(!(o instanceof Entry))
        	return false;

        Entry<?, ?> entry = (Entry<?, ?>) o;

        if(!key.equals(entry.key))
        	return false;
        return value.equals(entry.value);

    }

    @Override
    public int hashCode() {
        int result = key.hashCode();
        result = 31 * result + value.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Entry{" + "key=" + key + ", value=" + value + '}';
    }

    @Override
    public Object clone() {
        return new Entry<K, V>(this.key, this.value);
    }
}