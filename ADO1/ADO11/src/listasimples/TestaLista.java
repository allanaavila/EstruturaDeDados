package listasimples;


public class TestaLista {

    public static void main(String[] args) {

        Metodos metodo = new Metodos();
       
        Produto produto1=new Produto("Arroz", "Alimentos", 1234, 3, 30);
        Produto produto2=new Produto("Xampú", "Higiene", 4321, 2, 25.34F);
        Produto produto3=new Produto("Feijão", "Alimentos", 1324, 1, 10F);
        
        metodo.inserirElementoInicio(produto1);
        metodo.inserirElementoInicio(produto2);
        metodo.inserirElementoInicio(produto3);

        metodo.desconto(0.1F,"Alimentos");
        metodo.exibir(metodo.getAtual());
         
        
        try{
        System.out.println("=== Removendo =="); 
        System.out.println(metodo.remover(4321, 1));
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        metodo.exibir(metodo.getAtual());
    }
}
