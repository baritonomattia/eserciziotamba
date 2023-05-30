package es2Pila;

public class Nodo {
    private int info; 
    private Nodo link; 

    public Nodo(int info){
        this.info = info; 
        this.link = null; 
    }

    public void setInfo(int info){
        this.info = info; 
    
    }
    public void setLink(Nodo link){
        this.link = link; 
    }
    public int getInfo(){
        return info; 
    }
    public Nodo getLink() {
        return link; 
    }
}
