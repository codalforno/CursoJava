package pt.c02oo.s02classe.s01circulo01;

public class AppCirculo01 {
    public static void main(String args[]){
        Circulo circ = new Circulo();
        circ.centroX = 5;
        circ.centroY = 3;
        circ.raio = 10;

        System.out.println("Círculo: centro = (" + circ.centroX + ", " + circ.centroY + ") raio = " + circ.raio);
    }
}
