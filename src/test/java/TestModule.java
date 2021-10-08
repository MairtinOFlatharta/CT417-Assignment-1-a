import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class TestModule {
    @Test
    public void testNewModule(){
        // Build a new module with test data
        // Ensure all data returned by getters is accurate
        Module testModule = new Module(
                "testName",
                "testID",
                new ArrayList<Student>(),
                new ArrayList<Course>()
        );
        assertEquals("testName", testModule.getName());
        assertEquals("testID", testModule.getId());
        assertEquals(new ArrayList<Student>(), testModule.getStudents());
        assertEquals(new ArrayList<Course>(), testModule.getCourses());
    }

    @Test
    public void testNullModule(){
        // Build a new module object using only null or invalid values
        // Confirm that setters use default values
        Module nullModule = new Module(
                null,
                null,
                null,
                null
        );
        assertEquals("UNDEFINED", nullModule.getName());
        assertEquals("UNDEFINED", nullModule.getId());
        assertEquals(new ArrayList<Student>(), nullModule.getStudents());
        assertEquals(new ArrayList<Course>(), nullModule.getCourses());
    }

    @Test
    public void testEmptyFields(){
        // Build a new module object using empty strings
        // Fields should be replaced with default values
        Module emptyModule = new Module(
                "",
                "",
                null,
                null
        );
        assertEquals("UNDEFINED", emptyModule.getName());
        assertEquals("UNDEFINED", emptyModule.getId());
    }
}
