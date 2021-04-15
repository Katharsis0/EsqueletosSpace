package sample.linkedlist;

public class Nodo<T> {

    //Atributos clase Nodo

    private T valor;
    private Nodo<T> siguiente;
    private int posicion;

    //Constructor clase Nodo 1
    public Nodo(){

        this.valor= null;
        this.siguiente= null;
        this.posicion= 0;

    }
    //Constrcutor clase Nodo 2
    public Nodo(T valor, Nodo<T> siguiente){

        this.valor= valor;
        this.siguiente= siguiente;

    }

    //Getter del atributo valor
    public T getDato(){

        return valor;
    }

    //Setter del atributo valor
    public void setDato(T valor){

        this.valor= valor;
    }

    //Getter del atributo siguiente.
    public Nodo<T> getSiguiente(){

        return siguiente;
    }

    //Setter del atributo siguiente
    public void setSiguiente(Nodo<T> nodo){

        this.siguiente= siguiente;
    }

    //Getter de la posición del nodo.
    public int getPosicion(){

        return posicion;
    }

    //Setter de la posición del nodo
    public void setPosicion(int position){

        this.posicion=position;
    }

}
