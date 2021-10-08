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
        assertEquals(testStudent.getName(), "testName");
        assertEquals(testStudent.getAge(), (short)20);
        assertEquals(testStudent.getDob().getYear(), 2020);
        assertEquals(testStudent.getDob().getMonthOfYear(), 1);
        assertEquals(testStudent.getDob().getDayOfYear(), 1);
        assertEquals(testStudent.getId(), "1234");
        assertEquals(testStudent.getUsername(), "testName20");
        assertArrayEquals(testStudent.getCourses(), new Course[0]);
        assertArrayEquals(testStudent.getModules(), new Module[0]);
    }
}
