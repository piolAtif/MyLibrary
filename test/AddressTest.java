import org.junit.Test;
import person.Address;

import static org.junit.Assert.assertEquals;

public class AddressTest {
    @Test
    public void should_give_the_country() throws Exception {
        Address address = new Address("West Shanna","Georgia","Bangladesh");
        assertEquals("Bangladesh",address.getCountry());
    }

    @Test
    public void should_give_the_address() throws Exception {
        Address address = new Address("West Shanna","Georgia","Bangladesh");
        assertEquals("West Shanna, Georgia, Bangladesh",address.getAddress());
    }
}
