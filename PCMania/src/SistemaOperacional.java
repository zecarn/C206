public class SistemaOperacional {
    public String nome;
    public int tipo;

    @Override
    public String toString(){
        return "\nSistema Operacional: " + "\n" + nome + ", " + tipo + " bits";
    }
}
