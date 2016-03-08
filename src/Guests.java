import person.*;

import java.util.Objects;

public class Guests {
    String text;
    public Guests(String text) {
        this.text = text;
    }

    public Person setGuestDetail(){
        return setFieldInGuest(text.split(","));
    }

    private Person setFieldInGuest(String[] person) {
        Name name = setName(person[0], person[1]);
        Gender gender = checkGender(person[2]);
        Age age = new Age(new Integer(person [3]));
        Address address = setAddress(person[4], person[5], person[6]);
        return new Person(name, age, gender, address);
    }

    private Gender checkGender(String s) {
       if(Objects.equals(s, "Female")){
           return Gender.Female;
       }
        return Gender.Male;
    }

    private Name setName(String firstName, String lastName){
        return new Name(firstName, lastName);
    }

    private Address setAddress(String city, String state, String country){
        return new Address(city, state, country);
    }

}