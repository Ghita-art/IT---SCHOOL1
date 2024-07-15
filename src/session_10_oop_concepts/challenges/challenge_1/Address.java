package session_10_oop_concepts.challenges.challenge_1;

public class Address {
    private String street;
    private int number;
    private String block;
    private String city;
    private String country;
    private String postalCode;

    public Address(String street, int number, String block, String city, String country, String postalCode) {
        this.street = street;
        this.number = number;
        this.block = block;
        this.city = city;
        this.country = country;
        this.postalCode = postalCode;

    }

    @Override

    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", number='" + number + '\'' +
                ", block='" + block + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", postalCode='" + postalCode + '\'' +
                '}';
    }
}

