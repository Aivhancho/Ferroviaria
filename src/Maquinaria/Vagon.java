package Maquinaria;

public class Vagon {
    int identificador;

    double cargaMaxima;

    double cargaActual;

    String tipoCarga;

    public Vagon(int identificador, double cargaMaxima, double cargaActual, String tipoCarga) {
        this.identificador = identificador;
        this.cargaMaxima = cargaMaxima;
        this.cargaActual = cargaActual;
        this.tipoCarga = tipoCarga;
    }
}
