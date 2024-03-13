import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Carrinho carrinho = new Carrinho();
        carrinho.produtos[0] = new Produto();
        Scanner entrada = new Scanner(System.in);

        for(int i=0; i<5; i++){
            carrinho.produtos[i].nome = entrada.nextLine();
            carrinho.produtos[i].descricao = entrada.nextLine();
            carrinho.produtos[i].fabricante = entrada.nextLine();
            carrinho.produtos[i].preco = entrada.nextInt();
        }

        carrinho.exibirInfos();

        carrinho.calculaTotal();


    }

}
