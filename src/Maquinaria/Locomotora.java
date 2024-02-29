package Maquinaria;

import Personal.Mecanico; //al poner import (paquete) * se importarán todas las clases del paquete

public class Locomotora {
    String matricula;

    double potenciaMotor;

    int añoFabricacion;

    Mecanico mecanico1;

    public Locomotora(String matricula, double potenciaMotor, int añoFabricacion, Mecanico mecanico1) {
        this.matricula = matricula;
        this.potenciaMotor = potenciaMotor;
        this.añoFabricacion = añoFabricacion;
        this.mecanico1 = mecanico1;
    }
}
