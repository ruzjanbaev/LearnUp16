class IndexStorage {
    private int size;

    protected IndexStorage(int i) {
        if (i < 0) {
            throw new NegativeArraySizeException("Размер массива не может быть отрицательным, а у вас размер: " + i);
        }
        this.size = i;
    }

    protected void arrayIndexOutOfBoundsException(int index) {
        if (index < 0) {
            throw new ArrayIndexOutOfBoundsException("Индекс массива не может быть отрицательным, а у вас: " + index);
        } else if (index >= size()) {
            throw new ArrayIndexOutOfBoundsException("Индекс не должен быть больше или равен размеру массива (" + size() + "), а у вас: " + index);
        }
    }

    protected int size() {
        return this.size;
    }

    protected int get(int index) {
        arrayIndexOutOfBoundsException(index);
        return index % 2 == 0 ? index : -index;
    }

    protected int[] reverse() {
        int[] arr = new int[size()];

        for (int i = 0; i < size(); i++) {
            arr[i] = get(i);
        }

        for (int i = 0; i < arr.length / 2; i++) {
            int tmp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = tmp;
        }
        return arr;
    }
}