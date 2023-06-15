package Task2;

// Создйте класс Test2 двумя переменными. Добавьте конструктор с входными параметрами. Добавьте
// конструктор, инициализирующий члены класса по умолчанию. Добавьте set- и get- методы для полей экземпляра
// класса.

public class Main {
    public static void main(String[] args) {
        Test2 test2 = new Test2(10, 11);
        System.out.println("First num: " + test2.getA());
        System.out.println("Second num: " + test2.getB());
    }
}
