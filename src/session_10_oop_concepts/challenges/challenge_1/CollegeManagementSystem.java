package session_10_oop_concepts.challenges.challenge_1;

import session_10_oop_concepts.practice.bank_account.Address;

import java.time.LocalDate;
import java.time.LocalTime;

public class CollegeManagementSystem {
    public static void main(String[] args) {
        Student s1 = new Student("Maria", "Nedelcu", "F", LocalDate.of(1989, 4, 7),
                "2890407080082", new Address("Str Ion Creanga ", "25", "B15", 5, "Botosani", "Botosani", "710456"));

        Professor professor1 = new Professor("Ignat", "Maria", "F", LocalDate.of(1979, 7, 5), "2690603090041", new Address("Cale Victoriei", "55", "15", 15, "Bucharest", "Bucharest", "010064"));
        Professor professor2 = new Professor("Gheorghe", "Ion", "M", LocalDate.of(1980, 11, 6), "1800928070022", new Address("Strada Astronomului", "17", "10", 10, "Bucharest", "Bucharest", "010179"));
        Professor professor3 = new Professor("Damciulescu", "Marius", "M", LocalDate.of(1976, 2, 13), "1780215080040", new Address("Alea Nucului", "45", "8", 10, "Botosani", "Botosani", "733465"));
        Professor professor4 = new Professor("Savu", "Alina", "F", LocalDate.of(1985, 5, 17), "2840418070050", new Address("Bld. Mihai Eminescu", "20", "16", 0, "Botosani", "Botosani", "741595"));
        Professor professor5 = new Professor("Columbeanu", "Bianca", "F", LocalDate.of(1992, 9, 23), "2921022070045", new Address("Boteanu ", "7", "12", 7, "Bucharest", "Bucharest", "010027"));
        Professor professor6 = new Professor("Micsunescu", "Natalia", "F", LocalDate.of(1990, 10, 22), "1890828080022", new Address("Academiei", "7", "9", 9, "Bucharest", "Bucharest", "010011"));
        Professor professor7 = new Professor("Anton", "Antonia", "F", LocalDate.of(1993, 8, 15), "2950724070015", new Address("Amman", "12", "10", 8, "Bucharest", "Bucharest", "741511"));

        Course math = new Course(new Schedule(Schedule.Weekday.MONDAY, LocalTime.of(10, 0), LocalTime.of(10, 50)), "50 minute", "Math", "online", professor1);
        Course computerScience = new Course(new Schedule(Schedule.Weekday.MONDAY, LocalTime.of(11, 0), LocalTime.of(11, 50)), "50 minute", "Computer Science", "hybrid", professor4);
        Course physics = new Course(new Schedule(Schedule.Weekday.TUESDAY, LocalTime.of(9, 0), LocalTime.of(9, 50)), "50 minute", "Physics", "hybrid", professor3);
        Course chemistry = new Course(new Schedule(Schedule.Weekday.TUESDAY, LocalTime.of(10, 0), LocalTime.of(10, 50)), "50 minute", "Chemistry", "hybrid", professor2);
        Course biology = new Course(new Schedule(Schedule.Weekday.WEDNESDAY, LocalTime.of(8, 0), LocalTime.of(8, 50)), "50 minute", "Biology", "online", professor2);
        Course geography = new Course(new Schedule(Schedule.Weekday.WEDNESDAY, LocalTime.of(9, 0), LocalTime.of(9, 50)), "50 minute", "Geography", "online", professor5);
        Course english = new Course(new Schedule(Schedule.Weekday.THURSDAY, LocalTime.of(8, 0), LocalTime.of(8, 50)), "50 minute", "English", "online", professor6);
        Course history = new Course(new Schedule(Schedule.Weekday.THURSDAY, LocalTime.of(9, 0), LocalTime.of(9, 50)), "50 minute", "History", "online", professor7);

        System.out.println("Math " + math);
        System.out.println("Computer Science " + computerScience);
        System.out.println();
        System.out.println("Biology professor" + professor2);
        System.out.println();
        System.out.println("First student " + s1);
    }
}
