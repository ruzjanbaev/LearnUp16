import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class TestSize{

    @Test
    public void testSize() {
        // Test size()
        //----------------- 1. Фаза. Подготовка. Входящие данные
        final int nSize = 34;
        IndexStorage indexStorage = new IndexStorage(nSize);
        //----------------- 2. Фаза. Теситруемое действие.
        int actual = indexStorage.size();
        int expected = nSize;
        //------------------- 3. Фаза. Проверка.
        Assertions.assertEquals(expected, actual);
    }
}