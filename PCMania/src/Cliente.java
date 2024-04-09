public class Cliente {
    public String nome;
    public long cpf;
    Computador[] computador = new Computador[10];
    public Cliente(String nome, long cpf){
        this.nome = nome;
        this.cpf = cpf;
    }
    public float calculaTotalCompra(){
        float total = 0;
        for (int i = 0; i < computador.length; i++) {
            if(computador[i] != null){
                total += computador[i].preco;
            }
        }
        return total;
    }
}
