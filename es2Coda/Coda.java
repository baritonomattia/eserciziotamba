package es2Coda;

public class Coda {
    private Nodo head;
    private Nodo tail; 

    public Coda(){
        head = null; 
        tail = null; 
    }


    public Nodo crea(int info, Nodo link){
        Nodo p = new Nodo(info); 
        p.setLink(link);
        return p; 
    }

    public void enqueue(int info){
        Nodo p = crea(info, null);
        tail.setLink(p);
        tail = p; 

    }
}
