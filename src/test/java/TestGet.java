import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestGet {

    @Test
    public void testGet() {
        // Test get(int index)
        //----------------- 1. Фаза. Подготовка. Входящие данные
        int[] arr = {10, 11, 22, 33, 44, 55, 66, 77, 88, 99, 123, 234, 345, 456, 567, 678, 789};
        ArrayIndexStorage arrayIndexStorage = new ArrayIndexStorage(arr);
        int[] expected = new int[arr.length];
        int[] actual = arr;
        //----------------- 2. Фаза. Теситруемое действие.
        System.out.print("arrayIndexStorage.get = [");
        for (int i = 0; i < arrayIndexStorage.size(); i++) {
            expected[i] = arrayIndexStorage.get(i);
            System.out.print("[" + i + "] = " + expected[i] + ", ");
        }
        System.out.println("]");
        //------------------- 3. Фаза. Проверка.
        Assertions.assertArrayEquals(expected, actual);
    }
}
