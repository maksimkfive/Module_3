package task6;

public class Main {
    public static void main(String[] args) {
        PriorityQueue myQueue = new PriorityQueue(5);

        // добавляем элементы в очередь
        myQueue.insert(10);
        myQueue.insert(20);
        myQueue.insert(30);
        myQueue.insert(40);
        myQueue.insert(50);

        // выводим элементы очереди, начиная с наибольшего
        System.out.println("Элементы очереди:");
        while (!myQueue.isEmpty()) {
            int item = myQueue.remove();
            System.out.println(item);
        }
    }
}
