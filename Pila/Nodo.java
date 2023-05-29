package Pila;

public class Nodo {
    public int info; 
    public Nodo link; 

    public  Nodo(int info){
        this.info = info; 
        this.link = null ;
    }

    public int getInfo() {
        return info;
    }

    public void setInfo(int info) {
        this.info = info;
    }

    public Nodo getLink() {
        return link;
    }

    public void setLink(Nodo link) {
        this.link = link;
    }

    
}
