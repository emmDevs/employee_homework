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
    public void setName__notNull(){
        assertEquals("Ross Geller", employee.setName("Ross Geller"));
    }

    @Test
    public void setName__Null(){
        assertEquals("Matt LeBlanc", employee.setName(null));
    }

    @Test
    public void getNINumber(){
        assertEquals("BA123456E", employee.getnINumber());
    }

    @Test
    public void getSalary(){
        assertEquals(43125.74, employee.getSalary(), 0.01);
    }

    @Test
    public void canRaiseSalary__positiveNumber(){
        employee.raisesalary(5);
        assertEquals(45282.03, employee.getSalary(), 0.01);
    }

    @Test
    public void canRaiseSalary__negativeNumber(){
        employee.raisesalary(-5);
        assertEquals(43125.74, employee.getSalary(), 0.01);
    }

    @Test
    public void canGetBonus(){
        assertEquals(431.26, employee.payBonus(), 0.01);
    }
}
