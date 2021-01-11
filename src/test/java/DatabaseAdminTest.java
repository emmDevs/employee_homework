import org.junit.Before;
import org.junit.Test;
import staff.techStaff.DatabaseAdmin;
import staff.techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void setUp(){
        databaseAdmin = new DatabaseAdmin("Courtney Cox", "FG6638923Z", 32768.83);

    }

    @Test
    public void getName(){
        assertEquals("Courtney Cox", databaseAdmin.getName());
    }

    @Test
    public void getNINumber(){
        assertEquals("FG6638923Z", databaseAdmin.getnINumber());
    }

    @Test
    public void getSalary(){
        assertEquals(32768.83, databaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void canRaiseSalary(){
        databaseAdmin.raisesalary(5);
        assertEquals(34407.27, databaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void canGetBonus(){
        assertEquals(327.69, databaseAdmin.payBonus(), 0.01);
    }
}
