package MyList;

import java.util.Arrays;

    public class MyList1<T> {
        private int size = 0;
        private static final int DEFAULT_CAPACITY = 10;
        private T[] data;

        public MyList1() {
            data = (T[]) new Object[DEFAULT_CAPACITY];
        }

        public MyList1(int size) {

            data = (T[]) new Object[size];
        }

        private void ensureCapa() {
            if (size > data.length) {
                int biggerSize = size * 2 + 1;
                data = Arrays.copyOf(data, biggerSize);
            }
        }

        public void add(T t) {
            size += 1;
            ensureCapa();
            data[size - 1] = t;
        }

        public boolean add(T t, int index) {
            if (index >= 0 && index <= size) {
                size += 1;
                ensureCapa();
                for (int i = size - 2; i >= index; i--) {
                    data[i + 1] = data[1];

                }
                data[index] = t;
                return true;
            }
            return false;
        }

        public T get(int index) {
            if (index >= 0 && index <  size ){
                return data[index];
            }
            return null;
        }

        @Override
        public MyList1 clone() {
            MyList1 clone = new MyList1<>(data.length);
            for (T x : data) {
                clone.add(x);
            }
            return clone;
        }

        public T[] getData() {
            return this.data;
        }

        public int size() {
            return size;
        }

        public boolean remove(int index) {
            if (index >= 0 && index < size) {
                for (int i = index; i < size; i++) {
                    data[i] = data[i + 1];
                }
                size -= 1;
                return true;
            }
            return false;
        }

        public void clear() {
            data = (T[]) new Object[DEFAULT_CAPACITY];
            size = 0;
        }

        public int indexOf(T e) {
            for (int i = 0; i < size; i++) {
                if (data[i].equals(e)) {
                    return i;
                }
            }
            return -1;
        }

        public boolean contains(T e) {
            for (T x : data) {
                if (e.equals(x)) {
                    return true;
                }
            }
            return false;
        }
    }

