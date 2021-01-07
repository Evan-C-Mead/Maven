import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

public class WarmupTest {

    @Test
    public void testIfNamesAreEqual() {
        String name1 = "Mace";
        String name2 = "Grogu";
        String name3 = "Codeup";

        assertEquals(name2, name2);
        assertEquals(name3, name3);
        assertNotEquals(name1, name2);

    }

    @Test
    public void testIfListsAreSame() {
        List<String> languages = new ArrayList<>();
        List<String> moreLanguages = new ArrayList<>();
        List<String> clonedLanguages = languages;

        assertNotSame(languages, moreLanguages);
        assertSame(languages, clonedLanguages);
    }

    @Test
    public void testIfArrayEquals() {
        int[] numbers = {1, 2, 3};
        int[] otherNumbers = new int[3];
        otherNumbers[0] = 1;
        otherNumbers[1] = 2;
        otherNumbers[2] = 3;

        assertArrayEquals(numbers, otherNumbers);
    }

    @Test
    public void testIfContains() {
        String language = "PHP";

        assertTrue(language.contains("H")); // use assertTrue for this statement
        assertFalse(language.contains("J")); // use assertFalse for this statement
    }

}
