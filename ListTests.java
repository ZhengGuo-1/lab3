import static org.junit.Assert.*;

import java.util.List;

import org.junit.*;

public class ListTests {
    @Test 
	public void filtertest1() {
        ListExamples listExamples1 = new ListExamples();
        List<String> list = List.of("happy", "egg", "elephant");
        List<String> list2 = List.of("elephant");
        assertEquals(list2,listExamples1.filter(list, listExamples1));
	}

}
