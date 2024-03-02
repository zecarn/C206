import java.sql.SQLOutput;

public class Zumbi {
    double vida;
    String nome;

    Boolean transferencia = false;

    double mostraVida(){
        return vida;
    }

    void tranferenciaVida(Zumbi zumbiAlvo, double quantia){
        if(quantia <= vida){
            vida -= quantia;
            zumbiAlvo.vida += quantia;
            transferencia = true;

            System.out.println(transferencia);
        }
        else{
            System.out.println(transferencia);
        }
    }

}
