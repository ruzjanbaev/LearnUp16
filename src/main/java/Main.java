import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws Exception {
        IndexStorage indexStorage = new IndexStorage(23);
        System.out.println("indexStorage.size() = " + indexStorage.size());
        System.out.println("indexStorage.reverse() = " + Arrays.toString(indexStorage.reverse()));

        int[] arr = {10, 11, 22, 33, 44, 55, 66, 77, 88, 99, 123, 234, 345, 456, 567, 678, 789};
        System.out.println("arr = " + Arrays.toString(arr));
        ArrayIndexStorage arrayIndexStorage = new ArrayIndexStorage(arr);
        System.out.println("arrayIndexStorage.size() = " + arrayIndexStorage.size());

        int[] arrReverse = arrayIndexStorage.reverse();
        System.out.println("arrReverse = " + Arrays.toString(arrReverse));

        System.out.print("arrayIndexStorage.get = [");
        for (int i = 0; i < arrayIndexStorage.size(); i++) {
            System.out.print(arrayIndexStorage.get(i) + ((i < arrayIndexStorage.size() - 1) ? ", " : ""));
        }
        System.out.println("]");

        System.out.print("arrayIndexStorage.getParent = [");
        for (int i = 0; i < arrayIndexStorage.size(); i++) {
            System.out.print(arrayIndexStorage.getParent(i) + ((i < arrayIndexStorage.size() - 1) ? ", " : ""));
        }
        System.out.println("]");

        //В задании не сказано, что пустой массив создавать нельзя
        arr = new int[]{};
        System.out.println("arr = " + Arrays.toString(arr));
        try {
            ArrayIndexStorage arrayIndexStorageNull = new ArrayIndexStorage(arr);
            System.out.println("arrayIndexStorageNull.size() = " + arrayIndexStorageNull.size());
            System.out.println("arrayIndexStorageNull.reverse() = " + Arrays.toString(arrayIndexStorageNull.reverse()));
            //System.out.println(arrayIndexStorageNull.get(0)); // тут будет явная ошибка
            //System.out.println("arrayIndexStorageNull.getParent = " + arrayIndexStorageNull.getParent(0)); // тут будет явная ошибка
        } finally {
            System.out.println("Проверка на ошибки, на NULL!");
        }

        try {
            IndexStorage indexStorageErr = new IndexStorage(-1);
        } finally {
            System.out.println("Проверка на ошибки, на отрицательное значение!");
        }
    }
}