import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestGetParent {

    @Test
    public void testGetParent() {
        //----------------- 1. Фаза. Подготовка. Входящие данные
        int[] arr = {0, -1, 2, -3, 4, -5};
        ArrayIndexStorage arrayIndexStorage = new ArrayIndexStorage(arr);
        int[] actual = arr;
        //----------------- 2. Фаза. Теситруемое действие.
        int[] expected = new int[arr.length];
        for (int i = 0; i < arrayIndexStorage.size(); i++) {
            expected[i] = arrayIndexStorage.getParent(i);
            //System.out.print("[" + i + "] = " + expected[i] + ", ");
        }
        //------------------- 3. Фаза. Проверка.
        Assertions.assertArrayEquals(expected, actual);
    }
}
