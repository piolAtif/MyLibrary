import org.junit.Test;
import person.Name;

import static org.junit.Assert.assertEquals;

public class NameTest {
    @Test
    public void should_give_the_name_with_first_name_first() throws Exception {
        Name name = new Name("Juana","Champlin");
        assertEquals("Juana Champlin",name.forenameFirst());
    }

    @Test
    public void should_give_the_name_with_last_name_first() throws Exception {
        Name name = new Name("Juana","Champlin");
        assertEquals("Champlin, Juana",name.surnameFirst());
    }

    @Test
    public void should_give_first_name_if_last_name_doesnot_exist() throws Exception {
        Name name = new Name("Juana");
        assertEquals("Juana",name.forenameFirst());
    }

    @Test
    public void should_give_first_name_if_last_name_doesnot_exist_with_surname() throws Exception {
        Name name = new Name("Juana");
        assertEquals("Juana",name.surnameFirst());
    }

    @Test
    public void should_give_the_name_with_first_name_first_when_first_name_doesnot_exist() throws Exception {
        Name name = new Name("Champlin");
        assertEquals("Champlin",name.forenameFirst());
    }

    @Test
    public void should_give_the_name_with_last_name_first_when_first_name_doesnot_exist() throws Exception {
        Name name = new Name("Champlin");
        assertEquals("Champlin",name.surnameFirst());
    }
}