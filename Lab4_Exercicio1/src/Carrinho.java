public class Carrinho {
    double total;
    Produto[] produtos = new Produto[5];

    void exibirInfos(){
        for(int i=0; i<5; i++ ){
            System.out.println("Nome: " + produtos[i].nome);
            System.out.println("Descrição: " + produtos[i].descricao);
            System.out.println("Fabricante: " + produtos[i].fabricante);
            System.out.println("Preço: " + produtos[i].preco);
        }
    }
    void calculaTotal(){
        for(int i=0; i<5; i++){
            total =+ produtos[i].preco;
        }
        System.out.println("Valor total da compra: " + total);
    }
}
