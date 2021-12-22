package Introducao_Java_TM;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número e descubra se ele é PRIMO:");
        int nEntrada = sc.nextInt();

        if (vPrimo(nEntrada)) {
            System.out.println(nEntrada + " é um número primo!");
        } else {
            System.out.println(nEntrada + " não é um número primo!");
        }

    }

    public static boolean vPrimo(int n) {

        for (int i = 2; i < n; i++)
        if (n % i == 0){
            return false;
        }
        return true;
    }
}
/*Desenvolva um programa para informar se um um número n é primo ou não, sendo n um
valor que o usuário irá inserir pelo console. Lembre-se que um número é primo quando só é
divisível por 1 e por si mesmo.*/





    /*Desenvolva um programa para informar se um um número n é primo ou não, sendo n um
valor que o usuário irá inserir pelo console. Lembre-se que um número é primo quando só é
divisível por 1 e por si mesmo.*/