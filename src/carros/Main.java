package carros;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        do {
            // Inicia o jogo
            PalavraGenerator palavraGenerator = new PalavraGenerator();
            Display display = new Display();
            Guess guess = new Guess();
            Verificador verificador = new Verificador();

            String palavra = palavraGenerator.gerarPalavra();
            char primeiraLetra = palavra.charAt(0);
            char ultimaLetra = palavra.charAt(palavra.length() - 1);

            display.exibirMensagemInicial(primeiraLetra, ultimaLetra);

            // Loop principal do jogo
            while (true) {
                // Exibe a palavra parcial e obtém a tentativa do usuário
                display.exibirPalavraParcial(palavra, guess.getPalavraParcial());
                String tentativa = scanner.next().toUpperCase();

                // Verifica se o usuário adivinhou a palavra completa
                if (verificador.verificarPalavraCompleta(palavra, tentativa)) {
                    display.exibirMensagemVitoria(palavra);
                    break;
                }

                // Verifica se a tentativa está correta
                if (verificador.verificarTentativa(palavra, tentativa.charAt(0))) {
                    display.exibirMensagemAcerto();
                } else {
                    display.exibirMensagemErro();
                }

                // Atualiza a palavra parcial com base na tentativa
                guess.atualizarPalavraParcial(palavra, tentativa.charAt(0));
            }

            // Pergunta se o usuário quer jogar novamente
            System.out.println("Deseja iniciar um novo jogo? (S/N): ");
            String resposta = scanner.next().toUpperCase();
            if (!resposta.equals("S")) {
                break;
            }

        } while (true);

        System.out.println("Obrigado por jogar!");
    }
}
