package parameters;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestWithParameters {
    @Test(groups = {"parameters", "all"})
    @Parameters({"FirstParameter", "SecondParameter"})
    public void testCaseWithParameters(String param1, String param2){
        System.out.println(param1 + "" + param2);
    }
}
