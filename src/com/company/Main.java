package com.company;

public class Main {

    public static void main(String[] args) {
	    PriorityQ q = new PriorityQ();
	    q.add("Hello", 50);
        q.add("Friend", 100);
        q.add("Max", 5000);
        q.add("min", 2);
        q.add("r", 14);
        q.add("q", 432);
        q.add("f", 342);
        q.add("t", 222);
        q.add("v", 111);
        q.add("b", 333);
        q.add("n", 444);

        q.priorityArray();

        q.remove(2);
        q.priorityArray();

    }
}
