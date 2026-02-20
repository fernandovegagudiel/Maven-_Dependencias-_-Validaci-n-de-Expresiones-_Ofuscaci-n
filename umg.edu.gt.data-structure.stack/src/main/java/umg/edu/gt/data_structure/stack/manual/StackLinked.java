package umg.edu.gt.data_structure.stack.manual;

public class StackLinked {

    private Node top; // elemento superior de la pila
    private int size = 0; // número de elementos actuales

    // Verifica si la pila está vacía
    public boolean isEmpty() {
        return top == null;
    }

    // Inicializa la pila con el primer valor
    public void initStack(char value) {
        top = new Node(value, null, 1); // crea el primer nodo
        size = 1;
    }

    // Agrega un nuevo elemento al tope
    public void push(char value) {
        if (isEmpty()) {
            top = new Node(value, null, 1); // primer nodo si está vacía
        } else {
            top = new Node(value, top, top.count + 1); // enlaza al anterior
        }
        size++; // aumenta el tamaño
    }

    // Retorna el número de elementos de la pila
    public int size() {
        return size;
    }

    // Elimina y retorna el elemento del tope
    public char pop() {
        if (isEmpty()) {
            return '0'; // devuelve valor por defecto si está vacía
        }
        char value = top.value;
        top = top.next; // actualiza el tope
        size--; // disminuye el tamaño
        return value;
    }

    // Retorna la cantidad de elementos (igual que size)
    public int getCount() {
        return size;
    }

    // Obtiene el nodo del fondo de la pila
    public Node getNodeInit() {
        if (isEmpty()) return null;

        Node temp = top;
        while (temp.next != null) {
            temp = temp.next; // recorre hasta el último nodo
        }
        return temp;
    }

    // Muestra el valor del tope sin eliminarlo
    public char peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack underflow"); // error si está vacía
        }
        return top.value;
    }
}