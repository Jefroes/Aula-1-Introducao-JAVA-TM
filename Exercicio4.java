package Introducao_Java_TM;

import java.util.*;

public class Exercicio4 {
    public static void main(String[] args) {
        int nEntrada;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um intervalo");
        nEntrada = sc.nextInt();
        List<Integer> listaPrimo = new ArrayList<>();
        System.out.println("Primos");
        for (int i = 2; i < nEntrada; i++) {
            if (verPrimo(i)) {
                listaPrimo.add(i);
            }
        }
        System.out.print(listaPrimo);
    }

    private static boolean verPrimo(int numero){
        if (numero < 0) {
            numero *= -1;
        }
        if ((numero % 2 == 0) && (numero > 2) || (numero < 2)) {
            return false;
        }
        for (int i = 3; i <= (int) Math.sqrt(numero); i += 2) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}

/*Desenvolva um programa para mostrar no console os primeiros n números primos entre 1
e m, sendo m um valor que o usuário irá inserir pelo console.*/