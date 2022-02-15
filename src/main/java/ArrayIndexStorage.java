import java.util.Arrays;

public class ArrayIndexStorage extends IndexStorage {
    private int[] arr;

    protected ArrayIndexStorage(int[] arr) {
        super(arr.length);
        this.setArr(arr);
    }

    protected void setArr(int[] arr) {
        this.arr = arr;
    }

    @Override
    protected int get(int index) {
        arrayIndexOutOfBoundsException(index);
        return this.arr[index];
    }

    protected int getParent(int index) {
        return super.get(index);
    }

    @Override
    public String toString() {
        return "ArrayIndexStorage{" +
                "arr=" + Arrays.toString(arr) +
                '}';
    }
}