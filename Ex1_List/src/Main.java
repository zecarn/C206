import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Double> listaDouble = new ArrayList<>();

        listaDouble.add(10.0);
        listaDouble.add(7.0);
        listaDouble.add(3.0);
        listaDouble.add(100.0);
        listaDouble.add(50.0);

        Collections.sort(listaDouble, Collections.reverseOrder());

        System.out.println(listaDouble);

    }
}