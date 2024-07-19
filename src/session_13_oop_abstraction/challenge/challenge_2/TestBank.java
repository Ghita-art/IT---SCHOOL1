package session_13_oop_abstraction.challenge.challenge_2;

public class TestBank {
    public static void main(String[] args) {
        BankA bankA = new BankA();
        BankB bankB = new BankB();
        BankC bankC = new BankC();

        System.out.println("The balance of BankA is: " + bankA.getBalance());
        System.out.println("The balance of BankB is: " + bankB.getBalance());
        System.out.println("The balance of BankC is: " + bankC.getBalance());
    }
}
