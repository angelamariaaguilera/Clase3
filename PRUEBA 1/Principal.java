package Prueba1;

// Clase principal con el main()
// -----------------------------

import java.util.Date;

public class Principal {
    public static void main(String[] args) {
        // Creamos un cliente
        Cliente cliente = new Cliente("987654", "María Gómez");

        // Creamos una cámara (hereda de Producto)
        Camara camara = new Camara(101, "Sony", "Alpha A7III");

        // Creamos una impresión con fecha
        Impresion impresion = new Impresion(202, "Color", new Date());
        impresion.agregarFoto(new Foto("boda.jpg"));
        impresion.agregarFoto(new Foto("fiesta.png"));

        // Armamos el pedido con fecha y cliente
        Pedido pedido = new Pedido(cliente, new Date());
        pedido.agregarProducto(camara);
        pedido.agregarProducto(impresion);

        // Mostramos por pantalla todo el pedido
        pedido.mostrarPedido();
    }
}
