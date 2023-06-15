package Task3;

import java.util.Arrays;

// Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость (массив
// из пяти элементов). Создайте массив из десяти элементов такого типа. Добавьте возможность вывода фамилий и
// номеров групп студентов, имеющих оценки, равные только 9 или 10
public class Main {
    private static Student[] students;

    public static void main(String[] args) {
        Student[] student = new Student[]{
                new Student("Dolgolaptev", "D.I.V", "120601",
                        new int[]{3, 4, 5, 4, 6}),
                new Student("Ivanov", "I.I.I", "120602",
                        new int[]{9, 9, 9, 9, 9}),
                new Student("Pushkin", "P.I.V", "120602",
                        new int[]{5, 5, 5, 5, 6}),
                new Student("Vorodei", "V.A.K", "120601",
                        new int[]{8, 8, 8, 4, 6}),
                new Student("Solovei", "S.E.A", "120603",
                        new int[]{7, 4, 5, 7, 6}),
                new Student("Pronin", "P.G.K", "120604",
                        new int[]{3, 3, 5, 4, 6}),
                new Student("Kuchminski", "K.I.W", "120605",
                        new int[]{10, 10, 10, 10, 10}),
                new Student("Maleshev", "M.P.D", "120603",
                        new int[]{0, 4, 5, 4, 6}),
                new Student("Petrusevich", "P.M.I", "120604",
                        new int[]{3, 4, 5, 4, 6}),
                new Student("Dubovic", "D.A.V", "120601",
                        new int[]{3, 4, 5, 4, 6})
        };
        System.out.println(Arrays.toString(student));
    }
}
