package Coda;

public class Lista {
   private Nodo head; 
   private Nodo tail; 
   
   public Lista(){
    head = null; 
    tail = null; 
   }

   public String toString(){
        String s = "coda "; 
        Nodo p = head;
        while(p != null){
            s += " " + p.getInfo(); 
            p = p.getLink(); 
        }     
        return s; 
   }

   public void enqueue(Nodo p){
        if(head == null){
            head = p; 
            tail = p; 
        
        }else{
            tail.setLink(p);
            tail = p; 
        }
   }

   public String dequeue(){
        Nodo p = head; 
        if(head == null){
            return null; 
        }
        head = head.getLink(); 
        return " " + p.getInfo(); 
   }
   
}
