package Introducao_Java_TM;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        int nQtd;
        int nMulti;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero e veja seus multiplos:");
        nMulti = sc.nextInt();
        System.out.println("Quantas vezes deseja ver o multiplo do valor digitado?");
        nQtd = sc.nextInt();
        int nEntrada = nMulti;

        for (int i = 0; i < nQtd; i++){
            System.out.println(nMulti);
            nMulti +=nEntrada;
        }
    }
}
/*Desenvolva um programa para mostrar os primeiros n números múltiplos de m, sendo n e
m valores que o usuário irá inserir via console. Lembre-se que um número a é divisível por b
quando o resto da divisão de a por b é igual a 0.*/