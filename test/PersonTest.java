import org.junit.Test;
import person.Address;
import person.Gender;
import person.Name;
import person.Person;

import static org.junit.Assert.assertEquals;

public class PersonTest {
    @Test
    public void should_give_name_with_first_name_first() throws Exception {
        Name name = new Name("Julius", "Barrows");
        Address address = new Address("Veda haven","Vermont", "Macedonia");
        Person p = new Person(name, 18, Gender.Female, address);
        assertEquals("Julius Barrows", name.forenameFirst());
    }

    @Test
    public void should_give_name_with_last_name_first() throws Exception {
        Name name = new Name("Julius", "Barrows");
        Address address = new Address("Veda haven","Vermont", "Macedonia");
        Person person= new Person(name, 18, Gender.Female, address);
        assertEquals("Barrows Julius", name.surnameFirst());
    }

    @Test
    public void should_give_Ms_if_gender_is_Female() throws Exception {
        Name name = new Name("Julius", "Barrows");
        Address address = new Address("Veda haven","Vermont", "Macedonia");
        Person person= new Person(name, 18, Gender.Female, address);
        assertEquals("Ms", Gender.Female.toString());
    }

    @Test
    public void should_give_Mr_if_gender_is_Male() throws Exception {
        Name name = new Name("Gavin", "Hyatt");
        Address address = new Address("Crooks ton", "Illinois", "Romania");
        Person person= new Person(name, 36, Gender.Male, address);
        assertEquals("Mr", Gender.Male.toString());
    }

    @Test
    public void should_give_name_and_country_with_first_name_first() throws Exception {
        Name name = new Name("Gavin", "Hyatt");
        Address address = new Address("Crooks ton", "Illinois", "Romania");
        Person person= new Person(name, 36, Gender.Male, address);
        assertEquals("Mr Gavin Hyatt, Romania",person.getNameAndCountryWithForenameFirst());
    }

    @Test
    public void should_give_name_and_country_with_last_name_first() throws Exception {
        Name name = new Name("Gavin", "Hyatt");
        Address address = new Address("Crooks ton", "Illinois", "Romania");
        Person person= new Person(name, 36, Gender.Male, address);
        assertEquals("Mr Hyatt Gavin, Romania",person.getNameAndCountryWithSurnameFirst());
    }

    @Test
    public void should_give_name_and_gender_with_first_name_first() throws Exception {
        Name name = new Name("Julius", "Barrows");
        Address address = new Address("Veda haven","Vermont", "Macedonia");
        Person person= new Person(name, 18, Gender.Female, address);
        assertEquals("Ms Julius Barrows", person.nameAndGenderWithForenameFirst());
    }

    @Test
    public void should_give_name_and_gender_with_last_name_first() throws Exception {
        Name name = new Name("Julius", "Barrows");
        Address address = new Address("Veda haven","Vermont", "Macedonia");
        Person person= new Person(name, 18, Gender.Female, address);
        assertEquals("Ms Barrows Julius", person.nameAndGenderWithSurnameFirst());
    }




}
