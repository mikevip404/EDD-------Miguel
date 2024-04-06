package Listas_Enlazadas;


public class Lista 
{

    private Nodos inicio;
    private Nodos fin;
    
    public Lista()
    {
      inicio=fin = null;
    }
 
    //Metodo para agregar inicio
    public void agregarInicio(int info)
    {
        Nodos nuevo=new Nodos(info, inicio);

        if(inicio==null)
        {
            inicio=fin = nuevo;
        }
            inicio = nuevo;
    }
 
    //Metodo para agregar fin
    public void agregarFin(int info)
    {
        Nodos nuevo=new Nodos(info, null);

        if(inicio==null)
        {
            inicio=fin = nuevo;
        }
        else
        {
            fin.setSiguiente(nuevo);
            fin = nuevo;
        }
    }



 
    //Metodo para imprimir
    public void imprimir()
    {
        Nodos aux=inicio;

        while(aux!=null)
        {
            System.out.println(aux.getDato());
            aux = aux.getSiguiente();
        }
    }
 



    //Metodo para eliminar el nodo
    public void eliminarNodo(int numero)
    {
        if(inicio!=null)
        {
            if((inicio==fin)&&(inicio.getDato()==numero))
            {
                inicio=fin = null;
            } 
            else if(inicio.getDato()==numero)
            {
                inicio=inicio.getSiguiente();
            }

        else
        {
            Nodos anterior = inicio;
            Nodos siguiente = inicio.getSiguiente();

            while((siguiente!=null)&&(siguiente.getDato()!=numero))
            {
                anterior=siguiente;
                siguiente=siguiente.getSiguiente();
            }
            if(siguiente!=null)
            {
                anterior.setSiguiente(siguiente.getSiguiente());

                if(siguiente==fin)
                {
                    fin=anterior;
                }
            }
        }
        }
    }



 
    //Metodo ordenar de mayor a menor
    public void ordenarMayorMenor(int info)
    {
        int aux;
        Nodos recorrer=inicio;
        int array[]=new int [info];

        for(int i=0;i<info;i++)               
        {
            array[i]=recorrer.getDato();
            recorrer=recorrer.getSiguiente();
        }

        for(int k=0;k<info;k++)
        {
            for(int j=k+1;j<info;j++)
            {
                if(array[k]<array[j])
                {
                aux=array[k];
                array[k]=array[j];
                array[j]=aux;
                }
            }
        }

        Lista nueva=new Lista();
        
        for(int f=0;f<info;f++)
        {
            nueva.agregarFin(array[f]);
        }
            nueva.imprimir();
        }
        



        //Metodo para calcular el promedio de la lista
        public void promedio()
        {
            Nodos aux = inicio;
            int suma=0;
            double promedio;

            while(aux!=null)
            {
            suma= suma + aux.getDato();
            aux=aux.getSiguiente();
            }

            promedio=suma/5;
            System.out.println("El promedio de la lista es:"+promedio);
        }

}

