package Introducao_Java_TM;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos números naturais quer exibir?");
        int nQtd = sc.nextInt();
        System.out.println("Quantos dígitos mínimos ele deve possuir?");
        int qtdDigitos = sc.nextInt();
        System.out.println("Qual valor do digito final");
        int nTermina = sc.nextInt();

        int qtd = 0, k= 0;
        int cont;
        String valor ="";

        while (qtd < nQtd) {
            cont=1;
            valor=String.valueOf(k);
            if(valor.charAt(valor.length()-1)==(char)nTermina+'0') {
                for (int i = 0; i < valor.length()-1; i++) {
                    if(valor.charAt(i)==nTermina+'0'){
                        cont++;
                        if(cont==qtdDigitos){
                            System.out.println(k+"");
                            qtd++;
                            break;
                        }
                    }
                }
            }
            k++;
        }
    }
}

