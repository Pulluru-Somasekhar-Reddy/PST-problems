// The goal is to process this list using Java’s Date and Time API (java.time) 

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;
class Event {
    String name;
    LocalDate date;
    Event(String name, LocalDate date) {
        this.name = name;
        this.date = date;
    }
}
public class Task9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Event> events = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String name = sc.next();
            String dateStr = sc.next();
            LocalDate date = LocalDate.parse(dateStr);
            events.add(new Event(name, date));
        }
        int month = sc.nextInt();
        List<Event> sortedEvents = events.stream()
                .sorted(Comparator.comparing(e -> e.date))
                .collect(Collectors.toList());
        System.out.println(
                sortedEvents.stream()
                        .map(e -> e.name)
                        .collect(Collectors.joining(" "))
        );
        Event earliest = Collections.min(events, Comparator.comparing(e -> e.date));
        System.out.println(earliest.name);
        Event latest = Collections.max(events, Comparator.comparing(e -> e.date));
        System.out.println(latest.name);
        System.out.println(
                events.stream()
                        .filter(e -> e.date.getMonthValue() == month)
                        .map(e -> e.name)
                        .collect(Collectors.joining(" "))
        );
    }
}