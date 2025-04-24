package Prueba1;

// Clase Foto
// ----------
// COMPOSICIÓN: una impresión está formada por varias fotos,
// y las fotos no viven sin la impresión (en este ejemplo sencillo).

public class Foto {
    private String fichero;

    public Foto(String fichero) {
        this.fichero = fichero;
    }

    public String getFichero() {
        return fichero;
    }

    public void print() {
        System.out.println("   Imprimiendo foto: " + fichero);
    }
}
