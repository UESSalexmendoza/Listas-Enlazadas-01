public class ListaEnlazada {
    private Nodo primerNodo; // Primer nodo de la lista

    public ListaEnlazada() {
        primerNodo = null;
    }

    // Insertar un nuevo nodo al final
    public void insertarAlFinal(String nombre, String apellidos, String direccion, String telefono, String fechaNacimiento) {
        Nodo nuevoNodo = new Nodo(nombre, apellidos, direccion, telefono, fechaNacimiento);
        if (primerNodo == null) {
            primerNodo = nuevoNodo;
            return;
        }

        Nodo actual = primerNodo;
        while (actual.siguiente != null) {
            actual = actual.siguiente;
        }

        actual.siguiente = nuevoNodo;
    }

    // Insertar antes de un nodo en la posición 'indice' (empezando en 0)
    public void insertarAntesPorIndice(int indice, String nombre, String apellidos, String direccion, String telefono, String fechaNacimiento) {
        Nodo nuevoNodo = new Nodo(nombre, apellidos, direccion, telefono, fechaNacimiento);
        // Caso especial: insertar antes del primer nodo (índice 0)
        if (indice == 0) {
            nuevoNodo.siguiente = primerNodo;
            primerNodo = nuevoNodo;
            return;
        }

        Nodo actual = primerNodo;
        Nodo anterior = null;
        int contador = 0;

        while (actual != null && contador < indice) {
            anterior = actual;
            actual = actual.siguiente;
            contador++;
        }

        if (contador != indice) {
            System.out.println("Indice fuera de rango: " + indice);
            return;
        }

        // Insertamos el nuevo nodo entre anterior y actual
        anterior.siguiente = nuevoNodo;
        nuevoNodo.siguiente = actual;
    }

    // Insertar antes de un nodo que tenga el apellido buscado
    public void insertarAntesPorApellido(String apellidoObjetivo, String nombre, String apellidos, String direccion,
            String telefono, String fechaNacimiento) {
        Nodo nuevoNodo = new Nodo(nombre, apellidos, direccion, telefono, fechaNacimiento);

        // Caso especial: insertar antes del primer nodo
        if (primerNodo != null && primerNodo.apellidos.equals(apellidoObjetivo)) {
            nuevoNodo.siguiente = primerNodo;
            primerNodo = nuevoNodo;
            return;
        }

        Nodo actual = primerNodo;
        Nodo anterior = null;

        while (actual != null && !actual.apellidos.equals(apellidoObjetivo)) {
            anterior = actual;
            actual = actual.siguiente;
        }

        if (actual == null) {
            System.out.println("No se encontro el apellido: " + apellidoObjetivo);
            return;
        }

        anterior.siguiente = nuevoNodo;
        nuevoNodo.siguiente = actual;
    }

    // Insertar un nuevo nodo al inicio de la lista
    public void insertarAlInicio(String nombre, String apellidos, String direccion, String telefono,
            String fechaNacimiento) {
        Nodo nuevoNodo = new Nodo(nombre, apellidos, direccion, telefono, fechaNacimiento);
        nuevoNodo.siguiente = primerNodo; // el nuevo nodo apunta al actual primer nodo
        primerNodo = nuevoNodo; // ahora el primer nodo es el nuevo nodo
    }

    // Imprimir la lista completa con formato tipo cuadro
    public void imprimirLista() {
        Nodo actual = primerNodo;
        int ancho = 50; // Ancho total de la línea
        int indice = 0;

        while (actual != null) {
            String siguienteIndice = (actual.siguiente != null) ? String.valueOf(indice + 1) : "null";
            System.out.println(" " + "_".repeat(ancho + 1)); // Separador
            System.out.println(
                    "| " + formatearLinea("[" + "Indice: " + indice + "] -----------> [Indice siguiente: " + siguienteIndice + "]", ancho)
                            + "|");
            System.out.println("| " + formatearLinea(formatearLinea(("Nombre" ),20) + ": " + actual.nombre, ancho) + "|");
            System.out.println("| " + formatearLinea(formatearLinea(("Apellidos" ),20) + ": " + actual.apellidos, ancho) + "|");
            System.out.println("| " + formatearLinea(formatearLinea(("Direccion" ),20) + ": " + actual.direccion, ancho) + "|");
            System.out.println("| " + formatearLinea(formatearLinea(("Telefono" ),20) + ": " + actual.telefono, ancho) + "|");
            System.out.println("| " + formatearLinea(formatearLinea(("Fecha de Nacimiento" ),20) + ": " + actual.fechaNacimiento, ancho) + "|");
            System.out.println(" " + "-".repeat(ancho + 1)); // Separador
            actual = actual.siguiente;
            indice++;
        }
    }

    // Método auxiliar para rellenar la línea con espacios hasta el ancho deseado
    private String formatearLinea(String texto, int ancho) {
        if (texto.length() >= ancho) {
            return texto.substring(0, ancho); // Si el texto es muy largo, lo cortamos
        } else {
            int espaciosRestantes = ancho - texto.length();
            return texto + " ".repeat(espaciosRestantes);
        }
    }
}
