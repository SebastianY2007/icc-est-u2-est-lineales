package controllers;

import models.Node;

public class ListaEnlazada<T> {
    public Node<T> head;
    private int size;

    public ListaEnlazada() {
        this.head = null;
        this.size = 0;
    }

    public void append(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
            size++;
            return;
        }
        // Tendré que llegar al último y a eso agregar el nodo
        Node<T> current = head;
        while (current.getNext() != null) {
            current = current.getNext();
        }
        current.setNext(new Node<>(data));
        size++;
    }

    public void deleteFirst() {
        // Eliminar head
        if (head == null) {
            return;
        }
        head = head.getNext();
        size--;
    }

    public void deleteLast() {
        // Iterar y eliminar el ultimo
        if (head == null) {
            return;
        }

        if (head.getNext() == null) {
            head = null;
            size--;
            return;
        }

        Node<T> current = head;
        while (current.getNext() != null) {
            current = current.getNext();
        }

        current.setNext(null);
        size--;
    }

    // Eliminar un nodo en especifico
    public void deleteNode(T data) {
        /// Verificar si está vacío -> se acaba
        /// Verificar si el objetico es primero -> elimia el head
        /// Iterar y preguntar por cada uno si es obj -> eliminar
        if (head == null) {
            return;
        }

        if (head.getValue().equals(data)) {
            head = head.getNext();
            size--;
            return;
        }

        Node<T> current = head;
        while (current.getNext() != null && !current.getNext().getValue().equals(data)) {
            current = current.getNext();
        }

        if (current.getNext() == null) {
            return;
        }

        current.setNext(current.getNext().getNext());
        size--;
    }

    public int size() {
        return size;
    }

    public void printAllNodes() {
        Node<T> current = head;
        while (current != null) {
            System.out.println(current.getValue() + " -> ");
            current = current.getNext();
        }
        System.out.println("FIN");
    }
}
