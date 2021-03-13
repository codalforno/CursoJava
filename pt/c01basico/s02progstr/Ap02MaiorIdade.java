package pt.c01basico.s02progstr;

import java.util.Scanner;

public class Ap02MaiorIdade {
    public static void main(String args[]){
        System.out.print("Digite sua idade: ");
        Scanner teclado = new Scanner(System.in);
        String sidade = teclado.nextLine();

        int idade = Integer.parseInt(sidade);
        if (idade >= 18)
            System.out.println("Voce e maior de idade");
        else
            System.out.println("Voce nao e maior de idade");
    }
    
}
