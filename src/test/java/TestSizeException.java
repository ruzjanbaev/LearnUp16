import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class TestSizeException {

    @Test //(expected = NegativeArraySizeException.class)
    public void testSizeException() throws Exception {
        final int nSize = -34;
        boolean actual = false;
        boolean expected = true;
        try {
            IndexStorage indexStorage = new IndexStorage(nSize);
        } catch (NegativeArraySizeException ex) {
            //System.out.println(ex.toString());
            expected = false;
        }
        Assertions.assertEquals(expected, actual);
    }
}