import java.util.Scanner;

public class Exercicio2 {

  Scanner entrada = new Scanner(System.in);
  
  System.out.println("Digite o primeiro numero: ");
  int lanche1 = entrada.nextTnt();
  System.out.println("Digite o segundo numero: ");
  int lanche2 = entrada.nextInt();
  System.out.println("Digite o terceiro numero: ");
  int lanche3 = entrada.nextInt();

  int total = lanche1 + lanche2 + lanche3;
  float media = total/3.0f;
  
}
