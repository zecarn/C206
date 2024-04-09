import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int promocao;

        Cliente cliente = new Cliente("José Carlos", 479035896);

        Computador computador1 = new Computador();
        Computador computador2 = new Computador();
        Computador computador3 = new Computador();

        MemoriaUSB memoriaUSB1 = new MemoriaUSB();
        MemoriaUSB memoriaUSB2 = new MemoriaUSB();
        MemoriaUSB memoriaUSB3 = new MemoriaUSB();

        // Promoção 1:
        computador1.marca = "Positivo";
        computador1.preco = 3300;
        computador1.hard[0].nome = "Pentium Core i3";
        computador1.hard[0].capacidade = 2200;
        computador1.hard[1].nome = "Memória RAM";
        computador1.hard[1].capacidade = 8;
        computador1.hard[2].nome = "HD";
        computador1.hard[2].capacidade = 500;
        computador1.sistemaOp.nome = "Linux Ubuntu";
        computador1.sistemaOp.tipo = 32;
        memoriaUSB1.nome = "Pen-drive";
        memoriaUSB1.capacidade = 16;
        computador1.addMemoriaUSB(memoriaUSB1);

        // Promoção 2:
        computador2.marca = "Acer";
        computador2.preco = 8800;
        computador2.hard[0].nome = "Pentium Core i5";
        computador2.hard[0].capacidade = 3370;
        computador2.hard[1].nome = "Memória RAM";
        computador2.hard[1].capacidade = 16;
        computador2.hard[2].nome = "HD";
        computador2.hard[2].capacidade = 1000;
        computador2.sistemaOp.nome = "Windows 8";
        computador2.sistemaOp.tipo = 64;
        memoriaUSB2.nome = "Pen-drive";
        memoriaUSB2.capacidade = 32;
        computador2.addMemoriaUSB(memoriaUSB2);

        // Promoção 3
        computador3.marca = "Vaio";
        computador3.preco = 4800;
        computador3.hard[0].nome = "Pentium Core i7";
        computador3.hard[0].capacidade = 4500;
        computador3.hard[1].nome = "Memória RAM";
        computador3.hard[1].capacidade = 32;
        computador3.hard[2].nome = "HD";
        computador3.hard[2].capacidade = 2000;
        computador3.sistemaOp.nome = "Windows 10";
        computador3.sistemaOp.tipo = 64;
        memoriaUSB3.nome = "HD Externo";
        memoriaUSB3.capacidade = 1000;
        computador3.addMemoriaUSB(memoriaUSB3);

        System.out.println("Promoção 1 - PC Positivo | Promoção 2 - PC Acer | Promoção 3 - PC Vaio");

        do {
            System.out.println("Qual PC você deseja comprar? (0 para sair)");
            promocao = entrada.nextInt();

            for (int i = 0; i < cliente.computador.length; i++) {
                if (cliente.computador[i] == null){
                    switch (promocao){
                        case 0:
                            System.out.println("Obrigado por visitar nossa loja. Volte sempre!");
                            break;
                        case 1:
                            cliente.computador[i] = computador1;
                            System.out.println("Promoção 1 comprada com sucesso!");
                            break;
                        case 2:
                            cliente.computador[i] = computador2;
                            System.out.println("Promoção 2 comprada com sucesso!");
                            break;
                        case 3:
                            cliente.computador[i] = computador3;
                            System.out.println("Promoção 3 comprada com sucesso!");
                            break;
                        default:
                            System.out.println("Escolha uma opção válida");
                    } break;
                }
            }

        } while (promocao != 0);

        System.out.println("\nInformações do Cliente: " + "\nNome: " + cliente.nome + "\nCpf: " + cliente.cpf);

        for (int i = 0; i < cliente.computador.length; i++) {
            if(cliente.computador[i] != null){
                System.out.println("\nInformações da compra número " + (i+1));
                cliente.computador[i].mostraPCConfigs();
            }
        }

        cliente.calculaTotalCompra();
    }
}
