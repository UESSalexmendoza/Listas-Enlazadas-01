//Lista Enlazada 
//Alex Mendoza
//UEES
public class Main {
  public static void main(String[] args) {
    ListaEnlazada lista = new ListaEnlazada();

    // Insertamos registros con informacion
    lista.insertarAlFinal("Alex", "Mendoza", "Calle A", "099999999", "01/01/1990");
    lista.insertarAlFinal("Eliseo", "Vallejo", "Calle B", "098888888", "02/02/1985");
    lista.insertarAlFinal("Erick", "Yanez", "Calle C", "097777777", "03/03/1980");
    lista.insertarAlFinal("Francisco", "Torres", "Calle D", "096666666", "04/04/1992");
    /*
     * lista.insertarAlFinal("Freddy", "Constante", "Calle E", "095555555",
     * "05/05/1987");
     * lista.insertarAlFinal("Grace", "Ortega", "Calle F", "094444444",
     * "06/06/1993");
     * lista.insertarAlFinal("Gregory", "Zambrano", "Calle G", "093333333",
     * "07/07/1989");
     * lista.insertarAlFinal("Ivan", "Rivadeneira", "Calle H", "092222222",
     * "08/08/1991");
     * lista.insertarAlFinal("John", "Chacho", "Calle I", "091111111",
     * "09/09/1986");
     * lista.insertarAlFinal("Luis", "Rodriguez", "Calle J", "090000000",
     * "10/10/1988");
     * lista.insertarAlFinal("Mateo", "Hidalgo", "Calle K", "088888888",
     * "11/11/1990");
     * lista.insertarAlFinal("Paul", "Torres", "Calle L", "087777777",
     * "12/12/1985");
     * lista.insertarAlFinal("Santiago", "Davila", "Calle M", "086666666",
     * "13/01/1994");
     */

    // Imprimimos la lista original
    System.out.println("Lista original:");
    lista.imprimirLista();

    // Insertar un nuevo nodo antes del índice 3
    System.out.println("\nInsertar 'Carlos Lopez' antes del índice 3:");
    lista.insertarAntesPorIndice(3, "Carlos", "Lopez", "Calle Z", "085555555", "14/02/1995");

    System.out.println("\nLista actualizada:");
    lista.imprimirLista();

    // Insertar un nuevo nodo antes del apellido "Torres"
    System.out.println("\nInsertar 'Ana Perez' antes del apellido 'Torres':");
    lista.insertarAntesPorApellido("Torres", "Ana", "Perez", "Calle Y", "084444444", "15/03/1996");

    System.out.println("\nLista actualizada:");
    lista.imprimirLista();

    System.out.println("\n");
    System.out.println("\nInsertar 'Laura Gomez' al inicio de la lista:");
    lista.insertarAlInicio("Laura", "Gomez", "Calle X", "083333333", "16/04/1997");

    System.out.println("\nLista actualizada:");
    lista.imprimirLista();
  }
}
