import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestModule {
    @Test
    public void testNewModule(){
        // Build a new module with test data
        // Ensure all data returned by getters is accurate
        Module testModule = new Module(
                "testName",
                "testID"
        );
        assertEquals("testName", testModule.getName());
        assertEquals("testID", testModule.getId());
    }

    @Test
    public void testNullModule(){
        // Build a new module object using only null or invalid values
        // Confirm that setters use default values
        Module nullModule = new Module(
                null,
                null
        );
        assertEquals("UNDEFINED", nullModule.getName());
        assertEquals("UNDEFINED", nullModule.getId());
    }

    @Test
    public void testEmptyFields(){
        // Build a new module object using empty strings
        // Fields should be replaced with default values
        Module emptyModule = new Module(
                "",
                ""
        );
        assertEquals("UNDEFINED", emptyModule.getName());
        assertEquals("UNDEFINED", emptyModule.getId());
    }
}
