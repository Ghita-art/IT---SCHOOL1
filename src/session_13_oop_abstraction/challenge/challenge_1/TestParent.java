package session_13_oop_abstraction.challenge.challenge_1;

public class TestParent {
    public static void main(String[] args) {
        SubClassOne subClassOne = new SubClassOne();
        SubClassTwo subClassTwo = new SubClassTwo();

        subClassOne.message();
        subClassTwo.message();
    }
}
