package calendar;
/**
 *  This class provides a basic set of test cases for the
 *  TimeTable class.
 */
import org.junit.Test;

import java.util.GregorianCalendar;
import java.util.LinkedList;
public class TimeTableTest {

	 @Test
	  public void test01()  throws Throwable  {
		 
	 }
	 @Test
	  public void test02()  throws Throwable  {
		 
	 }
//add more unit tests as you needed
    @Test
    public void getApptRange() throws DateOutOfRangeException {
        
        TimeTable table = new TimeTable();
        
        GregorianCalendar calendarTest = new GregorianCalendar(10,3,10);
        CalDay day = new CalDay(calendarTest);
        
        Appt test = new Appt(5, 6, 6, 5, 5, "camping", "going camping");
        Appt test1 = new Appt(9, 9, 9, 9, 9, "work,", "go to work");
        Appt test2 = new Appt(25, 50, 60, 9, 9, "work,", "go to work");
        Appt test3 = new Appt(7, 7, 7, 7, 7, "work,", "go to work");
        Appt test4 = new Appt(6, 6, 6, 7, 7, "fun", "have fun!");
        Appt test5 = new Appt(13, 45, 6, 7, 7, "test", "test");
        
        
        day.addAppt(test);
        day.addAppt(test1);
        day.addAppt(test2);
        day.addAppt(test3);
        day.addAppt(test4);
        day.addAppt(test5);
        
        
        GregorianCalendar calendarTest1 = new GregorianCalendar(2,3,3);
        CalDay day1 = new CalDay(calendarTest1);
        
        
        day1.addAppt(test);
        day1.addAppt(test1);
        day1.addAppt(test2);
        day1.addAppt(test3);
        day1.addAppt(test4);
        
        LinkedList<CalDay> days = new LinkedList<CalDay>();
        
        table.getApptRange (day.appts, calendarTest1, calendarTest);
        table.getApptRange (day1.appts, calendarTest, calendarTest1);
        
        
    }
    @Test
    public void delete()
    {

        TimeTable table = new TimeTable();


        GregorianCalendar calendarTest = new GregorianCalendar(2003,3,10);
        CalDay day = new CalDay(calendarTest);

        Appt test = new Appt(5, 6, 6, 5, 5, "camping", "going camping");
        Appt test1 = new Appt(9, 9, 9, 9, 9, "work,", "go to work");
        Appt test2 = new Appt(25, 50, 60, 9, 9, "work,", "go to work");
        Appt test3 = new Appt(7, 7, 7, 7, 7, "work,", "go to work");
        Appt test4 = new Appt(6, 6, 6, 7, 7, "fun", "have fun!");
        Appt test5 = new Appt(13, 45, 6, 7, 7, "test", "test");
        Appt test6 = null;

        day.addAppt(test);
        day.addAppt(test1);
        day.addAppt(test2);
        day.addAppt(test3);
        day.addAppt(test4);
        day.addAppt(test5);

        table.deleteAppt(day.appts, test3);
        table.deleteAppt(day.appts, null);
        table.deleteAppt(null, null);
        table.deleteAppt(new LinkedList<Appt>(), test5);
        table.deleteAppt(day.appts, new Appt(-5, 5, 5, 5, 5, "test", "tea"));

        assertEquals(day.appts, test1);
        assertEquals(table.deleteAppt(day.appts, null), null);
        assertEquals(table.deleteAppt(null, null), null);
        assertEquals(table.deleteAppt(day.appts, new Appt(-5, 5, 5, 5, 5, "test", "tea")), null);


    }

    private void assertEquals(LinkedList<Appt> appts, Appt test1) {
    }

    @Test
    public void test()
    {
        TimeTable table = new TimeTable();


        GregorianCalendar calendarTest = new GregorianCalendar(2006,2,10);
        CalDay day = new CalDay(calendarTest);

        Appt test = new Appt(5, 6, 6, 7, 5, "camping", "going camping");
        Appt test1 = new Appt(9, 9, 9, 9, 9, "work,", "go to work");

        day.addAppt(test);
        day.addAppt(test1);
    }
}
