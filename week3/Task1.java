import java.util.*;
import java.util.stream.*;
class Student {
    String name;
    int marks;
    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
    String getName() {
        return name;
    }
    int getMarks() {
        return marks;
    }
}
public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        List<Student> students = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            String name = sc.next();
            int marks = sc.nextInt();
            students.add(new Student(name, marks));
        }
        int K = sc.nextInt();
        String result = students.stream()
                .sorted(
                        Comparator.comparingInt(Student::getMarks).reversed()
                                .thenComparing(Student::getName)
                )
                .limit(K)
                .map(Student::getName)
                .collect(Collectors.joining(" "));
        System.out.println(result);
    }
}