package controllers;

import models.Node;

public class Queue<T> {
    
    private Node<T> first;
    private Node<T> last;
    private int size;

    public Queue() {
        this.first = null;
        this.last = null;
        this.size = 0;  
    }

    public boolean isEmpty() {
        return first == null;
    }

    public int size() {
        return size;
    }

    public void enqueue(T data) {
        Node<T> newNode = new Node<>(data);

        if (isEmpty()) {
            // Lleno dos
            first = newNode;
            last = newNode;
        } else {
            // Lleno ultimo
            last.setNext(newNode);
            last = newNode;
        }
        size++;
    }

    public T dequeue() {
        if (isEmpty()) {
            // throw new NoSuchElementException("La cola está vacía.");
            return null;
        }
        T data = first.getValue();
        first = first.getNext();
        if (first == null) {
            last = null;
        }
        size--;
        return data;
    }

    public Node<T> getFirst() {
        return first;
    }

    public void setFirst(Node<T> first) {
        this.first = first;
    }

    public Node<T> getLast() {
        return last;
    }

    public void setLast(Node<T> last) {
        this.last = last;
    }

    public void printAllNodes() {
        Node<T> current = first;
        while (current != null) {
            System.out.println(current.getValue() + " -> ");
            current = current.getNext();
        }
        System.out.println("FIN");
    }
}
