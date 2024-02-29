package Maquinaria;

import Personal.Maquinista;

public class Trenes {
    Locomotora locomotora1;

    Vagon vagon1[];

    Maquinista maquinista;

    public Trenes(Locomotora locomotora1, Vagon[] vagon1, Maquinista maquinista) {
        this.locomotora1 = locomotora1;
        this.vagon1 = new Vagon[5];
        this.maquinista = maquinista;
    }
}
