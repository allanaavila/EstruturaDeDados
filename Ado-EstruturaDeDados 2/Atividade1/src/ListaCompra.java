public class ListaCompra{

  private String nomeProduto, categoria;
  private int codigo, quantidade;
  private float preco;

  public ListaCompra() {
  }

  public ListaCompra(String nomeProduto, String categoria, int codigo, 
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
      this.quantidade = quantidade;
  }

  public float getPreco() {
      return preco;
  }

  public void setPreco(float preco) {
      this.preco = preco;
  }
  
  public String getExibeItemCupomFiscal(){
      
      return " " + quantidade + "        " + nomeProduto + "                    " + preco;

  }

  @Override
  public String toString() {
    return "\nProduto: " + nomeProduto + 
            "\nCategoria: " + categoria + 
            "\nCódigo: " + codigo + 
            "\nQuantidade: " + quantidade + 
            "\nPreço: R$" + preco + "\n";
  }
  
}
