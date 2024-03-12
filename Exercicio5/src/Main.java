public class Main {
    public static void main(String[] args){
        Personagem personagem1 = new Personagem();
        Arma arma1 = new Arma();

        Personagem personagem2 = new Personagem();
        Arma arma2 = new Arma();

        personagem1.arma = arma1;

        personagem1.tomarDano();

        System.out.println("Vida do personagem: " + personagem1.pontos);
    }
}
