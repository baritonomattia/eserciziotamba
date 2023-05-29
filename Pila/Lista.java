package Pila;

public class Lista {
    private Nodo head; 

    public Lista(){
        head = null; 
    }

    public void push(int info){
        Nodo p = new Nodo(info); 
        head = p;
    }

    public void push(){
        Nodo p;
        p = head;
        head = head.getLink(); 
    }
}
