public class Main {

    public static void main(String[] args){
        Zumbi zumbi1 = new Zumbi();
        zumbi1.nome = "Zeca";
        zumbi1.vida = 95.0;

        Zumbi zumbi2 = new Zumbi();
        zumbi2.nome = "Marcio";
        zumbi2.vida = 100.0;

        Zumbi zumbi3 = new Zumbi();
        Zumbi zumbi4 = new Zumbi();

        zumbi3.vida = 50;
        zumbi4.vida = 30;

        zumbi1 = zumbi2;

        zumbi1.vida = 50;

        System.out.println("Zumbi1 = " + zumbi1.vida);
        System.out.println("Zumbi2 = " + zumbi2.vida);

        zumbi3.tranferenciaVida(zumbi4, 10);

        System.out.println(zumbi3.mostraVida());
        System.out.println(zumbi4.mostraVida());

    }


}
