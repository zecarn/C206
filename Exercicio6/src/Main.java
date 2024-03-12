public class Main {
    public static void main(String[] args){
        Piloto piloto = new Piloto();
        piloto.nome = "José";


        Kart kart = new Kart();
        kart.nome = "McQueen";


        kart.piloto = piloto;

        kart.fazerDrift();
        kart.pular();
        kart.soltarTurbo();

        kart.piloto.soltaSuperPoder();

        kart.motor.mostraInfo();
    }
}
