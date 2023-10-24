import static org.junit.Assert.*;
import org.junit.*;
import java.util.List;
import java.util.Arrays;

public class ListTests {
	@Test 
	public void testMerge() {
    List<String> strings1 = Arrays.asList("aa", "dd");
    List<String> strings2 = Arrays.asList("cc", "ee");
    List<String> mergedStrings = ListExamples.merge(strings1, strings2);
    List<String> expectedStrings = Arrays.asList("aa", "cc", "dd", "ee");
    for(int i = 0; i < expectedStrings.size(); i++)
        assertEquals(expectedStrings.get(i), mergedStrings.get(i));
	}
}
