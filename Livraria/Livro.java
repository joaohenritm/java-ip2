package livraria;

public class Livro {

    private int ISBN;
    private String titulo;
    private String autor;
    private double preco;
    private int qtdEstoque;

    public Livro(int codigo) {
        this.ISBN = codigo;
    }
    public void setTitulo(String tit) {
        this.titulo = tit;
    }
    public void setAutor(String aut) {
        this.autor = aut;
    }

    public void setPreco(double prec) {
        this.preco = prec;
    }

    public void setQtdEstoque(int qtdE) {
        this.qtdEstoque = qtdE;
    }

    //
    
    public int getISBN() {
        return this.ISBN;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public String getAutor() {
        return this.autor;
    }

    public double getPreco() {
        return this.preco;
    }

    public int getQtdEstoque() {
        return this.qtdEstoque;
    }
    
    public String toString() {
        return "ISBN: " + this.ISBN + "\n Título: " + this.titulo + "\n Autor: " + this.autor
                + "\n Preço: " + this.preco + "\n Quantidade em estoque: " + this.qtdEstoque;
    }
}