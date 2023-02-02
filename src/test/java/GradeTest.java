import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GradeTest {
    @Test
    void getGradeTest() throws Exception {
        Grade grade = new Grade();
        // Running test with coverage means that we will be able to see which lines of code were executed .
        // We should try to hit all the scenarios when we write our test cases.
        Assertions.assertEquals('C',grade.getGrade(0));
        //To Handle Exceptions in tests
        Assertions.assertThrows(Exception.class,()->{grade.getGrade(-1);});
    }
}
