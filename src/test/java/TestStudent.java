import org.junit.Test;
import org.joda.time.DateTime;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class TestStudent {
    @Test
    public void testNewStudent(){
        //Build a new student with test data
        //Ensure all data returned by getters is accurate
        Student testStudent = new Student(
                "testName",
                (short)20,
                DateTime.parse("2020-01-01"),
                "1234",
                new Course[0],
                new Module[0]
        );
        assertEquals("testName", testStudent.getName());
        assertEquals((short)20, testStudent.getAge());

        assertEquals(2020, testStudent.getDob().getYear());
        assertEquals(1, testStudent.getDob().getMonthOfYear());
        assertEquals(1, testStudent.getDob().getDayOfMonth());

        assertEquals("1234", testStudent.getId());
        assertEquals("testName20", testStudent.getUsername());
        assertArrayEquals(new Course[0], testStudent.getCourses());
        assertArrayEquals(new Module[0], testStudent.getModules());
    }

    @Test
    public void testNullStudent(){
        // Build a new student object using only null or invalid values
        // Confirm that setters use default values
        Student nullStudent = new Student(
                null,
                (short)-10,
                null,
                null,
                null,
                null
        );
        assertEquals("UNDEFINED", nullStudent.getName());
        assertEquals((short)0, nullStudent.getAge());

        assertEquals(DateTime.now().getYear(), nullStudent.getDob().getYear());
        assertEquals(DateTime.now().getMonthOfYear(), nullStudent.getDob().getMonthOfYear());
        assertEquals(DateTime.now().getDayOfMonth(), nullStudent.getDob().getDayOfMonth());

        assertEquals("UNDEFINED", nullStudent.getId());
        assertArrayEquals(new Course[0], nullStudent.getCourses());
        assertArrayEquals(new Module[0], nullStudent.getModules());
    }

    @Test
    public void testInvalidBirthday(){
        // Build student that has a birth date set in the future
        // and check if default birth date is used
        // Make test birth year that will always be 20 years in the future
        String testDOBYear = Integer.toString(DateTime.now().getYear() + 20);
        Student dobStudent = new Student(
                null,
                (short)-10,
                DateTime.parse(testDOBYear + "-01-01"),
                null,
                null,
                null
        );

        assertEquals(DateTime.now().getYear(), dobStudent.getDob().getYear());
        assertEquals(DateTime.now().getMonthOfYear(), dobStudent.getDob().getMonthOfYear());
        assertEquals(DateTime.now().getDayOfMonth(), dobStudent.getDob().getDayOfMonth());
    }
}
