package Listas_Enlazadas;


public class Nodos 
{
    //Declaración de atributos
    private int dato;
    private Nodos siguiente; 
    
    //Constructor Nodo null
    public Nodos(int dato)
    {
        this.dato = dato;
        this.siguiente = null;
    }
    
    //Constructor Nodo con parametro
    public Nodos(int dato, Nodos siguiente)
    {
        this.dato = dato;
        this.siguiente = siguiente;
    }

    //Métodos getters and setters
    public int getDato() 
    {
        return dato;
    }

    public void setDato(int dato) 
    {
        this.dato = dato;
    }
    
    public Nodos getSiguiente() 
    {
        return siguiente;
    }

    public void setSiguiente(Nodos siguiente) 
    {
        this.siguiente = siguiente;
    }
}
