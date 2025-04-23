/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tp6;

/**
 *
 * @author User
 */
public class Node {

    // Variable en la cual se va a guardar el valor.
    private int value;
    // Variable para enlazar los nodos.
    private Node next;

    /**
     * Constructor que inicializamos el valor de las variables.
     */
    public void Node() {
        this.value = 0;
        this.next = null;
    }

    // Métodos get y set para los atributos.
    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
