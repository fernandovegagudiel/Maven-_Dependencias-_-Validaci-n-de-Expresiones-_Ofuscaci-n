

package stackHandler.handler;

import umg.edu.gt.data_structure.stack.manual.StackLinked;

public class SymbolValidator {

    public static boolean validar(String exp) {

        StackLinked stack = new StackLinked();

        for (int i = 0; i < exp.length(); i++) {
            char c = exp.charAt(i);

            // Abre simbolos
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            }

            // Cierra simbolos
            if (c == ')' || c == ']' || c == '}') {

                if (stack.isEmpty()) return false;

                char top = stack.pop();

                if (!esPar(top, c)) return false;
            }
        }

        return stack.isEmpty();
    }

    private static boolean esPar(char open, char close) {
        return (open == '(' && close == ')') ||
               (open == '[' && close == ']') ||
               (open == '{' && close == '}');
    }
}
