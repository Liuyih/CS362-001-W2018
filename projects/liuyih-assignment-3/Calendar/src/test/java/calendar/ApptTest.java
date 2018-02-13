package calendar;
/**
 *  This class provides a basic set of test cases for the
 *  Appt class.
 */
import org.junit.Test;

import static org.junit.Assert.*;

public class ApptTest {
    /**
     * Test that the gets methods work as expected.
     */
    @Test
    public void test01()  throws Throwable  {
        int startHour=21;
        int startMinute=30;
        int startDay=15;
        int startMonth=01;
        int startYear=2018;
        String title="Birthday Party";
        String description="This is my birthday party.";
        //Construct a new Appointment object with the initial data
        Appt appt = new Appt(startHour,
                             startMinute ,
                             startDay ,
                             startMonth ,
                             startYear ,
                             title,
                             description);
        // assertions
        assertTrue(appt.getValid());
        assertEquals(21, appt.getStartHour());
        assertEquals(30, appt.getStartMinute());
        assertEquals(15, appt.getStartDay());
        assertEquals(01, appt.getStartMonth());
        assertEquals(2018, appt.getStartYear());
        assertEquals("Birthday Party", appt.getTitle());
        assertEquals("This is my birthday party.", appt.getDescription());
    }
    
    @Test
    public void isValid(){
        
        Appt test = new Appt(-28, 0, -59 , 5, 45, "adsfasdf", "asdsdf");
        Appt test1 = new Appt(27, -50, -59 , 5, -59, "adsfasdf", "asdsdf");
        Appt test2 = new Appt(20, 50, -59 , 5, -59, "adsfasdf", "asdsdf");
        Appt test3 = new Appt(23, 0, 7 , 5, -59, "adsfasdf", "asdsdf");
        Appt test4 = new Appt(15, 590, 5, 5, 5, "Test", "test");
        Appt test5 = new Appt(0, 5, 5, 5, 5, "Test", "test");
        Appt test6 = new Appt(13, 58, 5, 5, 5, "Test", "test");
        Appt test7 = new Appt(5, 58, 5, 5, 5, "Test", "test");
        
        
        assertFalse(test1.getValid());
        assertFalse(test2.getValid());
        assertTrue(test3.getValid());
        assertFalse(test4.getValid());
        assertEquals(test4.getStartHour(), 15);
        
        test4.toString();
        test5.toString();
        test3.toString();
        //assertEquals(test3.toString(), "adsfasdf");
        assertEquals(test5.toString(), "\t5/5/5 at 12:5am ,Test, test\n");
        assertEquals(test6.toString(), "\t5/5/5 at 1:58pm ,Test, test\n");
        assertEquals(test7.toString(), "\t5/5/5 at 5:58am ,Test, test\n");
        
        
    }
    
    @Test
    public void setTime()
    {
        Appt test = new Appt(8, 5, 5 , 5, 9, "adsfasdf", "asdsdf");
        
        test.setStartHour(55);
        assertFalse(test.getValid());
        test.setStartMinute(5);
        test.setStartDay(5);
        test.setStartMonth(5);
        test.setStartYear(5);
        test.setTitle(null);
        test.setDescription(null);
        
    }
    
    
}
