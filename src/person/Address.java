package person;
public class Address {
    String city;
    String state;
    String country;

    public Address(String city, String state, String country) {
        this.city = city;
        this.state = state;
        this.country = country;
    }

    public String getCountry(){
       return country;
    }

    public String getAddress() {return String.format("%s, %s, %s",city,state,country);
    }
}
