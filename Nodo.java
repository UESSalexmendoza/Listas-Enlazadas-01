public class Nodo {
    String nombre;
    String apellidos;
    String direccion;
    String telefono;
    String fechaNacimiento;

    Nodo siguiente; // Referencia al siguiente nodo

    // Constructor con todos los campos
    public Nodo(String nombre, String apellidos, String direccion, String telefono, String fechaNacimiento) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.telefono = telefono;
        this.fechaNacimiento = fechaNacimiento;
        this.siguiente = null;
    }
}
