import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyProgTest {

    private MyProg myProg;

    @BeforeEach
    public void setUp() {
        System.out.println("Welcome to MyProg Test!");
        System.out.println("A test case is ready to run.");
        myProg = new MyProg();
    }

    @AfterEach
    public void tearDown() {
        System.out.println("Thank you for running the test cases.");
    }


    @Test
    public void testM1Case1() {
        assertEquals(5, myProg.m1(3));
    }

    @Test
    public void testM1Case2() {
        assertEquals(7, myProg.m1(7));
    }

    @Test
    public void testM1Case3() {
        assertEquals(121, myProg.m1(11));
    }

    // Test cases for m2
    @Test
    public void testM2Case1() {
        assertEquals(275, myProg.m2(20, 30));
    }

    @Test
    public void testM2Case2() {
        assertEquals(385, myProg.m2(40, 30));
    }

    @Test
    public void testM2Case3() {
        assertEquals(25, myProg.m2(25, 25));
    }
}
