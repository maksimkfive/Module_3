package task81;

public class Main {
    public static void printStudentInfo(Student student) {
        System.out.print(student.getName());
        if (student.getAddress().isPresent()) {
            Address address = student.getAddress().get();
            System.out.print(", " + address.getCity() + ", " + address.getRegion());
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Address address1 = new Address("Саратов", "64");
        Address address2 = new Address("Москва", "99");

        Student student1 = new Student("Максим Киндлер", address1);
        Student student2 = new Student("Карманчиков Владислав Андреевич", address2);
        Student student3 = new Student("Bob");

        printStudentInfo(student1);
        printStudentInfo(student2);
        printStudentInfo(student3);
    }
}
