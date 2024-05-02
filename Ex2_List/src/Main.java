import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
public class Main {
    public static void main(String[] args) {
        List<HomemAranha> listaranha = new ArrayList<>();

        TobeyMaguire homemAranha1 = new TobeyMaguire("Duende Verde", 2002);
        TobeyMaguire homemAranha2 = new TobeyMaguire("Dr. Octopus",2004);
        AndrewGarfield espetacular1 = new AndrewGarfield("Homem Lagarto", 2012);
        AndrewGarfield espetacular2 = new AndrewGarfield("Elecktro", 2014);
        TomHolland deVoltaAoLar = new TomHolland("Falcão", 2017);
        TomHolland longeDeCasa = new TomHolland("Mysterio", 2019);

        listaranha.add(homemAranha1);
        listaranha.add(espetacular1);
        listaranha.add(deVoltaAoLar);
        listaranha.add(homemAranha2);
        listaranha.add(espetacular2);
        listaranha.add(longeDeCasa);

        for(HomemAranha aranha : listaranha){
            System.out.println("Ano do filme: " + aranha.getAnoDoFilme());
            System.out.println("Vilão do filme: " + aranha.getVilao());
            System.out.println("-------------------------------------------");
        }

        Collections.sort(listaranha);

        System.out.println("MOSTRANDO OS FILMES MAIS RECENTES: ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        for(HomemAranha aranha : listaranha){
            System.out.println("Ano do filme: " + aranha.getAnoDoFilme());
            System.out.println("Vilão do filme: " + aranha.getVilao());
            System.out.println("-------------------------------------------");
        }

    }
}