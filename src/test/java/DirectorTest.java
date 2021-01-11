import org.junit.Before;
import org.junit.Test;
import staff.management.Director;
import staff.management.Manager;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void setUp(){
        director = new Director("Jennifer Anniston", "KL127356H", 58765.49, 1430786.56);

    }

    @Test
    public void getName(){
        assertEquals("Jennifer Anniston", director.getName());
    }

    @Test
    public void getNINumber(){
        assertEquals("KL127356H", director.getnINumber());
    }

    @Test
    public void getSalary(){
        assertEquals(58765.49, director.getSalary(), 0.01);
    }

    @Test
    public void getBudget(){
        assertEquals(1430786.56, director.getBudget(), 0.01);
    }

    @Test
    public void canRaiseSalary(){
        director.raisesalary(5);
        assertEquals(61703.76, director.getSalary(), 0.01);
    }

    @Test
    public void canGetBonus(){
        assertEquals(1175.30, director.payBonus(), 0.01);
    }
}
