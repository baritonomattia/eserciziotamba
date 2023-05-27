package es1Nodi;

public class Lista {
    private Nodo head;

    public Lista(){
        head = null; 
    }

    public String stampa(){
        Nodo p = head; 
        String s = " "; 
        while(p!= null){
            s += p.getInfo() + " "; 
            p = p.getLink(); 
        }
        return s; 
    }

    public void inserisciInTesta(int n){
        Nodo p = new Nodo(n); 
        p.setLink(head);
        head = p; 
    }

    public void inserisciInCoda(int info){
        Nodo pn = new Nodo(info); 
        Nodo p = head; 
        while(p.getLink() != null){
            p = p.getLink(); 
        }
        pn.setLink(null);
        p.setLink(pn);
    }

    public void inserisciInPosizione(int info, int pos){
        Nodo pn = new Nodo(info); 
        Nodo p = head; 
        int i = 0; 
        if(pos == 0) inserisciInTesta(info);
        else
            while(i < pos -1){
                p = p.getLink(); 
                ++i; 
            
            }
            pn.setLink(p.getLink());
            p.setLink(pn);
    }

    public void scambia(){
        Nodo precedente = null; 
        Nodo p = head; 
        while( p != null && p.getLink() != null){
            Nodo successivo = p.getLink(); 
            p.setLink(successivo.getLink());
            if(precedente != null){
                precedente.setLink(successivo);
            }else{
                head = successivo; 
            }
            precedente = p; 
            p = p.getLink(); 
        }
    }

    public void duplica(int valore){
        Nodo p = head; 
        while(p!=null){
            if(p.getInfo() == valore){
                Nodo pn = new Nodo(p.getInfo()); 
                pn.setLink(p.getLink());
                p.setLink(pn);
                p = pn; 
            }
            p = p.getLink(); 
        }
    }
}
