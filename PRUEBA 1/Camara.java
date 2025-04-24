package Prueba1;

// Subclase Camara: muestra cómo heredo de Producto
// ------------------------------------------------
// HERENCIA: Camara “es un” Producto.
// POLIMORFISMO: voy a sobreescribir mostrarDetalles().

public class Camara extends Producto {
    private String marca;
    private String modelo;

    public Camara(int numero, String marca, String modelo) {
        // Llamo al constructor de la superclase
        super(numero);
        this.marca = marca;
        this.modelo = modelo;
    }

    // Este método reemplaza al de Producto
    @Override
    public void mostrarDetalles() {
        System.out.println("Cámara - Marca: " + marca
            + ", Modelo: " + modelo
            + ", Número: " + getNumero());
    }
}
