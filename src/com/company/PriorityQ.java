package com.company;


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
        public int compareTo(Data data) {
            if (data.getKey() >= this.getKey()) {
                return data.getKey();
            }

            return this.getKey();
        }
    }

    private int n;
    private Data[] data;

    public PriorityQ() {
        data = new Data[32];
        data[0] = new Data(0, "");
        n = 0;
    }

    public void add(Data d) {

        Data temp = new Data(0, "");

        if (n > 1) {
            int kval = d.compareTo(data[n]);
            if (kval == d.key) {
                temp = data[n];
                data[n] = d;
                data[n + 1] = temp;
            } else {

            }

        }
//        heapify(data);
//        assert isMaxHeap();

    }

    public String returnMax() {
        return null;
    }

    public String extractMax() {
        return null;
    }

    public void remove(int i) {

    }

    public void decrementPriority(int i, int o) {

    }

    public int[] priorityArray() {
        return null;

    }
}
