public class Kart {
    String nome;

    Motor motor;

    Piloto piloto;

    public Kart(){
        motor = new Motor();
    }

    void pular(){
        System.out.println("O carro pulou");
        motor.velocidadeMaxima = 100;
    }
    void soltarTurbo() {
        System.out.println("Turbo foi ativado");
        motor.velocidadeMaxima = 150;
    }
    void fazerDrift(){
        System.out.println("Fazendo drift");
        motor.velocidadeMaxima = 50;
    }
}
