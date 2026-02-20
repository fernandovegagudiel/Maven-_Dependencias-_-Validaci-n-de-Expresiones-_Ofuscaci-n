package umg.edu.gt.data_structure.stack.manual;

public class StackLinked {

    private Node top; // tope de la pila
    private int size = 0; // número de elementos en la pila

    public boolean isEmpty() {
        return top == null;
    }

    // Inicializa la pila con un valor
    public void initStack(char value) {
        top = new Node(value, null, 1);
        size = 1;
    }

    public void push(char value) {
        if (isEmpty()) {
            // Primer nodo
            top = new Node(value, null, 1);
        } else {
            // Nuevo nodo apunta al anterior y aumenta conteo
            top = new Node(value, top, top.count + 1);
        }
        size++;
    }

    // Tamaño real de la pila (seguro aunque esté vacía)
    public int size() {
        return size;
    }

    public char pop() {
        if (isEmpty()) {
            return '0';
        }
        char value = top.value;
        top = top.next;
        size--;
        return value;
    }

    // Método adicional que te pidieron (getCount / getSize / length)
    public int getCount() {
        return size;
    }

    // Devuelve el nodo inicial (el del fondo de la pila)
    public Node getNodeInit() {
        if (isEmpty()) return null;

        Node temp = top;
        while (temp.next != null) {
            temp = temp.next;
        }
        return temp;
    }

    public char peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack underflow");
        }
        return top.value;
    }
}
