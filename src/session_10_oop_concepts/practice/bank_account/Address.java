package session_10_oop_concepts.practice.bank_account;

public class Address {
    private String street;
    private String number;
    private String block;
    private String flatNo;
    private String city;
    private String county;
    private String postalCode;

    public Address(String street, String number, String block, String flatNo, String city, String county, String postalCode) {

        this.street = street;
        this.number = number;
        this.block = block;
        this.flatNo = flatNo;
        this.city = city;
        this.county = county;
        this.postalCode = postalCode;
    }

    public Address(String street, String number, String block, int i, String vaslui, String vaslui1, String number1) {
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", number='" + number + '\'' +
                ", block='" + block + '\'' +
                ", flatNo=" + flatNo +
                ", city='" + city + '\'' +
                ", county='" + county + '\'' +
                ", postalCode='" + postalCode + '\'' +
                '}';
    }
}

