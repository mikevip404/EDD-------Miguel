package Introduccion_Listas_Enlazadas;

public class Main 
{
    public static void main(String[] args) 
    {
        // Agrerar nodo al inicio de una lista enzalada
        Lista MiLista = new Lista();
        MiLista.agregandoAlInicio("Lupita");
        MiLista.agregandoAlInicio("Ana");
        MiLista.agregandoAlInicio("Juan");
        MiLista.agregandoAlInicio("Maria");
        MiLista.mostrarLista();

        if(MiLista.estaVacia())
        {
            System.out.println("La lista esta vacia");
        }
        else
        {
            System.out.println("\n La lista no esta vacia");
        }
        
        System.out.println();
        System.out.println("Cantidad de elementos de la lista enlazada: " + MiLista.cantidadNodos());

    }
    
}
