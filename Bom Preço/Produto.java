package bompreco;

public class Produto {

    private int codigo;
    private String descricao;
    private double preco;
    private int quantidade;
    private String prazoDeEntrega;

    public Produto(int cod) {
        this.codigo = cod;
    }

    public void setDescricao(String desc) {
        this.descricao = desc;
    }

    public void setPreco(double prec) {
        this.preco = prec;
    }

    public void setQuantidade(int qtd) {
        this.quantidade = qtd;
    }

    public void setPrazo(String prazo) {
        this.prazoDeEntrega = prazo;
    }

    //
    
    public int getCodigo() {
        return this.codigo;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public double getPreco() {
        return this.preco;
    }

    public int getQuantidade() {
        return this.quantidade;
    }

    public String getPrazo() {
        return this.prazoDeEntrega;
    }
}
