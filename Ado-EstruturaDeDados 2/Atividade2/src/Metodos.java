public class Metodos {
    
    private Elemento inicio = null;
    private Elemento atual, aux;
    private int quantidadeElementos = 0;

    public Elemento getInicio() {
        return inicio;
    }
    
    public Elemento getAtual() {
        return atual;
    }
    
    public void inserirElemento(Object objeto) {
        if (inicio == null) {
            Elemento novoElemento = new Elemento(null, null, objeto);
            this.inicio = novoElemento;
            aux = inicio;
        } else {
            Elemento novoElemento = new Elemento(null, aux, objeto);
            this.atual = novoElemento;
            aux.setProx(atual);
            aux = atual; 
        }
        quantidadeElementos++;
    }
    
    public void exibir(Elemento elemento) {
            
        System.out.println("\n");
        System.out.println("     Funcionario \n");
        
        if(elemento == atual) {
            while(elemento != null) {
                System.out.print(elemento + " ");
                elemento = elemento.getAnt();
                System.out.println("\n"); 
            }
                    
            }else if(elemento  == inicio) {
                while(elemento != null) {
                System.out.print(elemento + " ");
                elemento = elemento.getProx();
            }
        }
    }
    
    public void busca(Elemento elemento, int matricula) {
        
        System.out.println("     Busca por Matricula \n");
        
        System.out.println("Buscando pelo numero da matricula: " + matricula + " \n");
        
        while (elemento != null) {
            Funcionario f = (Funcionario)elemento.getObjeto();
            
            if (f.getMatricula() == matricula) {
                System.out.println(f.toString());
            } 
            elemento = elemento.getProx();
            
        }
    }

    public boolean remover(Elemento elemento, int matricula) {
    
        busca(atual, matricula);
        
        System.out.println("\n");
        System.out.println("Removendo elemento da matricula: " + matricula);
    
        Elemento aux = elemento;
        
        while(elemento != null) {
            
            Funcionario f = (Funcionario)elemento.getObjeto();
            
                if(f.getMatricula() == matricula) {
                       
                //remocao do primeiro elemento da lista
                if(elemento == atual) {
                    atual = atual.getAnt();
                    aux.setAnt(null);
                    quantidadeElementos--;
                    return true;
                    
                // remocao do ultimo elemento da lista
                }else if(elemento.getAnt() == null) {
                    aux.setAnt(null);
                    quantidadeElementos--;
                    return true;
                    
                // remocao de um elemento qualquer
                }else {
                    aux.setAnt(elemento.getAnt());
                    elemento.setAnt(null);
                    quantidadeElementos--;

                    return true;
                }
            }
            aux = elemento;
            elemento = elemento.getAnt();
        }
        return false;
    }
    
}