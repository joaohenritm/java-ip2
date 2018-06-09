package bompreco;

import java.util.Scanner;

public class Loja {

    private Produto[] loja;

    public Loja(int total) { // metodo construtor da classe Loja
        loja = new Produto[total];
    }

    public void cadastrar() {
        Scanner entrada = new Scanner(System.in);
        int codigo;
        String descricao;
        double preco;
        int quantidade;
        String prazoDeEntrega;
        Produto p;

        for (int i = 0; i < loja.length; i++) {
            System.out.print("Insira o código do produto: ");
            codigo = entrada.nextInt();
            entrada.nextLine();
            p = new Produto(codigo);

            for (int j = 0; j < loja.length - 1; j++) {
                if (this.loja[i].getCodigo() != this.loja[i].getCodigo()) {
                    System.out.println("Rolap");
                }
                
            }

            System.out.print("Insira a descrição do produto: ");
            descricao = entrada.nextLine();
            p.setDescricao(descricao);

            System.out.print("Insira o preço do produto: ");
            preco = entrada.nextDouble();
            entrada.nextLine();
            p.setPreco(preco);

            System.out.print("Insira a quantidade do produto em estoque: ");
            quantidade = entrada.nextInt();
            entrada.nextLine();
            p.setQuantidade(quantidade);

            System.out.print("Insira o prazo de entrega do produto: ");
            prazoDeEntrega = entrada.nextLine();
            p.setPrazo(prazoDeEntrega);

            this.loja[i] = p;
        }
    }
}
