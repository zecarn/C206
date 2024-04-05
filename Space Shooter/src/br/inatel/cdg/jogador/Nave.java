package br.inatel.cdg.jogador;

import br.inatel.cdg.inimigo.Asteroide;

import java.util.Objects;

public class Nave {
    private String nome;
    private double vida;
    private String tipoTiro;

    public double getVida() {
        return vida;
    }
    public void setVida(double vida){
        this.vida = vida;
    }
    public void setTipoTiro(String tipoTiro){
        this.tipoTiro = tipoTiro;
    }
    public Nave(String nome, double vida, String tipoTiro){
        this.nome = nome;
        this.vida = vida;
        this.tipoTiro = tipoTiro;
    }
    public void atirar(Asteroide ast){
        if((Objects.equals(this.tipoTiro, "Normal")) && (Objects.equals(ast.getTipoAsteroide(), "Pequeno"))){
            ast.destruir();
        }
        else if ((Objects.equals(this.tipoTiro, "Explosivo")) && (Objects.equals(ast.getTipoAsteroide(), "Grande"))) {
            ast.destruir();
        }
        else if ((Objects.equals(this.tipoTiro, "Explosivo")) && (Objects.equals(ast.getTipoAsteroide(), "Pequeno"))) {
            ast.destruir();
        }
        else{
            setVida(this.vida - 20.00);
            System.out.println("A nave está com " + getVida() + " de vida!");
            if(this.vida == 0){
                System.out.println("A nave explodiu!");
            }
        }

    }

}
