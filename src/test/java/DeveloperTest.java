import org.junit.Before;
import org.junit.Test;
import staff.Employee;
import staff.techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

     Developer developer;

    @Before
    public void setUp(){
        developer = new Developer("Joey Tribiani", "PD654321T", 25341.50);

    }

    @Test
    public void getName(){
        assertEquals("Joey Tribiani", developer.getName());
    }

    @Test
    public void getNINumber(){
        assertEquals("PD654321T", developer.getnINumber());
    }

    @Test
    public void getSalary(){
        assertEquals(25341.50, developer.getSalary(), 0.01);
    }

    @Test
    public void canRaiseSalary(){
        developer.raisesalary(5);
        assertEquals(26608.58, developer.getSalary(), 0.01);
    }

    @Test
    public void canGetBonus(){
        assertEquals(253.42, developer.payBonus(), 0.01);
    }
}
