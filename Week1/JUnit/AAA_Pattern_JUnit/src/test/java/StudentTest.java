import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class StudentTest {

    private Student student;

    @Before
    public void setUp() {

        // Setup code
        student = new Student("Sowmya");

        System.out.println("Before test executed : "+student);
    }

    @Test
    public void testGreeting() {

        // Arrange
        String expected = "Welcome Sowmya";

        // Act
        String actual = student.getGreeting();

        // Assert
        assertEquals(expected, actual);
    }

    @After
    public void tearDown() {

        student = null;

        System.out.println("After test executed : "+student);
    }
}