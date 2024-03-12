public class Main {

    public static void main(String[] args){
        Zumbi zumbi1 = new Zumbi();
        zumbi1.nome = "Chris";
        zumbi1.vida = 10000;
        zumbi1.qtdDentes = 0;
        zumbi1.cabelo = false;

        zumbi1.atacar();
        zumbi1.cozinhar();

        Zumbi zumbi2 = new Zumbi();
        zumbi2.nome = "QualquerNome";
        zumbi2.qtdDentes = 99;

        System.out.println("Quantidade de dentes do zumbi2 " + zumbi2.qtdDentes);
        zumbi2.atacar();
        System.out.println("Quantidade de dentes do zumbi2 " + zumbi2.qtdDentes);
    }
}
