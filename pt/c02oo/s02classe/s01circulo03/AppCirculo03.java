package pt.c02oo.s02classe.s01circulo03;

public class AppCirculo03 {
    public static void main(String args[]){
        Circulo circ = new Circulo(5, 3, 10);
        
        System.out.println("Círculo: centro = (" + circ.centroX + ", " + circ.centroY + ") raio = " + circ.raio);
        circ.mostraArea();
        System.out.println("Area do circulo: " + circ.area());
    }
}
