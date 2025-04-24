package Prueba1;

// Clase base: Producto
// --------------------
// Aquí vemos HERENCIA: todas las cámaras o impresiones son productos,
// porque comparten el número.
public class Producto {
    private int numero;

    // Constructor
    public Producto(int numero) {
        this.numero = numero;
    }

    // Getter para el número
    public int getNumero() {
        return numero;
    }

    // Método que luego se “polimorﬁa” en las subclases
    public void mostrarDetalles() {
        System.out.println("Producto genérico. Número: " + numero);
    }
}
