package livraria;

import java.util.Scanner;

public class Cadastro {

    public Livro[] livros;
    private int total;

    public Cadastro() {
        livros = new Livro[100];
    }

    public void cadastrar(int ISBN) {
        Scanner entrada = new Scanner(System.in);
        int i, j;
        Livro liv;
        if (total == 0) {
            liv = new Livro(ISBN);

            System.out.print("Digite o título do livro: ");
            String titulo = entrada.nextLine();
            liv.setTitulo(titulo);

            System.out.print("Digite o nome do autor do livro: ");
            String autor = entrada.nextLine();
            liv.setAutor(autor);

            System.out.print("Digite o preço unitário do livro: ");
            double preco = entrada.nextDouble();
            entrada.nextLine();
            liv.setPreco(preco);

            System.out.print("Digite a quantidade em estoque desse livro: ");
            int qtd = entrada.nextInt();
            entrada.nextLine();
            liv.setQtdEstoque(qtd);

            livros[total] = liv;
            total++;
        } else if (total == livros.length) {
            System.out.println("O limite de livros cadastrados já foi atingido.");
        } else {
            for (i = 0; i < total; i++) { // achar o ponto de inserção.
                if (livros[i].getISBN() == ISBN) {
                    System.out.print("Já existe um livro cadastrado com esse ISBN.");
                    return;
                } else if (livros[i].getISBN() > ISBN) {
                    break;
                }
            }
            for (j = total; j > i; j--) {
                livros[j] = livros[j - 1];
            }
            liv = new Livro(ISBN);

            System.out.print("Digite o título do livro: ");
            String titulo = entrada.nextLine();
            liv.setTitulo(titulo);

            System.out.print("Digite o nome do autor do livro: ");
            String autor = entrada.nextLine();
            liv.setAutor(autor);

            System.out.print("Digite o preço unitário do livro: ");
            double preco = entrada.nextDouble();
            entrada.nextLine();
            liv.setPreco(preco);

            System.out.print("Digite a quantidade em estoque desse livro: ");
            int qtd = entrada.nextInt();
            entrada.nextLine();
            liv.setQtdEstoque(qtd);

            livros[i] = liv;
            total++;
        }
    }

    public void exibirTodos() {
        for (int i = 0; i < total; i++) {
            System.out.println("Livro " + (i + 1) + "\n" + livros[i]);
        }
        if (total == 0) {
            System.out.println("Não existem livros cadastrados no momento.");
        }
    }

    public void exibirTituloPreco() {
        Scanner entrada = new Scanner(System.in);
        int i;
        System.out.print("Insira o nome do autor que deseja procurar: ");
        String autor = entrada.nextLine();
        for (i = 0; i < total; i++) {
            System.out.println("Preço e nome dos livros do autor " + autor + ": ");
            if (livros[i].getAutor().equalsIgnoreCase(autor)) {
                System.out.println(livros[i].getTitulo() + " " + livros[i].getPreco() + "R$");
            }
        }
        if (i == total) {
            System.out.print("Não foi encontrado um livro desse autor.");
        }
    }
    public int buscaBinaria (int isbn) {
        int inicio = 0, meio, fim = total - 1;
        do {
            meio = (inicio + fim) /2;
            if (livros[meio].getISBN()== isbn) {
                return meio;
            }
            else if (isbn < livros[meio].getISBN()) {
                fim = meio - 1;
            }
            else {
                inicio = meio + 1;
            }
        } while (inicio <= fim);
        return -1; // não achou 
    }
    public void removerLivro (int isbn) {
        int i, j;
        boolean achou = false;
        for (i = 0; i < total; i++) { // loop de busca
            if (livros[i].getISBN() == isbn) {
                achou = true;
                break;
            }
            else if (livros[i].getISBN() > isbn) {
                break;
            }
        }
        if (achou == false) {
            System.out.println("ISBN não cadastrado."); 
        }
        else { // remoção do livro
            for (j = i; j < total - 1; j++) {
                livros [j] = livros [j+1];
            }
            livros [j] = null;
            total--;
            System.out.println("Livro removido com sucesso.");
        }
    }

    public void vefCaroBarato() {
        int i;
        double maior = 0;
        double menor = 999999999;
        for (i = 0; i < total; i++) {
            if (livros[i].getPreco() > maior) {
                maior = livros[i].getPreco();
            }
            if (livros[i].getPreco() < menor) {
                menor = livros[i].getPreco();
            }
        }
        for (i = 0; i < total; i++) {
            if (maior == livros[i].getPreco()) {
                System.out.println("O livro mais caro e seu preço é: " + livros[i].getTitulo()
                        + " " + livros[i].getPreco() + "R$");
            }
            if (menor == livros[i].getPreco()) {
                System.out.println("O livro mais barato e seu preço é: " + livros[i].getTitulo()
                        + " " + livros[i].getPreco() + "R$");

            }
        }
    }
}
