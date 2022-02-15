import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class TestReverse {

    @Test
    public void testReverse() {
        // Test reverse
        //----------------- 1. Фаза. Подготовка. Входящие данные
        final int nSize = 23;
        int[] arr = new int[nSize];
        IndexStorage indexStorage = new IndexStorage(nSize);
        for (int i = 0; i < indexStorage.size(); i++) {
            arr[i] = indexStorage.get(i);
        }
        //----------------- 2. Фаза. Теситруемое действие.
        int[] actual = arr.clone();
        ArrayIndexStorage arrayIndexStorage = new ArrayIndexStorage(arr.clone());
        actual = arrayIndexStorage.reverse();
        int[] expected = arrayIndexStorage.reverse();
        //------------------- 3. Фаза. Проверка.
        Assertions.assertArrayEquals(expected, actual);
    }
}
