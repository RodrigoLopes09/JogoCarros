package carros;

import java.util.Scanner;

public class Guess {

    private String palavraParcial;
    private Scanner scanner;

    public Guess() {
        this.palavraParcial = "";
        this.scanner = new Scanner(System.in);
    }

    public char obterTentativa() {
        System.out.println("Digite uma letra: ");
        char tentativa = scanner.next().toUpperCase().charAt(0);
        return tentativa;
    }

    public String getPalavraParcial() {
        return palavraParcial;
    }

    public void atualizarPalavraParcial(String palavra, char tentativa) {
        // Atualiza a palavra parcial com base na tentativa do usuário
        // Adiciona a letra à palavra parcial se estiver correta, mantém '_' se estiver incorreta
        StringBuilder novaPalavraParcial = new StringBuilder(palavraParcial);
        for (int i = 0; i < palavra.length(); i++) {
            if (palavra.charAt(i) == tentativa && i < novaPalavraParcial.length()) {
                novaPalavraParcial.setCharAt(i, tentativa);
            }
        }
        palavraParcial = novaPalavraParcial.toString();
    }


    public void resetarPalavraParcial() {
        palavraParcial = "";
    }
}


