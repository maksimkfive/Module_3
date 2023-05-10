package task5;

import java.util.LinkedList;

public class HashSet {
    private int bucketSize;
    private LinkedList[] buckets;

    public HashSet(int bucketSize) {
        this.bucketSize = bucketSize;
        buckets = new LinkedList[bucketSize];
        for (int i = 0; i < bucketSize; i++) {
            buckets[i] = new LinkedList();
        }
    }

    public void add(int value) {
        int bucketIndex = hashFunction(value);
        LinkedList bucket = buckets[bucketIndex];
        if (!bucket.contains(value)) {
            bucket.add(value);
        }
    }

    public void remove(int value) {
        int bucketIndex = hashFunction(value);
        LinkedList<Integer> bucket = buckets[bucketIndex];
        if (bucket.size() > 0) {
            if (bucket.contains(value)) {
                bucket.remove(Integer.valueOf(value));
            } else {
                System.out.println("Элемент " + value + " не найден в множестве");
            }
        } else {
            System.out.println("Множество пустое");
        }
    }

    public boolean contains(int value) {
        int bucketIndex = hashFunction(value);
        LinkedList bucket = buckets[bucketIndex];
        return bucket.contains(value);
    }

    private int hashFunction(int value) {
        return Math.abs(value % bucketSize);
    }
}
