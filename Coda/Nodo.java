package Coda;

public class Nodo {
    private int info; 
    private Nodo link;
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
    public Nodo(int info, Nodo link) {
        this.info = info;
        this.link = link;
    } 

    

    
}
