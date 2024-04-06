package Introduccion_Listas_Enlazadas;

//Cada vez que creamos un nuevo objeto en la clase nodo,
//estaremos creando un nuevo nodo.

public class Nodo 
{
    String dato;    //dato que contiene el nodo
    Nodo siguiente; //puntero que contendrá la direccion del siguiente nodo



    public Nodo(String d, Nodo sig) 
    {
        dato = d;
        siguiente = sig;
    }



    public String getDato() 
    {
        return dato;
    }

    public void setDato(String d) 
    {
        dato = d;
    }

    public Nodo getSig() 
    {
        return siguiente;
    }

    public void setSig(Nodo sig) 
    {
        siguiente = sig;
    }

    
}
