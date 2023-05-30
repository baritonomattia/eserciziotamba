package es2Nodi;


public class Lista {
    private Nodo head;

    public Lista(){
        head = null; 
    }

    public void inserisciInTesta(int info){
        Nodo p = new Nodo(info);
        p.setLink(head);
        head = p;  
    }

    public void inserisciInPosizione(int pos, int info){
        Nodo p = new Nodo(info); 
        Nodo testa = head;
        int i = 0; 
        if(pos == 0) inserisciInTesta(info);
        else {
            while(i < pos - 1){
                testa = p.getLink(); 
                ++i; 
            }
            p.setLink(testa.getLink());
            testa.setLink(p);
        }
    }

    public void inserisciInCoda(int info){
        Nodo p = head; 
        Nodo pn = new Nodo(info); 
        while(p.getLink() != null){
            p = p.getLink(); 
        }
        pn.setLink(null);
        p.setLink(pn);
    }

    public void eliminaInCoda(){
        Nodo ps = head;
        Nodo pp = head;
        while(ps.getLink() != null){
            pp = ps;
            ps = ps.getLink();
        }
    }

    public void eliminaInTesta(){
        head = head.getLink();
    }

    public String toString(){
        Nodo p = head; 
        String s = " "; 
        while(p.getLink() != null){
            s += p.getInfo() + " ";
            p = p.getLink();  
        }
        return s; 
    }


}
