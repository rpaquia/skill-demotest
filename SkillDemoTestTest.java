import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemoTestTest {
    @Test
    public void multiplication() {
        assertEquals(5, SkillDemoTest.multiply(2, 3));
    }
    //Need to think about the test + commands
    //Checking Week 4
}
//javac -cp .:lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar MarkdownParseTest.java
//scp -r . cs15lwi22@ieng6.ucsd.edu:~/markdown-parse
//scp -r . cs15lwi22@ieng6.ucsd.edu:~/markdown-parse
//java -cp .:lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar org.junit.runner.JUnitCore MarkdownParseTest
//java -cp .:lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar org.junit.runner.JUnitCore MarkdownParseTest

