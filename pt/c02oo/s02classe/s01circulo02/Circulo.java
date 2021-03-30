package pt.c02oo.s02classe.s01circulo02;

public class Circulo {
    int centroX, centroY;
    int raio;

    void mostraArea(){
        System.out.println("Area do círculo: " + Math.PI * raio * raio);
    }
}
