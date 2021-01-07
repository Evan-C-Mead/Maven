import org.junit.Test;
import static org.junit.Assert.*;

public class MyFirstTest {

    @Test
    public void testIfNamesAreEqual() {
        String expectedName = "Grogu";
        String actualName = "Grogu";

        assertEquals(expectedName, actualName);
    }

    @Test
    public void testIfNumbersAreEqual() {
        int expectedNumber = 31;
        int actualNumber = 31;

        assertEquals(expectedNumber, actualNumber);
    }

    // When you're using floating points values a third parameter is required (Delta)
    // which represents a positive margin of error of decimals.
    @Test
    public void testIfChangeIsCorrect() {
        Double price = 10.0;
        Double discount = 4.5;

        assertEquals(5.5, price - discount, 0);
        assertEquals(5.1, price - discount, 0.5);
        assertNotEquals(4.9, price - discount, 0.5);
    }

    @Test
    public void testIfObjectsAreDifferent() {
        Object dog = new Object();
        Object sheep = new Object();
        Object clonedSheep = sheep;

        assertNotSame(sheep, dog);
        assertSame(sheep, clonedSheep);
    }

    @Test
    public void testIfArrayEquals() {
        char[] expected = {'J','u','n','i','t'};
        char[] actual = "Junit".toCharArray();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void testIfGreaterOrLesserThanWorks() {

        boolean learningTDD = true;

        assertTrue(learningTDD);
        assertTrue("5 is greater than 4", 5 > 4);
        assertFalse("5 is not greater than 6", 5 > 6);
    }

    @Test
    public void testIfInstanceIsNull() {
        Object phone = new Object();
        Object laptop = null;
        assertNull(null);
        assertNotNull(phone);
        assertNull(laptop);
    }



}
