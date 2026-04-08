// Given a list of persons, each with a name (String) and age (integer).
//Sort the persons alphabetically by name using method references.
//Filter the persons older than a given age limit using a static method reference. 
//Convert all names to uppercase using an instance method reference.


import java.util.*;
import java.util.stream.Collectors;
class Person {
    String name;
    int age;
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public static boolean isOlderThanLimit(Person p, int ageLimit) {
        return p.age > ageLimit;
    }
    public String getName() {
        return name;
    }
}
public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Person> persons = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int age = sc.nextInt();
            persons.add(new Person(name, age));
        }
        int ageLimit = sc.nextInt();
        List<String> sortedNames = persons.stream()
                .sorted(Comparator.comparing(Person::getName))
                .map(Person::getName)
                .collect(Collectors.toList());
        List<String> filteredNames = persons.stream()
                .filter(p -> Person.isOlderThanLimit(p, ageLimit))
                .map(Person::getName)
                .collect(Collectors.toList());
        List<String> upperCaseNames = persons.stream()
                .map(Person::getName)
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(String.join(" ", sortedNames));
        System.out.println(String.join(" ", filteredNames));
        System.out.println(String.join(" ", upperCaseNames));
    }
}