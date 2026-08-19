class DynamicArray {

    private int[] array;
    private int length;
    private int capacity;

    public DynamicArray(int capacity) {
        if (capacity > 0) {
            array = new int[capacity];
            length = 0;
            this.capacity = capacity;
        }
    }

    public int get(int i) {
        return array[i];
    }

    public void set(int i, int n) {
        array[i] = n;
    }

    public void pushback(int n) {
        if (length == capacity) {
            resize();
        }

        set(length, n);
        length++;
    }

    public int popback() {
        int lastValue = get(length - 1);
        length--;
        return lastValue;
    }

    private void resize() {
        capacity = capacity * 2;
        int[] resizedArray = new int[capacity];

        for (int i = 0; i < length; i++) {
            resizedArray[i] = array[i];
        }

        array = resizedArray;
    }

    public int getSize() {
        return length;
    }

    public int getCapacity() {
        return capacity;
    }
}
