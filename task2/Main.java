package task2;

public class Main {
    public static void main(String[] args) {
        LinkedList myList = new LinkedList();

        // добавляем элементы в список
        myList.add(5);
        myList.add(10);
        myList.add(15);
        myList.add(20);
        myList.add(25);

        // выводим элементы списка на экран
        System.out.println("Список до удаления:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Элемент " + i + ": " + myList.get(i));
        }

        // удаляем элемент из списка
        myList.remove(10);

        // выводим элементы списка на экран
        System.out.println("Список после удаления:");
        for (int i = 0; i < 4; i++) {
            System.out.println("Элемент " + i + ": " + myList.get(i));
        }
    }
}
