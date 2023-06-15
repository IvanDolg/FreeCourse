package Task3;
import java.util.Arrays;

public class Student {
    private String lastName;
    private String initials;
    private String numGroup;
    private int[] grade;
    public Student(String lastName, String initials, String numGroup, int grade[]){
        this.lastName = lastName;
        this.initials = initials;
        this.numGroup = numGroup;
        this.grade = grade;
    }
    public int getNum(Student[] students){
        int i = 0;
        for (Student student : students) {
            if (this.grade[i] >= 9) {
                System.out.println(this.lastName);
                System.out.println(this.numGroup);
                i++;
            }
        }
        return i;
    }
    public String toString(){
        for (int i = 0; i < grade.length; i++) {
            if (grade[i] >= 9) {
                return  "\nThis student has an excellent academic record " +
                        "\n" + this.lastName +
                        " " + this.initials +
                        " " + this.numGroup +
                        " " + Arrays.toString(this.grade);
            }
        }
        return "\nThis student has a poor academic record";
    }
}
