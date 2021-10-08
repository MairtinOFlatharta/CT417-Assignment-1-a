import org.junit.Test;
import org.joda.time.DateTime;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class TestCourse {
    @Test
    public void testNewCourse(){
        Course testCourse = new Course(
                "testName",
                new Module[0],
                new Student[0],
                DateTime.parse("2020-01-01"),
                DateTime.parse("2020-01-02")
        );
        assertEquals(testCourse.getName(), "testName");
        assertArrayEquals(testCourse.getModules(), new Module[0]);
        assertArrayEquals(testCourse.getStudents(), new Student[0]);

        assertEquals(testCourse.getStartDate().getYear(), 2020);
        assertEquals(testCourse.getStartDate().getMonthOfYear(), 1);
        assertEquals(testCourse.getStartDate().getDayOfYear(), 1);

        assertEquals(testCourse.getEndDate().getYear(), 2020);
        assertEquals(testCourse.getEndDate().getMonthOfYear(), 1);
        assertEquals(testCourse.getEndDate().getDayOfYear(), 2);
    }
}
