package es2Pila;

public class Pila {
    private Nodo head; 

    public Pila(){
        head = null; 
    }

    public void push(int info){
        Nodo p = new Nodo(info); 
        p.setLink(head);
        head = p; 
    }

    public void pop(){
        head = head.getLink()
    }
}
