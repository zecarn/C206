public class MemoriaUSB {
    public String nome;
    public int capacidade;

    @Override
    public String toString(){
        return "\nMemória USB: " + "\n" + nome + " " + capacidade + " Gb";
    }
}
