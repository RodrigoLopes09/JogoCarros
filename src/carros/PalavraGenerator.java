package carros;

import java.util.Random;

public class PalavraGenerator {

    private static final String[] CARROS = {"FORD", "CHEVROLET", "TOYOTA", "HONDA", "BMW"};

    public String gerarPalavra() {
        Random random = new Random();
        int indice = random.nextInt(CARROS.length);
        return CARROS[indice];
    }
}
