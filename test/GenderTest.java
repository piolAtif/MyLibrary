import org.junit.Test;
import person.Gender;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GenderTest {
    @Test
    public void should_give_Ms_when_gender_is_female() throws Exception {
        assertEquals("Ms", Gender.Female.toString());
    }

    @Test
    public void should_give_Mr_when_gender_is_male() throws Exception {
        assertEquals("Mr", Gender.Male.toString());
    }

    @Test
    public void should_be_female() throws Exception {
        assertTrue(Gender.Female.isSameGender("Ms"));
    }

    @Test
    public void should_be_male() throws Exception {
        assertTrue(Gender.Male.isSameGender("Mr"));
    }

    @Test
    public void should_not_female() throws Exception {
        assertFalse(Gender.Female.isSameGender("Mr"));
    }

    @Test
    public void should_not_male() throws Exception {
        assertFalse(Gender.Male.isSameGender("Ms"));
    }
}
