package com.bridgelabz.Queue;

public class MainQueue {

    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.display();
        queue.delete(10);
        queue.display();
    }
}
