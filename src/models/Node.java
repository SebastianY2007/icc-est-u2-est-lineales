package models;

public class Node<T> {
    
    private T value; // UPS_2025
    private Node<T> next; // Puntero
    private Node<T> prev; // Anterior

    public Node(T value) {
        this.value = value;
        this.next = null;
        this.prev = null;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    public Node<T> getPrev() {
        return prev;
    }

    public void setPrev(Node<T> prev) {
        this.prev = prev;
    }

    @Override
    public String toString() {
        return "\nNode Value: " + value + ", Next: -> " + next;
    }
}
