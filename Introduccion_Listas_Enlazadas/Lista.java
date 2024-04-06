package Introduccion_Listas_Enlazadas;

public class Lista 
{
    private Nodo inicio; //punteros para acceder al inicio
    private Nodo fin;    // y al final de la lista
    int cont=0;   //contador para mostrar la cantidad de elementos que hay en la lista

    public Lista()
    {
        inicio = null;
        fin = null;
    }

    public boolean estaVacia()
    {
        return inicio == null;
    }

    public void agregandoAlInicio(String d)
    {
        cont++;

        if(estaVacia())
        {
            inicio = new Nodo(d, inicio);
            fin = inicio;
        }
        else
        {
            inicio = new Nodo(d, inicio);
        }
    }

    public int cantidadNodos()
    {
        return cont;
    }

    public void mostrarLista()
    {
        Nodo aux = inicio;

        while(aux!=null)
        {
            System.out.print("[" + aux.dato + "]--->");
            aux = aux.siguiente;
        }
    }

}
