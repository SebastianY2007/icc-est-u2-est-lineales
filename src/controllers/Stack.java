package controllers;

import java.util.EmptyStackException;
import models.Node;

public class Stack<T> {

    private Node<T> top;
    private int size;

    public Stack() {
        this.top = null;
        this.size = 0;
    }
    
    // Método para insertar
    public void push(T data) {
        Node<T> newNode = new Node<>(data);
        newNode.setNext(top);
        top = newNode;
        size++;
    }

    // Método sacar y/o eliminar
    public T pop() {
        if (top == null) {
            // Return null
            throw new EmptyStackException();
        }

        T data = top.getValue();
        top = top.getNext();
        size--;

        return data;
    }   

    // Retorna el primero pero sin eliminar
    public T peek() {
        if (top == null) 
            return null;

        return top.getValue();
    }

    public boolean isEmpty() {
        return top == null;
    }

    public int size() {
        return size;
    }

    public void printAllNodes() {
        Node<T> current = top;
        System.out.println("Cima -> ");
        while (current != null) {
            System.out.println(current.getValue() + " -> ");
            current = current.getNext();
        }
        System.out.println("FIN");
    }
}
