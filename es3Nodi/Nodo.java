package es3Nodi;

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
    public int getInfo(){
        return info; 
    }
    public void setLink(Nodo link){
        this.link = link; 
    }
    public Nodo getLink(){
        return link; 
    }
}
