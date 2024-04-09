public class BrownieNutella extends Brownie{
    public BrownieNutella(String nome, double preco, String sabor){
        super(nome, preco, sabor);
    }
    public void adicionaNutella(){
        setPreco(this.preco + 7);
        System.out.println("Adicionando mais Nutella por 7 reais");
    }
    @Override
    public void calculaValorTotalCompra(){
        System.out.println("Nome: Brownie Nutellão");
        super.calculaValorTotalCompra();
    }
    public void addCarrinhoDeCompras(){
        super.addCarrinhoDeCompras();
        System.out.println("Adicionado Brownie Nutellão");
    }
}
