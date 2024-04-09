public class Main {
    public static void main(String[] args){
        BrownieNutella bn = new BrownieNutella("João", 12.00, "Nutella");
        BrownieCafe bc = new BrownieCafe("Mario", 8.00, "Café");
        BrownieDoceDeLeite bl = new BrownieDoceDeLeite("Luis", 10.00, "Doce de Leite");

        Comprador comprador = new Comprador("José", 100.00);

        bn.mostraInfo();
        bn.adicionaNutella();
        //bn.addCarrinhoDeCompras();
        //bn.calculaValorTotalCompra();

        bc.mostraInfo();
        bc.adicionaCafe();
        //bc.addCarrinhoDeCompras();
        //bc.calculaValorTotalCompra();

        bl.mostraInfo();
        bl.adcionaDoceDeLeite();
        //bl.addCarrinhoDeCompras();
        //bl.calculaValorTotalCompra();

        comprador.efetuarCompra(bn);
        comprador.efetuarCompra(bl);
        comprador.efetuarCompra(bc);
    }
}
