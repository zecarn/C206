import java.util.Arrays;

public class Computador {
    public String marca;
    public float preco;
    SistemaOperacional sistemaOp;
    HardwareBasico[] hard;
    MemoriaUSB[] memoriaUSB = new MemoriaUSB[1];

    public void mostraPCConfigs(){
        System.out.println("Marca: " + this.marca + "\nPreço: " + this.preco);
        for (int i = 0; i < hard.length; i++) {
            if(hard[i] != null){
                System.out.println(hard[i].toString());
            }
        }
        System.out.println(sistemaOp.toString());
        //System.out.println(Arrays.toString(memoriaUSB));
        for (int i = 0; i < memoriaUSB.length; i++) {
            if(memoriaUSB[i] != null){
                System.out.println(memoriaUSB[i].toString());
            }
        }
    }
    public void addMemoriaUSB(MemoriaUSB musb){
        for (int i = 0; i < memoriaUSB.length; i++) {
            if(memoriaUSB[i] == null){
                memoriaUSB[i] = musb;
                break;
            }
        }

    }

    public Computador(){
        sistemaOp = new SistemaOperacional();
        hard = new HardwareBasico[3];
        for (int i = 0; i < hard.length; i++) {
            if(hard[i] == null){
                hard[i] = new HardwareBasico();
            }
        }
    }

}
