package task6;

public class PriorityQueue {
    private int maxSize;
    private int[] queueArray;
    private int nItems;

    public PriorityQueue(int size) {
        maxSize = size;
        queueArray = new int[maxSize];
        nItems = 0;
    }

    public void insert(int value) {
        if (nItems == 0) {
            queueArray[nItems++] = value;
        } else {
            int j = nItems - 1;
            while (j >= 0 && value > queueArray[j]) {
                queueArray[j + 1] = queueArray[j];
                j--;
            }
            queueArray[j + 1] = value;
            nItems++;
        }
    }

    public int remove() {
        return queueArray[--nItems];
    }

    public boolean isEmpty() {
        return (nItems == 0);
    }

    public boolean isFull() {
        return (nItems == maxSize);
    }
}
