/**
 * BSI - 3º Semestre
 * Estrutura de Dados - 2ª ADO
 * @author Lucas Vergilio Cintra
 * @author Wellington Lira de Melo
 */

// Exercício 01

package ADO2_1;

public class Fila {

    private Fila proximo;
    private Fila anterior;
    private int valor;
    
    public Fila(int valor) {
        this.valor = valor;
    }
    
    public Fila getProximo() {
        return proximo;
    }

    public void setProximo(Fila proximo) {
        this.proximo = proximo;
    }

    public Fila getAnterior() {
        return anterior;
    }

    public void setAnterior(Fila anterior) {
        this.anterior = anterior;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
  
}

package ADO2_1;

public class Operadores {

    private Fila inicio = null;
    private Fila fim = null;
    private int quantidade = 0;
    
    // Método para inserir objetos
    public void enqueue(int valor) {
    
        // Quando a fila está vazia
        if(this.quantidade == 0) {
        
            Fila fila = new Fila(valor);
            fila.setAnterior(null);
            fila.setProximo(null);
            this.inicio = fila;
            this.fim = fila; 
            this.quantidade++;
            
        // Quando a fila não está vazia
        } else {
        
            Fila fila = new Fila(valor);
            fila.setAnterior(null);
            fila.setProximo(fim);
            this.fim.setAnterior(fila);
            this.fim = fila;
            this.quantidade++;
        
        }
    
    }
    
    // Método para remover objetos
    public void dequeue() {
    
    	// Quando a fila está vazia
        if (quantidade == 0) {
        
            System.out.println("Fila vazia.\n");
        
        // Quando a fila possui um objeto
        } else if (quantidade == 1) {
            
            this.inicio = null;
            this.fim = null;
            this.quantidade--;
        
        // Quando a fila possui mais de um objeto
        } else {
        
            this.inicio = inicio.getAnterior();
            this.inicio.setProximo(null);
            this.quantidade--;
        
        }
    
    }
    
    // Método para imprimir o valor do objeto
    public void printElement(Fila element) {
    
        System.out.println(element.getValor());
    
    }
    
    // Método para imprimir todos os objetos
    public void print() {
    
        System.out.println("- - - FILA - - -\n");
        
        Fila local = inicio;
        
        // Quando a fila está vazia
        if(quantidade == 0) {
        
            System.out.println("Fila vazia.");
            
        }
        
        // Imprime um objeto e passa para o próximo até o fim da fila
        while(local != null) {
        
            printElement(local);
            local = local.getAnterior();
            
        }
        
        System.out.println();
        
    
    }
    
    // Método para imprimir/retornar o tamanho da fila
    public int size(){
    
        System.out.println("Tamanho da fila: " + this.quantidade);
    
        return this.quantidade;
        
    }
    

    // Método para saber se a fila está vazia
    public boolean isEmpty(){
    
        if (this.quantidade == 0) {
        
            System.out.println("Fila vazia.\n");
            return true;
        
        } else {
        
            System.out.println("Fila com elementos.\n");
            return false;
            
        }
        
    }
    
    // Método para imprimir/retornar o primeiro objeto da fila
    public Fila front(){
    
        if (this.quantidade == 0) {
        
            System.out.println("Fila vazia.");
            return null;
        
        } else {
        
            printElement(this.inicio);
            return this.inicio;
        
        }
    
    }
       
}

package ADO2_1;

public class main {

    public static void main(String[] args) {
        
        Operadores lista = new Operadores();
        
        lista.print();
        
        lista.enqueue(1);
        lista.enqueue(2);
        lista.enqueue(3);
        
        lista.print();
        
        lista.dequeue();
        
        lista.print();
        
        lista.isEmpty();
        
        lista.print();
        
        Fila inicio = lista.front();
        System.out.println(inicio.getValor());
        
        lista.dequeue();
        lista.dequeue();
        
        lista.print();
        
        lista.dequeue();
        
        lista.print();
        
    }
}

