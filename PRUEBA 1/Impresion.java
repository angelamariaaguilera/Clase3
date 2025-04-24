package Prueba1;

// Subclase Impresion: también HEREDA de Producto
// COMPOSICIÓN: guarda lista de Fotos.
// ------------------------------------------------

import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Impresion extends Producto {
    private String color;
    private List<Foto> fotos;      // composición: la Impresión “tiene” Fotos
    // (podríamos usar agregación si quisieran compartir Fotos entre varias impresiones)

    private Date fechaImpresion;   // fecha de esta impresión

    public Impresion(int numero, String color, Date fechaImpresion) {
        super(numero);
        this.color = color;
        this.fotos = new ArrayList<Foto>();
        this.fechaImpresion = fechaImpresion;
    }

    public void agregarFoto(Foto foto) {
        fotos.add(foto);
    }

    @Override
    public void mostrarDetalles() {
        // Le damos formato bonito a la fecha
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        String fechaFormateada = formato.format(fechaImpresion);

        System.out.println("Impresión - Color: " + color
            + ", Número: " + getNumero()
            + ", Fecha: " + fechaFormateada);

        // Recorremos las fotos y las “print”
        for (int i = 0; i < fotos.size(); i++) {
            Foto f = fotos.get(i);
            f.print();
        }
    }
}
