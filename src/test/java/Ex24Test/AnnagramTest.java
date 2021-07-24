package Ex24Test;

import oop.example.Ex24;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class AnnagramTest {
    @Test
    void FunctionName()
    {
        Ex24 name = new Ex24();
        Boolean actual = name.isAnagram("Hello", "World");
        Boolean expected = false;
        assertEquals(expected, actual);
    }

}
