package carros;

import java.util.Scanner;

public class JogoController {

    private static Scanner scanner = new Scanner(System.in);

    public static boolean iniciarNovoJogo() {
        System.out.println("Deseja iniciar um novo jogo? (S/N): ");
        String resposta = scanner.next().toUpperCase();
        return resposta.equals("S");
    }

    public static void jogarJogo() {
        while (true) {
            PalavraGenerator palavraGenerator = new PalavraGenerator();
            Display display = new Display();
            Guess guess = new Guess();
            Verificador verificador = new Verificador();

            // Inicia o jogo
            String palavra = palavraGenerator.gerarPalavra();
            char primeiraLetra = palavra.charAt(0);
            char ultimaLetra = palavra.charAt(palavra.length() - 1);

            display.exibirMensagemInicial(primeiraLetra, ultimaLetra);

            // Loop principal do jogo
            while (true) {
                // Exibe a palavra parcial e obtém a tentativa do usuário
                display.exibirPalavraParcial(palavra, guess.getPalavraParcial());
                char tentativa = guess.obterTentativa();

                // Verifica se a tentativa está correta
                if (verificador.verificarTentativa(palavra, tentativa)) {
                    display.exibirMensagemAcerto();
                } else {
                    display.exibirMensagemErro();
                }

                // Atualiza a palavra parcial com base na tentativa
                guess.atualizarPalavraParcial(palavra, tentativa);

                // Verifica se o usuário adivinhou a palavra completa
                if (verificador.verificarPalavraCompleta(palavra, guess.getPalavraParcial())) {
                    display.exibirMensagemVitoria(palavra);
                    break;
                }
            }

            // Pergunta se o usuário quer jogar novamente
            if (!iniciarNovoJogo()) {
                // Se não, encerra o jogo
                break;
            }
        }

        System.out.println("Obrigado por jogar!");
    }

    public static void main(String[] args) {
        jogarJogo();
    }
}
