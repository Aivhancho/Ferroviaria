import Personal.*;
import Maquinaria.*;

public class Main {
    public static void main(String[] args) {
        Maquinista maquinista1 = new Maquinista("Josefina", "111111L",1000,"jefe");
        Mecanico mecanico = new Mecanico("Pistacho", 99999999, "frenos");
        Locomotora locomotora = new Locomotora("5754FJG",23.6,2010, mecanico);
    }
}