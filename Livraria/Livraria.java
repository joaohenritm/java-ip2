package livraria;

import java.util.Scanner;

public class Livraria {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Cadastro cad = new Cadastro();
        int ISBN;
        String aut;
        int op = 0;
        do {
            System.out.print("Qual opção deseja realizar? \n"
                    + "1- Cadastar UM livro. \n"
                    + "2- Exibir os livros cadastrados. \n"
                    + "3- Exibir livros e preços de um determinado autor. \n"
                    + "4- Exibir livro mais caro e mais barato e seus respectivos preços. \n"
                    + "5- Remover um livro cadastrado. \n"
                    + "Resposta: ");
            op = entrada.nextInt();
            switch (op) {
                case 1:
                    System.out.print("Insira o ISBN do livro: ");
                    ISBN = entrada.nextInt();
                    cad.cadastrar(ISBN);
                    break;
                case 2:
                    cad.exibirTodos();
                    break;
                case 3: 
                    cad.exibirTituloPreco();
                    break;
                case 4:
                    cad.vefCaroBarato();
                    break;
                case 5:
                    System.out.print("Insira o ISBN do livro que vai ser removido: ");
                    ISBN = entrada.nextInt();
                    cad.removerLivro(ISBN);
                    break;
            }
        } while (op != 0);
    }
}
