package com.company;


import java.util.Arrays;

public class PriorityQ {

    private class Data implements Comparable<Data>{
        private int key;
        private String value;

        public Data(int key, String value) {
            this.key = key;
            this.value = value;
        }

        public int getKey() {
            return this.key;
        }

        public String getValue() {
            return this.value;
        }

        @Override
        // Returns 1 if compared data is bigger, 0 if not.
        public int compareTo(Data data) {
            if (data.getKey() >= this.getKey()) {
                return 1;
            }

            return 0;
        }
    }

    private int n;
    private Data[] data;

    public PriorityQ() {
        data = new Data[255];
        data[0] = null;
        n = 0;
    }

    // Recursive method to heapify subtree with root = i, and length = 255 or max specified on construction
    public void heapify(int i, int length) {

        int max = i;
        int left_child = 2 * i + 1;
        int right_child = 2 * i + 2;

        if (left_child < length && data[right_child].compareTo(data[left_child]) == 1) {
                max = left_child;
        }

        if (right_child < length && data[right_child].compareTo(data[left_child]) == 0) {
            max = right_child;
        }

        if (max != i) {
            Data swap = data[i];
            data[i] = data[max];
            data[max] = swap;

            heapify(max, length);
        }
    }

    private void heapify_up(int i) {
        int parent;

        if (i != 1) {
            parent = (int)Math.floor(i/2);

            if (data[parent].compareTo(data[i]) == 1) {
                Data temp = data[parent];
                data[parent] = data[i];
                data[i] = temp;
                heapify_up(parent);
            }
        }
    }

    public void add(String s, int key) {
        Data d = new Data(key, s);
        if (n == data.length) {
            throw new IndexOutOfBoundsException("Heap's underlying storage is overflow");
        } else {
            n++;
            data[n] = d;
            heapify_up(n);
        }
//        assert isMaxHeap();
    }

    public String returnMax() {
        return data[1].getValue();
    }

    public String extractMax() {
        if (n <= 0)
            throw new ArrayIndexOutOfBoundsException("Queue is empty");
        if(n == 1)
            return data[1].getValue();

        Data root = data[1];
        data[1] = data[n];
        n--;
        heapify(1, n);
        return root.getValue();
    }

    public void remove(int i) {
        Data remove = data[i];
        data[i] = data[n];
        n--;
        heapify(i, n);
    }

    public void decrementPriority(int i, int o) {
        Data d_curr = data[i];
        d_curr.key = d_curr.key - o;
        data[i] = d_curr;
    }

    public int[] priorityArray() {
        int[] keys = new int[n];
        for (int i = 0; i < n; i++) {
            keys[i] = data[i + 1].getKey();
        }

        System.out.println(Arrays.toString(keys));
        return keys;
    }
}
