import org.junit.Test;
import person.Age;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class AgeTest {
    @Test
    public void should_give_the_age_of_guest() throws Exception {
        Age age = new Age(23);
        assertEquals("23", age.getAge());
    }

    @Test
    public void test_for_should_guest_has_legal_drinking_age() throws Exception {
        Age age = new Age(23);
        assertTrue(age.isLegalDrivingAge());
    }

    @Test
    public void test_for_guest_has_not_legal_drinking_age() throws Exception {
        Age age = new Age(20);
        assertFalse(age.isLegalDrivingAge());
    }
}
