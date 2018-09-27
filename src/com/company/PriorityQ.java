package com.company;

abstract class Data implements Comparable<Data>{
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

public class PriorityQ {

    private int n;

    public PriorityQ() {
    }

    public void add(String s, int p) {

//        heapify(s);
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
