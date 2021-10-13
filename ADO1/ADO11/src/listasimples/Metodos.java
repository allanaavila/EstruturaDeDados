package listasimples;

public class Metodos {

    private Elemento atual = null;
    private int quantidadeElementos = 0;

    public Elemento getAtual() {
        return atual;
    }

    //Insere um elemento no início da lista
    public void inserirElementoInicio(Object objeto) {
        Elemento novoElemento = new Elemento(atual, objeto);
        this.atual = novoElemento;
        quantidadeElementos++;
    }

    public Object pesquisar(int codigo) {
        Elemento elemento = this.atual;
        Produto produto;
        while (elemento != null) {
            produto = (Produto) elemento.getObjeto();
            if (produto.getCodigo() == codigo) {
                return produto;
            }
            elemento = elemento.getAnt();
        }
        return null;
    }

    public boolean remover(int codigo, int quantidadeRemovida) {
        Produto produto = (Produto) pesquisar(codigo);
        if (produto != null /*&& quantidadeRemovida < produto.getQuantidade()*/) {
            produto.setQuantidade(produto.getQuantidade() - quantidadeRemovida);
            return true;
        }
        return false;
    }

    public boolean remover(int codigo) {
        Elemento remov = atual;
        if (atual != null) {
            Produto produto;
            Elemento aux = remov;
            while (remov != null) {
                produto = (Produto) remov.getObjeto();
                if (produto.getCodigo() == codigo) {
                    //Remoção do primeiro elemento da lista
                    if (remov == atual) {
                        atual = atual.getAnt();
                        remov.setAnt(null);
                        //Remoção do último elemento da lista
                    } else if (remov.getAnt() == null) {
                        aux.setAnt(null);
                        //Remoção de um elemento qualquer
                    } else {
                        aux.setAnt(remov.getAnt());
                        remov.setAnt(null);
                    }
                    quantidadeElementos--;
                    return true;
                }
                aux = remov;
                remov = remov.getAnt();
            }
        }
        return false;
    }

    public void exibir(Elemento elemento) {
        System.out.println("Cupom Fiscal");
        System.out.print("{");
        float total = 0;
        for (int i = 0; i < quantidadeElementos; i++) {
            System.out.print(elemento + " ");
            Produto produto = (Produto) elemento.getObjeto();
            total += produto.getPreco() * produto.getQuantidade();
            elemento = elemento.getAnt();
        }
        System.out.print("}");
        System.out.println("\nTotal da compra: " + total);
    }

    public void desconto(float desconto, String categoria) {
        Elemento elemento = this.atual;
        while (elemento != null) {
            Produto produto = (Produto) elemento.getObjeto();
            if (produto.getCategoria().equals(categoria)) {
                float pd = produto.getPreco() * (1 - desconto);
                produto.setPreco(pd);
            }
            elemento = elemento.getAnt();
        }

    }

}
