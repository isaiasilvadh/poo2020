package ListasEnlazadas;
public class jisilva1EVA_ListasEnlazadas {
    class Nodo {
        // Variable en la cual se va a guardar el valor.
        private int valor;
        // Variable para enlazar los nodos.
        private ListasEnlazadas.Nodo siguiente;
        //Constructor iniciado con valor a las variables.
        public Nodo() {
            this.valor = 0;
            this.siguiente = null;
        }
        // Métodos get y set para los atributos.
        public int getValor() {
            return valor;
        }
        public void setValor(int valor) {
            this.valor = valor;
        }
        public ListasEnlazadas.Nodo getSiguiente() {
            return siguiente;
        }
        public void setSiguiente(ListasEnlazadas.Nodo siguiente) {
            this.siguiente = siguiente;
        }
    }
    // Clase Lista que contiene los metodos para operar en la lista.
    static class Lista {
        // Inicio de la lista
        private ListasEnlazadas.Nodo inicio;
        // Tamaño de la lista.
        private int tamanio;
        //Constructor de la clase lista
        public Lista() {
            inicio = null;
            tamanio = 0;
        }
        //Si el primer nodo no apunta a otro, esta vacia.
        public boolean esVacia() {
            return inicio == null;
        }
        //retorna el tamaño de la lista
        public int getTamanio() {
            return tamanio;
        }

        public void agregarAlInicio(int valor) {
            // Creamos un nuevo nodo.
            ListasEnlazadas.Nodo nuevo = new ListasEnlazadas.Nodo();
            // Se ingresa valor al nodo.
            nuevo.setValor(valor);
            // se verifica si la lista esta vacia.
            if (esVacia()) {
                // Inicializa la lista agregando como inicio al nuevo nodo.
                inicio = nuevo;
                // Caso contrario va agregando los nodos al inicio de la lista.
            } else {
                // Une el nuevo nodo con la lista existente.
                nuevo.setSiguiente(inicio);
                // Asigna al nuevo nodo como el inicio de la lista.
                inicio = nuevo;
            }
            // Incrementa el contador de tamaño de la lista.
            tamanio++;
        }

        // Agrega un nodo al final de la lista.
        public void agregarAlFinal(int valor) {
            // Creamos un nuevo nodo.
            ListasEnlazadas.Nodo nuevo = new ListasEnlazadas.Nodo();
            // Se ingresa valor al nodo.
            nuevo.setValor(valor);
            // Consulta si la lista esta vacia.
            if (esVacia()) {
                // Inicializa la lista agregando como inicio al nuevo nodo.
                inicio = nuevo;
                // Caso contrario se llega al ultimo nodo para agregar el nuevo.
            } else {
                // Crea una copia de la lista.
                ListasEnlazadas.Nodo aux = inicio;
                // Recorre la lista hasta llegar al ultimo nodo.
                while (aux.getSiguiente() != null) {
                    aux = aux.getSiguiente();
                }
                // Agrega el nuevo nodo al final de la lista.
                aux.setSiguiente(nuevo);
            }
            // Incrementa el contador de tamaño de la lista
            tamanio++;
        }
        // Busca nodos, servirá para eliminar en cualquier posicion
        public boolean buscar(int referencia) {
            // Crea una copia de la lista.
            ListasEnlazadas.Nodo aux = inicio;
            // Booleano para verificar si el valor existe.
            boolean encontrado = false;
            // Recorre la lista hasta encontrar el elemento o hasta el fin de lista.
            while (aux != null && encontrado != true) {
                // verifica si es el nodo que estamos buscando.
                if (referencia == aux.getValor()) {
                    // devuelve true al encontrar el nodo.
                    encontrado = true;
                } else {
                    // Avanza al siguiente nodo.
                    aux = aux.getSiguiente();
                }
            }
            // Retorna el resultado de la bandera.
            return encontrado;
        }

        //Elimina nodo por ubicación.
        public void removerPorPosicion(int posicion) {
            // Verifica si la posición ingresada se encuentra en la lista
            if (posicion >= 0 && posicion < tamanio) {
                // Consulta si el nodo a eliminar es el primero
                if (posicion == 0) {
                    // Elimina el primer nodo apuntando al siguinte.
                    inicio = inicio.getSiguiente();
                }
                // En caso que el nodo a eliminar este al medio o al ultimo
                else {
                    // Crea una copia de la lista.
                    ListasEnlazadas.Nodo aux = inicio;
                    // Recorre la lista hasta lleger al nodo anterior a eliminar.
                    for (int i = 0; i < posicion - 1; i++) {
                        aux = aux.getSiguiente();
                    }
                    // Guarda el nodo siguiente al nodo a eliminar.
                    ListasEnlazadas.Nodo siguiente = aux.getSiguiente();
                    // Elimina la referencia del nodo apuntando al nodo siguiente.
                    aux.setSiguiente(siguiente.getSiguiente());
                }
                // Disminuye el contador de tamaño de la lista.
                tamanio--;
            }
        }

        // ELiminar Lista
        public void eliminar() {
            // Elimina el valor y la referencia de los nodos.
            inicio = null;
            // Reinicia el contador de tamaño de la lista a 0.
            tamanio = 0;
        }

        // Imprimir lista
        public void listar() {
            // Verifica si la lista contiene elementos.
            if (!esVacia()) {
                // Crea una copia de la lista.
                ListasEnlazadas.Nodo aux = inicio;
                // Posicion de los elementos de la lista.
                int i = 0;
                // Recorre la lista hasta el final.
                while (aux != null) {
                    // Imprime en pantalla el valor del nodo.
                    System.out.print(i + ".[ " + aux.getValor() + " ]");
                    // Avanza al siguiente nodo.
                    aux = aux.getSiguiente();
                    // Incrementa el contador de la posición.
                    i++;
                }
            }
        }
        // Main para poder ejecutar el programa
        public static void main(String[] args) {
            // Creación de objeto de la clase Lista
            Lista lista = new Lista();
            // Agregar in inicio de la lista
            lista.agregarAlInicio(1);
            lista.agregarAlInicio(2);
            lista.agregarAlInicio(3);
            // Agregar al final de la lista
            lista.agregarAlFinal(6);
            lista.agregarAlFinal(7);
            lista.agregarAlFinal(8);
            // Se imprime la lista ingresada.
            System.out.println("Lista enlazada");
            lista.listar();
            System.out.println("\n\nTamaño de Lista: " + lista.getTamanio());
            // Eliminacion del nodo en determinada posicion e imprime la lista.
            System.out.println("\nEliminación del nodo en la posición 1");
            lista.removerPorPosicion(1);
            lista.listar();
            System.out.println("\n\nTamaño de Lista: " + lista.getTamanio());
            //Elimina la lista.
            System.out.println("\nLista Eliminada");
            lista.eliminar();

        }
    }
}
