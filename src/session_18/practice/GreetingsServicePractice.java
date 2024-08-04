package session_18.practice;

public class GreetingsServicePractice {

    public static void main(String[] args) {
        //using anonymous class

        GreetingsService anonymousGreetingService = new GreetingsService() {
            @Override
            public void greet(String message) {
                System.out.println(message + "From anonymous class");

            }
        };
        anonymousGreetingService.greet("Hello World!");

        //using lambda expression

        GreetingsService lambdaGreetingService = input -> System.out.println(input + "From lambda expression");
        lambdaGreetingService.greet("Hello World");
    }
}
