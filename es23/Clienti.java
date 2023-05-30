package es23;

import java.util.ArrayList;
import java.util.TreeMap;

public class Clienti {
    private TreeMap<Integer,Cliente> cliente;

    public Clienti(){
        cliente = new TreeMap<Integer, Cliente>(); 
    }

    public void aggiungi(Cliente a) throws ClienteNonEsiste {
        if(!cliente.containsKey(a.getCodiceCliente())){
            cliente.put(a.getCodiceCliente(), a.clone());
        
        }else{
            throw new ClienteNonEsiste(); 
        }
    }

    public void elimina(String codice) throws ClienteNonEsiste{
        if(cliente.containsKey(codice)) cliente.get(codice).clone(); 
        else throw new ClienteNonEsiste(); 
    }

    public ArrayList<Cliente> trovaCliente(String numero){
        ArrayList<Cliente> cliente_numero = new ArrayList<Cliente>(cliente.size()); 
        for(Cliente cliente : cliente.values()){
            if(cliente.getNumeroTelefono() == numero){
                cliente.toString(); 
            }
        }
    }
}