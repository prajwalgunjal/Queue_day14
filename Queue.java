package com.bridgelabz.Queue;

import com.bridgelabz.linkedlist.LinkedList;

public class Queue<T> {
    LinkedList<T> linkedList = new LinkedList<T>();
    public void add(T data){
        linkedList.add(data);
    }

    public void display() {
        linkedList.display();
    }

    public void delete(T data) {

        linkedList.DeleteFirstElement(data);
    }
}
