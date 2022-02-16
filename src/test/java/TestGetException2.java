import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestGetException2 {

    @Test
    public void testGetException2() {
        int[] arr = {10, 11, 22, 33, 44, 55, 66, 77, 88, 99, 123, 234, 345, 456, 567, 678, 789};
        ArrayIndexStorage arrayIndexStorage = new ArrayIndexStorage(arr);
        boolean actual = false;
        boolean expected = true;
        try {
            arr[0] = arrayIndexStorage.get(arr.length+1);
        } catch (ArrayIndexOutOfBoundsException ex) {
            //System.out.println(ex.toString());
            expected = false;
        }
        Assertions.assertEquals(expected, actual);
    }
}
