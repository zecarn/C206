public class Brownie {
    protected String nome;
    protected double preco;
    protected String sabor;

    public double getPreco(){
        return preco;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }
    public Brownie(String nome, double preco, String sabor){
        this.nome = nome;
        this.preco = preco;
        this.sabor = sabor;
    }
    public void addCarrinhoDeCompras(){
        System.out.println("Adicionando brownie no carrinho...");
    }
    public void calculaValorTotalCompra(){
        //System.out.println("Nome do Brownie: " + this.sabor);
        System.out.println("Valor total da compra é: R$" + this.preco);
    }
    public void mostraInfo(){
        System.out.println("Nome do comprador: " + this.nome);
        System.out.println("Preço do Brownie: " + this.preco);
        System.out.println("Sabor do Brownie: " + this.sabor);
    }

}
