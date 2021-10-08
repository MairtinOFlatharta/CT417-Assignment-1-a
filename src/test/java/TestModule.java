import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestModule {
    @Test
    public void testNewModule(){
        //Build a new module with test data
        //Ensure all data returned by getters is accurate
        Module testModule = new Module(
                "testName",
                "testID"
        );
        assertEquals(testModule.getName(), "testName");
        assertEquals(testModule.getId(), "testID");
    }
}
