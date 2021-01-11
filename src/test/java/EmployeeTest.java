import org.junit.Before;
import org.junit.Test;
import staff.Employee;
import staff.management.Manager;

import static org.junit.Assert.assertEquals;

public class EmployeeTest {

    Employee employee;

    @Before
    public void setUp(){
        employee = new Manager("Matt LeBlanc", "BA123456E", 43125.74, "Engineering");

    }

    @Test
    public void getName(){
        assertEquals("Matt LeBlanc", employee.getName());
    }

    @Test
    public void getNINumber(){
        assertEquals("BA123456E", employee.getnINumber());
    }
}
