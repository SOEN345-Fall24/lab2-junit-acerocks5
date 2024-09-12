import org.junit.Test;

import static org.junit.Assert.*;

public class ExampleTest {
    @Test
    public void testFunction_A1()
    {
        Example test = new Example(2, 1);
        assertTrue("incorrect", 5 == test.Function_A( 3));
    }

    @Test
    public void testFunction_A2()
    {
        Example test = new Example(2, 1);
        assertTrue("incorrect", -7 == test.Function_A(-5));
    }

    @Test
    public void testFunction_B1()
    {
        Example test = new Example(2, 2);
        assertTrue("incorrect", 6 == test.Function_B(8));
    }

    @Test
    public void testFunction_B2()
    {
        Example test = new Example(2, 2);
        assertTrue("incorrect", 6 == test.Function_B(4));
    }

}