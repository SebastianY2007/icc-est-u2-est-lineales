import controllers.*;
import models.Person;

public class App {
    
    public static void main(String[] args) throws Exception {

        /* 
        Node<Person> node1 = new Node<Person>(new Person("Juan", 30));
        
        Node<Person> node2 = new Node<Person>(new Person("Maria", 35));
        
        Node<Person> node3 = new Node<Person>(new Person("Pepito", 30));
        
        Node<Person> node4 = new Node<Person>(new Person("Diego", 35));

        node1.setNext(node2);  // J -> M
        node2.setNext(node3);  // M -> P
        node3.setNext(node4);  // P -> D
       

        System.out.println(node1);
        */

        // runStackExample();
        // runQueueExample();
        // runLinkedListExample();

        Person personA = new Person("Pepito", 32);
        Person personB = new Person("Pepito", 32);
        System.out.println(personA);
        System.out.println(personB);
        System.out.println(personA.equals(personB));
    }
    
     
    public static void runStackExample() {
        Stack<Person> persons = new Stack<>();

        persons.push(new Person("Juan", 30));
        persons.push(new Person("Maria", 35));
        persons.push(new Person("Pepito", 32));
        persons.push(new Person("Diego", 31));
        
        System.out.println("Size: " + persons.size());
        persons.printAllNodes();
        System.out.println(persons.pop());
        System.out.println("Size: " + persons.size());
        persons.printAllNodes();
    }
    

     
    public static void runQueueExample() {
        Queue<Person> persons = new Queue<>();
        persons.enqueue(new Person("Juan", 30));
        persons.enqueue(new Person("Maria", 35));
        persons.enqueue(new Person("Pepito", 32));
        persons.enqueue(new Person("Diego", 31));
        System.out.println("Size: " + persons.size());
        persons.printAllNodes();
        System.out.println(persons.dequeue());
        System.out.println("Primera: " + persons.getFirst().getValue());
        System.out.println("Ultima: " + persons.getLast().getValue());
        System.out.println("Size: " + persons.size());
        persons.printAllNodes();
    }
    

    public static void runLinkedListExample() {
        ListaEnlazada<Person> persons = new ListaEnlazada<>();
        persons.append(new Person("Juan", 30));
        persons.append(new Person("Maria", 35));
        persons.append(new Person("Pepito", 32));
        persons.append(new Person("Diego", 31));
        System.out.println("Size: " + persons.size());
        persons.printAllNodes();
        persons.deleteNode(new Person("Pepito", 32));
        persons.printAllNodes();
        persons.deleteFirst();
        persons.printAllNodes();
        persons.deleteLast();
        persons.printAllNodes();
        System.out.println("Size=" + persons.size());
    }
}
