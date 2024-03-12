public class Piloto {

    String nome;
    boolean vilao = false;


    void soltaSuperPoder(){
        if(vilao == true){
            System.out.println("Vilão abatido");
        }
        else{
            System.out.println("Ninguém foi afetado");
        }

    }
}
