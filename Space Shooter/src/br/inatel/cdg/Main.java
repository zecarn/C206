package br.inatel.cdg;

import br.inatel.cdg.inimigo.Asteroide;
import br.inatel.cdg.jogador.Nave;

public class Main {
    public static void main(String[] args){
        Nave nave = new Nave("Moonlight 23", 100.0, "Pequeno");
        Asteroide ast1 = new Asteroide("Cometa", "Grande");
        Asteroide ast2 = new Asteroide("Mini cometa", "Pequeno");
        Asteroide ast3 = new Asteroide("Gigante", "Grande");

        nave.atirar(ast1);

        nave.setTipoTiro("Explosivo");
        nave.atirar(ast1);

        nave.setTipoTiro("Normal");
        nave.atirar(ast2);

        nave.setTipoTiro("Normal");
        nave.atirar(ast3);
        nave.setTipoTiro("Normal");
        nave.atirar(ast3);
        nave.setTipoTiro("Normal");
        nave.atirar(ast3);
        nave.setTipoTiro("Normal");
        nave.atirar(ast3);
    }
}
