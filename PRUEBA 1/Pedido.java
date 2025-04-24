package Prueba1;

// Clase Pedido
// ------------
// AGREGACIÓN: el pedido agrupa varios Productos,
// y se le asocia un Cliente.
// Además guardamos la fecha del pedido y la mostramos.

import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Pedido {
    private Cliente cliente;        // agregación
    private List<Producto> productos; // agregación de Productos
    private Date fechaPedido;         // fecha en que se hizo el pedido

    public Pedido(Cliente cliente, Date fechaPedido) {
        this.cliente = cliente;
        this.fechaPedido = fechaPedido;
        this.productos = new ArrayList<Producto>();
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public void mostrarPedido() {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        String fechaConHora = formato.format(fechaPedido);

        System.out.println("=== Pedido de: " + cliente.getNombre() + " ===");
        System.out.println("Fecha del pedido: " + fechaConHora);
        System.out.println("------------------------------------------");

        // POLIMORFISMO en acción: muestro detalles de cada Producto,
        // aunque sean Camara o Impresion.
        for (int i = 0; i < productos.size(); i++) {
            Producto p = productos.get(i);
            p.mostrarDetalles();
        }
    }
}
