package listasimples;

import java.text.DecimalFormat;

public class Produto {

    private String nomeProduto, categoria;
    private int codigo, quantidade;
    private float preco;

    public Produto() {
    }

    public Produto(String nomeProduto, String categoria, int codigo,
            int quantidade, float preco) {
        this.nomeProduto = nomeProduto;
        this.categoria = categoria;
        this.codigo = codigo;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        if (quantidade >= 1) {
            this.quantidade = quantidade;
        }else{
          throw new IllegalArgumentException("Quantidade inválida");
        }
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat(".00");
        return "Produto{" + "nomeProduto=" + nomeProduto + ", categoria="
                + categoria + ", codigo=" + codigo + ", quantidade="
                + quantidade + ", preco=" + df.format(preco) + '}' + "\n";
    }

}
