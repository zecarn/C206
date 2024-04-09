public class BrownieDoceDeLeite extends Brownie{
    public BrownieDoceDeLeite(String nome, double preco, String sabor){
        super(nome, preco, sabor);
    }
    public void adcionaDoceDeLeite(){
        setPreco(this.preco + 5);
        System.out.println("Adicionando mais Doce de Leite por 5 reais");
    }
    @Override
    public void calculaValorTotalCompra(){
        System.out.println("Nome: Brownie Doce di Leitão");
        super.calculaValorTotalCompra();
    }
    public void addCarrinhoDeCompras(){
        super.addCarrinhoDeCompras();
        System.out.println("Adicionado Brownie Doce di Leitão");
    }
}
