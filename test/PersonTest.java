import org.junit.Test;
import person.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class PersonTest {
    @Test
    public void should_give_name_with_first_name_first() throws Exception {
        Name name = new Name("Julius", "Barrows");
        Address address = new Address("West Shanna","Georgia","Bangladesh");
        Age age = new Age(18);
        Person p = new Person(name, age, Gender.Female, address);
        assertEquals("Julius Barrows", name.forenameFirst());
    }

    @Test
    public void should_give_name_with_last_name_first() throws Exception {
        Name name = new Name("Julius", "Barrows");
        Address address = new Address("West Shanna","Georgia","Bangladesh");
        Age age = new Age(18);
        Person p = new Person(name, age, Gender.Female, address);
    }

    @Test
    public void should_give_Ms_if_gender_is_Female() throws Exception {
        Name name = new Name("Julius", "Barrows");
        Address address = new Address("West Shanna","Georgia","Bangladesh");
        Age age = new Age(18);
        Person p = new Person(name, age, Gender.Female, address);    }

    @Test
    public void should_give_Mr_if_gender_is_Male() throws Exception {
        Name name = new Name("Gavin", "Hyatt");
        Address address = new Address("West Shanna","Georgia","Bangladesh");
        Age age = new Age(36);
        Person person= new Person(name, age, Gender.Male, address);
        assertEquals("Mr", Gender.Male.toString());
    }

    @Test
    public void should_give_name_and_country_with_first_name_first() throws Exception {
        Name name = new Name("Gavin", "Hyatt");
        Address address = new Address("Katlynn view","Vermont","Romania");
        Age age = new Age(36);
        Person person= new Person(name, age, Gender.Male, address);

        assertEquals("Mr Gavin Hyatt, Romania",person.getNameAndCountryWithForenameFirst());
    }

    @Test
    public void should_give_name_and_country_with_last_name_first() throws Exception {
        Name name = new Name("Gavin", "Hyatt");
        Address address = new Address("Katlynn view","Vermont","Romania");
        Age age = new Age(36);
        Person person= new Person(name, age, Gender.Male, address);

        assertEquals("Mr Hyatt, Gavin, Romania",person.getNameAndCountryWithSurnameFirst());
    }

    @Test
    public void should_give_name_and_gender_with_first_name_first() throws Exception {
        Name name = new Name("Julius", "Barrows");
        Address address = new Address("West Shanna","Georgia","Bangladesh");
        Age age = new Age(18);
        Person person= new Person(name, age, Gender.Female, address);
        assertEquals("Ms Julius Barrows", person.getNameWithForenameFirst());
    }

    @Test
    public void should_give_name_and_gender_with_last_name_first() throws Exception {
        Name name = new Name("Julius", "Barrows");
        Address address = new Address("West Shanna","Georgia","Bangladesh");
        Age age = new Age(18);
        Person person= new Person(name, age, Gender.Female, address);
        assertEquals("Ms Barrows, Julius", person.getNameWithSurnameFirst());
    }

    @Test
    public void should_dispense_vouchers_to_person_who_is_above_20() throws Exception {
        Name name = new Name("Melody", "Dooley");
        Address address = new Address("West Shanna","Georgia","Bangladesh");
        Age age = new Age(36);
        Person person= new Person(name, age, Gender.Male, address);

        assertTrue(age.isLegalDrivingAge());

    }
}
