package pt.c01basico.s03vetor;

import java.util.Scanner;

public class Ap01Vetor {
    static int converte(String entrada){
        String nomeDia[] = new String[7];
        nomeDia[0] = "Domingo";
        nomeDia[1] = "Segunda";
        nomeDia[2] = "Terca";
        nomeDia[3] = "Quarta";
        nomeDia[4] = "Quinta";
        nomeDia[5] = "Sexta";
        nomeDia[6] = "Sábado";

        int d = 0;
        for(int i = 0; i<nomeDia.length; i++){
            if (entrada.equals(nomeDia[i]))
                d = i+1;
        }
        return d;
    }
    public static void main(String args[]){
        System.out.print("Digite o dia: ");
        Scanner teclado = new Scanner(System.in);
        String dia = teclado.nextLine();

        System.out.println("Convertido: " + converte(dia));
    }
}
