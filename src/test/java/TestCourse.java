import org.junit.Test;
import org.joda.time.DateTime;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class TestCourse {
    @Test
    public void testNewCourse(){
        // Build a new course with test data
        // Ensure all data returned by getters is accurate
        Course testCourse = new Course(
                "testName",
                new Module[0],
                new Student[0],
                DateTime.parse("2020-01-01"),
                DateTime.parse("2020-01-02")
        );
        assertEquals("testName", testCourse.getName());
        assertArrayEquals(new Module[0], testCourse.getModules());
        assertArrayEquals(new Student[0], testCourse.getStudents());

        assertEquals(2020, testCourse.getStartDate().getYear());
        assertEquals(1, testCourse.getStartDate().getMonthOfYear());
        assertEquals(1, testCourse.getStartDate().getDayOfMonth());

        assertEquals(2020, testCourse.getEndDate().getYear());
        assertEquals(1, testCourse.getEndDate().getMonthOfYear());
        assertEquals(2, testCourse.getEndDate().getDayOfMonth());
    }

    @Test
    public void testNullCourse(){
        // Build a new course object using only null or invalid values
        // Confirm that setters use default values
        Course nullCourse = new Course(
                null,
                null,
                null,
                null,
                null
        );
        assertEquals("UNDEFINED", nullCourse.getName());
        assertArrayEquals(new Module[0], nullCourse.getModules());
        assertArrayEquals(new Student[0], nullCourse.getStudents());

        assertEquals(DateTime.now().getYear(), nullCourse.getStartDate().getYear());
        assertEquals(DateTime.now().getMonthOfYear(), nullCourse.getStartDate().getMonthOfYear());
        assertEquals(DateTime.now().getDayOfMonth(), nullCourse.getStartDate().getDayOfMonth());

        assertEquals(DateTime.now().getYear(), nullCourse.getEndDate().getYear());
        assertEquals(DateTime.now().getMonthOfYear(), nullCourse.getEndDate().getMonthOfYear());
        assertEquals(DateTime.now().getDayOfMonth(), nullCourse.getEndDate().getDayOfMonth());
    }

    @Test
    public void testInvalidEndDate(){
        // Build a new course object and try to set the end date before the start date
        // Both end date and start date should be the same in response
        Course dateCourse = new Course(
                null,
                null,
                null,
                DateTime.parse("2020-12-12"),
                DateTime.parse("2020-01-01")
        );
        assertEquals(2020, dateCourse.getStartDate().getYear());
        assertEquals(12, dateCourse.getStartDate().getMonthOfYear());
        assertEquals(12, dateCourse.getStartDate().getDayOfMonth());

        assertEquals(dateCourse.getStartDate().getYear(), dateCourse.getEndDate().getYear());
        assertEquals(dateCourse.getStartDate().getMonthOfYear(), dateCourse.getEndDate().getMonthOfYear());
        assertEquals(dateCourse.getStartDate().getDayOfYear(), dateCourse.getEndDate().getDayOfYear());
    }
}
