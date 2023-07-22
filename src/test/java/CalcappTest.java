// Module 25.7 SLF4j Exercise 25.7.1 Calculator+Test (JUnit) + SLF4J

import org.example.Calcapp;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalcappTest {


//    public void setUp() throws Exception {
//        super.setUp();
//    }

//    public void tearDown() throws Exception {
//    }

    private Calcapp calcapp;

    @Test
    public void getSum() {
        assertEquals(14, calcapp.getSum(7,7));
    }

    @Test
    public void getDivide() {
        assertEquals(25, calcapp.getDivide(100,4));
    }

    @Test(expected = ArithmeticException.class)
    public void divisionWithException() {
        calcapp.getDivide(15,0);
    }

    @Test
    public void getMultiple() {
        assertEquals(48, calcapp.getMultiple(6,8));
    }

    @Test
    public void getSub() {
        assertEquals(12, calcapp.getSub(71,59));
    }


    @Before
    public void initTest() {
        calcapp = new Calcapp();
    }

    @After
    public void afterTest() {
        calcapp = null;
    }
}