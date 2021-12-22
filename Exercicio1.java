package Introducao_Java_TM;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        int nEntrada;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um valor e veja a sequência de números pares:");
        nEntrada = sc.nextInt();
        int[] ints = gerarVetorPar(nEntrada);
        System.out.println(Arrays.toString(ints));
        System.out.println("######################");
        List<Integer> listaInteiros = geraListaPar(nEntrada);
        System.out.println(listaInteiros);

    }

    private static int[] gerarVetorPar(int nEntrada) {
        int[] a = new int[nEntrada];
        int count = 0;
        for (int i = 0; count < a.length; i++){
            if (i % 2 == 0){
                a[count] = i;
                count++;
            }
        }
        return a;
    }

    private static List<Integer> geraListaPar(int nEntrada){
        List<Integer> listNumerosPares = new ArrayList<>();

        for (int i = 0; listNumerosPares.size() < nEntrada ; i++){
            if (i % 2 == 0){
                listNumerosPares.add(i);
            }
        }
        return listNumerosPares.subList(4,10);
    }
}
/*Exercício 1

Desenvolva um programa para mostrar os primeiros n números pares, sendo n um valor
que o usuário irá inserir pelo console. Lembre-se que um número é par quando divisível por
2.*/