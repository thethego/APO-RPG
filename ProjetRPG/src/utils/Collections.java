/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Deque;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author
 * http://www.java2s.com/Code/Java/Collections-Data-Structure/Setoperationsunionintersectiondifferencesymmetricdifferenceissubsetissuperset.htm
 */
public class Collections {

    public static <T> List<T> concat(Collection<? extends T>... collections) {
        List<T> tmp = new ArrayList<>();
        for (Collection<? extends T> collection : collections) {
            tmp.addAll(collection);
        }
        return tmp;
    }

    public static <T> Set<T> union(Set<? extends T>... sets) {
        return union((Collection<Set<T>>) Arrays.asList((T[]) sets));
    }
    
    public static <T> Set<T> union(Collection<Set<T>> sets) {
        Set<T> tmp = new HashSet<>();
        for (Set<? extends T> set : sets) {
            if (set != null) {
                tmp.addAll(set);
            }
        }
        return tmp;
    }

    public static <T> Set<T> intersection(Set<? extends T>... sets) {
        Set<T> tmp = null;
        for (Set<? extends T> set : sets) {
            if (set != null) {
                tmp = new HashSet<>(set);
                break;
            }
        }
        if (tmp == null) {
            return null;
        }

        for (Set<? extends T> set : sets) {
            if (set != null) {
                tmp.retainAll(set);
            }
        }
        return tmp;
    }

    public static <T> Set<T> difference(Set<? extends T> setA, Set<? extends T> setB) {
        Set<T> tmp = new HashSet<>(setA);
        tmp.removeAll(setB);
        return tmp;
    }

    public static <T> Set<T> symDifference(Set<? extends T> setA, Set<? extends T> setB) {
        Set<T> tmpA;
        Set<T> tmpB;

        tmpA = union(setA, setB);
        tmpB = intersection(setA, setB);
        return difference(tmpA, tmpB);
    }

    public static <T> boolean isSubset(Set<? extends T> setA, Set<? extends T> setB) {
        return setB.containsAll(setA);
    }

    public static <T> boolean isSuperset(Set<? extends T> setA, Set<? extends T> setB) {
        return setA.containsAll(setB);
    }

    public static <T> Set<T> set(T... list) {
        return new HashSet<>(Arrays.asList(list));
    }

    public static <T> Deque<T> queue(T... list) {
        return new ArrayDeque<>(Arrays.asList(list));
    }

    public static <T> List<T> list(T... list) {
        return new ArrayList<>(Arrays.asList(list));
    }
    
    public static <T> Collection<T> collection(T... list) {
        return set(list);
    }
    
    public static <K, V, C extends Collection<V>> boolean multiPutAll(K key, Collection<V> values, Map<K, C> map)
    {
        if (map.containsKey(key)) {
            map.get(key).addAll(values);
            return true;
        } else {
            map.put(key, (C) values);
            return false;
        }
    }
            
    public static <K, V, C extends Collection<V>> boolean multiPut(K key, V value, Map<K, C> map)
    {
        return multiPutAll(key, collection(value), map);
    }

}
