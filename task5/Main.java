package task5;

public class Main {
    public static void main(String[] args) {
        HashSet mySet = new HashSet(5); // создаем экземпляр HashSet

        mySet.add(5); // добавляем элементы в множество
        mySet.add(10);
        mySet.add(15);
        mySet.add(20);
        mySet.add(25);

        System.out.println(mySet.contains(10)); // проверяем, содержит ли множество элемент 10
        mySet.remove(10); // удаляем элемент из множества
        System.out.println(mySet.contains(10)); // проверяем, содержит ли множество элемент 10 после удаления
}
    }
