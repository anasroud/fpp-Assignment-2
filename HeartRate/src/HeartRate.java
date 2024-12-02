import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class HeartRate {
    public final String firstName;
    public final String lastName;
    public final String dateOfBirth;
    public final int RHR = 70;
    public int avgHeartRate;
    public final double lb = 0.5;
    public final double ub = 0.85;

    public HeartRate(String firstName, String lastName, String dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
    }

    public String getAge() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDate birthDate = LocalDate.parse(dateOfBirth, formatter);
        LocalDate currentDate = LocalDate.now();
        int age = Period.between(birthDate, currentDate).getYears();
        return Integer.toString(age);
    }

    public int getMaximumHeartRate() {
        return 220 - Integer.parseInt(getAge());
    }

    public int getAvgHeartRate() {
        return avgHeartRate = getMaximumHeartRate() - getRestingHeartRate();
    }

    public int getRestingHeartRate() {
        return RHR;
    }

    public double getBoundaryHeartRate() {
        return getAvgHeartRate() * lb + getRestingHeartRate();
    }

    public double getUpperBoundaryHeartRate() {
        return getAvgHeartRate() * ub + getRestingHeartRate();
    }

    public String toString() {
        return "The Target Heart Rate is between: " + getBoundaryHeartRate()  + "and" + getUpperBoundaryHeartRate() + "\n" +
                "First Name: " + firstName + "\n" +
                "Last Name: " + lastName + "\n" +
                "Age: " + getAge() + "\n" +
                "Date of Birth: " + dateOfBirth + "\n" +
                "Maximum Heart Rate: " + getMaximumHeartRate() + "\n";
    }
}
