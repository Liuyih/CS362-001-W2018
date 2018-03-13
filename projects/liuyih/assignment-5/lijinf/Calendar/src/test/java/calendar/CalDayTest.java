package calendar;
/**
 *  This class provides a basic set of test cases for the
 *  CalDay class.
 */
import java.util.Calendar;
import java.util.GregorianCalendar;


import org.junit.Test;

import static org.junit.Assert.*;

public class CalDayTest {
    
    
    @Test
    public void CalDay()
    {
        CalDay day = new CalDay();
        assertEquals(false, day.isValid());
        
        GregorianCalendar calendarTest = new GregorianCalendar();
        CalDay day1 = new CalDay(calendarTest);
        
        assertEquals(calendarTest.get(calendarTest.DAY_OF_MONTH), day1.day);
        assertEquals(true, day1.isValid());
        
        day1.toString();
        day1.getSizeAppts();
        day.toString();
        day1.iterator();
        day.iterator();
        
    }
    
    @Test
    public void addAppt()
    {
        
        Appt test = new Appt(7, 6, 6, 5, 5, "camping", "going camping");
        Appt test1 = new Appt(9, 9, 9, 9, 9, "work,", "go to work");
        Appt test2 = new Appt(25, 50, 60, 9, 9, "work,", "go to work");
        Appt test3 = new Appt(7, 7, 7, 7, 7, "work,", "go to work");
        Appt test4 = new Appt(6, 6, 7, 7, -7, "fun", "have fun!");
        
        GregorianCalendar calendarTest = new GregorianCalendar();
        CalDay day = new CalDay(calendarTest);
        day.addAppt(test);
        day.addAppt(test1);
        day.addAppt(test2);
        day.addAppt(test4);
        day.toString();
        
        assertEquals(day.getMonth(), 1);
        assertEquals(day.getDay(), 12);
        assertEquals(day.getYear(), 2018);
        assertEquals(day.getSizeAppts(), 3);
        
        
    }
    
    
    
}
