public class Comprador {
    private String nome;
    private double saldo;
    public String getNome(){
        return nome;
    }
    public Comprador(String nome, double saldo){
        this.nome = nome;
        this.saldo = saldo;
    }
    public void efetuarCompra(Brownie brownie){
        brownie.addCarrinhoDeCompras();
        brownie.calculaValorTotalCompra();
        this.saldo = saldo - brownie.getPreco();
        System.out.println("Saldo de " + getNome() + ": R$" + this.saldo);
        System.out.println(" ");
    }
}
