package es23;

import java.util.TreeMap;

public class Clienti {
    private TreeMap<Integer,Cliente> cliente;

    public Clienti(){
        cliente = new TreeMap<Integer, Cliente>(); 
    }

    public void aggiungi(Cliente cliente) throws ClienteEsistente{
        if(!cliente.containsKey(cliente.getCodiceCliente())){
            cliente.put
        }
    }
}
