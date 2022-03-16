
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PersonTest {

    Person person;

    @BeforeEach
    public void setup() {
        person = new Person("Paul", "McCartney", 2000, true, true, true);
    }

    @Test
    public void show_full_name() {
        String fullName = "Paul McCartney";
        assertEquals(fullName, person.fullName());
    }

    @Test
    void test_calculateYearlySalary(){
        person.setSalary(1200);
        float salary = 14400;
        assertEquals(salary, person.calculateYearlySalary());
    }

    @Test
    void person_is_MEI(){
        person.setAnotherCompanyOwner(false);
        person.setPensioner(false);
        person.setPublicServer(false);
        assertTrue(person.isMEI());
    }

    @Test
    void person_is_not_MEI(){
        boolean isMei = person.isMEI();
        assertFalse(isMei);
    }

}