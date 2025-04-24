package Prueba1;

// Clase Cliente
// -------------
// AGREGACIÓN: un Pedido “tiene” un Cliente, pero el Cliente
// podría existir por separado de ese Pedido.

public class Cliente {
    private String cedula;
    private String nombre;

    public Cliente(String cedula, String nombre) {
        this.cedula = cedula;
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }
}
