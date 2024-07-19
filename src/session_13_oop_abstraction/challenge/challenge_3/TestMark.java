package session_13_oop_abstraction.challenge.challenge_3;

public class TestMark {
    public static void main(String[] args) {

        StudentA studentA = new StudentA(45, 65, 70);
        StudentB studentB = new StudentB(55, 67, 83, 80);

        System.out.println("The percentage of StudentA is: " + studentA.getPercentage() + " %");
        System.out.println("The percentage of StudentB is: " + studentB.getPercentage() + " %");
    }
}
