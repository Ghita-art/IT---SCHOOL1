package session_10_oop_concepts.bank_account.bank_account.static_keyword;

public class Validator {
    public static boolean isValidUser(User user) {
        return user.getAge() > 18;
    }
}

