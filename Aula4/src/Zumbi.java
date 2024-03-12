public class Zumbi {
    int vida;
    int qtdDentes;
    boolean cabelo;
    String nome;


    void atacar(){
        qtdDentes = 100;
        System.out.println("Zumbi atacando...");
    }
    void dancar(){
        cabelo = false;
        System.out.println("Zumbi dançando...");
    }

    void cozinhar(){
        System.out.println("Zumbi cozinhando...");
    }

    void infectar(){
        System.out.println("Zumbi infectando...");
    }

}
