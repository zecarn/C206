public class HardwareBasico {
    public String nome;
    public float capacidade;

    @Override
    public String toString(){
        return "\nHardware: " + "\nNome: " + nome + "\nCapacidade: " + capacidade + " Mhz";
    }
}
