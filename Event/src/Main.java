import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter event name:");
        String eventName = scanner.nextLine();

        System.out.println("Enter event date and time (yyyy-MM-ddTHH:mm):");
        String eventDateTimeInput = scanner.nextLine();
        LocalDateTime eventDateTime = LocalDateTime.parse(eventDateTimeInput);

        System.out.println("Enter event time zone (e.g., America/Chicago):");
        String eventTimeZoneInput = scanner.nextLine();
        ZoneId eventTimeZone = ZoneId.of(eventTimeZoneInput);
        System.out.println("Event Time Zone: " + eventTimeZone);

        Event event = new Event(eventName, eventDateTime, eventTimeZone);

        System.out.println("Event Details:");
        System.out.println("Event Name: " + event.getEventName());
        System.out.println("Event Day: " + event.getEventDay());
        System.out.println("Is Leap Year: " + event.isLeapYear());
        System.out.println("Days Until Event: " + event.daysUntilEvent());
        System.out.println("Formatted Event Details: " + event.formatEventDetails());

        System.out.println("Enter target time zone for conversion (e.g., America/Panama):");
        String targetTimeZone = scanner.nextLine();
        System.out.println("Converted Event Time: " + event.convertTimeZone(targetTimeZone));

        scanner.close();
    }
}