package Listas_Enlazadas;
import java.util.*;

/*
 Crear una lista simple la cual debe ingresar números reales, luego ordenarlos de mayor a menor, 
 imprimir la lista, obtener el promedio de los valores de cada lista, 
 comprobar cuál es el valor que más se repite en la lista.
 
 */

public class Main 
{

    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);

        Lista coleccion=new Lista();
        int n=5, dato;
        System.out.println("Ejercicio 1- Listas Simples\n");

        for(int i=0;i<n;i++)
        {
            System.out.println("Ingrese el elemento "+(i+1)+" de la lista");
            dato=s.nextInt();
            coleccion.agregarInicio(dato);
        }
        System.out.println("Lista ingresada:");
        coleccion.imprimir();
        
        System.out.println("\nLista ordenada de mayor a menor");
        coleccion.ordenarMayorMenor(n);
        
        coleccion.promedio();

        s.close();
    }
}


