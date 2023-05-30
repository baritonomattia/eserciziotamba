package es23;

import java.util.ArrayList;
import java.util.TreeMap;

public class Clienti {
    private TreeMap<Integer,Cliente> cliente;

    public Clienti(){
        cliente = new TreeMap<Integer, Cliente>(); 
    }

    public void aggiungi(Cliente cliente) throws ClienteNonEsiste {
        if(!cliente.containsKey(cliente.getCodiceCliente())){
            cliente.put(cliente.getCodiceCliente(), cliente.clone()); 
        
        }else{
            throw new ClienteNonEsiste(); 
        }
    }

    public void elimina(String codice) throws ClienteNonEsiste{
        if(cliente.containsKey(codice)) return cliente.get(codice).clone(); 
        else throw new ClienteNonEsiste(); 
    }

    public ArrayList<Cliente> trovaCliente(String numero){
        ArrayList<Cliente> cliente_numero = new ArrayList<Cliente>(cliente.size()); 
        for(Cliente cliente : cliente.values()){
            if(cliente.get)
        }
    }
}