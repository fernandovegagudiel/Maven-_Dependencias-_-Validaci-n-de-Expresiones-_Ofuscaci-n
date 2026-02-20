package stackHandler.handler;

import umg.edu.gt.data_structure.stack.manual.StackLinked;

public class Main {
	
	public static void main(String[] args) {
        // ===== PRUEBA DE TU PILA =====
        StackLinked stack = new StackLinked();

        stack.initStack('A');
        stack.push('B');
        stack.push('C');

        System.out.println("Tamanio? " + stack.size());
        System.out.println("Peek: " + stack.peek()); // C
        System.out.println("Pop: " + stack.pop());   // C
        System.out.println("Peek: " + stack.peek());
        System.out.println("Pop: " + stack.pop());   // B
        System.out.println("Vacia? " + stack.isEmpty()); // false
        System.out.println("Pop: " + stack.pop());   // A
        System.out.println("Vacia? " + stack.isEmpty()); // true
        System.out.println("Pop: " + stack.pop());   // 0 (porque tu pop devuelve '0' si está vacía)

        // ===== PRUEBA DEL VALIDADOR =====
        System.out.println("\n=== Validación de expresiones ===");

        String valido = "(a+b) * [c-d]";
        String invalido = "([)]";

        System.out.println(valido + " -> " + SymbolValidator.validar(valido));   // true
        System.out.println(invalido + " -> " + SymbolValidator.validar(invalido)); // false
    }
}
