package es3Nodi;

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

    public void inserisciInCoda(int info){
        Nodo p = new Nodo(info);
        Nodo pn = head;
        while(p.getLink() != null){
            pn = pn.getLink(); 
        }
        p.setLink(null);
        pn.setLink(p);
    }

    public void inserisciInPosizione(int pos, int info){
        Nodo p = new Nodo(info);
        int i = 0; 
        Nodo pp = head;
        if(pos <= 0){
            inserisciInTesta(info);
        }else {
            while(i < pos - 1 ){
                head = p.getLink(); 
                ++i; 
            }

        p.setLink(pp.getLink());
        pp.setLink(p);
        }
    }

    public String toString(){
        Nodo p = head;
        String s = " "; 
        while(p.getLink() != null){
            s += " " + p.getInfo(); 
            p = p.getLink(); 
        }
        return s;
    }

    public void eliminaInTesta(){
        head = head.getLink(); 
    }

    public void eliminaInCoda(){
        Nodo ps = head;
        Nodo pp = head;
        while(ps.getLink() != null){
            pp = ps;
            ps = ps.getLink();
        }
        pp.setLink(null);
    }

    public void eliminaInPosizione(int pos){
        Nodo pp, ps;
        ps = pp.getLink();
        pp.setLink(ps.getLink());
    }

    
}
