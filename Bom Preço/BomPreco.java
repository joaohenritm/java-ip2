package bompreco;

import java.util.Scanner;

public class BomPreco {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int op;
        int t;

        System.out.println("Qual das opções gostaria de realizar? \n "
                + "1- Cadastrar produtos de uma loja. \n "
                + "2- Exibir os dados. \n "
                + "3- Sair do programa.");
        System.out.print("Resposta: ");
        op = entrada.nextInt();
        switch (op) {
            case 1:
                System.out.print("Quantos produtos serão cadastrados? ");
                t = entrada.nextInt();

                while (t <= 0) {
                    System.out.print("Por favor, informe uma quantidade maior que zero: ");
                    t = entrada.nextInt();
                }
                Loja l = new Loja(t);
                l.cadastrar(); break;
            case 2:
        }
    }

}
