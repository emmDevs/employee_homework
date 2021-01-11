import org.junit.Before;
import org.junit.Test;
import staff.Employee;
import staff.management.Manager;

import static org.junit.Assert.assertEquals;

public class ManagerTest {
    Manager manager;

    @Before
    public void setUp(){
        manager = new Manager("Matt LeBlanc", "BA123456E", 43125.74, "Engineering");

    }

    @Test
    public void getName(){
        assertEquals("Matt LeBlanc", manager.getName());
    }

    @Test
    public void getNINumber(){
        assertEquals("BA123456E", manager.getnINumber());
    }

    @Test
    public void getSalary(){
        assertEquals(43125.74, manager.getSalary(), 0.01);
    }

    @Test
    public void canRaiseSalary(){
        manager.raisesalary(5);
        assertEquals(45282.03, manager.getSalary(), 0.01);
    }

    @Test
    public void canGetBonus(){
        assertEquals(431.26, manager.payBonus(), 0.01);
    }
}
