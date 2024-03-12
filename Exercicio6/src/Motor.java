public class Motor {
    String cilindradas;
    float velocidadeMaxima;

    void mostraInfo(){
        if(velocidadeMaxima == 50){
            cilindradas = "50 cilindradas";
        }
        else if (velocidadeMaxima == 100) {
            cilindradas = "100 cilindradas";
        }
        else if (velocidadeMaxima == 150) {
            cilindradas = "150 cilindradas";
        }
        System.out.println("Velocidade: " + velocidadeMaxima);
        System.out.println(cilindradas);
    }
}
