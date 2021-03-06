package sample.linkedlist;

//Declaración de la lista simple
public class simpleLinkedList<T>{

    //Atributos de la clase simpleLinkedList
    private Nodo<T> primero;
    private int largo;

    //Declaratoria del constructor de simpleLinkedList
    public simpleLinkedList() {

        primero= null;
        largo=0;
    }

    //verificar si la lista está vacía. @return True or False
    public boolean estaVacia(){

        return primero==null;

    }

    //Obtener el largo de la lista
    public int getLargo(){

        return largo;
    }

    //Insertar nuevo dato al frente de la lista
    public void addFrente(T dato){

        Nodo<T> nuevoNodo= new Nodo<T>();
        nuevoNodo.setDato(dato);

        if (estaVacia()){

            primero= nuevoNodo;
            primero.setPosicion(0);

        }
        else {

            nuevoNodo.setPosicion(0);
            nuevoNodo.setSiguiente(primero);
            primero = nuevoNodo;

        }
        Nodo<T> aux= primero.getSiguiente();
        while (aux!=null) {

            aux.setPosicion(aux.getPosicion());
            aux= aux.getSiguiente();

        }
        largo++;

    }
    //Borrar el dato al frente de la lista
    public void deleteFrente(){

        if (estaVacia()){

            primero=null;

        }
        else {

            primero= primero.getSiguiente();
            Nodo<T> aux= primero;

            while(aux!= null){

                aux.setPosicion(aux.getPosicion()-1);
                aux=aux.getSiguiente();

            }
        }
        largo--;
    }

    //Insertar dato al final de la lista
    public void addUltimo(T dato){

        Nodo<T> newNodo = new Nodo<T>();
        newNodo.setDato(dato);

        if(estaVacia()){

            primero= newNodo;
            primero.setPosicion(0);

        }
        else {

            Nodo<T> aux = new Nodo<T>();
            aux = primero;

            while (aux.getSiguiente() != null) {

                aux = aux.getSiguiente();

            }


            aux.setSiguiente(newNodo);
            aux.getSiguiente().setPosicion(largo);
        }

        largo++;

    }

    //Borrar dato al final de la lista
    public void deleteUltimo(){

        Nodo<T> aux= new Nodo<T>();
        aux= primero;

        if(estaVacia() || largo ==1){

            primero=null;

        }
        else{

            while(aux.getSiguiente().getSiguiente()!=null){
                aux=aux.getSiguiente();
            }

        aux.setSiguiente(null);
        }
        largo--;

    }

    //Obtener valor especifico del índice
    public Nodo<T> get(int i){

        if (i >= largo){

            try {

                throw new Exception();

            }catch (Exception e){

                e.printStackTrace();
            }
        }
        Nodo<T> aux= primero;

        while (aux != primero ){

            if(aux.getPosicion() == i){

                return aux;
            }

            aux= aux.getSiguiente();

        }
        return null;
    }

    //Borrar elemento específico contenido en el indice
    public void deleteElemento(T t){

        Nodo<T> aux= new Nodo<T>();
        aux= primero;

        if (estaVacia()){

            primero=null;

        }
        else if (primero.getDato()==t){

            deleteFrente();

        }
        else{

            while (aux.getSiguiente()!=null){

                if(aux.getSiguiente().getDato()==t){

                    Nodo<T> auxSegundo= new Nodo<T>();
                    aux.setSiguiente(aux.getSiguiente().getSiguiente());
                    auxSegundo= aux.getSiguiente();

                    while (auxSegundo!=null){

                        auxSegundo.setPosicion(auxSegundo.getPosicion()-1);

                    }

                }

                else{

                    aux=aux.getSiguiente();
                }
            }
        }largo--;

    }

    //Imprimir elementos de la lista
    public void printLista(){

        Nodo<T> aux= primero;

        while(aux!=null){
            System.out.println(aux.getDato().toString());
            aux= aux.getSiguiente();

        }
    }

    //Retornar el primero elemento de la lista
    public Nodo<T> getPrimero(){

        return primero;
    }

    //Retornar último elemento de la lista
    public  Nodo<T> getUltimo(){

        Nodo<T> aux= primero;

        while(aux.getSiguiente()!=null){

            aux= aux.getSiguiente();
        }

        return aux;
    }

    //Saber si cierto elemento está contenido en la lista
    public boolean contains(T t){

        Nodo<T> aux = primero;
        boolean estaContenido= false;

        while (aux!= null){

            if(aux.getDato().equals(t)){

                estaContenido= true;

            }aux= aux.getSiguiente();
        }
        return estaContenido;

    }
}
