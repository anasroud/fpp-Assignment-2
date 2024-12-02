import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.Year;

public class Event {
    private String eventName;
    private LocalDateTime eventDateTime;
    private ZoneId eventTimeZone;

    public Event(String eventName, LocalDateTime eventDateTime, ZoneId eventTimeZone) {
        this.eventName = eventName;
        this.eventDateTime = eventDateTime;
        this.eventTimeZone = eventTimeZone;
    }

    public String getEventName() {
        return eventName;
    }

    public LocalDateTime getEventDateTime() {
        return eventDateTime;
    }

    public ZoneId getEventTimeZone() {
        return eventTimeZone;
    }

    public String getEventDay() {
        DateTimeFormatter dayFormater = DateTimeFormatter.ofPattern("EEEE");
        return eventDateTime.format(dayFormater);
    }

    public boolean isLeapYear() {
        return Year.isLeap(eventDateTime.getYear());
    }

    public long daysUntilEvent() {
        LocalDateTime now = LocalDateTime.now();
        return ChronoUnit.DAYS.between(now, eventDateTime);
    }

    public String formatEventDetails() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, MMMM dd, yyyy @ HH:mm");
        return eventDateTime.format(formatter) + " [" + eventTimeZone + "]";
    }

    public String convertTimeZone(String targetTimeZone) {
        ZoneId targetZoneId = ZoneId.of(targetTimeZone);
        LocalDateTime targetDateTime = eventDateTime.atZone(eventTimeZone).withZoneSameInstant(targetZoneId).toLocalDateTime();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, MMMM dd, yyyy @ HH:mm");
        return targetDateTime.format(formatter) + " [" + targetZoneId + "]";
    }
}