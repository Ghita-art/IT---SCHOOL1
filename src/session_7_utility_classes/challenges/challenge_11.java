package session_7_utility_classes.challenges;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class challenge_11 {
    public static void main(String[] args) {
        LocalTime momentTime = LocalTime.of(14, 52, 0);
        LocalTime presentTime = LocalTime.now();

        System.out.println(elapsedTimeSince(momentTime, presentTime));
    }

    public static String elapsedTimeSince(LocalTime momentTime, LocalTime presentTime) {
        long durationHours = ChronoUnit.HOURS.between(momentTime, presentTime);
        long durationMinutes = ChronoUnit.MINUTES.between(momentTime, presentTime);
        long durationSeconds = ChronoUnit.SECONDS.between(momentTime, presentTime);

        LocalTime duration = LocalTime.of(0, 0, 0);

        duration = duration.plusHours(durationHours);
        duration = duration.plusMinutes(durationMinutes);
        duration = duration.plusSeconds(durationSeconds);

        return duration.toString();
    }
}


