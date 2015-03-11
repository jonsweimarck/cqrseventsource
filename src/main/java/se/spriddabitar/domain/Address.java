package se.spriddabitar.domain;

public class Address {
    private String street;
    private String zip;
    private String town;

    public Address(String street, String zip, String town) {
        this.street = street;
        this.zip = zip;
        this.town = town;
    }

    public String getStreet() {
        return street;
    }

    public String getZip() {
        return zip;
    }

    public String getTown() {
        return town;
    }
}
