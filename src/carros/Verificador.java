package carros;

public class Verificador {

    public boolean verificarTentativa(String palavra, char tentativa) {
        // Verifica se a tentativa do usuário está correta
        return palavra.contains(String.valueOf(tentativa));
    }

    public boolean verificarPalavraCompleta(String palavra, String palavraParcial) {
        // Verifica se o usuário adivinhou a palavra completa
        return palavra.equals(palavraParcial);
    }
}
