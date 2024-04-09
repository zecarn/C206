public class BrownieCafe extends Brownie{
    public BrownieCafe(String nome, double preco, String sabor){
        super(nome, preco, sabor);
    }
    public void adicionaCafe(){
        setPreco(this.preco + 3);
        System.out.println("Adicionando mais café por 3 reais");
    }
    @Override
    public void calculaValorTotalCompra(){
        System.out.println("Nome: Brownie Cafezão");
        super.calculaValorTotalCompra();
    }
    public void addCarrinhoDeCompras(){
        super.addCarrinhoDeCompras();
        System.out.println("Adicionado Brownie Cafezão");
    }
}
